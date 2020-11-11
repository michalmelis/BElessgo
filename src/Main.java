import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args)
    {
        numbers.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        printNumbersORisEmpty();
        System.out.println();
        addIfNotExists(6);
        System.out.println();
        deleteSomeNumbers();
        System.out.println();
        addSomeNumbers();
        System.out.println();
       multiplyByLength();
    }


    public static void printNumbersORisEmpty ()
    {
            if(numbers.isEmpty()) System.out.println("Is empty");
            else numbers.forEach(System.out::print);
    }
    public static void addIfNotExists(int number)
    {
        if (!numbers.contains(number)) numbers.add(number);

        numbers.forEach(System.out::print);
    }
    public static void deleteSomeNumbers(){
       numbers.stream().filter(integer -> integer % 2 != 0 ).forEach(System.out:: print);

    }
    public static void addSomeNumbers(){
        numbers.stream().filter(integer -> integer % 2 == 0 ).forEach(System.out:: print);

    }
    static void multiplyByLength(){
        numbers.stream().mapToInt(integer -> integer*numbers.size()).forEach((System.out:: print));

    }

}




