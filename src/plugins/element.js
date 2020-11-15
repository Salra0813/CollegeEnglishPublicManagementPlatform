import Vue from 'vue'
import {Button,Carousel,CarouselItem, 
    Form,FormItem,Input,Radio,RadioGroup,Dialog,Notification,Menu,Submenu,MenuItem,MenuItemGroup, Container,
    Header,
    Aside,
    Main,
    Footer,} from 'element-ui'

Vue.use(Button)
Vue.use(Carousel)
Vue.use(CarouselItem)
Vue.use(Form);
Vue.use(FormItem);
Vue.use(Input);
Vue.use(Radio);
Vue.use(RadioGroup);
Vue.use(Dialog);
Vue.use(Input);
Vue.use(Radio);
Vue.use(RadioGroup);
Vue.use(Dialog);
Vue.use(Menu);
Vue.use(Submenu);
Vue.use(MenuItem);
Vue.use(MenuItemGroup);
Vue.use(Container);
Vue.use(Header);
Vue.use(Aside);
Vue.use(Main);
Vue.use(Footer);

Vue.prototype.$notify = Notification; //提示弹窗组件