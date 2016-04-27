angular.module('character.sheet.app').controller('CharacterSheetController', function ($scope, $window, $location) {
	
	$scope.getCharacterInformatioPage = function() {
		return 'tabs/character-information.html';
	}
	
	$scope.getCharacterAttributesPage = function() {
		return 'tabs/character-attributes.html';
	}
	
	$scope.getCharacterSavingThrowsPage = function() {
		return 'tabs/character-information.html';
	}
});