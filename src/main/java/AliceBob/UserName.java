package AliceBob;

import java.util.Scanner;


public class UserName {

    public static void main(String[] args) {

        String UserName;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        UserName = s.next();

        if (UserName.equalsIgnoreCase("Alice") || UserName.equalsIgnoreCase("Bob"))
        {
            System.out.print("Hello, how are you " + UserName);
        }


    }
}
