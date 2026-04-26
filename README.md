# CRM客户关系管理系统

## 一、项目简介

本项目是一个基于Spring Boot开发的客户关系管理系统（CRM），旨在帮助企业高效管理客户资源、营销机会、服务请求等业务流程。项目适合Spring Boot初学者学习参考，代码注释完善，结构清晰。

### 项目特点
- 完整的CRM业务流程管理
- 基于Spring Boot 2.3.3.RELEASE开发
- 采用前后端分离架构，使用Layui作为前端UI框架
- 集成MyBatis-Plus简化持久层开发
- 支持Swagger API文档自动生成
- 包含定时任务、权限管理、数据统计等企业级功能

### 相关链接
- **GitHub**: [https://github.com/ChangeWeDer/crm](https://github.com/ChangeWeDer/crm)
- **Gitee（推荐）**: [https://gitee.com/changeWeder/crm](https://gitee.com/changeWeder/crm)
- **项目博客**: [https://www.upstudy.top/index.php/archives/39/](https://www.upstudy.top/index.php/archives/39/)

---

## 二、技术栈

### 后端技术
- **Spring Boot 2.3.3.RELEASE** - 基础框架
- **MyBatis-Plus 3.0.5** - 持久层框架，简化CRUD操作
- **MySQL 5.7** - 关系型数据库
- **Druid 1.1.22** - 阿里数据库连接池
- **PageHelper 1.2.3** - 分页插件
- **Swagger 2.9.2** - API文档自动生成工具
- **Lombok** - 简化Java代码编写
- **Spring AOP** - 面向切面编程

### 前端技术
- **Layui** - 前端UI框架
- **FreeMarker** - 模板引擎
- **Z-tree** - 目录树生成插件
- **ECharts** - 数据可视化图表库

### 开发工具
- **IntelliJ IDEA** - Java集成开发环境
- **Navicat Premium** - 数据库管理工具
- **Chrome浏览器** - 前端调试

---

## 三、项目结构

```
crm-master/
├── crm/                          # 主项目模块
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/top/upstudy/
│   │   │   │   ├── base/         # 公共类
│   │   │   │   └── crm/
│   │   │   │       ├── annotations/    # 自定义注解
│   │   │   │       ├── aspect/         # 切面类
│   │   │   │       ├── config/         # 配置类
│   │   │   │       ├── controller/     # 控制器层
│   │   │   │       ├── enums/          # 枚举类
│   │   │   │       ├── exceptions/     # 全局异常配置
│   │   │   │       ├── generator/      # 代码生成器
│   │   │   │       ├── interceptor/    # 拦截器
│   │   │   │       ├── mapper/         # 数据访问层
│   │   │   │       ├── pojo/           # 实体类
│   │   │   │       ├── query/          # 查询对象
│   │   │   │       ├── service/        # 业务逻辑层
│   │   │   │       │   └── impl/       # 业务逻辑实现
│   │   │   │       ├── task/           # 定时任务
│   │   │   │       ├── utils/          # 工具类
│   │   │   │       └── vo/             # 视图对象
│   │   │   └── resources/
│   │   │       ├── views/              # FreeMarker模板文件
│   │   │       ├── mappers/            # MyBatis映射文件
│   │   │       ├── public/             # 静态资源
│   │   │       ├── application.yml     # 主配置文件
│   │   │       ├── application-dev.yml # 开发环境配置
│   │   │       └── application-prod.yml# 生产环境配置
│   │   └── test/                      # 测试代码
│   └── pom.xml                        # Maven依赖配置
├── database/
│   └── crm.sql                        # 数据库初始化脚本
├── LICENSE                           # 开源协议
└── README.md                         # 项目说明文档
```

---

## 四、核心功能模块

### 4.1 营销管理
- **营销机会管理**：创建、编辑、查询营销机会
- **客户开发计划**：制定和跟踪客户开发计划
- **计划执行效果**：记录和分析计划执行情况

### 4.2 客户管理
- **客户信息管理**：客户基本信息的增删改查
- **客户联系人**：管理客户联系人信息
- **客户交往记录**：记录与客户的交往历史
- **客户订单管理**：订单信息及订单详情管理

### 4.3 服务管理
- **服务创建**：创建客户服务请求
- **服务分配**：将服务请求分配给处理人
- **服务处理**：记录服务处理过程
- **服务反馈**：客户反馈信息管理
- **服务归档**：已处理服务的归档管理

### 4.4 客户流失管理
- **流失客户统计**：统计和分析流失客户
- **流失预警**：客户流失预警机制
- **暂缓措施**：针对流失客户的暂缓措施管理
- **定时任务**：自动将符合条件的客户加入流失表

### 4.5 权限管理
- **用户管理**：用户信息的增删改查
- **角色管理**：角色的创建和权限分配
- **模块管理**：系统功能模块管理
- **权限控制**：基于角色的访问控制

### 4.6 数据统计
- **客户贡献分析**：统计客户贡献度
- **客户流失分析**：客户流失情况统计
- **客户构成分析**：客户类型、地区等构成分析
- **服务统计**：服务请求和处理情况统计

### 4.7 数据字典
- **字典管理**：系统数据字典的维护
- **字典项管理**：字典项的增删改查

---

## 五、数据库设计

### 主要数据表
- **t_sale_chance** - 营销机会表
- **t_cus_dev_plan** - 客户开发计划表
- **t_customer** - 客户信息表
- **t_customer_contact** - 客户联系人表
- **t_customer_order** - 客户订单表
- **t_order_details** - 订单详情表
- **t_customer_serve** - 客户服务表
- **t_customer_loss** - 客户流失表
- **t_customer_reprieve** - 流失暂缓措施表
- **t_user** - 用户表
- **t_role** - 角色表
- **t_module** - 模块表
- **t_permission** - 权限表
- **t_datadic** - 数据字典表
- **t_log** - 日志表

### 数据库表关系
- **营销管理**：营销机会 → 开发计划
- **客户管理**：客户 → 联系人、订单
- **服务管理**：服务请求 → 分配 → 处理 → 反馈 → 归档
- **权限管理**：用户 → 角色 → 权限
- **流失管理**：客户 → 流失预警 → 暂缓措施

---

## 六、快速开始

### 6.1 环境要求
- JDK 1.8+
- Maven 3.6+
- MySQL 5.7+
- IntelliJ IDEA

### 6.2 安装步骤

1. **克隆项目**
```bash
git clone https://gitee.com/changeWeder/crm.git
```

2. **导入数据库**
```sql
-- 创建数据库
CREATE DATABASE crm CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

-- 导入SQL脚本
USE crm;
SOURCE database/crm.sql;
```

3. **修改配置**
编辑 `crm/src/main/resources/application-dev.yml`，修改数据库连接信息：
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/crm?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC
    username: root
    password: 你的数据库密码
```

4. **安装Lombok插件**
在IDEA中搜索并安装Lombok插件

5. **启动项目**
```bash
cd crm
mvn clean install
mvn spring-boot:run
```

6. **访问系统**
- 系统首页：http://localhost:8080/
- Swagger文档：http://localhost:8080/swagger-ui.html

### 6.3 默认账号
- 用户名：admin
- 密码：123456

---

## 七、项目截图

### 登录页面
![登录页面](https://img-blog.csdnimg.cn/2020111413270439.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg3ODMzMg==,size_16,color_FFFFFF,t_70#pic_center)

### 系统主页
![系统主页](https://img-blog.csdnimg.cn/20201114132825159.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg3ODMzMg==,size_16,color_FFFFFF,t_70#pic_center)

---

## 八、开发说明

### 8.1 代码生成器
项目集成了MyBatis-Plus代码生成器，可根据数据库表自动生成Entity、Mapper、Service、Controller等代码。

### 8.2 全局异常处理
使用`@ControllerAdvice`实现全局异常处理，统一返回错误信息。

### 8.3 日志记录
使用AOP切面记录用户操作日志，存储到`t_log`表中。

### 8.4 定时任务
使用Spring Task实现定时任务，自动将符合条件的客户加入流失表。

### 8.5 权限控制
基于角色的权限控制，通过拦截器实现简单的权限验证。

---

## 九、注意事项

1. 本项目仅供学习参考使用，生产环境使用请进行安全加固
2. 数据库密码请根据实际情况修改
3. 建议使用MySQL 5.7及以上版本
4. 前端页面使用Layui框架，需要熟悉其使用方法
5. 项目部分功能可能存在不完善之处，欢迎大家提出改进建议

---

## 十、贡献指南

欢迎提交Issue和Pull Request来帮助改进项目！

1. Fork本仓库
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 提交Pull Request

---

## 十一、开源协议

本项目采用 [Apache License 2.0](LICENSE) 开源协议。

---

## 十二、联系方式

如有问题或建议，欢迎通过以下方式联系：

- 项目博客：https://www.upstudy.top/index.php/archives/39/
- GitHub Issues：https://github.com/ChangeWeDer/crm/issues

---

**感谢您的关注和支持！如果觉得项目对您有帮助，请给个Star ⭐**
## 五、数据库表间关系
**5.1.营销管理**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20201114115418195.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg3ODMzMg==,size_16,color_FFFFFF,t_70#pic_center)
**5.2.客户管理**
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020111412520713.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg3ODMzMg==,size_16,color_FFFFFF,t_70#pic_center)
**5.3.服务管理**：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20201114125819116.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg3ODMzMg==,size_16,color_FFFFFF,t_70#pic_center)
**5.4.权限管理**：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20201114130543290.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg3ODMzMg==,size_16,color_FFFFFF,t_70#pic_center)
**5.5.其余**：日志表（t_log）、t_datadic(字典表)

## 六、项目目录说明
- main.java.top.upstudy
  * base (公共类)
  * crm 
    + annotations （自定义注解）
    + aspect（切面类）
    + config（配置类）
    + controller（controler层）
    + enums（枚举类）
    + exceptions（全局异常配置）
    + generator（代码生成器）
    + interceptor（拦截器）
    + mapper（大部分增删改查使用了mybatis-plus，自定义SQL的已在这里声明）
    + pojo（实体类）
    + query（查询类）
    + service（service层）
    + task（定时任务，定时将定义流失的用户添加到流失表）
    + utils（工具类）
    + vo（自定义实体）
   
