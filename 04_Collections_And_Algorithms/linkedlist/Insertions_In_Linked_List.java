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

public class Insertions_In_Linked_List {
    public static void main(String[] args){
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        
        head = insertAtBeginning(head, 9);
        head = insertAtBeginning(head, 8);
        head = insertAtBeginning(head, 10);
        
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);
        
        head = insertAtPosition(head, 99, 2); 
        
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("null");
        
    }
    
    public static Node insertAtBeginning(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    
    public static Node insertAtEnd(Node head,int data) {
        Node newnode = new Node(data);
        
        if(head == null){
            return newnode;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next = newnode;
        return head;
    }
    
    public static Node insertAtPosition(Node head, int data, int pos){
        if(pos == 0){
            return insertAtBeginning(head,data);
        }
        
        Node newnode = new Node(data);
        Node temp = head;
        int count = 0;
        
        while(temp.next!=null && count<pos-1){
            temp = temp.next;
            count++;
        }
        
        if(temp == null){
            System.out.println("Position out of range");
            return head;
        }
        
        newnode.next = temp.next;
        temp.next = newnode;
        
        return head;
        
    }
    
}
