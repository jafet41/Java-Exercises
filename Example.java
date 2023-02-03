import java.util.*;
import java.io.*;

class BiCycle{
	String printSomething(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	@Override
	String printSomething(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ printSomething());
		String temp=super().printSomething()
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}

