<template>
  <div>
    <!-- <h1>{{ message }}</h1> -->
    <!-- <element-view></element-view> -->
    <!-- 员工管理 -->
    <EmpView></EmpView>

  </div>
</template>

<script>
// import ElementView from "./views/element/ElementView.vue";
// import ElementView from './views/element/ElementView.vue';
import EmpView from './views/tlias/EmpView.vue';
export default {
  components:{EmpView},
  data() {
    return {
      message:"Hello Vue"
    }
  },
  methods: {

  }
}
</script>

<style>


</style>
