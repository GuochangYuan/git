class Person
{
  //定义一个实例变量
  public String name;
//.......
  //定义一个类变量
  public static int eyeNum;
}
public class Test
{
  public static void main(String args[])
{ 
     //第一次主动使用Person类，该类自动初始化，则eyeNum变量开始其作用，输出0
     System.out.println("Person的eyeNum类变量值："+Person.eyeNum);
     //创建Person对象
     Person p=new Person();



    //通过Person对象的引用p来访问Person对象name实例
    System.out.println("p变量的name变量值是："+p.name+"p对象的eyeNum变量值："+p.eyeNum);
     p.name="孙悟空";
    p.eyeNum=2;
   System.out.println("赋值后，再次访问");
  System.out.println("p.name="+p.name+"  p.eyeNum="+p.eyeNum);

Person p2=new Person();
System.out.println("p2.name="+p2.name+"  p2.eyeNum="+p2.eyeNum);

    }}

