<!doctype html>
<html>
<meta charset="utf-8">
<head>
<title>F-Select-Project</title>
<script	src="jquery-1.11.3.min .js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link href="fSelect.css" rel="stylesheet">
<link href="bootstrap-theme.min.css" rel="stylesheet">
<link href="bootstrap.min.css" rel="stylesheet">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="fSelect.js"></script>
<script src="activiteDescription.js"></script>
<script src="resetActivite.js"></script>
<script src="bootstrap.js"></script>
</head>
<body>
	<div class="container">
		<br>
		<br>
		<div class="fs-wrap multiple" id =testNorme>
			<select class="famille" id=libelleNorme multiple="multiple">
				<option value="cp">C++</option>
				<option value="cs">C#</option>
				<option value="oc">Object C</option>
				<option value="c">C</option>
				<option value="js">JavaScript</option>
				<option value="php">PHP</option>
				<option value="asp">ASP</option>
				<option value="jsp">JSP</option>
			</select>
		</div>
		<div class="fs-wrap multiple">
			<select class="famille" id= "libelleEtape" multiple="multiple">
				<option value="cp">C++</option>
				<option value="cs">C#</option>
				<option value="oc">Object C</option>
				<option value="c">C</option>
				<option value="js">JavaScript</option>
				<option value="php">PHP</option>
				<option value="asp">ASP</option>
				<option value="jsp">JSP</option>
			</select>
		</div>
		<div class="fs-wrap multiple">
			<select class="famille" id="libelleProcessus" multiple="multiple">
				<option value="cp">C++</option>
				<option value="cs">C#</option>
				<option value="oc">Object C</option>
				<option value="c">C</option>
				<option value="js">JavaScript</option>
				<option value="php">PHP</option>
				<option value="asp">ASP</option>
				<option value="jsp">JSP</option>
			</select>
		</div>
		<div class="fs-wrap multiple">
			<select id="testfamille" class="famille" id="libelleFamille"multiple="multiple">
				<option value="cp">C++</option>
				<option value="cs">C#</option>
				<option value="oc">Object C</option>
				<option value="c">C</option>
				<option value="js">JavaScript</option>
				<option value="php">PHP</option>
				<option value="asp">ASP</option>
				<option value="jsp">JSP</option>
			</select>
		</div><button id="unCheckSelect" type="reset" class="glyphicon glyphicon-remove-circle"></button>
		
	</div>
	<script type="text/javascript">
		(function($) {
		    $(function() {
			 $("#unCheckSelect").click(function() {
  				$('.fs-option').removeClass('selected');
  				setTimeout("location.reload(true);",0);
			});	
		    });
		    
		    function cellTooltipContent(inString) {
 				   return "I love " + inString;
			}
		    
		   		$( 'select' ).tooltip({
   			 content: function() { return cellTooltipContent( $(this).val() )}
		});
		})(jQuery);
	</script>
</body>
</html>