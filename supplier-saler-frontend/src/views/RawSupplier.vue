<template>
  <div class="raw-supplier-container">
    <el-table :data="rawSuppliers" style="width: 100%">
      <!-- ID 列，链接跳转 -->
      <el-table-column prop="id" label="ID" width="50">
        <template #default="scope">
          <a :href="scope.row.url" target="_blank">{{ scope.row.id }}</a>
        </template>
      </el-table-column>

      <!-- URL 列 -->
      <el-table-column prop="url" label="URL"></el-table-column>

      <!-- Content 列，支持缩略展示和展开 -->
      <el-table-column prop="content" label="Content">
        <template #default="scope">
          <div>
            <span v-if="!scope.row.expanded">
              {{ scope.row.content.length > 50 ? scope.row.content.slice(0, 50) + '...' : scope.row.content }}
            </span>
            <span v-else>
              {{ scope.row.content }}
            </span>
            <el-button
              type="text"
              size="mini"
              @click="toggleContent(scope.row)"
            >
              {{ scope.row.expanded ? '收起' : '展开' }}
            </el-button>
          </div>
        </template>
      </el-table-column>

      <!-- 操作列 -->
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
      this.rawSuppliers = Array.isArray(response.data)
        ? response.data.map(item => ({ ...item, expanded: false })) // 初始化 expanded 状态
        : [];
    },
    async deleteRawSupplier(id) {
      await api.delete(`/supplier/raw/${id}`);
      this.fetchRawSuppliers();
    },
    toggleContent(row) {
      row.expanded = !row.expanded; // 切换 expanded 状态
    }
  }
};
</script>

<style scoped>
.raw-supplier-container {
  position: relative;
  z-index: 1; /* 确保表格的 z-index 不会覆盖下拉菜单 */
}

.el-table {
  overflow: visible; /* 确保表格内容不会限制下拉菜单的显示 */
}
</style>
