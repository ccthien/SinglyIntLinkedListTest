package com.operr.test;

/**
 *
 * @author ccthien
 */
public class SinglyIntLinkedList {
	private SinglyIntLinkedListNode head = null;
	public boolean isEmpty() {return head == null;}
	
	/**
	 * Append one int value to the list
	 * 
	 * @param value		value to append 
	 */
	public void append(int value) {
		if(isEmpty()) {
			head = new SinglyIntLinkedListNode(value);
		}else{
			SinglyIntLinkedListNode node = head;
			SinglyIntLinkedListNode next = node.getNext();
			while(next!=null) {
				node = next;
				next = node.getNext();
			}
			node.setNext(new SinglyIntLinkedListNode(value));
		}
	}
	
	/**
	 * Remove tail element
	 * 
	 * @return		value of tail if exists or null on empty list
	 */
	public Integer removeTail() {
		if(isEmpty()) return null;
		SinglyIntLinkedListNode node = head;
		SinglyIntLinkedListNode next = node.getNext();
		if(next==null) {
			head = null;
			return node.getValue();
		}
		while(next.getNext()!=null) {
			node = next;
			next = node.getNext();
		}
		node.setNext(null);
		return next.getValue();
	}
	
	/**
	 * Remove all items has value greater than the input value
	 * 
	 * @param value		maximum value to keep on the list
	 * @return			number of items removed
	 */
	public int removeGreater(int value) {
		if(isEmpty()) return 0;
		int count = 0;
		
		// remove all satisfy value on head
		while(head.getValue()>value) {
			count++;
			if(head==null) return count;
			head = head.getNext();
		}
		
		// head will not content greater value now
		SinglyIntLinkedListNode node = head;
		SinglyIntLinkedListNode next = node.getNext();
		while(next!=null) {
			if(next.getValue()>value) {
				count++;
				node.setNext(next.getNext());
				
			}else{
				node = next;
			}
			next = node.getNext();
		}
		return count;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		SinglyIntLinkedListNode node = head;
		
		while(node!=null) {
			if(sb.length()!=0) {
				sb.append(" -> ");
			}
			sb.append(node.getValue());
			node = node.getNext();
		}
		
		
		return sb.toString();
	}
}
