package com.example.databaseconnection;

public class DatabaseFactory {
    public static Database createDatabase(DatabaseType databaseType, String databaseName) {
        return switch (databaseType) {
            case MONGO_DB -> new MongoDBDatabase(databaseName);
            case MYSQL -> new MySQLDatabase(databaseName);
            case POSTGRE_SQL -> new PostgreSQLDatabase(databaseName);
            default -> throw new IllegalArgumentException("Invalid Database type " + databaseName);
        };
    }
}
