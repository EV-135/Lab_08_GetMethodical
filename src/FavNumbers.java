import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int favNum = 0;
        double favDub = 0.0;

        favNum = SafeInput.getInt(in, "Enter your favorite number");
        favDub = SafeInput.getDouble(in, "Enter your favorite Decimal");
        System.out.println("Your favorite number is "+favNum+" and your favorite decimal is "+favDub);
    }
}
