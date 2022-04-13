import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter something");
        String input =sc.nextLine();
        System.out.print("you entered: ");
        System.out.println(input);

        System.out.println(StringUtils.isNumeric(input));
        if (StringUtils.isNumeric(input)){
            System.out.println(input+ " is a number");
        } else {
            System.out.println(input+ " is not a number");
        }
        System.out.println("flipped case: " + StringUtils.swapCase(input));
        System.out.println("reversed: " + StringUtils.reverse(input));
    }
}
