public class Multithreading {
	public static void main(String[] args){

		for(int i=0;i<=3;i++){
			MultithreadThing myThing=new MultithreadThing(i);
			if(i==0){
				myThing.start();
				try{
					myThing.join();
				}catch(InterruptedException e){
				}
			} else{
				myThing.start();
				System.out.println("Is alive? "+myThing.isAlive());
			}
		}
		//throw new RuntimeException();
	}
}