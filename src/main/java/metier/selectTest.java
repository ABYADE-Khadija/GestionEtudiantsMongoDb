package metier;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import dbconfig.DBconnect;
import dbconfig.SelectService;

public class selectTest {

	public static void main(String[] args) {
		
		ArrayList<Etudiant> l = SelectService.AllStudents();
		
		/*DBconnect db= new DBconnect();
		//Connect with a collection exist on database
		DBCollection etudiants = db.database.getCollection("etudiants");
		DBCursor cursor = etudiants.find();
		ArrayList<Etudiant> etudiantsL = new ArrayList();
		while (cursor.hasNext()) {
			Etudiant e = new Etudiant();
			ArrayList<Note> notes = new ArrayList<Note>();
			
			DBObject o = (DBObject) cursor.next();
			List<DBObject> mongoNotes = (List<DBObject>)o.get("notes");
			
			for (DBObject n : mongoNotes) {
				Note note = new Note((String)n.get("matiere"),(Double)n.get("note"));
				notes.add(note);
			}
			
			e.setNo_etud((String)o.get("no_etud"));
			e.setNom((String)o.get("nom"));
			e.setAdresse((String)o.get("adresse"));
			e.setDat_nais((String)o.get("dat_nais"));
			e.setNotes(notes);
            etudiantsL.add(e);
        }
		for (Etudiant etudiant : etudiantsL) {
			System.out.println(etudiant.toString());
			for (Note l : etudiant.getNotes()) {
				System.out.println(l.toString());
			}
		}*/

	}

}
