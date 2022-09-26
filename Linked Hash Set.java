import java.util.Set;
import java.util.LinkedHashSet;
public class Main
{
    public static void main(String[] args)
    {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
        
        set.remove(20);
       
        System.out.println(set.contains(20));

        System.out.println(set.size());
        
        set.clear();
        
        System.out.println(set.isEmpty());
    }
}