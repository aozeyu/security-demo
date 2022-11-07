<template>
 <h1 style="background-color: black">{{msg}}</h1>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return{
      msg: ''
    }
  },
  mounted() {
    fetch("/api/messages/hello").then(response => {
      response.text()
    }).then(data => {
      this.msg = data;
    })
  }
}
</script>
