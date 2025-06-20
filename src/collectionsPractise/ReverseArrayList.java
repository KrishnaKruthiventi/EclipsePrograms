package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
	
	public static <T> void reverseArrayList(ArrayList<T> list) {
		for(int i = 0; i < list.size() / 2; i++) {
			T temp = list.get(i);
			list.set(i, list.get(list.size() - 1 - i));
			list.set(list.size() - 1 - i, temp);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
		reverseArrayList(words);
		System.out.println(words);
	}
}
