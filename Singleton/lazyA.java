class lazyA {
	private static A obj;

	private lazyA(){}

	public static lazyA getA(){
		if(obj==null){
			synchronyzed(Singleton.class){
				if(obj==null){
					obj = new Singleton();//instance created at requset time
				}
			}
		}
		return obj;
	}

	public void doSomething(){

	}
}