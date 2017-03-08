package singletonPattern;
/*程序设计模式之单例模式（整理自http://www.blogjava.net/kenzhh/archive/2016/03/28/357824.html）
 * 细分有以下7种写法：
 * 一：懒汉，线程不安全
 * 二：懒汉，线程安全
 * 三：饿汉
 * 四：饿汉变种
 * 五：静态内部类
 * 六：枚举
 * 七：双重校验锁
 * 不过一般来说，第一种不算单例，第四种和第三种就是一种，如果算的话，第五种也可以分开写了。
 * 所以说，一般单例都是五种写法。懒汉，恶汉，双重校验锁，枚举和静态内部类。
 * 一:懒汉
 * 二：饿汉
 * 三：双重校验锁
 * 四：枚举
 * 五：静态内部类
 * */
//单例模式（懒汉，线程不安全）
public class Test {

	public static void main(String[] args) {
		Laz instance_laz = Laz.getLaz();//懒汉模式
		Hungry instance_hungry = Hungry.getInstance();//饿汉模式
		DoubleCheck instance_DoubleCheck = DoubleCheck.getInstance();//双重校验锁
		Enum instance_enum = Enum.INSTANCE;//枚举模式
		InnerClass instance_innerclass = InnerClass.getInstance();//静态内部类模式
		
		instance_laz.excute();
		instance_hungry.excute();
		instance_DoubleCheck.excute();
		instance_enum.excute();
		instance_innerclass.excute();
	}
}
