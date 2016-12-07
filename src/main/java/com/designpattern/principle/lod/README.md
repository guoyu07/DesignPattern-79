Law of Demeter LoD 迪米特法则 也称为最少知识原则(Least Knowledge Principle, LKP)

一个类,应该对自己需要耦合或调用的类知道得最少.细节我不关心,我只负责调用.

1.只和朋友交流, only talk to you immediate friends.
2.朋友间也是有距离的.

迪米特法则的核心观念就是类间解耦,弱耦合,这样,类的复用率才可以提高.
导致的结果就是,产生了大量的中转或跳转类,导致系统的复杂性提高,维护难度增加.

