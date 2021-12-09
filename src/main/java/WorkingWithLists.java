import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("awais");
        obj.add("javed");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.contains("awais"));
        System.out.println(obj.contains("Ali"));
        System.out.println(obj);
        //The way how to use loop with lists
        for (String objects : obj) {
            System.out.println(objects);
        }
        //foreach loop
        obj.forEach(System.out::println);
        //traditional for loop
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));

        }
    }
}
