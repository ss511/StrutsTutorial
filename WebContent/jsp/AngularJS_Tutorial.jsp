<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Angular JS Tutorial</title>
<script src="../js/angular.min.js"></script>
<!--  <script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script> -->
</head>
<body>
<!-- ng-app: defines an angular js application
	 ng-model: bind input control to application data
	 ng-bind: bind application data to HTML view
	 use data-ng in case of HTML 5
	 ng-init to initialize application variable
	 {{}} for expression
	 ng-init="person={firstName:'', lastName:''}" object
	 ng-init="points=[1,2,3,4,5]" array
	 ng-repeat for looping
 -->
	<div ng-app="myapp" ng-controller="MyController">
		<p>Name: <input type="text" ng-model="name" /></p>
		<p>Gender: <input type="radio" ng-model="gender" value="Male"/>Male &nbsp; <input type="radio" ng-model="gender" value="Female"/>Female</p>
		<p>Your Salary: <input type="number" ng-model="salary" /></p>
		<p>Your Spouse Salary: <input type="number" ng-model="spouse_salary" /></p>
		Profession. Filter Profession: <input type="text" ng-model="test" />
		<ul>
		<li ng-repeat="x in profession | filter:test">
      		<input type="radio" ng-model="proff" name="prof" value="{{x}}"/>{{x}}
    	</li>
    	</ul>
		<hr/>
		<p>Your name is <span ng-bind="name"></span></p>
		<p>Your gender is <span ng-bind="gender"></span></p>
		<p>Total Family income: {{salary+spouse_salary}}</p>
		<p>Total Family income: <span ng-bind="salary + spouse_salary"></span></p>
		<p>Your Profession: <span ng-bind="proff"></span></p>
		<p ng-hide="shallHide">Suggested User Id: {{getUserId() | lowercase}}</p>
		<button ng-click="toggle()">Toggle View</button>
	</div>
	<script>
		angular.module("myapp",[]).controller("MyController", function($scope){
			$scope.profession = ['software developer','manager','admin'],
			$scope.getUserId = function(){
				return $scope.name+"_"+$scope.gender;
			},
			$scope.shallHide = false;
			$scope.toggle = function(){
				$scope.shallHide = !$scope.shallHide;
			}
		});
	</script>
</body>

</html>