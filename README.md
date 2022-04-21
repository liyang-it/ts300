## 📚 唐诗三百首 api接口, JDK版本需要 1.8
### 🛠️整合的功能
* 只实现了  随机一条唐诗接口
* 唐诗数据库 缺少 诗歌 解析、和注释两个信息，后期可以补


### 🛠️文件结构说明
| 模块             | 介绍                 |
|----------------|--------------------|
| doc            | 项目文件 目录            |
| doc.data       | 项目数据               |
| doc.desc       | 项目说明文件             |
| doc.sql        | sql                |
| jishi-api    | api          |
| jishi-core  | 核心公共组件             |
| jishi-db      | 数据库、服务层、实体类、mapper |
| jishi-start    | 程序启动相关             |
| logs   | 主程序日志目录            |

### 🛠️依赖
| 依赖           | 版本                |
|--------------|-------------------|
| Mysql        | 5.6               |
| MyBatis-PLUS | 项目数据              |
| SpringBoot   | 2.1.5             |
| Redis        | >= 2.6            |

### 🛠Swagger 访问地址: localhost:端口号/服务/Swagger-ui.html
