package com.example.databaseconnection;

public abstract class Database {
    private String databaseName;

    public Database(String name) {
        this.databaseName = name;
    }

    public abstract DatabaseType supportsType();

    public String getDatabaseName() {
        return databaseName;
    }

    public abstract void databaseConnection();
}
