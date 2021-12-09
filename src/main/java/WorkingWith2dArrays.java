import java.util.Arrays;

public class WorkingWith2dArrays {

    public static void main(String[] args) {
        char[][] chars = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                chars[i][j]='-';
            }
        }
        System.out.println(Arrays.deepToString(chars));

    }
}
