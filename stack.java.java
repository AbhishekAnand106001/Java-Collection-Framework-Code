import java.util.Stack;
public class Main
{
    public static void main(String[] args)
    {
        Stack<String> animals = new Stack<>();
        animals.push("cat");
        animals.push("horse");
        animals.push("rat");
        animals.push("dog");
        System.out.println(animals);
        
        System.out.println(animals.peek());
        
        animals.pop();
        
        System.out.println(animals.peek());
        
    }
}