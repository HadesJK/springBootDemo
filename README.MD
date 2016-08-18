# Spring Boot Demo

**java -jar springboot.jar** 方式启动程序
**localhost:8080** 进行访问

## master
官方13章的代码,区别是配置打包插件需要指定主类,否则报错。

## issue@14
官方14章的代码,没问题

## issue@17
官方17章代码，没问题，并且加入了final域的一个示例。

## issue@23
1. 关闭banner
2. 获取运行参数 args， 通过ApplicationArguments类
3. 获取运行参数 args， 通过CommandLineRunner接口(据说实现ApplicationRunner也是一样的效果)
总之，2和3都是在applicaiont.run(args)之前执行的。i

**经过issue@24测试后，发现其实2/3两种方式有区别的**

## issue@24
1. 测试获取properties属性，spring boot有一个规则来进行合理的覆盖这些属性值。
2. 因为命令行参数会覆盖配置文件,但是可以屏蔽它
3. 使用type safe，可以注入一些值。记得使用prefix＝指定前缀 和 locations＝ 指定配置文件位置，没理解错的话，应该按名字注入的。同时需要注意的是，**和@Value很大不同，它需要getter/setter**
4. 增加spring.profiles.active=属性在application.properties来激活一个配置文件

## issue@26
spring log



