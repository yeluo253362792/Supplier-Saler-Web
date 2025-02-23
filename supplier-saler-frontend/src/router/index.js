import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Contact from '../views/Contact.vue'
import RawSupplier from '../views/RawSupplier.vue'
import StructuredSupplier from '../views/StructuredSupplier.vue'

const routes = [
  { path: '/', name: 'Home', component: Home },
  { path: '/about', name: 'About', component: About },
  { path: '/contact', name: 'Contact', component: Contact },
  { path: '/raw-supplier', name: 'RawSupplier', component: RawSupplier },
  { path: '/structured-supplier', name: 'StructuredSupplier', component: StructuredSupplier },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
