package singletonPattern;
/*
 * 懒汉
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * 
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
 * 但是，遗憾的是，效率很低，99%情况下不需要同步。
 * 
*/
public class Laz {//单例模式（懒汉）
	private static Laz instance;
	private Laz(){}
	//public static synchronized Laz getLaz(){//懒汉，线程安全
	public static Laz getLaz(){//懒汉，线程不安全
		if(instance==null)
			instance=new Laz();
		return instance;
	}
	
	public void excute(){
		System.out.print("单例模式，懒汉，线程不安全\n");
	}
}