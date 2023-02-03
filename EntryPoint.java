public class EntryPoint {
	public static void main(String[] args) {
		Animal ruiseNor= new Animal(2,2,2,1,2);
		ruiseNor.correr();
		System.out.println("Es capaz de volar?: " + ruiseNor.capazDeVolar());
	}
}

class Animal {
	 private int patas;
	 private int alas;
	 private int oidos;
	 private int ojos;
	 private int boca;
 
	Animal(int patas, int oidos, int ojos, int boca, int alas){
		this.patas=patas;
		this.oidos=oidos;
		this.ojos=ojos;
		this.boca=boca;
		this.alas=alas;
	}

	public void correr(){
		System.out.println("Este es un animal corriendo");
	}

	public boolean capazDeVolar(){
		if(this.alas!=0){
			return true;
		} 
		return false;
	}
}