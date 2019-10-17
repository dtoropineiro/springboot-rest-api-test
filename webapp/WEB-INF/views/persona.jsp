<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Persona Info</title>
    <spring:url value="/resources" var="urlPublic" />
	<spring:url value="/persona" var="urlPersonas" />
    <link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${urlPublic}/bootstrap/css/theme.css" rel="stylesheet">
    
  </head>

  <body>

    <jsp:include page="../includes/menu.jsp"></jsp:include>
    
    <div class="container theme-showcase" role="main">

      <h3>Persona Info</h3>

            
      <a href="${urlCreate}" class="btn btn-success" role="button" title="New Persona" >New</a><br><br>
	
      <div class="table-responsive">
        <table class="table table-hover table-striped table-bordered">
            <tr>
                <th>Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Phone Number</th>
                <th>Hair Colour</th>
            </tr>
            
            <c:forEach var="persona" items="${personas.content}">
			  <tr>
				<td>${persona.name}</td>
				<td>${persona.lastName}</td>
				<td>${persona.address}</td>
				<td>${persona.phoneNumber}</td>
				<td>${persona.hairColour}</td>
				<td>
					<a href="#" class="btn btn-success btn-sm" role="button" title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
					<a href="#" class="btn btn-danger btn-sm" role="button" title="Delete"><span class="glyphicon glyphicon-trash"></span></a>
				</td>
				<td>
							<a href="${urlPersonas}/edit/${persona.id}" class="btn btn-success btn-sm" role="button" title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
							<a href="${urlPersonas}/delete/${persona.id}" onclick='return confirm("Are you sure?")' class="btn btn-danger btn-sm" role="button" title="Delete"><span class="glyphicon glyphicon-trash"></span></a>
						</td>
			  </tr>
			</c:forEach>
            
        </table>
      </div>
          
      <hr class="featurette-divider">

      

    </div> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>     
  </body>
</html>
