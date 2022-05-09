import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) throws Exception {
        getSum();
    }
    public static void getSum(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbersArray = new ArrayList<>();
        while (true){
            System.out.println("Enter a number");
            int numbers = Integer.valueOf(input.nextLine());
            if (numbers == 0){
                int sumNum = 0;
                String stringy = "";
                for (Integer number: numbersArray) {
                    sumNum += number;
                    stringy += number + ", ";
                    }
                    System.out.println( stringy + " items were the in the list" );
                    System.out.println("The sum of that list is: " + sumNum); 
                }   
                else {
                    numbersArray.add(numbers);
                }
        } 
                    
    }
}

