package ua.com.alevel;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class FouthTask {

    public static  void getAllFiles(){
        Scanner input = new Scanner(System.in);
        String ext = ".txt";
        String path;
        System.out.println("Enter the required path for search .txt files(If you skip, the program will find file in current folder:");
        path = input.nextLine();
        File file = new File(path);
        File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
        if(listFiles.length == 0){
            System.out.println(path + "There are not files with .txt in this folder");
        }else{
            for(File f : listFiles)
                System.out.println("File: " + path + File.separator + f.getName());
        }
    }
    public static class MyFileNameFilter implements FilenameFilter {

        private String ext;
        public MyFileNameFilter(String ext){
            this.ext = ext.toLowerCase();
        }
        @Override
        public boolean accept(File path, String name) {
            return name.toLowerCase().endsWith(ext);
        }
    }
}
