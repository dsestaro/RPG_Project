angular.module('character.sheet.app').controller('AttributeController', function ($scope, AttributesService) {
	
	$scope.titles = ["Attributes", "Sub-Attributes"];
	
	$scope.getAttributesNames = function() {
		AttributesService.getAttributeNames(null, function(success) {
			$scope.attributesNames = success;
		}, function(error) {
			log("Could not find getAttributeNames method!");
		});
	}
	
	$scope.getAttributesNames();
});