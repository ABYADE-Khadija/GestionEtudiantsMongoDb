package dbconfig;

import java.util.*;

import org.bson.BsonArray;
import org.bson.BsonDocument;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.codecs.BsonValueCodec;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DBObjectCodec;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import metier.*;

public  class SelectService {
	
		
	public static MongoDatabase db=DBconnect.getInstance();
   
	public static boolean AddStudent(Etudiant etu) {
 
	      //Creating a collection
	      try{
	    	  db.createCollection("etudiants"); 
	    	  System.out.println("Collection created successfully");
	      }catch(Exception e) { }
	      
	      //Preparing a document
	      Document document = new Document();
	      document.append("no_etud", etu.getNo_etud());
	      document.append("nom", etu.getNom());
	      document.append("adresse",etu.getAdresse() );
	      document.append("dat_nais",etu.getDat_nais());
	      
	      Collection<Document> listNotes= new ArrayList<Document>();
	      
	      
	      for (Note no : etu.getNotes()) {
	    	  Document doc = new Document();
		      doc.append("matiere",no.getMatiere() );
		      doc.append("note", no.getNote());
		      listNotes.add(doc); 
		  }
	      document.append("notes",listNotes);  
	     
	      //Inserting the document into the collection
	      db.getCollection("etudiants").insertOne(document);
	      System.out.println("Document inserted successfully");
 
		return true;
	}
	
	
	public static ArrayList<Etudiant> AllStudents() {
		ArrayList<Etudiant> etudiantsL = new ArrayList();
		
		
		MongoCollection<Document> etudiants = db.getCollection("etudiants");
		FindIterable<Document> data=etudiants.find();
		Iterator<Document> it=data.iterator();
		
		while (it.hasNext()) { 
		    Document doc=it.next();
		    
		    ArrayList<Note> notesL = new ArrayList();
		  //Note
			ArrayList<Document> notes = new ArrayList<Document>();
			notes=(ArrayList<Document>) doc.get("notes");
			Iterator<Document> noIt=notes.iterator();
			
			while(noIt.hasNext()) {
				Document docs=noIt.next();
				Note note= new Note();
				note.setMatiere((String) docs.get("matiere"));
				note.setNote((Double) docs.get("note"));
				notesL.add(note);
			}
			
			//Etudiant
			Etudiant e = new Etudiant();
			e.setNo_etud((String)doc.get("no_etud"));
			e.setNom((String)doc.get("nom"));
			e.setAdresse((String)doc.get("adresse"));
			e.setDat_nais((String)doc.get("dat_nais"));
			
			
			e.setNotes(notesL);	
            etudiantsL.add(e);
            System.out.println(e);
		}
		return etudiantsL;
	}
	
	
}
