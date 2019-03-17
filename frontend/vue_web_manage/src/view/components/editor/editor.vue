<template>
  <div>
   <div id="websiteEditorElem" style="height: 250px"></div>
  </div>
</template>

<script>
import E from 'wangeditor'
export default {
  name: 'editor_page',
  components: {
    E
  },

mounted () {
      // wangeditor
     var phoneEditor = new E('phoneEditorElem')
      phoneEditor.onchange = function () {
        this.formData.phone = this.$txt.html()
      }
      phoneEditor.create()
    }
}
</script>

<style>

</style>
