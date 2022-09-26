import java.util.HashSet;
import java.util.Set;
public class Main
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10);
        System.out.println(set);
        
        set.remove(20);
        System.out.println(set);
        
        System.out.println(set.contains(30));
        
        System.out.println(set.size());
        
        set.clear();
        
        System.out.println(set.isEmpty());
    }
}