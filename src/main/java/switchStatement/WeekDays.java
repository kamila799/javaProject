package switchStatement;

public class WeekDays {
    public static void main(String[] args) {

        int day = 5;
        switch(day){
            case 1, 2, 3, 4, 5:
                System.out.println("WeekDay");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Invalid day");
        }


    }
}
