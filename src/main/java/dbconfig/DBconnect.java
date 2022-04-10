package dbconfig;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import metier.Etudiant;
import metier.Note;


public class DBconnect {
	
	//public static DB database=null;
	
	@SuppressWarnings("deprecation")
	public DBconnect() {
		super();
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase database = mongoClient.getDatabase("gescom");
	}
	
	public static MongoDatabase getInstance() {
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase database = mongoClient.getDatabase("scolarite");
		
		return database;
	}
	
}



