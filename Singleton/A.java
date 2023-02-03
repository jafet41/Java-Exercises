//Early instatiation
class A {
	private static A obj = new A();

	private A(){}

	public static A getA(){
		return obj;
	}

	public void doSomething(){
		//Write code
	}
}