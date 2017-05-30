package com.operr.test;

/**
 *
 * @author ccthien
 */
public class SinglyIntLinkedListNode {
	private final int value;
	private SinglyIntLinkedListNode next;
	public int getValue() {
		return value;
	}
	
	public SinglyIntLinkedListNode getNext() {
		return next;
	}
	
	public void setNext(SinglyIntLinkedListNode node) {
		this.next = node;
	}
	
	public SinglyIntLinkedListNode(int value) {
		this.value = value;
	}
	
}
