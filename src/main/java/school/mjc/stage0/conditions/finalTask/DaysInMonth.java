package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        int leap=0;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=0;
                }
                else{
                    leap=1;
                }

            }
            else{
                leap = 0;
            }
        }
        else{
            leap = 1;
        }


        if(month%2!=0) {

            if(month<=7 && month >=1) {
                System.out.println("31");
            }
            else if (month<=11 && month>=9) {
                System.out.println("30");
            }
            else {
                System.out.println("invalid date");
            }

        }
        else if (month==2 && leap == 1) {
            System.out.println("28");
        }
        else if (month==2 && leap == 0){
            System.out.println("29");
        }


        else if(month%2==0){
            if(month<=6 && month >=4) {
                System.out.println("30");
            }
            else if (month<=12 && month>=8) {
                System.out.println("31");
            }
            else {
                System.out.println("invalid date");
            }
        }



    }
}
