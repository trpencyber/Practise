package number_practise;

import java.util.Scanner;

public class do_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.Add  2.Sub  3.Multiply  4.Exit");
            choice = sc.nextInt(); 

            if (choice == 1)
                System.out.println("Add selected");
            else if (choice == 2)
                System.out.println("Sub selected");
            else if (choice == 3)
                System.out.println("Multiply selected");
            else if (choice != 4)
                System.out.println("Invalid option, try again");

        } while (choice != 4);

        System.out.println("Exited.");
        sc.close();
    }
}