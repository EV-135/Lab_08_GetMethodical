import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double price = 0.00;
        boolean done=false;
        double total = 0.00;

        do {

            price = SafeInput.getRangedDouble(in, "What is the price of your item?", 0.50, 10.00);
            done = SafeInput.getYNConfirm(in, "Do you have another item? [Y/N]");
            total = total+price;
        }while(!done);
        System.out.printf("Your total is $%.2f",total);

    }
}
