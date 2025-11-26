class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class Deletion_in_Linked_List {
    public static void main(String[] args){
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        
        deleteAtBegininng(head);
        
        deleteAtEnd(head);
        
        deleteAtPosition(head,2);
        
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        
    }
    
    public static Node deleteAtBegininng(Node head){
        if(head == null){
            return null;
        }
        return head.next;
    }
    
    public static Node deleteAtEnd(Node head) {
        if(head == null || head.next == null){
            return null;
        }
        
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        
        temp.next = null;
        return head;
    }
    
    public static Node deleteAtPosition(Node head, int pos) {
        if(head==null){
            return null;
        }
        
        if(pos==0){
            return head.next;
        }
        
        Node temp = head;
        int count=0;
        
        while(temp.next!=null && count<pos-1){
            temp = temp.next;
            count++;
        }
        
        if(temp==null || temp.next==null){
            System.out.print("Position out of bounds");
            return head;
        }
        
        temp.next = temp.next.next;
        return head;
        
    }
    
    
    
}
