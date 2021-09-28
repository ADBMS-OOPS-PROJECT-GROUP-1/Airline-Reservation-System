import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

public class JavaDemoInsert {
    public static void main(String[] args){

        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        // Accessing the database
        MongoDatabase database = mongo.getDatabase("Airlines");
        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection("Registration");

        Document item = new Document("_id", new ObjectId());
        item.append("Name","Anushree").append("Age",22).append("Contact",789669967).append("Gender","Female");
        collection.insertOne(item);
    }



}

