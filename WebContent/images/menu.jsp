<!DOCTYPE html>
<html lang="en">
<head>
<title>Front page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="jumbotron" >
				<font style="background-image: url('3.jpg'); height: 40px; width:400px "  ><h2>Farmer to customer direct sell system</h2> </font>
			    <div style='float: right;'><a href="basic/login.jsp">Login</a></div>	
			</div>
			<!-- <div class="row" style="">
			<div class="jumbotron" style="height: 20px">
				<font style="background-color: orange "> </font>
			    <a style="text-align: left"  href="home.jsp">Home</a>
			    
         <div style='float: right;'><a href="login.jsp">Login</a></div>			    
			    
			</div>
			 -->
		
			
<div class="w3-content w3-display-container">
  <img class="mySlides" src="5.jpg" style="width:100%" >
  <img class="mySlides" src="6.jpg" style="width:100%">
  <!-- <img class="mySlides" src="img_mountains.jpg" style="width:20%">
  <img class="mySlides" src="img_forest.jpg" style="width:20%"> -->

  <a class="w3-btn-floating w3-display-left" onclick="plusDivs(-1)">&#10094;</a>
  <a class="w3-btn-floating w3-display-right" onclick="plusDivs(1)">&#10095;</a>
</div>


	<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}
</script>
			
			<div class="col-sm-9" style="background-color: lavender;">
			<a href="abc"><input type="image" src="5.jpg" class="img-circle" alt="vegetables" width="150"
					height="150">vegetables<br></a>
			<a href="pqr"><img src="6.jpg" class="img-circle" alt="grains" width="150" 
					height="150"></a>
			</div>
			<div class="col-sm-3" style="background-color: lavenderblush;">.col-sm-4</div>
	</div>
	</div>
		
	
	</body>
	</html>