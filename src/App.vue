<template>
  <div id="app">
    <header>
      <the-header></the-header>
    </header>
    <div class="body"><router-view></router-view></div>
    <footer>
      <the-footer></the-footer>
    </footer>
  </div>
</template>

<script>
import TheHeader from "../src/components/TheHeader";
import TheFooter from "../src/components/TheFooter";

export default {
  name: "app",
  components: {
    TheHeader,
    TheFooter,
  },
};
</script>

<style lang = "less">
@import url("/src/style/Common.less");
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

html {
  font-size: calc(100vw / 80);
}

#app {
  display: flex;
  min-height: 100vh;
  flex-direction: column;
  header {
    z-index: 2;
  }
  .body {
    z-index: 1;
    flex: 1;
    background-color: white;
  }
}

/* 滚动条样式修改 */
::-webkit-scrollbar {
    width: 10px;
    
}
 
::-webkit-scrollbar-track {
    --webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
    border-radius: 10px;
}
 
::-webkit-scrollbar-thumb {
    border-radius: 5px;
    background:@brandcolor;
    --webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.5);
}
 
::-webkit-scrollbar-thumb:window-inactive {
    background: @brandcolor;

}
</style>
