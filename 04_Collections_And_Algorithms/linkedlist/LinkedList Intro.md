<h2 align="center"><b>Linked List</b></h2>

- In Java, a linked list is a dynamic, linear data structure where elements are stored in individual nodes connected by references (pointers).
- A linked list is a linear data structure where elements (called nodes) are stored in memory non-contiguously. Each node holds a value and a reference (pointer) to the next node in the chain.

```
[10 | next] → [20 | next] → [30 | null]
```

#### Why do we need Linked List in Java?

<img width="1534" height="378" alt="image" src="https://github.com/user-attachments/assets/eb2df517-379e-417f-a382-3a6dc0386a75" />


### Operations in Linked List

The following are the basic operations that we perform on LinkedList:

- Insertion
  - Insertion at beginning
  - Insertion at end
  - Insertion at position
- Deletion
  - Delete from end
  - Delete from middle
  - Delete from pos
- Find Middle element
- Reverse a Linked List


### Building a Linked List from scratch

**1.Define Linked List**

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

**2.Insert Nodes**

#### a) Insert at Beginning

```java
    static Node insertAtBeginning(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }
```


#### b) Insert at End

```java
   static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }
```

#### c) Insert at Pos

```java
static Node insertAtPos(Node head, int data, int pos) {
        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }

        Node temp = head;

        for(int i=0;i<pos-1;i++) {
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid Postion");
        }

        newNode.next = temp.next;
        temp.next 
    }
```


**3. Delete Nodes**

#### a) Delete from Beginning

```java

```

#### b) Delete from End

```java

```

#### c) Delete from Pos

```java

```
