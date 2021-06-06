package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        String age = input.nextLine();

        int a = Integer.parseInt(age);
        if(a > 15) {
            System.out.println("You are old enough to drive.");
        }
        else{
            System.out.println("You are not old enough to drive.");

        }
    }
}
