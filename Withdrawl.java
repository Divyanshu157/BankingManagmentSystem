import java.util.Scanner;

public class Withdrawl {

    Scanner sc = new Scanner(System.in);
    int amt;



    public Withdrawl() {

        System.out.println("Enter amount to be withdrawl\n");
        amt= sc.nextInt();
        if (amt<=Main.amount) {
            withdrawl(amt);
        }else {
            System.out.println("balance is not enough\n");

        }
    }
    public void withdrawl(int amt){
        Main.amount=Main.amount-amt;
    }
}
