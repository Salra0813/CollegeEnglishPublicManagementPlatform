<template>
  <div class="HomePage">
    <home-carousel></home-carousel>
  </div>
</template>

<script>
import HomeCarousel from "../HomePage/HomeCarousel"
export default {
  name:"HomePage",
  components:{
    HomeCarousel,
  }
}
</script>

<style lang="less" scoped>
.HomePage{
    display: flex;
    flex-direction: column;
    align-items: center;
    .HomeCarousel{
      margin-top: 6rem;
    }
}
</style>