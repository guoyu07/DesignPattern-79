工厂方法模式

定义一个用于创建对象的接口,让子类决定实例化哪一个类.工厂方法使一个类的实例化延迟到子类.

优点:
    1.良好的封装性.一个对象创建是有约束的,如果一个调用者需要一个具体的产品对象,只要知道这个产品的类名(或约束字符串)就可以了,不用
    知道创建对象的过程(new),降低模块间的耦合.
    2.优秀的扩展性.在增加类的情况下,只需适当的修改工厂类,或扩展一个工厂类,就可以实现变化.
    3.隐藏产品类.产品的实现如何变化,调用者都不需要关心,直接接口保持不变,系统的上层模块就不会发生变化.