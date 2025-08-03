package com.example.databaseconnection;

public class PostgreSQLDatabase extends Database {

    public PostgreSQLDatabase(String databaseName) {
        super(databaseName);
    }

    public void databaseConnection() {
        // Implement the logic to connect to PostgreSQL Database
        System.out.println("Connecting to PostgreSQL Database");
    }

    @Override
    public DatabaseType supportsType() {
        return DatabaseType.POSTGRE_SQL;
    }
}