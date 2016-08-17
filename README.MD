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
总之，2和3都是在applicaiont.run(args)之前执行的。
