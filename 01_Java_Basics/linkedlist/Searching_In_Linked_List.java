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

public class Main {
    public static void main(String[] args){
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        
        System.out.println("Search 5: " +search(head,5));
        System.out.println("Search 99: " +search(head,99));
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        
    }
    
    public static boolean search(Node head,int key) {
        Node temp = head;
        
        while(temp!=null){
            if(temp.data ==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
        
    }
}
