import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
   public static void newArrayList(){
       ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
   }
   public static void printNumbersORisEmpty(ArrayList<Integer> numbers){
        if( numbers.isEmpty()) System.out.println("Is empty");
       numbers.forEach((n) -> { System.out.println(n); });
   }

}
