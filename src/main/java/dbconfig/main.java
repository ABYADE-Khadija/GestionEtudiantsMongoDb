package dbconfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.descending;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;

import metier.Etudiant;
import metier.Note;

public class main {

	public static void main(String[] args) {
		
		Note note=new Note("java",15.0);
		Note note1=new Note("mongo",18.0);
		Note note2=new Note("Python",16.0);
		
		ArrayList<Note> listNotes=new ArrayList<Note>();
		listNotes.add(note);
		listNotes.add(note1);
		listNotes.add(note2);
		
		Etudiant et= new Etudiant("1", "KANANE", "Essaouira", "01/01/1998", listNotes);
		Etudiant et1= new Etudiant("2", "ABYADE", "Casablanac", "04/04/1998", listNotes);
			
		//System.out.println(et);
		//System.out.println(et1);
		
		//SelectService.AddStudent(et);
		//SelectService.AddStudent(et1);
		SelectService.AllStudents();
		
		
        
		
	}

}
