'use strict'

angular.module('tienda.services', []).factory('ProductoService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getProductByCode = function(codigoProducto) {
				var url = CONSTANTS.getProductByCode + codigoProducto;
				return $http.get(url);
			}
			service.getAllProducts = function() {
				return $http.get(CONSTANTS.getAllProducts);
			}
			service.saveProduct = function(productoDto) {
				return $http.post(CONSTANTS.saveProduct, productoDto);
			}
			return service;
		} ]);