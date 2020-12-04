package ru.itsjava.threads;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Privet");
//        Thread thread = new ThreadA();
//        thread.start();
//        System.out.println("Privet");
//        System.out.println("Poka");

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 1000_000_000L; j++) {
//            }
//            System.out.print("A" + " ");
//        }
//
//        for (int i = 0; i < 3; i++) {
//            Thread.sleep(1000);
//            System.out.print("A" + " ");
//        }

//        // 1 2 3 4 5 6 7 8 9 10 11 12
//        //   A   A   A   A    A     A
//        //     B     B     B        B
//        System.out.println("Начало");
//        Thread threadA = new Printer("A", 2000L);
//        Thread threadB = new Printer("B", 3000L);
//
//        threadA.start();
//        threadB.start();
//
//        threadA.join();
//        threadB.join();
//
//        System.out.println("Конец");

//        RunnableB runnableB = new RunnableB();
//        Thread threadRunnableB = new Thread(runnableB);
//        threadRunnableB.start();

        new Thread(new RunnableB()).start();

    }
}

//Домашнее задание:
//1. Создать Перечисление Дни недели
//2. Создать конструктор с входящим параметром переводом дня недели
//+ toString()

//0. Рассказать, чем отличается создание потока с помощью интерфейса Runnable и класса Thread (аудио)
//И что делает метод sleep() и метод join()?
//1. Создать 2 потока разными способами (Унаследоваться от Runnable и от класса Thread) и запустить их
//2. Написать программу, которая выводит любое сообщение раз в 5 секунд.