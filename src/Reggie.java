import java.util.Scanner;
public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String secNum = "";
        String mNum="";
        String menu="";

        secNum = SafeInput.getRegExString(in, "Enter your SSN","\\d{3}-\\d{2}-\\d{4}");
        mNum = SafeInput.getRegExString(in, "Enter your M-Number", "(M|m)\\d{5}$");
        menu = SafeInput.getRegExString(in,"Select a menu choice [O,S,V,Q]","[OoSsVvQq]$");

        System.out.println("Your SSN is "+secNum);
        System.out.println("Your M-Number is "+mNum);

        if(menu.equals("O")||menu.equals("o")){
            System.out.println("You chose Open");
        }else if(menu.equals("S")||menu.equals("s")){
            System.out.println("You chose Save");
        }else if(menu.equals("V")||menu.equals("v")){
            System.out.println("You chose View");
        }else{
            System.out.println("You chose Quit");
        }

    }
}
