package pkg4_inputoutputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PushbackInputStream;
// Praktikum 2
//public class CopyFile {
//    void copy(String input, String output) {
//        FileReader reader;
//        FileWriter writer;
//        int data;
//        try {
//            reader = new FileReader(input);
//            writer = new FileWriter(output);
//            while ((data
//                    = reader.read()) != -1) {
//                writer.write(data);
//            }
//            reader.close();
//            writer.close();
//        } catch (IOException ie) {
//            ie.printStackTrace();
//        }
//    }
//
//    public static void main(String args[]) {
//        String inputFile = "D:/input.txt";
//        String outputFile = "D:/outputprak2.txt";
//        CopyFile cf = new CopyFile();
//        cf.copy(inputFile, outputFile);
//    }
//}
// Praktikum 2
//-------------------------------
// Praktikum 3
//public class CopyFile {
//
//    void copy(String input, String output) {
//        BufferedReader reader;
//        BufferedWriter writer;
//        String data;
//        try {
//            reader = new BufferedReader(new FileReader(input));
//            writer = new BufferedWriter(new FileWriter(output));
//            while ((data = reader.readLine()) != null) {
//                writer.write(data, 0, data.length());
//            }
//            reader.close();
//            writer.close();
//        } catch (IOException ie) {
//            ie.printStackTrace();
//        }
//    }
//
//    public static void main(String args[]) {
//        String inputFile = "D:/input.txt";
//        String outputFile = "D:/outputprak3.txt";
//        CopyFile cf = new CopyFile();
//        cf.copy(inputFile, outputFile);
//    }
//}
// Praktikum 3
//-------------------------------
// Praktikum 4
//public class CopyFile {
//
//    void copy(String input, String output) {
//        FileInputStream inputStr;
//        FileOutputStream outputStr;
//        int data;
//        try {
//            inputStr = new FileInputStream(input);
//            outputStr = new FileOutputStream(output);
//            while ((data = inputStr.read()) != -1) {
//                outputStr.write(data);
//            }
//            inputStr.close();
//            outputStr.close();
//        } catch (IOException ie) {
//            ie.printStackTrace();
//        }
//    }
//
//    public static void main(String args[]) {
//        String inputFile = "D:/input.txt";
//        String outputFile = "D:/outputprak4.txt";
//        CopyFile cf = new CopyFile();
//        cf.copy(inputFile, outputFile);
//    }
//}
// Praktikum 4
//-------------------------------
// Praktikum 5
public class CopyFile {

    void copy(String input) {
        PushbackInputStream inputStr;
        PrintStream outputStr;
        int data;
        try {
            inputStr = new PushbackInputStream(new FileInputStream(input));
            outputStr = new PrintStream(System.out);
            while ((data = inputStr.read()) != -1) {
                outputStr.println(
                "read data: " + (char) data); inputStr.unread(data);
                data = inputStr.read();
                outputStr.println("unread data: " + (char) data);
            }
            inputStr.close();
            outputStr.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String args[]) {
        String inputFile = "D:/input.txt";
        CopyFile cf = new CopyFile();
        cf.copy(inputFile);
    }
}
// Praktikum 5
