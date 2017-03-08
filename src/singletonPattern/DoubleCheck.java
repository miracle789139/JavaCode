package singletonPattern;
/*
 * 单例模式，双重校验锁
 * 这个是第二种方式的升级版，俗称双重检查锁定，
 * 详细介绍请查看：http://www.ibm.com/developerworks/cn/java/j-dcl.html
 * 在JDK1.5之后，双重检查锁定才能够正常达到单例效果。
 * 
 * */
public class DoubleCheck {//单例模式，双重校验锁
	private volatile static DoubleCheck instance;
	private DoubleCheck(){}
	public static DoubleCheck getInstance(){
		if(instance == null){
			synchronized(DoubleCheck.class){
				if(instance == null){
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}
	
	public void excute(){
		System.out.print("单例模式，双重校验锁\n");
	}
}
