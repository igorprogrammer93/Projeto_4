package dao;

import com.mongodb.client.MongoCollection;
import database.MongoUtil;
import org.bson.Document;

public class LogVendaDAO {

    private final MongoCollection<Document> collection = MongoUtil.getDatabase().getCollection("log_vendas");

    public void salvarLog(String mensagem) {
        Document doc = new Document("mensagem", mensagem)
                .append("timestamp", System.currentTimeMillis());
        collection.insertOne(doc);
    }
}