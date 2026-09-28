# 项目：CarConsole 小车控制台

## 项目背景
这是我的小车项目的第一版，纯 Java 控制台程序。
目标：模拟小车控制逻辑，为后续 Spring Boot 后端打基础。

## 技术栈
- Java 17
- Maven 管理依赖
- 纯 Java SE（暂时没有 Spring Boot）

## 项目结构
com.carconsole 包下：
- CarCommand.java          (接口：所有指令的规范)
- ForwardCommand.java      (前进)
- StopCommand.java         (停止)
- LeftCommand.java         (左转)
- RightCommand.java        (右转)
- CarCommandException.java (自定义异常)
- CarController.java       (调度中心：HashMap 映射 + List 历史)
- Main.java                (控制台入口：Scanner 循环)

## 编码规范
- 所有指令类必须实现 CarCommand 接口
- 加新指令时，只需在 CarController 构造方法里加一行 commandMap.put(...)
- 异常统一用 CarCommandException

## 常用命令
- 编译运行：在 IDEA 里直接运行 Main
- 提交代码：git add . && git commit -m "..." && git push

## 后续计划
- 第2周：转成 Spring Boot 后端
- 第3周：对接 rosbridge
- 第5周：AI 生成 App 前端