package com.example.databaseconnection;

public class MySQLDatabase extends Database {
    public MySQLDatabase(String databaseName) {
        super(databaseName);
    }

    public void databaseConnection() {
        // Implement the logic to connect to MySQL Database
        System.out.println("Connecting to MySQL Database");
    }

    @Override
    public DatabaseType supportsType() {
        return DatabaseType.MYSQL;
    }
}