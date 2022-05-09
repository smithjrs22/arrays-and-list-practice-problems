import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        while (true){
        System.out.println("Write something");
        String userString = input.nextLine();
            if (userString.equals("")) {
                System.out.println("The fifth item in the list is: " + list.get(4));
            } else  
                list.add(userString);
        }
        
    }
}

