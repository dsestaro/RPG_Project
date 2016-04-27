angular.module('character.sheet.app').controller('CharacterSheetController', function ($scope, $window, $location) {
	
	$scope.goToCharacterSheet = function() {
		$window.location.href = 'pages/character-sheet.html';
	}
});