import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		//Retrieving an element takes O(n)
		//Adding and Removing elements in Linkedlists is faster than Arraylists
		//LinkedList.removeLast() O(1)
		//LinkedList.remove(Object) O(n)
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("Jhon");
		namesLinkedList.add("Lisa");
		namesLinkedList.add("Jenna");
		namesLinkedList.add("Paul");
		namesLinkedList.add("Lenna");
		String s=namesLinkedList.get(2);
		System.out.println(s);

		//Retrieving an element takes O(1)
		//Adding and Removing elements in Arraylists is slower than Linkedlist

		//ArrayList.remove(Object) O(n)
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("Danny");
		namesArrayList.add("Lazlo");
		namesArrayList.add("Teresa");
		namesArrayList.add("Fabian");
		namesArrayList.add("Tessa");
		String t=namesArrayList.get(2);
		System.out.println(t);
	}
}