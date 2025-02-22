import { createRouter, createWebHistory } from 'vue-router';

import RawSupplierList from '@/views/RawSupplierList.vue';
import StructuredSupplierList from '@/views/StructuredSupplierList.vue';
import WholesalePriceList from '@/views/WholesalePriceList.vue';

const routes = [
  {
    path: '/',
    redirect: '/raw-suppliers'
  },
  {
    path: '/raw-suppliers',
    name: 'RawSupplierList',
    component: RawSupplierList
  },
  {
    path: '/structured-suppliers',
    name: 'StructuredSupplierList',
    component: StructuredSupplierList
  },
  {
    path: '/wholesale-prices',
    name: 'WholesalePriceList',
    component: WholesalePriceList
  }
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
});

export default router;
