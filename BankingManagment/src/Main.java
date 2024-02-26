import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
//    public int amt;


    public static int amount  ;
    private static final String PASSWORD_FILE = "password.txt";

    public static void main(String[] args) {

//        String filePath = "example.txt";


        // Create a Path object
//        Path path = Paths.get(filePath);


        if (!isPasswordSet()) {
            setPassword();
        }

        if (!verifyPassword()) {
            System.out.println("Incorrect password. Exiting program.");
            return;
        }
        String filePath = "example.txt";
        Path path = Paths.get(filePath);


        Scanner sc = new Scanner(System.in);
//        System.out.println("1 Withdrawl\n2 Deposit\n3 BalanceEnquiry\n");
//        int Case = sc.nextInt();
        boolean exit;

//        boolean exit = sc.nextBoolean();

//        new Deposit(2000);
//        new Withdrawl(90);
//        new Deposit(1000);
//        new Deposit(200);
//        new BalanceEnquiry();



        do {

            System.out.println("1 Withdrawl\n2 Deposit\n3 BalanceEnquiry\n");
            int Case = sc.nextInt();


            switch (Case) {
                case 1:
                    new Withdrawl();
//                    new BalanceEnquiry();
                    break;

                case 2:
                    new Deposit();
//                    new BalanceEnquiry();

                    break;
                case 3:
                    new BalanceEnquiry();
                    break;

                default:
//                    new BalanceEnquiry();
                    System.out.println("You have Entered invalid Choice\n");
                    break;
            }
            System.out.println("if you want to continue enter true either false\n");
        exit = sc.nextBoolean();
        }while (exit);


    }
    private static boolean isPasswordSet() {
        Path passwordFilePath = Paths.get(PASSWORD_FILE);
        return Files.exists(passwordFilePath);
    }

    private static void setPassword() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Password not set. Enter a new password: ");
            String newPassword = sc.nextLine();

            Files.write(Paths.get(PASSWORD_FILE), newPassword.getBytes());
            System.out.println("Password set successfully.");
        } catch (IOException e) {
            System.err.println("Error setting password: " + e.getMessage());
        }
    }

    private static boolean verifyPassword() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the password: ");
            String enteredPassword = sc.nextLine();

            List<String> lines = Files.readAllLines(Paths.get(PASSWORD_FILE));
            String storedPassword = lines.get(0);

            return enteredPassword.equals(storedPassword);
        } catch (IOException e) {
            System.err.println("Error verifying password: " + e.getMessage());
            return false;
        }
    }

}