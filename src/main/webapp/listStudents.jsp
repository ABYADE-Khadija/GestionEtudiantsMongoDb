
<%@page import="org.bson.Document"%>
<%@page import= "java.util.ArrayList,metier.*, dbconfig.*" %>


<%ArrayList<Etudiant> etudiants = new ArrayList();
DBconnect db= new DBconnect();
etudiants= SelectService.AllStudents();
%>

<!DOCTYPE html>
<head>
	<title>test</title>
	
	<link rel="stylesheet" type="text/css" href="tableau.css"  > 
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">	
	<script src="https://kit.fontawesome.com/dc70a27419.js" crossorigin="anonymous"></script>

</head>
<script>
function deleteStudent(e){
	document.getElementById("no_etud").value = e;
	document.getElementById("myform").submit();
	}

</script>

<body  class="body" >
<h1 style="font-size: 30px;font-family: 'georgia';font-weight: bold;text-align: center;margin : 25px;">Service Scolarite</h1>
	</br></br></br></br>
	<div id="tabDiv">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8 offset-md-2 col-sm-10 offset-sm-1" >	
	<table class="table table-striped table-bordered table-hover table-sm table-responsive " style="text-align:center" >
		<thead class="thead-dark">
			<tr >
				<th style="text-align: center;">Code etudiant</th>
				<th style="text-align: center; width: 200px">Nom complet</th>
				<th style="text-align: center; width: 200px">Adresse</th>
				<th style="text-align: center; width: 200px">date de naissance</th>
				<th style="text-align: center; width: 200px">Notes</th>
				<th class="bg-danger">operations</th>
			</tr>
		</thead>
	   <tbody class="">
		<% int c=0;
		for (Etudiant e : etudiants) { %>
			<tr class="trow">
				<td style="text-align: center; width: 225px"> <%= c+1 %></td>
				<td style="text-align: center; width: 225px"><%=e.getNom()%></td>
				<td style="text-align: center; width: 225px"><%=e.getAdresse()%></td>
				<td style="text-align: center; width: 225px"><%=e.getDat_nais()%></td>
				<td style="text-align: center; width: 225px">
					 	<%c++; 
					 	for (Note n : e.getNotes() ) { %>
							<p class="notes"><%=n.getMatiere().toString() %> : <%=n.getNote().toString() %> </p>	
						<%  } %>
				</td>	
				<td class="bg-danger" style="text-align: center; width: 125px">
						<i class="fas fa-user-edit mod" style="margin-right: 10px"></i>
						<i class="fas fa-trash supp"  style="margin-left:10px"onclick="deleteStudent('<%=e.getNo_etud()%>')"></i>
				</td>	
			</tr>	
		<%} %>
	   </tbody>
		</table>
		<form id ="myform" action="app" method="get" hidden="true"><input id="no_etud" type="text" value="ed1" name="no_etud"><input class="fas fa-user-edit mod" type="submit" name=""></form>
		</div>
		</div>
		</div>
		</div>
		</body>