/*************************************************************************
    > File Name: VariableOverrideTest.java
    > Author: ma6174
    > Mail: ma6174@163.com 
    > Created Time: 2017年10月20日 星期五 05时41分55秒
 ************************************************************************/
public class VariableOverrideTest{
	//定义一个name实例变量
	private String name="李刚";
	//定义一个price类变量
	private static double price=78.0;
	//主方法入口
	public static void main(String args[]){
		//方法里局部变量直接覆盖成员变量
		int price=65;
		System.out.println("局部变量："+price);
		System.out.println("类变量："+VariableOverrideTest.price);
		new VariableOverrideTest().info();
	}
	public void info(){

		String name="孙悟空";
		System.out.println(name);
		System.out.println(this.name);
	}
}
