<template>
  <div id="main">
    <!-- 导航栏 -->
    <nav class="navbar">
      <div class="navbar-brand">供应商管理系统</div>
      <ul class="navbar-menu">
        
        <li><router-link to="/">首页</router-link></li>
        <!-- 新增供应源管理菜单 -->
        <li class="dropdown">
          <span>供应源管理</span>
          <ul class="dropdown-menu">
            <li><router-link to="/raw-supplier">原始供应源管理</router-link></li>
            <li><router-link to="/structured-supplier">结构化供应源管理</router-link></li>
          </ul>
        </li>
        <li><router-link to="/about">关于</router-link></li>
        <li><router-link to="/contact">联系我们</router-link></li>
      </ul>
    </nav>

    <!-- 主内容区域 -->
    <main class="content">
      <router-view />
    </main>

    <!-- 页脚 -->
    <footer class="footer">
      <p>© 2023 供应商管理系统. 版权所有.</p>
    </footer>
  </div>
</template>

<script>
export default {
  name: 'MainPage',
}
</script>

<style scoped>
#main {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}

.navbar {
  background-color: #2c3e50;
  color: white;
  padding: 1rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.navbar-brand {
  font-size: 1.5rem;
  font-weight: bold;
}

.navbar-menu {
  list-style: none;
  display: flex;
  gap: 1rem;
  margin: 0;
  padding: 0;
}

.navbar-menu li {
  position: relative;
}

.navbar-menu li a {
  color: white;
  text-decoration: none;
}

.dropdown {
  cursor: pointer;
}

.dropdown-menu {
  display: none;
  position: absolute;
  top: 100%;
  left: 0;
  background-color: #34495e;
  list-style: none;
  padding: 0.5rem 0;
  margin: 0;
  border-radius: 4px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
  z-index: 2; /* 确保表格的 z-index 不会覆盖下拉菜单 */
}

.dropdown-menu li {
  padding: 0.5rem 1rem;
}

.dropdown-menu li a {
  color: white;
  text-decoration: none;
}

.dropdown:hover .dropdown-menu {
  display: block;
}

.content {
  flex: 1;
  padding: 2rem;
  text-align: center;
}

.footer {
  background-color: #2c3e50;
  color: white;
  text-align: center;
  padding: 1rem;
}
</style>
