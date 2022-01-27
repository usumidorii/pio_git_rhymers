package edu.kis.vh.nursery.list;

import org.junit.Test;
import org.junit.Assert;

public class IntLinkedListTest {

    @Test
    public void testPush() {
        IntLinkedList intLinkedList = new IntLinkedList();

        intLinkedList.push(4);

        Assert.assertEquals(4 ,intLinkedList.top());
    }

    @Test
    public void testTop() {
        IntLinkedList intLinkedList = new IntLinkedList();

        intLinkedList.push(4);
        intLinkedList.push(3);

        Assert.assertEquals(3, intLinkedList.top());
    }

    @Test
    public void testPop() {
        IntLinkedList intLinkedList = new IntLinkedList();

        intLinkedList.push(4);
        intLinkedList.push(3);
        intLinkedList.push(2);

        Assert.assertEquals(2, intLinkedList.pop());
        Assert.assertEquals(3, intLinkedList.pop());

        intLinkedList.push(5);

        Assert.assertEquals(5, intLinkedList.pop());
        Assert.assertEquals(4, intLinkedList.pop());
    }

}