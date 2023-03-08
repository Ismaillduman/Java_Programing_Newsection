package replit_tasks.tasks_week_5;

import java.util.Scanner;

class Main {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        if(isAvailable){
            if(year==2018){
                if(month==1&&day>=7||month==8&&day<=7){
                    return true;
                }else if(month>=2&&month<=7){
                    return true;
                }
            }else{
                return false;
            }
        }
        return isAvailable;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}