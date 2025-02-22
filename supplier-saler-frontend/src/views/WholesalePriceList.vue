<template>
  <div>
    <el-table :data="wholesalePrices" style="width: 100%">
      <el-table-column prop="id" label="ID" width="50"></el-table-column>
      <el-table-column prop="minQuantity" label="Min Quantity"></el-table-column>
      <el-table-column prop="price" label="Price"></el-table-column>
    </el-table>
  </div>
</template>

<script>
import api from '@/api';

export default {
  data() {
    return {
      wholesalePrices: []
    };
  },
  created() {
    this.fetchWholesalePrices();
  },
  methods: {
    async fetchWholesalePrices() {
      const response = await api.get('/supplier/structured/1/prices');
      this.wholesalePrices = response.data;
    }
  }
};
</script>
