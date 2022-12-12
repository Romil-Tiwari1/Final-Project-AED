package HealthCentre.DB4OUtil;

import HealthCentre.EcoSystem;
import HealthCentre.SystemConfiguration;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fakhr
 */
public class DB4OUtil {
     private static final String FILENAME = Paths.get("Dummy.db4o").toAbsolutePath().toString();// path to the data store
     private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            // System.out.println("test4" + config);
            config.common().add(new TransparentPersistenceSupport());
            //System.out.println("test5" + config);
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //System.out.println("test6" + config);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);
            // System.out.println("test7" + config);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save
            //System.out.println("test8" + config);
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            // System.out.println("test8.1" + FILENAME);
            //System.out.println("test9" + db);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        //System.out.println("connectionnnnnnnn"+ conn);
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        //System.out.println("systemssssssssss" + systems);
        EcoSystem system;
        if (systems.size() == 0){
            system = SystemConfiguration.configure();  // If there's no System in the record, create a new one
            System.out.println("size==0");
        }
        else{
            system = systems.get(systems.size() - 1);
             System.out.println("size not 0");
        }
        conn.close();
        return system;
    }
}
