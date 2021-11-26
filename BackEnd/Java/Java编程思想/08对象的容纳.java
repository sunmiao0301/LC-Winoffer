8.对象的容纳
Java提供了容纳对象（或对象的句柄）的多种方式
1）内建类型 —— 数组
2）集合类（容器类）

8.1 数组
与C++不同的是 Java对数组会进行范围检查，若是超过边界，就会获得一个 RuntimeException(运行时间违例）

8.1.2 （Java中）数组的返回 —— easy

8.2 集合
在提集合具体内容之前 我们可以思考一个问题：
集合也是一个类，在程序员最初编写这些集合的代码时，他不知道用户到底想将什么类型放入集合，怎么解决？
答：当初编写的时候，程序员设计的集合实际上容纳的是类型为Object的一些对象的句柄，Object是所有类的根，自然代表Java中的所有对象
PS：注意！但是这并不包括基本数据类型，因为它们并不是从“任何东西”继承来的

1.错误有时并不显露出来


