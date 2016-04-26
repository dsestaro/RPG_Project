angular.module('index.app').controller('IndexController', function ($scope, $window, $location) {
	
	$scope.goToCharacterSheet = function() {
		$window.location.href = 'pages/character-sheet.html';
	}
});