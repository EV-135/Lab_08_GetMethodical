import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int maxDay = 0;
        boolean done=false;

        year = SafeInput.getRangedInt(in, "What year were you born?", 1950, 2015);
        month = SafeInput.getRangedInt(in,"What month were you born?", 1, 12);

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
        }


        do {
            day = SafeInput.getRangedInt(in,"What day were you born?", 1, 31);
            if (day <= maxDay) {
                done = true;
            } else {
                System.out.println("That is not a valid input, try again.");
            }
        }while(!done);

        hour = SafeInput.getRangedInt(in,"What hour were you born?", 1, 24);
        minute = SafeInput.getRangedInt(in, "What minute were you born?",0,59);

        System.out.println("You were born in the year "+year+", the month "+month+", the day "+day+", the hour "+hour+", and the minute "+minute);



    }
}
