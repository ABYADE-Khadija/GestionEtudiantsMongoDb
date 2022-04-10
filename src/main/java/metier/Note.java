package metier;

import java.util.Date;

public class Note {
	private int id;
	private String matiere;
	private Double note;
	public Note(int id, String matiere, Double note) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.note = note;
	}
	public Note(String matiere, Double note) {
		super();
		this.matiere = matiere;
		this.note = note;
	}
	
	public Note() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", matiere=" + matiere + ", note=" + note + "]";
	}
	
	
}
