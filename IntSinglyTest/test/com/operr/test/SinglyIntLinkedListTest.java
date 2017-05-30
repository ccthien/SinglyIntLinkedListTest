/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operr.test;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ccthien
 */
public class SinglyIntLinkedListTest {
	@Test public void testSinglyIntLinkedList() {
		SinglyIntLinkedList list = new SinglyIntLinkedList();
		list.append(8); // 1
		list.append(5); // 2
		list.append(4);
		list.append(5); // 3
		list.append(9); // 4
		list.append(2);
		list.append(7); // 5
		list.append(6); // 6
		list.append(3);
		System.out.println(list);
		Assert.assertEquals("Should be 6 values more than 4",6,list.removeGreater(4));
		System.out.println(list);
		Assert.assertEquals(Integer.valueOf(3),list.removeTail());
		Assert.assertEquals(Integer.valueOf(2),list.removeTail());
		Assert.assertEquals(Integer.valueOf(4),list.removeTail());
		Assert.assertNull(list.removeTail());
		list.append(8);
		Assert.assertEquals(Integer.valueOf(8),list.removeTail());
		Assert.assertNull(list.removeTail());
	}
}
