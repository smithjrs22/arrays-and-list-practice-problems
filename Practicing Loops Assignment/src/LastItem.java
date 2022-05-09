import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        while (true){
        System.out.println("Enter something");
        String userString = input.nextLine();
            if (userString.equals("")) {
                System.out.println("The last item in the list was: " + list.get(list.size() - 1));
            } else  
                list.add(userString);
        }
        
    }
}

