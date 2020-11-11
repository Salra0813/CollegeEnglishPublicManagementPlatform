import Vue from 'vue'
import {Button,Carousel,CarouselItem, 
    Form,FormItem,Input,Radio,RadioGroup,Notification} from 'element-ui'

Vue.use(Button)
Vue.use(Carousel)
Vue.use(CarouselItem)
Vue.use(Form);
Vue.use(FormItem);
Vue.use(Input);
Vue.use(Radio);
Vue.use(RadioGroup);

Vue.prototype.$notify = Notification; //提示弹窗组件