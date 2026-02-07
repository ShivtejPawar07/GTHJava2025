class MyLinkedList{
   private int data;
   private Node head=null;
  
   private class Node{
   	 int data;
   	 Node next;
   	Node(int data){
   	   this.data=data;
   	  
   	}
   }
   void insertAtBeg(int value)
   {
   	if(head==null) {
   		head=new Node(value);
   	    head.next=null;
   	}
   	else {
   		Node temp;
   		temp = new Node(value);
   		temp.next=head;
   		head=temp;
   	}
   }
   void iterate() {
   	if(head==null) {
   		System.out.println("LinkedList is empty");
   	}
   	else {
   		Node temp=head;
   		while(temp!=null) {
   			System.out.print(temp.data+"\t");
   			temp=temp.next;
   		}
   	}
   }
}
public class TestLinkedListApplication {
	public static void main(String[] args) {
	      MyLinkedList list= new MyLinkedList();
	        list.insertAtBeg(10);
	        list.insertAtBeg(20);
	        list.insertAtBeg(30);
	        list.iterate();
	}
}
