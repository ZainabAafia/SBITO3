
public class FunctionsAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Volume v= new Volume();
       v.fun1();
       v.fun2(10, 10, 10); //2
		
		int ans = v.fun3(10,10,10); 
		System.out.println("volume "+ans);
		int output = v.fun4();
		System.out.println("volume "+output);
	}

}
class Volume
{ 
	public void fun1() {
	int a=10;
	int b=20;
	int c=30;
	int d=a*b*c;
	System.out.println("a is "+a);
	System.out.println("b is "+b);
	System.out.println("c is "+c);
	System.out.println("volume is "+d);
	System.out.println("-------------------");
	}
	

public void fun2(int a, int b, int c) {
	int d=a*b*c;
	System.out.println("a is "+a);
	System.out.println("b is "+b);
	System.out.println("c is "+c);
	System.out.println("volume is "+d);
	System.out.println("-------------------");
}
public int fun3(int a, int b, int c) {
	int d=a*b*c;
	System.out.println("a is "+a);
	System.out.println("b is "+b);
	System.out.println("c is "+c);
	System.out.println("-------------------");
	return d;
	
}
public int fun4() {
	int a=10;
	int b=10;
	int c=10;
	int d=a*b*c;
    System.out.println("a is "+a);
	System.out.println("b is "+b);
	System.out.println("c is "+c);
	
	System.out.println("-------------------");
	return d;
	
	
	
}
}







