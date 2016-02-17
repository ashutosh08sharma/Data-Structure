package node;

public class Node {
	public String StudentName;
	public Node next;
	
	
	public Node(String studentName) {
		StudentName = studentName;
		next =null;
	}
	
	public void display(){
		System.out.println("Student Name :"+ StudentName);
	}
	
	public String toString(){
		return StudentName;
	}
	

}
