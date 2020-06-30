package com.red30tech.backend;

import com.red30tech.cache.api.Cache;
import com.red30tech.database.api.Database;
import com.red30tech.database.api.DatabaseFactory;

public class Processor {
    public static void main(String... args) {
        Database database = DatabaseFactory.getDatabase();

        try {
            database = new Cache(database);
        } catch (NoClassDefFoundError err) {
            System.err.println("Can't find cache");
        }

        System.out.println("Database class: " + database.getClass().getName());
        System.out.println("Module name: " + database.getClass().getModule().getDescriptor().name());
        System.out.println("Module version: " + database.getClass().getModule().getDescriptor().version());

        database.create("Hello", "There");
        System.out.println(database.get("Hello"));
        database.update("Hello", "Bye");
        System.out.println(database.get("Hello"));
        database.delete("Hello");
        System.out.println(database.get("Hello"));
    }
}
