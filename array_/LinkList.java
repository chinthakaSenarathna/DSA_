// import java.util.*;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        next = null;
    }
}

public class LinkList {
    int countLength(Node head){
        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    int searchValue(Node head, int val){
        if(head == null){
            System.out.println("Empty List");
            return -1;
        }
        Node temp = head;

        while(temp != null){
            if(temp.value == val){
                return 0;
            }
            temp = temp.next;
        }
        return -1;
    }

    void printValues(Node head){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            System.out.println(temp);
            System.out.println(temp.next);
            temp = temp.next;
        }
    }

    Node insertAtPosition(Node head,int val,int pos){
        LinkList ob = new LinkList();

        if(head == null || pos > ob.countLength(head) || pos < 0){
            System.out.println("Invalid position");
            return head;
        }
        else{
            Node temp = head;

            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            return head;
        }
    }

    Node insertAtBegining(Node head,int val){
        if(head == null){
            return new Node(val);
        }

        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
    }

    Node insertAtEnd(Node head,int val){
        if(head == null){
            return new Node(val);
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        
        // Node n1 = new Node(1);
        // head = n1;
        // Node n2 = new Node(2);
        // n1.next = n2;
        // Node n3 = new Node(3);
        // n2.next = n3;

        // object creation...
        LinkList ob = new LinkList();

        // insert values...
        // head = ob.insertAtEnd(head,1);
        // head = ob.insertAtEnd(head,2);
        // head = ob.insertAtEnd(head,3);
        // head = ob.insertAtEnd(head,4);
        // head = ob.insertAtEnd(head,5);

        head = ob.insertAtBegining(head,1);
        head = ob.insertAtBegining(head,2);
        head = ob.insertAtBegining(head,3);
        head = ob.insertAtBegining(head,4);
        head = ob.insertAtBegining(head,5);
        
        head = ob.insertAtPosition(head,99,3);

        System.out.println(ob.searchValue(head,99) == -1 ? "False" : "True");

        ob.printValues(head);
        
    }
}