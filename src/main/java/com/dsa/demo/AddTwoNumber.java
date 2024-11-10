package com.dsa.demo;

public class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head node for the result linked list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Traverse both linked lists
        while (l1 != null || l2 != null || carry != 0) {
            // Get the current values (if a list is exhausted, use 0)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Calculate sum of the digits + carry
            int sum = val1 + val2 + carry;
            
            // Update the carry for the next addition
            carry = sum / 10;
            
            // Create a new node for the current digit in the result
            current.next = new ListNode(sum % 10);
            
            // Move the current pointer to the next node
            current = current.next;
            
            // Move the pointers to the next nodes in the input lists (if available)
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Return the result linked list starting from the next node of dummyHead
        return dummyHead.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the numbers
        ListNode result = addTwoNumbers(l1, l2);
        
        // Print the result linked list
        printList(result);  // Output: 7 0 8
    }
}
