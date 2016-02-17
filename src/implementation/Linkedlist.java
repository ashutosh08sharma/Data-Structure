package implementation;

import node.Node;

public class Linkedlist {

	public Node firstlink;

	public Linkedlist() {
		firstlink = null;
	}

	public boolean isEmpty() {
		return (firstlink == null);
	}

	public void insertFirstlink(Node NewLink) {

		NewLink.next = firstlink;
		firstlink = NewLink;
	}

	public Node Firstremove() {
		Node linkreference = firstlink;
		if (!isEmpty()) {
			firstlink = firstlink.next;
			System.out.println("Link Removed"+ linkreference);
		} else {
			System.out.println("Empty List");

		}
		return linkreference;
	}

	public void showlist() {
		Node thelink = firstlink;
		while (thelink != null) {
			thelink.display();
			thelink = thelink.next;
			System.out.println();
		}
	}

	public Node find(String StudentName) {
		Node thelink = firstlink;
		if (!isEmpty()) {
			while (thelink.StudentName != StudentName) {

				if (thelink.StudentName == null) {
					return null;
				} else {
					thelink = thelink.next;
				}
			}
		}

		else {
			System.out.println("Empty List");

		}
		return thelink;

	}
	
	public void remove(Node StudentRemove){
		Node currentlink = firstlink;
		Node previouslink = firstlink;
		
		while(currentlink.StudentName != StudentRemove.StudentName){
			      if(currentlink.StudentName==null){
			    	System.out.println("Reached end of list");  
			      }
			      else{
			    	  previouslink= currentlink;
			    	  currentlink= currentlink.next;
			    	  
			    	  
			      }
			}
		System.out.println("Match Found as :" + currentlink.StudentName);
		if (firstlink.StudentName == StudentRemove.StudentName) {
			firstlink = firstlink.next;

		}

		else {
			previouslink.next = currentlink.next;
		}
		
		}
	

}

