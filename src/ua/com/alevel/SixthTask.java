package ua.com.alevel;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SixthTask {

    public static void getFileInRange() {
        Scanner input = new Scanner(System.in);
        String path;
        System.out.println("Enter the required path for search .txt files(If you skip, the program will find file in current folder:");
        path = input.nextLine();
        System.out.println("Enter Upper bound(in bytes):");
        double Upper = input.nextDouble();
        System.out.println("Enter Lower bound(in bytes):");
        double lower = input.nextDouble();
        File file = new File(path);
        List<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
        for (int index = 0; index < files.size(); index++) {
            if (files.get(index).isFile()) {
                if((files.get(index).length()) > lower && (files.get(index).length()) <Upper){
                    System.out.println(files.get(index).getName() + "size is " +files.get(index).length() + " bytes");
                }
            }
        }
    }
}
