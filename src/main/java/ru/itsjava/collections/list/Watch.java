package ru.itsjava.collections.list;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Watch {
    private final String firm;
    private String author;
    private int price;
}
