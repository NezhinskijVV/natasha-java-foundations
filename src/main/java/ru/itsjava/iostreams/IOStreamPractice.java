package ru.itsjava.iostreams;


import java.io.*;

public class IOStreamPractice {

    public static void main(String[] args) {
//        try (BufferedReader console =
//                     new BufferedReader(new InputStreamReader(System.in))) {
//
//            String input = console.readLine();
//            System.out.println("Ваша строка -- " + input);
//        } catch (IOException exception){
//            System.out.println(exception);
//        }

        File file = new File("file.txt");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("ashdfa");
            printWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
