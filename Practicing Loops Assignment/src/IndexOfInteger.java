import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        while (true){
        System.out.println("Enter a number");
        int num = Integer.valueOf(input.nextLine());
            if (num == 0) {
                System.out.println("Done entering integers into the list." );
                System.out.println("What number are you looking for in the list?" );
                int num2 = Integer.valueOf(input.nextLine());
                System.out.println(num2 + " is at index " + list.indexOf(num2));
            } else  
                list.add(num);
        }
        
    }
}

