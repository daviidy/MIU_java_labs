package recursion;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> list3 = new LinkedList<>();
		
		if (list1.size() == 0) {
			for (int i = 0; i < list2.size(); i++) {
				list3.add(list2.get(i));
			}
			return list3;
		}
		else if (list2.size() == 0) {
			for (int i = 0; i < list1.size(); i++) {
				list3.add(list1.get(i));
			}
			return list3;
		}
		int first1 = list1.get(0);
		int first2 = list2.get(0);
		if (first1 < first2) {
			list3.add(first1);
			list1.remove();
			list3.addAll(merge(list1, list2));
		}
		else {
			list3.add(first2);
			list2.remove();
			list3.addAll(merge(list1, list2));
		}
		return list3;
	}
	//test your code
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);list1.add(5);list1.add(21);list1.add(25);
		list2.add(2);list2.add(9);list2.add(17);
		Merge m = new Merge();
		LinkedList list3 = m.merge(list1, list2);
		if(list3 != null) System.out.println(list3);
		
	}
}
