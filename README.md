# 软件测试项目

## 开发

1. git clone 到本地，用Intellij IDEA打开

2. 用Maven下载安装依赖

3. 目录结构

    - src/main/java 下是源代码

    - src/test/java 下是测试类


## 测试

在 src/test/java 下编写完测试用例后可以使用Maven生命周期中的test一键测试

在git push 提交到GitHub服务器上之后会在 [Jetkins](http://106.14.163.93:8080/) 中自动进行集成测试，并查看测试结果。

缺陷管理在GitHub 的 Issue板块，进行提交应当注明具体问题。

