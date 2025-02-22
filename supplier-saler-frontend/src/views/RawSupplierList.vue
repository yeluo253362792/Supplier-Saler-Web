<template>
  <div>
    <el-table :data="rawSuppliers" style="width: 100%">
      <el-table-column prop="id" label="ID" width="50"></el-table-column>
      <el-table-column prop="url" label="URL"></el-table-column>
      <el-table-column prop="content" label="Content"></el-table-column>
      <el-table-column label="操作">
        <template #default="scope">
          <el-button size="mini" @click="deleteRawSupplier(scope.row.id)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import api from '@/api';

export default {
  data() {
    return {
      rawSuppliers: []
    };
  },
  created() {
    this.fetchRawSuppliers();
  },
  methods: {
    async fetchRawSuppliers() {
      const response = await api.get('/supplier/raw');
      console.log(response.data); // 打印返回的数据
      this.rawSuppliers = Array.isArray(response.data) ? response.data : [];
    },
    async deleteRawSupplier(id) {
      await api.delete(`/supplier/raw/${id}`);
      this.fetchRawSuppliers();
    }
  }
};
</script>
