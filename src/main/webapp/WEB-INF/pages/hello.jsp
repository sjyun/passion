<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9/angular.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angular-strap/dist/angular-strap.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angular-strap/dist/angular-strap.tpl.min.js"></script>
	</head>
<body>
	<h1>${message}</h1>
	
	<script type="text/javascript">
	angular.module('myApp', [
	                         'mgcrea.ngStrap.modal',
	                         'mgcrea.ngStrap.aside',
	                         'mgcrea.ngStrap.tooltip'
	                       ]);
	
	$scope.modal = {
			"title": "Title",
			"content": "Hello Modal"
	};
	</script>
	
	<button type="button" class="btn btn-lg btn-primary" data-animation="am-fade-and-scale" data-placement="center" bs-modal="modal">Click to toggle modal
  <br>
  <small>(using an object)</small>
</button>

<!-- You can use a custom html template with the `data-template` attr -->
<button type="button" class="btn btn-lg btn-danger" data-animation="am-fade-and-slide-top" data-template="modal/docs/modal.tpl.demo.html" bs-modal="modal">Custom Modal
  <br>
  <small>(using data-template)</small>
</button>
</body>
</html>