##首先新建一个mysql数据库
```sql
# 新建数据库
CREATE DATABASE mybatis
  DEFAULT CHARACTER SET utf8;

# 选择数据库
USE mybatis;

# 表名起自己的名字
CREATE TABLE Yangming
(
  id   INT PRIMARY KEY,
  col1 VARCHAR(20),
  col2 VARCHAR(20)
);
```
jdbc.properties，注意调整成自己的数据库名
```properties
jdbc.url=jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf8&useSSL=false
```