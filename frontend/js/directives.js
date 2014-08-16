'use strict';

/**
 * RequireJS module for angular directives.
 * Directives are for reusable html parts with logic
 * @param  {object} globals
 * @param  {object} angular
 * @param  {object} moment
 * @private
 */
define(['globals', 'angular', 'moment', './configs', './services'],
    function(globals, angular, moment) {

        /**
         * @ngdoc module
         * @name bizregistrator.directives
         * @requires bizregistrator.configs, ui.router
         */
        angular.module(globals.appName + '.directives', [globals.appName + '.configs', 'ui.router']).
            /**
             * @ngdoc directive
             * @name bizregistrator.directives.directive:sampleDirective
             * @restrict EAC
             * @description 
             * @element 
             * @example 
            */               
            directive('sampleDirective', [function() {
                return function(scope, elm, attrs) {
                    angular.noop();
                };
            }]);
    });
