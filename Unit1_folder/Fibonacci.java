public class Fibonacci
{
  public static void main(String args[])
  {
  int a=1;
  int b=1;
System.out.println("1");
for(int i=0; i < 10; i++){
//  a =(a-1)+(b+2);

System.out.println(a);

a = (a + b);
b = a-b;


}
  }
}
