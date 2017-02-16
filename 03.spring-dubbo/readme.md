#Spring Dubbo
这个Spring Dubbo的这个测试工程我写了好久。主要是本身Dubbo并不难，主要是与传统工程，特别是在常在项目中开发的思维模式有很大的差别。为了能把这些差别搞的更加让大家容易接受一些，耗费了我很多时间。


多模块：一般来说，任何一个Dubbo远程调用工程，都需要分三个部分：Api、Consumer（大家在传统思维可以理解为客户端）、Provider（可以理解为服务端）。这三者是什么关系呢？

![Dubbo](http://p1.bpimg.com/567571/6e12c91c6c9997ee.png)

级别上就是上图所示的这个关系。我们工程会分三个模块，这三个模块分别是Api、Consumer、Provider：

![图中client和server是为了让大家容易理解](http://i1.piimg.com/567571/bb8ab01a885f273c.jpg)

Consumer和Provider两个模块完全没有相互依赖（工程角度）。在真实应用中，可以把这两个模块分别部署在两个不同的tomcat（或者其他web容器中）。

##**接下来会介绍一下当前工程的几个关键点**

1. **api的部分非常简单,单纯的只有接口的部分。**
2. **Provider部分。只需要实现api的借口，并且加上Dubbo的Service注释。**
![](http://i1.piimg.com/567571/a096850d22f9e169.jpg)
3. **Consumer部分，只需要引用接口。但特别需要注意，只有Spring Bean才能引用。**
![](http://p1.bqimg.com/567571/f66bff948d13b75f.jpg)
4. **需要注意本地要启动zookeeper** *启动方法网上很多，这不是重点*
##**调试方式**
1. **Server段添加tomcat方式**
![](http://p1.bpimg.com/567571/52c08978bd2700fe.jpg)
2. **Client段添加tomcat方式**
![](http://p1.bqimg.com/567571/59f91e4fbd33f245.jpg)
**需要特别注意端口，其他没有什么，另外如果不会添加tomcat调试方式参考如下：**
![](http://p1.bpimg.com/567571/4b28181ed531ac48.jpg)
![](http://i1.piimg.com/567571/fbaef51593e62d1b.jpg)
3. **浏览器中调试：[http://localhost:8080/YangmingDubbo/params](http://localhost:8080/YangmingDubbo/params)页面中显示：**
![](http://i1.piimg.com/567571/7efe71138cb1f635.jpg)
