<template>

    <div>
        <el-container>
            <el-header>Header</el-header>
            <el-main>
                <el-submenu>
                    <template slot="title"><i class="el-icon-message"></i>系统信息管理</template>
                    <el-menu-item index="1-1">
                        <router-link to="/dpt">部门管理</router-link>
                    </el-menu-item>
                    <el-menu-item>
                        <router-link to="/emp">员工管理</router-link>
                    </el-menu-item>
                </el-submenu>
            </el-main>
        </el-container>
    </div>
</template>

<script>

</script>

<style></style>