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
    controllers.BaseController = ['$scope', '$state', 'Data', 'api',
        function($scope, $state, Data, api) {
            $scope.$state = $state;
            $scope.Data = Data;
            $scope.api = api;

            $scope.timeFilter = {
                start: [0, 10000],
                range: {
                    'min': [ 0 ],
                    'max': [ 10000 ]
                },
                connect: true,
                step: 100,
                margin: 1000,
                serialization: {
                    upper: [$.Link({
                        target: '-tooltip-<div class="sb-nus-tooltip"></div>',
                        method: function ( value ) {
                            $(this).html(
                                '<span>' + value + '</span>'
                            );
                        }
                    })]
                }
            };
            $scope.timeFilter.set = function(e, slider) {
                angular.noop(); // TODO api call
            }
            $scope.timeFilter.slide = function(e, slider) {
                // var slider = angular.element(e.currentTarget);
                // var sliderWidth = angular.element(e.currentTarget).width();
                // var tip = angular.element(e.currentTarget).find(".sb-nus-tooltip");
                // tip.each(function(i, el) {
                //     if (angular.element(el).offset().left < slider.offset().left - 5) {
                //         angular.element(el).offset({top:angular.element(el).offset().top, left:slider.offset().left - 5});
                //     }
                //     // if (angular.element(el).offset().left >= slider.offset().left - 5) {
                //     //     angular.element(el).offset({top:angular.element(el).offset().top, left:slider.offset().left - 5});
                //     // }
                // });
            }

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
    controllers.HomeController = ['$scope', '$state', 'Data', 'api',
        function($scope, $state, Data, api) {
            $scope.$state = $state;
        }
    ];

    /**
     * @ngdoc object
     * @name smartInvestor.controller:SearchController
     * @description Controller of What We Offer page
     * @requires $scope
     * @requires smartInvestor.services.Data
     * @requires smartInvestor.services.api
     */
    controllers.SearchController = ['$scope', 'Data', 'api',
        function($scope, Data, api) {
            var lat, lng, radius;


            // api.predictions.get(lat, lng, radius).then(
            //     // success rseponse
            //     function (response) {
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
                // },
                // // error response
                // function (response) {
                //     // think about error handling
                // }
            // );
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
