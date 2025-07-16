import java.util.Stack;

public class test2 {

  public static void main(String[] args) {
    
  
         Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
         System.out.println("Top element: " + stack.peek());

        // 弹栈
        int poppedElement1 = stack.pop();
        System.out.println("Popped element: " + poppedElement1);

        int poppedElement2 = stack.pop();
        System.out.println("Popped element: " + poppedElement2);
        // 判断栈是否为空
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 获取栈的大小
        System.out.println("Stack size: " + stack.size());
}
}
