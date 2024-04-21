//package Lesson40;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public Main() throws FileNotFoundException {
//    }
//
//    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("file1.txt");
//        char character = 65;
//        for (; character <= 'Z'; character++) {
//            fileWriter.write(character);
//        }
//
//        fileWriter.write("\n");
//
//        for (int i = 48; i < 58; i++) {
//            fileWriter.write(i);
//            fileWriter.write("\n");
//        }
//        fileWriter.close();
//        System.out.println(fileWriter);
//
//        FileReader fileReader = new FileReader("file1.txt");
//        FileWriter fileWriter1 = new FileWriter("file2.txt");
//        Scanner sc = new Scanner(fileReader);
//        int file1Count = 1;
//        while (sc.hasNextLine()) {
//            String nextLine = sc.nextLine();
//            System.out.println(file1Count + ": " + nextLine);
//            if (file1Count % 3 == 0) {
//                fileWriter1.write(nextLine + " ");
//            }
//            file1Count++;
//        }
//        fileReader.close();
//        fileWriter1.close();
//
//        System.out.println("\nfile2.txt");
//
//        FileReader fileReader1 = new FileReader("file2.txt");
//        Scanner sc1 = new Scanner(fileReader1);
//        while (sc1.hasNext()) {
//            System.out.print(sc1.next() + " ");
//        }
//        fileReader1.close();
//    }
//}
