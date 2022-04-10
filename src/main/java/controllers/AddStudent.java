package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Etudiant;
import metier.Note;

/**
 * Servlet implementation class servlete
 */
@WebServlet("/servlete")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> matiers=new ArrayList<String>();
		matiers.add("java");matiers.add("mongodb");matiers.add("python");
		
 		String nom= request.getParameter("nom");
		String ville= request.getParameter("ville");
		String dateNaiss= request.getParameter("date_naissance").toString();
		
		System.out.println(nom+" "+ville+" "+dateNaiss);
		
		
		//Les notes
		Double java= Double.parseDouble(request.getParameter("java"));
		Double mongodb= Double.parseDouble(request.getParameter("mongodb"));
		Double python= Double.parseDouble(request.getParameter("python"));
		
		
		ArrayList<Note> notes=new ArrayList<Note>();
		notes.add(new Note("java",java));
		notes.add(new Note("mongodb",mongodb));
		notes.add(new Note("python",python));
		
		
		Etudiant et=new Etudiant(nom, ville, dateNaiss,notes);
		SelectService.AddStudent(et);
	    
		request.getRequestDispatcher("/").forward(request, response);
		
		
		
	}

}






