public class MultithreadThing extends Thread {

	private int threadNumber;
	public MultithreadThing (int threadNumber){
		this.threadNumber=threadNumber;
	}

	//Here it goes the desired functionality 
	@Override
	public void run(){
		for(int i=1; i<=5;i++){
			System.out.println("I es: "+i+" desde el Hilo: "+threadNumber);
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
			}
		}
	}
}

//Another way to implement Multithreading:
//public class MultithreadThing implements Runnable {*Same Code Here*}

// for(int i=0;i<=3;i++){
//Instanciar clase que implementa la interfaz
// 		MultithreadThing myThing=new MultithreadThing(i);
//Instanciar clase thread y pasarle el objeto del paso anterior al constructor de Thread
//		Thread myThread=new Thread(myThing);
// 		myThread.start();
// }