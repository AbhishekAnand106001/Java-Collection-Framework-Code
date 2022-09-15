import java.util.ArrayList;
import java.util.List;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> rollno = new ArrayList<>();
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);
        System.out.println(rollno);
        
        rollno.add(1, 6);
        rollno.add(3, 7);
        System.out.println(rollno);
        
        ArrayList<Integer> newrollno = new ArrayList<>();
        newrollno.add(8);
        newrollno.add(9);
        newrollno.add(10);
        
        rollno.addAll(newrollno);
        System.out.println(rollno);
        
        System.out.println(rollno.get(9));
        
        rollno.remove(1);
        System.out.println(rollno);
        
        rollno.remove(Integer.valueOf(7));
        System.out.println(rollno);
        
        rollno.set(5, 6);
        rollno.set(6, 7);
        rollno.set(7, 8);
        System.out.println(rollno);
        
        System.out.println(rollno.contains(5));
        System.out.println(rollno.contains(9));
        
        for(int i=0; i<rollno.size(); i++)
        {
        System.out.println(rollno.get(i));
        }
        
        for(Integer element: rollno)
        {
        System.out.println(element);
        }
        
        rollno.clear();
        System.out.println(rollno);
    }
}