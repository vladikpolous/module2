package ua.com.alevel;

import java.io.File;
import java.util.Scanner;

public class SeconTaskAndThird {

    private static String fdgdf = "\"";
    public static void getAbsolutePath(){
        Scanner input = new Scanner(System.in);
        File f;
        String path, filePath;
        boolean result = false;
        System.out.println("Enter the required path for search(If you skip, the program will find file in current folder:");
        path = input.nextLine();
        f = new File(path );
        System.out.println("Enter the name of required file: ");
        filePath = input.nextLine();
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].toString().equals(path + "\\" + filePath) && files[i].isFile()) {
                result = true;
                System.out.println("Absolutly path for your file:");
                System.out.println(fdgdf + files[i]+fdgdf);
                break;
            }
        }
    }
}
