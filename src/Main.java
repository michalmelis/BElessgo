import java.util.*;

public class Main {

    public static List<Integer>   numbers = new ArrayList<>();
    public static Set<Integer>        hashSetNumbers = new HashSet<>();
    public static HashMap<String,Integer> hashMap = new HashMap<>();

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
        System.out.println();
        System.out.println(calculateBudget(getPeople()));
        System.out.println(ifNameConstainsA(getPeople()));

        hashSetNumbers.addAll(numbers);
        hashSetNumbers.add(1);
        hashSetNumbers.forEach(System.out::print);
        System.out.println();
        hashMap.put("Red",1);
        hashMap.put("Green",2);
        hashMap.put("Black",3);
        hashMap.put("White",4);
        System.out.println(hashMap);

        ifDontExistAddElementToMap();


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
    public static int calculateBudget(Person[] people){
         return Arrays.stream(people).map(Person::getBudget).reduce(0, Integer::sum);
    }
    public static Person[] getPeople() {
        Person person1 = new Person("John", 21, 29000);
        Person person2 = new Person("Steve", 32, 32000);
        Person person3 = new Person("Martin", 16, 1600);
        return new Person[]{person1, person2, person3};
    }

    public static boolean ifNameConstainsA(Person[] people){
        return Arrays.stream(people).map(Person::getName).anyMatch(i->i.contains("a"));
    }
   public static void ifDontExistAddElementToMap(){
        hashMap.putIfAbsent("blue",5);
        System.out.println(hashMap);
   }
}




