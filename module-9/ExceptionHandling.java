import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Honda");
        list.add("Toyota");
        list.add("Ford");
        list.add("Chevrolet");
        list.add("Nissan");
        list.add("Mazda");
        list.add("Subaru");
        list.add("Tesla");
        list.add("BMW");
        list.add("Kia");

        System.out.println(list);

        Scanner sc = new Scanner(System.in);

        int index = 0;

        for (String brand : list) {
            System.out.println(index + ". " + brand);
            index++;
        }

        System.out.println("enter the index of a brand to see again: ");
        String userInput = sc.nextLine();
        System.out.println("you have entered index: " + userInput);

        sc.close();
    }
}
