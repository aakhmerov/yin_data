'use strict';

/**
 * Module that defines initial configuration of the app
 * @param  {object} globals
 * @param  {object} angular
 * @param  {object} controllers
 * @private
 */
define(['globals', 'angular', './controllers', 'angular-ui-router'], function(global, angular, controllers) {

    /**
     * @ngdoc module
     * @name smartInvestor.configs
     * @requires ui.router
     * @description Module that contains configurations of the app
     */
    angular.module(global.appName + '.configs', ['ui.router']).
    // configuration of the main app
    // contains routes for the app and other configs
    config(['$stateProvider', '$urlRouterProvider', '$locationProvider',
        function($stateProvider, $urlRouterProvider, $locationProvider) {
            var basePartialsUrl = window.location.protocol + '//' + window.location.host + '/partials/';
            $urlRouterProvider.otherwise('/');
            $stateProvider
                .state('home', {
                    url: '/',
                    views: {
                        'main': {
                            templateUrl: basePartialsUrl + 'home.html',
                            controller: controllers.HomeController
                        }
                    }
                })
                .state('search', {
                    url: '/search',
                    views: {
                        'main': {
                            templateUrl: basePartialsUrl + 'search.html',
                            controller: controllers.SearchController
                        }
                    }
                })
                .state('hiw', {
                    url: '/how-it-works',
                    views: {
                        'main': {
                            templateUrl: basePartialsUrl + 'hiw.html',
                            controller: controllers.HIWController
                        }
                    }
                })
                .state('about-us', {
                    url: '/about-us',
                    views: {
                        'main': {
                            templateUrl: basePartialsUrl + 'about-us.html',
                            controller: controllers.AboutUsController
                        }
                    }
                });             
            $locationProvider.html5Mode(true);
        }
    ]);

});
