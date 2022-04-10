package metier;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;

import dbconfig.DBconnect;

public class deleteTest {

	public static void main(String[] args) {
		  MongoClient mongo = new MongoClient( "localhost" , 27017 );
	      MongoDatabase database = mongo.getDatabase("scolarite");
	      MongoCollection<Document> etudiants = database.getCollection("etudiants");
		 try {
             DeleteResult result = etudiants.deleteOne(Filters.eq("no_etud","e3"));
             System.out.println("Deleted document count: " + result.getDeletedCount());
         } catch (MongoException err) {
             System.err.println("Unable to delete due to an error: " + err);
         }

	}

}
