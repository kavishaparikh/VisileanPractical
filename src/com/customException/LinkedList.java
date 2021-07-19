package com.customException;

public class LinkedList {
	 Node head; 
	    static class Node {
	   
	        int data;
	        Node next;
	   
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    //push
	    public static LinkedList insert(LinkedList list, int data)
	    {
	        Node new_node = new Node(data);
	        new_node.next = null;
	   
	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	            Node last = list.head;
	            while (last.next != null) {
	                last = last.next;
	            }
	            last.next = new_node;
	        }
	        return list;
	    }
	    public static void printList(LinkedList list)
	    {
	        Node currNode = list.head;
	    
	        System.out.print("INSERT : ");
	        while (currNode != null) {
	            System.out.print(currNode.data + " ");
	            currNode = currNode.next;
	        }
	    }
	    //pop
	    public static LinkedList deleteAtPosition(LinkedList list, int index)
	    {
	        Node currNode = list.head, prev = null;
	 
	     
	        if (index == 0 && currNode != null) {
	            list.head = currNode.next; 
	 
	            System.out.println("\n" +  index + " position element deleted");
	 
	            return list;
	        }
	 
	        int counter = 0;
	        
	        for (int i=0; currNode!=null && i<index-1; i++)
	        {

	        	currNode = currNode.next;
	        	
	        }
       	 System.out.println("\n" + index + " position element deleted "+ currNode.data);
	        currNode.next=currNode.next.next;
	        
	        if (currNode == null) {
	            System.out.println("\n" + index + " position element not found");
	        }
	 
	        return list;
	    }
	    //search
	    public static LinkedList searchAtPosition(LinkedList list, int index)
	    {
	    	   Node currNode = list.head, prev = null;
	    	    for (int i=0; currNode!=null && i<index; i++)
		        {

		        	currNode = currNode.next;
		        	
		        }
	    	 System.out.println("\n" + index + " position element is "+ currNode.data);
	    	 
	    	  return list;
	    }
	    //getIndex
	    public static LinkedList getIndex(LinkedList list, int data)
	    {
	    	   Node currNode = list.head;
	    	
	    	 for (int i=0;  currNode!=null; i++)
		       {

		        	if(data==currNode.data)
		        	{System.out.println(data +" element index is "+i);
			    	 break;
		            }
		        	currNode=currNode.next;
		        }
		        	
		   
	    	  return list;
	    }
	    public static void main(String[] args)
	    {
	        LinkedList list = new LinkedList();
	   
	        list = insert(list, 10);
	        list = insert(list, 20);
	        list = insert(list, 30);
	        list = insert(list, 40);
	        list = insert(list, 50);
	        printList(list);

	        deleteAtPosition(list, 1);
	        printList(list);
	        searchAtPosition(list,2);
	        getIndex(list,40);


	    }
	   
}
