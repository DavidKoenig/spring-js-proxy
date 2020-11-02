<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld :msg="hello" />
  </div>
</template>

<script>
import HelloWorld from './components/Hello.vue'
import {getHello} from "./service/ExampleService";

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data() {
    return {
      hello: ""
    }
  },
  methods: {
    getHello() {
      getHello().then(response => {
        this.hello = response.hello;
      })
    },
  },
  mounted () {
    this.getHello();
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
