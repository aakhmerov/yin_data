'use strict';

/**
 * RequireJS Module for angular services, providers, factories, decorators, values and constants
 * @param  {[type]} global
 * @param  {[type]} angular
 * @param  {[type]} moment
 * @return {[type]}
 * @private
 */
define(['globals', 'angular', 'moment', './configs'],
    function(globals, angular, moment) {

        /**
         * @ngdoc module
         * @name smartInvestor.services
         * @requires bizregistrator.configs
         * @description Service module
         */
        angular.module(globals.appName + '.services', [globals.appName + '.configs']).
        
        /**
         * @ngdoc value
         * @name smartInvestor.services.value:version
         * @description version of the app
         */
        value('version', '0.0.2').
                
        /**
         * @ngdoc provider
         * @name smartInvestor.services.provider:Utils
         * @param  {object} $window
         * @return {[type]}
         */
        factory('Utils', ['$window',
            function($window) {
                var baseUrl = $window.location.origin + '/assets/';
                return {
                    baseUrl: baseUrl
                };
            }
        ]).
        
        /**
         * @ngdoc provider
         * @name smartInvestor.services.provider:Data
         * @description  Common Data service that represents services not directly linked with
         * server models but used across controllers
         * @param  {Object} api
         * @return {Object}
         */
        factory('Data', ['api',
            function(api) {
                var model = {
                    search: {
                        history: {
                            year: 2013
                        }
                    }
                };
                return model;
            }
        ]).
        
        /**
         * @ngdoc provider
         * @name smartInvestor.services.provider:api
         * @description API
         * @return {[type]}
         */
        factory('api', ['$http', '$state',
            function($http, $state) {
                
                var lat, lng, timestamp, sideLength, limit;

                var api = {
                    predictions: {
                        get: function(lat, lng, timestamp, sideLength) {
                            return $http({
                                method: 'GET',
                                // url: '/api/predictions',
                                url: '../dummy_data/predictions.json',
                                params: {
                                    lat: lat,
                                    lng: lng,
                                    timestamp: timestamp,
                                    sideLength: sideLength
                                }
                            });
                        }
                    },
                    apartments: {
                        get: function() {
                            return $http({
                                method: 'GET',
                                url: '/dummy_data/best_apartments.json', // replace with real api url
                                data: {
                                    lat: lat,
                                    lng: lng,
                                    limit: 5
                                }
                            });
                        }
                    }
                };
                return api;
            }
        ]);

    });
