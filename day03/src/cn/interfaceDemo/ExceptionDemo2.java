package cn.interfaceDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author : Tongqh
 * @Description: TODO throws
 * @date Date : 2024-03-01
 */
public class ExceptionDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        createFile("temp.txt");
    }

    public static void createFile(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
    }
}
