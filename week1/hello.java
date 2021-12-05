//第一个程序
//每个源码中只能有一个public类,且文件名必须是该类的类名，其他类没有限制
//每一个类都会生成一个class文件
 
//创建一个共有类
public class hello {

	//主方法，程序的入口。 （也可以将其写在其他类中，然后指定运行那个类，这样入口就在那个类中）
	public static void main(String[] args){
		System.out.println("hello world");
	}
}

class Cat{
	public static void main(String[] args){
		System.out.println("hello world Cat");
	}
}
 
 class Tiger{
 	public static void main(String[] args){
		System.out.println("hello world Tiger");
	}
 }