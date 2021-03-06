# [Java23种设计模式学习笔记](http://www.cnblogs.com/meet/p/5116504.html "Java23种设计模式学习笔记")

[个人网站](http://www.fangzheng.tech)

### 创建型模式：关注对象的创建过程
1. **[单例模式](http://www.cnblogs.com/meet/p/5116398.html)**：保证一个类只有一个实例，并且提供一个访问该实例的全局访问点
主要：
饿汉式（线程安全，调用效率高，但是不能延时加载）
懒汉式（线程安全，调用效率不高，但是可以延时加载）
其他：
双重检测锁式（由于JVM底层内部模型原因，偶尔会出问题。不建议使用）
静态内部类式（线程安全，调用效率高。但是可以延时加载）
枚举单例（线程安全，调用效率高，不能延时加载）
2. **[工厂模式](http://www.cnblogs.com/meet/p/5116400.html)**：
 简单工厂模式：用来生产同一等级结构中的任意产品（对已有产品新增功能，需要修改源代码）虽然能通过工厂来创建对象，但是违反了开闭原则。一旦增加功能需要在原有基础上修改代码。
 工厂方法模式：用来生产同一等级结构中的固定产品（支持增加任意产品，不用修改源代码）将工厂类调整为工厂接口，需要什么类型的工厂就使用该类实现该工厂，创建相应的产品。
3. **[抽象工厂模式](http://www.cnblogs.com/meet/p/5116400.html)**：用来生产不同产品族的全部产品（对于增加新的产品，无能为力。可增加一系列的产品族）抽象工厂模式用来生产不同产品族的全部产品，对于只增加产品某一部分则不适用。抽象工厂模式是工厂模式的一种升级版本。
4. **[建造者模式](http://www.cnblogs.com/meet/p/5116401.html)**：分离了对象子组件的单独构造（由Builder来负责构建，由Director来负责组装），从而可以构造出复杂的对象。
假如一个对象的构建很复杂，需要很多步骤。如果使用了建造者模式，会将其构建对象，和组装成一个对象这两步给分开来.
构建部分为（builder）和组织部分（director），实现了构建和装配的解耦。
5. **[原型模式](http://www.cnblogs.com/meet/p/5116404.html)**：通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。所谓原型模式就是构建一个对象的原型，通过原型来创建出新的对象。

### 行为型模式：关注系统中对象之间的相互交互，研究系统在运行时对象之间的相互通信和协作，进一步明确对象的职责。
6. **[模板方法模式](http://www.cnblogs.com/meet/p/5116417.html)**：定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的
某些特定步骤。也就是说：假如某些操作代码基本相同，只是其中一部分会经常改变，则可以使用模板方法，将不变的部分作为一个模板，将容易变动的
部分让子类来实现。
7. **[命令模式](http://www.cnblogs.com/meet/p/5116430.html)**（不常用）：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志。以及支持可撤销的操作。说白了，就是将一系列的请求命令封装起来，不直接调用真正执行者的方法，这样比较好扩展。
8. **[迭代器模式](http://www.cnblogs.com/meet/p/5116437.html)**：提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。也就是开发一个用于迭代某个对象中元素的功能。
一般我们开发时很少自己开发，因为jdk内置了迭代器。
9. **[观察者模式](http://www.cnblogs.com/meet/p/5116411.html)**：也叫（发布-订阅模式）定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态发生变化时，会通知所有观察者对象。使它们能够自动更新自己。例如：发广播，游戏中大喇叭，群聊
jdk中提供了抽象主题和抽象观察者的接口，我们可以使用这两个接口来方便的定义自己的观察者模式
10. **[中介者模式](http://www.cnblogs.com/meet/p/5116432.html)**：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显示地相互引用。从而使其耦合松散，而且可以独立地改变它们之间的交互。中介者模式核心：1.就是将网状结构处理成星型结构      2.将多对多处理成一对多
11. **[备忘录模式](http://www.cnblogs.com/meet/p/5116407.html)**：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
也就是说，不破坏源数据的情况下，将源数据进行一次或者多次的备份。
12. **[解释器模式](http://www.cnblogs.com/meet/p/5116424.html)**（不常用）：给定一个语言，定义它的文法一种表示。并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
13. **[状态模式](http://www.cnblogs.com/meet/p/5116415.html)**：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。当遇到不同的状态遇到不同的行为的时候，可以使用状态模式
例如：酒店房间的状态，是空闲，预定，还是已入住呢？而且这三种状态都对应着不同的行为，空闲的话就可预定，可预定的话就可入住，已入住的话
就不能显示空闲。
14. **[策略模式](http://www.cnblogs.com/meet/p/5116419.html)**：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的客户。
例如：商场中的打折商品，针对不同的客户可能有不同的折扣。那这些算法该怎么定义呢？可以使用策略模式，给每个会员或者商品都指定一个特定的算法，根据不同的算法，打不同的折扣。
15. **[职责链模式](http://www.cnblogs.com/meet/p/5116440.html)**：将能够处理同一类请求的对象连成一条链，使这些对象都有机会处理请求，所提交的请求沿着链传递。从而避免请求的
发送者和接受者之间的耦合关系。链上的对象逐个判断是否有能力处理该请求，如果能则就处理，如果不能，则传给链上的下一个对象。
直到有一个对象处理它为止。比如：请假申请，审批人连成一条链，每个人都有机会处理这个假条，但是这个请假申请最终肯定会经过审核（不管审批是否通过）。
16. **[访问者模式](http://www.cnblogs.com/meet/p/5116422.html)**（不常用）：表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

### 结构型模式：关注对象和类的组织
17. **[适配器模式](http://www.cnblogs.com/meet/p/5116467.html)**：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的类可以一起工作。
例如：NBA中的球员来自不同国家，而世界标准语言是英语。那他们不会英语，也不能各自学习所有国家的语言。所以，最好的办法就是请不同的翻译
将这些球员国家的语言翻译成英语。而这些翻译就是适配器！！
适配器模式分类：
1、适配器模式（不推荐使用）：由于类适配器模式需要多重继承对一个接口对另一个接口进行适配，而C#,Java不支持多重继承。
2、对象适配器模式：采用组合的方式
18. **[桥接模式](http://www.cnblogs.com/meet/p/5116458.html)**：将抽象部分与它的实现部分分离，使它们都可以独立的变化。而不会直接影响到其他部分。桥接模式解决了多层继承的结构，处理多维度变化的场景，将各个维度设计成独立的继承结构。使各个维度可以独立的扩展在抽象层建立联系。
19. **[装饰模式](http://www.cnblogs.com/meet/p/5116450.html)**：也叫装饰者模式或者装饰器模式，表示动态的给一个对象添加一些新的功能（利用子类继承父类也可以实现），但是比生成子类方式更灵活。例如：我们每个人身上穿的衣服，鞋子，领带，披风都可以理解为是对人的装饰。
20. **[组合模式](http://www.cnblogs.com/meet/p/5116455.html)**：将对象组合成树形结构以表示：部分--整体 的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。基本上见到的树形结构都使用到了组合模式。
21. **[外观模式](http://www.cnblogs.com/meet/p/5116447.html)**：为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口。这个接口使得这一子系统更加容易使用。遵守迪米特法则（最少知识原则）。说白了，就可以理解为封装。外观模式的核心：为子系统提供统一的入口，封装子系统的复杂性，便于客户端调用
22. **[享元模式](http://www.cnblogs.com/meet/p/5116445.html)**：运用共享技术有效的支持大量细粒度对象的重用。它能做到共享的关键就是区分了内部状态（可以共享，不会随环境变化而变化）和外部状态（不可以共享，会随环境变化而变化）。如果项目中有很多完全相同或相似的对象，则可以使用享元模式，节省内存。
23. **[代理模式](http://www.cnblogs.com/meet/p/5116464.html)**：为其他对象提供一种代理以便控制对这个对象的访问。
可以详细控制访问某个类（对象）的方法，在调用这个方法前作的前置处理（统一的流程代码放到代理中处理）。调用这个方法后做后置处理。
例如：明星的经纪人，租房的中介等等都是代理
代理模式分类：
1、静态代理（静态定义代理类，我们自己静态定义的代理类。比如我们自己定义一个明星的经纪人类）
2、动态代理（通过程序动态生成代理类，该代理类不是我们自己定义的。而是由程序自动生成）比较重要！！


**参考资料：**

大话设计模式(带目录完整版).pdf

HEAD_FIRST设计模式（中文版）.pdf

尚学堂_高淇_java300集最全视频教程_【GOF23设计模式】
