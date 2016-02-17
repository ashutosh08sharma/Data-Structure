package main;

import implementation.Linkedlist;
import node.Node;

public class Main {
	 public static void main(String[] args) {
		 Linkedlist thelinkedlist = new Linkedlist();
		 Node student = new Node("Ashutosh");
		 Node Student2= new Node("Anshuman");
		 Node Student3= new Node("Keval");
		 Node Student4= new Node("Hitesh");
		 Node Student5= new Node("Aman");
		 
		 thelinkedlist.insertFirstlink(student);
		 thelinkedlist.insertFirstlink(Student2);
		 thelinkedlist.insertFirstlink(Student3);
		 thelinkedlist.insertFirstlink(Student4);
		 thelinkedlist.insertFirstlink(Student5);
	
		 thelinkedlist.showlist();
		// System.out.println("Remove first link");
		 //thelinkedlist.Firstremove();
		 
		 
		// thelinkedlist.showlist();
		 
		 Node Student = thelinkedlist.find("Keval");	
		 System.out.println("student Found");
		 Student.display();
		 
		 thelinkedlist.remove(Student3);
		  thelinkedlist.showlist();

}
}