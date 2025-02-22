<template>
  <div>
    <el-table :data="structuredSuppliers" style="width: 100%">
      <el-table-column prop="id" label="ID" width="50"></el-table-column>
      <el-table-column prop="name" label="Name"></el-table-column>
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
