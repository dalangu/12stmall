
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderPlacementManager from "./components/listers/OrderPlacementCards"
import OrderPlacementDetail from "./components/listers/OrderPlacementDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import StockManager from "./components/listers/StockCards"
import StockDetail from "./components/listers/StockDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderPlacements',
                name: 'OrderPlacementManager',
                component: OrderPlacementManager
            },
            {
                path: '/orderPlacements/:id',
                name: 'OrderPlacementDetail',
                component: OrderPlacementDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/stocks',
                name: 'StockManager',
                component: StockManager
            },
            {
                path: '/stocks/:id',
                name: 'StockDetail',
                component: StockDetail
            },




    ]
})
