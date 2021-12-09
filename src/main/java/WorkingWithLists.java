import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> obj= new ArrayList<>();
        obj.add("awais");
        obj.add("javed");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.contains("awais"));
        System.out.println(obj.contains("Ali"));
        System.out.println(obj);

    }
}
