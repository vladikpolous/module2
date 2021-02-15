package ua.com.alevel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstTask {


    public static void findFiles() {
        Scanner input = new Scanner(System.in);
        File f;
        String path, file;
        boolean result = false;
        System.out.println("Enter the required path for search(If you skip, the program will find file in current folder:");
        path = input.nextLine();
        f = new File(path );
        System.out.println("Enter the name of required file: ");
        file = input.nextLine();
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].toString().equals(path + "\\" + file) && files[i].isFile()) {
                result = true;
                break;
            }
        }
        if (result == true)
            System.out.println("File located in the folder");
        else System.out.println("File was not found ");
    }
}
