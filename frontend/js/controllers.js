'use strict';

/**
 * Contorllers module. Defines controllers for Angular app
 * @param  {object} angular AngularJS
 * @param  {object} moment  MomentJS
 * @return {object}         Collection of controllers
 * @private
 */
define(['angular', 'moment', './filters'], function(angular, moment) {

    var controllers = {};

    /**
     * @ngdoc object
     * @name smartInvestor.controller:BaseController
     * @description Base controller. Loads with the app.
     * All other controllers inherit scope from it
     * @requires $scope
     * @requires smartInvestor.services.Data
     * @requires smartInvestor.services.api
     */
    controllers.BaseController = ['$scope', 'Data', 'api',
        function($scope, Data, api) {
            $scope.Data = Data;
            $scope.api = api;
        }
    ];

    /**
     * @ngdoc object
     * @name smartInvestor.controller:HomeController
     * @description Controller of Home page
     * @requires $scope
     * @requires smartInvestor.services.Data
     * @requires smartInvestor.services.api
     */
    controllers.HomeController = ['$scope', 'Data', 'api',
        function($scope, Data, api) {
            
        }
    ];

    /**
     * @ngdoc object
     * @name smartInvestor.controller:WWOController
     * @description Controller of What We Offer page
     * @requires $scope
     * @requires smartInvestor.services.Data
     * @requires smartInvestor.services.api
     */
    controllers.SearchController = ['$scope', 'Data', 'api',
        function($scope, Data, api) {
            var lat, lng, radius;
            api.predictions.get(lat, lng, radius).then(
                // success rseponse
                function (response) {
                    /*
                     * response object will look like this:
                     {
                        // one entry for each grid containing all the price values
                        // for the past years
                        {
                            lat1: Number,
                            lng1: Number,
                            lat2: Number,
                            lng2: Number,
                            prices: {
                                averageSellprices...
                            }
                        }
                     }
                    **/
                },
                // error response
                function (response) {
                    // think about error handling
                }
            );
        }
    ];

    /**
     * @ngdoc object
     * @name smartInvestor.controller:HIWController
     * @description Controller of How it works page
     * @requires $scope
     * @requires smartInvestor.services.Data
     * @requires smartInvestor.services.api
     */
    controllers.HIWController = ['$scope', 'Data', 'api',
        function($scope, Data, api) {

        }
    ];

    /**
     * @ngdoc object
     * @name smartInvestor.controller:AboutUsController
     * @description Controller of About us page
     * @requires $scope
     * @requires smartInvestor.services.Data
     * @requires smartInvestor.services.api
     */
    controllers.AboutUsController = ['$scope', 'Data', 'api',
        function($scope, Data, api) {

        }
    ];

    return controllers;

});
