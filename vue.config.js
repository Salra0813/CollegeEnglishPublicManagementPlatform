module.exports = {
    configureWebpack: {
      devServer: {
        proxy: {
          '/api': {
            target: '',
            secure: false,  // 如果是https接口，需要配置这个参数
            ws: true,//是否代理websockets
            changeOrigin: true,
            pathRewrite: {
              '^/api': ''
            }
          }
        }
      }
    }
  };