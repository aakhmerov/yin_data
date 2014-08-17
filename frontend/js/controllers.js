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
                start: $scope.Data.search.history.year,
                range: {
                    'min': [ 2008 ],
                    'max': [ 2014 ]
                },
                step: 1,
                serialization: {
                    lower: [$.Link({
                        target: '-tooltip-<div class="sb-nus-tooltip"></div>',
                        method: function ( value ) {
                            $(this).html(
                                '<span>' + value + '</span>'
                            );
                        }
                    })],
                    format: {
                        decimals: 0,
                        mark: ','
                    }
                }
            };
            $scope.timeFilter.set = function(e, slider) {
                this.Data.search.history.year = Number(slider);
            }.bind($scope);
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
            var lat = 1, lng = 1, timestamp = 0, sideLength = 1;

            api.apartments.get().then(
                // success
                function (response) {
                    $scope.apartments = response.data;
                },
                // error
                function () {}
            );

            api.predictions.get(lat, lng, timestamp, sideLength).then(
                // success rseponse
                function (response) {
                    angular.noop();
                },
                // error response
                function (error) {
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
