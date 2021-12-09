import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[7];
        colors[0] = "purple";
        colors[1] = "white";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println("Print by using simple for loop");
        for (int i = 0; i < colors.length; i++) {

            System.out.println(colors[i]);
        }
        System.out.println("Print by using enhanced for loop");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("Print with Stream API");
        Arrays.stream(colors).forEach(System.out::println);


    }
}
