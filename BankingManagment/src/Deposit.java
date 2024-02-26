import java.util.Scanner;

public class Deposit {
    Scanner sc = new Scanner(System.in);
    int amt;



    public Deposit() {
        System.out.println("Enter the Amount to deposit\n");
        amt= sc.nextInt();
        deposit(amt);
    }

    public void deposit(int amt){
        Main.amount= Main.amount+amt;

    }

}