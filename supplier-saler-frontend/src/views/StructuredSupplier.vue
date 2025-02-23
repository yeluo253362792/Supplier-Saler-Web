<template>
  <div class="structured-supplier-container">
    <el-table :data="structuredSuppliers" style="width: 100%">
      <el-table-column prop="id" label="ID" width="50"></el-table-column>
      <el-table-column label="Name">
        <template #default="scope">
          <a :href="scope.row.url" target="_blank">{{ scope.row.name }}</a>
        </template>
      </el-table-column>
      <el-table-column prop="url" label="URL"></el-table-column>
    </el-table>
  </div>
</template>

<script>
import api from '@/api';

export default {
  data() {
    return {
      structuredSuppliers: []
    };
  },
  created() {
    this.fetchStructuredSuppliers();
  },
  methods: {
    async fetchStructuredSuppliers() {
      const response = await api.get('/supplier/structured');
      this.structuredSuppliers = response.data;
    }
  }
};
</script>

<style scoped>
.structured-supplier-container {
  position: relative;
  z-index: 1; /* 确保表格的 z-index 不会覆盖下拉菜单 */
}

.el-table {
  overflow: visible; /* 确保表格内容不会限制下拉菜单的显示 */
}
</style>
