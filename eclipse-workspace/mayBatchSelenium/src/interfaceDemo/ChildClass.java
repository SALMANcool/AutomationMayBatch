package interfaceDemo;

public class ChildClass implements Interface2,Interface1{

	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("I am from m1");
	}

	@Override
	public void m2(int i) {
		// TODO Auto-generated method stub
		System.out.println("I am from interfac1"+i);
	}

	public void m2(String str) {
		// TODO Auto-generated method stub
		System.out.println("I am from interface2"+str);
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("I am from m3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("I am from m4");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("I am from m5");
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("I am from m6");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc=new ChildClass();
		cc.m1();
		cc.m2(10);
	//	cc.m2("salman");
		cc.m3();
		cc.m4();
		cc.m5();
		cc.m6();
	}
}
