import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from "axios"
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import './plugins/element.js'


Vue.use(ElementUI)
Vue.config.productionTip = false

Vue.prototype.$axios = axios;
axios.defaults.headers.post["Content-Type"] =
  "application/x-www-form-urlencoded;charset=UTF-8";
axios.defaults.baseURL = "/api";

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
