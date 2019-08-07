'use strict'

var tiendaApp = angular.module('tienda', [ 'ui.bootstrap', 'tienda.controllers',
		'tienda.services' ]);
tiendaApp.constant("CONSTANTS", {
	getProductByCode : "/producto/getProductByCode/",
	getAllProducts : "/producto/getAllProducts",
	saveProduct : "/producto/saveProduct"
});