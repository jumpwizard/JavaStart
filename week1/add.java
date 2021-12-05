//创建一个共有类
public class add {

	//主方法，程序的入口。 （也可以将其写在其他类中，然后指定运行那个类，这样入口就在那个类中）
	public static void main(String[] args){
		//加号左右两边有一方包含字符串时，做拼接运算
		System.out.println(100 + 98);//198
		System.out.println("100" + 98);//10098
		System.out.println(100 + 3 + "hello");//103hello
		System.out.println("hello" + 100 + 3);//hello1003
	}
}