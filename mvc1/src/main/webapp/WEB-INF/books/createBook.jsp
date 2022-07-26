<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  </head>
 <body>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	<div class="container mt-5">
	
	<c:if test="${seuccess != null}">
	<div class="aleart aleart-success"><c:out value="${seuccess}"  /></div>
	</c:if>
	
	
	
	
	<form method="post">
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Title:</label>
		    <input type="text" name="title" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		  </div>
		  
		    <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Languages:</label>
		    <input type="text" name="languages" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		  </div>
		  
		    <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Pages:</label>
		    <input type="text" name="pages" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		  </div>
		  
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Description:</label>
		    <input type="text" name="discription" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		  </div>
		  
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>

	</div>
</body>
</html>