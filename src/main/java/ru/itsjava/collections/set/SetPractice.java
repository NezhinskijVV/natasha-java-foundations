package ru.itsjava.collections.set;

import ru.itsjava.collections.Watch;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 18_000);
        Watch natashaWatch = new Watch("Apple", "Natasha", 25_000);
        Watch dmitriyWatch = new Watch("Omega", "Dmitriy", 100_000);

//        Set.of(vitaliyWatch, natashaWatch, dmitriyWatch)
        Set<Watch> watchSet = new HashSet<>();
        watchSet.add(vitaliyWatch);
        watchSet.add(natashaWatch);
        watchSet.add(dmitriyWatch);

        System.out.println("watchSet.size() = " + watchSet.size());
        System.out.println("watchSet.add(vitaliyWatch) = " + watchSet.add(vitaliyWatch));
        System.out.println("watchSet.size() = " + watchSet.size());


    }
}
