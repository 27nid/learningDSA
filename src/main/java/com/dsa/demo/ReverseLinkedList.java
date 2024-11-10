package com.dsa.demo;

import java.util.Stack;

public class ReverseLinkedList {


    static Node IterationApproach(Node head){

        Node curr=head,prev=null,next;

        while(curr!=null){

            //setting next Val so can the list should not change
            next = curr.next;

            //giving new link to current node to prev 
            curr.next=prev;

            //setting pre as new curr val as the link is reversed in last step
            prev=curr;

            //recursing this same step by going to next element in array
            curr=next;
        }
        return prev;
    }

    static Node RecurssionApproach(Node head){

        if(head==null || head.next==null) return head;
        Node rest = RecurssionApproach(head.next);
        head.next.next=head;
        head.next=null;
        return rest;
    }

    static Node StackApproach(Node head){
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        if (!stack.isEmpty()) {
            head = stack.pop();
            temp = head;
            while (!stack.isEmpty()) {
                temp.next = stack.pop();
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
    

    public static void main(String[] args) {
        

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("Given Linked list:");
        printList(head);
        //head = IterationApproach(head);
        //head = RecurssionApproach(head);
        head = StackApproach(head);
        System.out.print("\nReversed in Linked List:");
        printList(head);
    }
}
