<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Fashionpress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<title>吉他销售系统</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
</head>
<body>
<div class="container">
	<div class="row">
		<div class="span12">
			<h3 class="text-center">
				吉他销售系统
			</h3>
		</div>
	</div>
	<div class="row-fluid">
		<div class="col-md-6">
				<lable>type</lable>
				<input id="type" type="text" name="type"><br/>
				<lable>builder</lable>
				<input id="builder" type="text" name="builder"><br/>
				<lable>backwood</lable>
				<input id="backwood" type="text" name="backwood"><br/>
				<lable>topwood</lable>
				<input id="topwood" type="text" name="topwood"><br/>
				<input type="button"  id="search" value="搜索">
		</div>
		<div class="col-md-6">
			<table class="table">
				<thead>
					<tr>
						<th>
							type
						</th>
						<th>
							builder
						</th>
						<th>
							topwood
						</th>
						<th>
							backwood
						</th>
					</tr>
				</thead>
				<tbody id="result">
					<tr class="info">
						<td>
							4
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							04/04/2012
						</td>
						<td>
							Call in to confirm
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript" src="js/bookstrap.js"></script>
<script src="js/jquery-1.8.2.min.js"></script>

<script type="text/javascript">
var type=null;
var builder=null;
var topwood=null;
var backwood=null;
$("#search").click(function(){
	alert("213123");	 
type=$("#type").val();
builder=$("#builder").val();
topwood=$("#topwood").val();
backwood=$("#backwood").val();
	alert(type);
	filter();
});
function filter() {
	$.get("SearchGuitar", {type:type,builder:builder,topwood:topwood,backwood:backwood},function(n){
			var html = "";
			alert("asdas22");
			$("#result tr").remove();//除了第一行都删了。 
			for (var i=0; i < n.rows.length; i++) {
			var r = n.rows[i];
			html+="<tr class=\"info\"><td>"+r.type+"</td><td>"+r.builder+"</td><td>"+r.topwood+"</td><td>"+r.backwood+"</td><tr>";
		}
			$("#result").append(html);
	});
}
	
 	
</script>

</body>
</html>