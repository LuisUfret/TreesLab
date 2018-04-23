package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> c1 = t.addChild(t.root(), 9);
		t.addChild(c1, 7);
		t.addChild(c1, 10);
		
		Position<Integer> c2 = t.addChild(t.root(), 20);
		Position<Integer> c3 = t.addChild(c2, 15);
		t.addChild(c3, 12);
		Position<Integer> c5 = t.addChild(c3, 17);
		t.addChild(c5, 19);
		Position<Integer> c4 = t.addChild(c2, 21);
		Position<Integer> c6 = t.addChild(c4, 40);
		t.addChild(c6, 30);
		t.addChild(c6, 45);
		
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> lC1 = t.addLeft(t.root(), 9);
		t.addLeft(lC1, 7);
		t.addRight(lC1, 10);
		
		Position<Integer> rC1 = t.addRight(t.root(), 20);
		Position<Integer> lC2 = t.addLeft(rC1, 15);
		t.addLeft(lC2, 12);
		Position<Integer> lC23 = t.addRight(lC2, 17);
		t.addLeft(lC23, 19);
		Position<Integer> rC2 = t.addRight(rC1, 21);
		Position<Integer> rC3 = t.addRight(rC2, 40);
		t.addLeft(rC3, 30);
		t.addRight(rC3, 45);
		
		return t; 
	}


}
