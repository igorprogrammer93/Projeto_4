package database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoUtil {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "vendasdb_mongo";

    private static final MongoClient client = MongoClients.create(CONNECTION_STRING);
    private static final MongoDatabase database = client.getDatabase(DATABASE_NAME);

    public static MongoDatabase getDatabase() {
        return database;
    }
}