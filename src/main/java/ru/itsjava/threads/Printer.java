package ru.itsjava.threads;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Printer extends Thread {
    private final String value;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(delay);
            System.out.print(value + " ");
        }
    }
}
