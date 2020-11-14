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
</style>
