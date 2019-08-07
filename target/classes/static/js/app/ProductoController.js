'use strict'

var module = angular.module('tienda.controllers', []);
module.controller("ProductoController", [ "$scope", "ProductoService",
		function($scope, ProductoService) {

			$scope.productoDto = {
				CodigoProducto : null,
				NombreProducto : null,
				bodegas : []
			};
			$scope.bodegas = [];

			ProductoService.getProductByCode(1).then(function(value) {
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});

			$scope.saveProduct = function() {
				$scope.productoDto.bodegas = $scope.skills.map(bodega => {
					return {CodigoBodega: null, NombreBodega: bodega};
				});
				ProductoService.saveProduct($scope.productoDto).then(function() {
					console.log("works");
					ProductoService.getAllProducts().then(function(value) {
						$scope.allProducts= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.bodegas = [];
					$scope.productoDto = {
						CodigoProducto : null,
						NombreProducto : null,
						bodegas : []
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);