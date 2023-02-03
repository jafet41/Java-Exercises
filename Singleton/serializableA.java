public class A implements Serializable{
	protected Object readResolve(){
		return getA();
	}
}

//class loader memory different than heap memory(where objecta live)
//fisrt loads class then you can create the objects
//static keyword attribute would be the same for all the objects

//static block, could be use to initialize static variable i.e. excecuted just once (when you load a class)
