package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {

        int day = 3;

        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }
        else if (day == 6){
            System.out.println("Saturday");
        }
        else if (day == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid day");
        }

        String dayOfWeek = "Tuesday";
        if (dayOfWeek.equalsIgnoreCase("Monday"))
        {
            System.out.println(1);
        }
        else if (dayOfWeek.equalsIgnoreCase("Tuesday")){
            System.out.println(2);
        }
        else if (dayOfWeek.equalsIgnoreCase("Wednesday")){
            System.out.println(3);
        }
        else if (dayOfWeek.equalsIgnoreCase("Thursday")){
            System.out.println(4);
        }
        else if (dayOfWeek.equalsIgnoreCase("Friday")){
            System.out.println(5);
        }
        else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
            System.out.println(6);
        }
        else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
            System.out.println(7);
        }
        else {
            System.out.println(-1);
        }


        byte time = 13;
        if (time >= 9 && time <= 17){
            System.out.println("Work Hours");
        }
        else if (time >= 7 && time <= 9 || time >= 18 && time <=19){
            System.out.println("Commute Hours");
        }
        else if (time >= 6 && time <=8) {
            System.out.println("Breakfast Time");
        }
        else if (time >= 12 && time <=13) {
            System.out.println("Lunch Time");
        }
        else if (time >= 20 && time <= 22){
            System.out.println("Dinner Time");
        }
        else if (time >= 22 && time <=24){
            System.out.println("Late Hours");
        }
        else if (time >= 0 && time <= 6){
            System.out.println("Sleep Time");
        }


    }
}
