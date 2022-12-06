package Classes;

import Interfaces.Nameable;

public class Data {
    // All of the below methods do nothing except print a message that shows they were called, and the parameters passed to them.
    
    public Data(String database) {
        System.out.println("Connecting to database");
    }

    public void beginTran() {
        System.out.println("Beginning a transaction");
    }
   
    public void commit() {
        System.out.println("Committing transaction");
    }

    public void rollback() {
        System.out.println("Rolling back transaction");
    }

    public void insert(String table, Nameable object) {
        System.out.println("Inserting " + object.getName() + " into " + table);
    }
}
