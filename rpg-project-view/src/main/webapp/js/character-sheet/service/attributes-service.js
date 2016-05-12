angular.module('character.sheet.app')
.factory('AttributesService', ['$resource', function($resource) {
	return $resource('//localhost:8080/attributes/:action', 
	{},
	{
		getAttributeNames : {
			method: 'GET',
			isArray: true,
			params: {action: 'getAttributeNames'}
		}
	});
}]);