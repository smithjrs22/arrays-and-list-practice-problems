import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        while (true){
        System.out.println("Write something");
        String userString = input.nextLine();
            if (userString.equals("")) {
                System.out.println("The total amount of items in the list was: " + list.size());
            } else  
                list.add(userString);
        }
        
    }
}

