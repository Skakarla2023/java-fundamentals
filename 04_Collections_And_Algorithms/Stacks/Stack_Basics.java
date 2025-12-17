import java.util.Stack;

public class Stack_Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        
        System.out.println("Stack:"+st);
        
        System.out.println("Peek:"+st.peek());
        
        System.out.println("Popped:"+st.pop());
        
        System.out.println("Stack after pop:"+st);
        
        System.out.println("Is Empty? "+st.isEmpty());
        
        System.out.println("Size: "+st.size());
        
    }
}
