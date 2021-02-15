package ua.com.alevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what do you want to choose:\n" +
                "1 - You can find by absolutly path of file\n" +
                "2 - You can see absolutly path of file(2 and 3 task together\n" +
                "4 - You can find the file by .txt\n" +
                "5 - You can find the folder and see all files in it\n" +
                "6 - You can find file by size\n" +
                "7 - You can find file by key word");
        int variant = input.nextInt();
        if(variant == 1){
            FirstTask.findFiles();
        }else if(variant == 2){
            SeconTaskAndThird.getAbsolutePath();
        }
        else if(variant == 4){
            FouthTask.getAllFiles();
        }
        else if(variant == 5){
            FifthTask.getFilesByFolder();
        }
        else if(variant == 6){
SixthTask.getFileInRange();
        }
        else if(variant == 7){

        }

    }
}
