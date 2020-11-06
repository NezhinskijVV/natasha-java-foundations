package ru.itsjava.collections.map;

import ru.itsjava.collections.Watch;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 18_000);
        Watch natashaWatch = new Watch("Apple", "Natasha", 25_000);
        Watch dmitriyWatch = new Watch("Omega", "Dmitriy", 100_000);

        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man natalie = new Man("Natalie");

        Map<Man, Watch> menMap = new HashMap<>();
        menMap.put(andrey, vitaliyWatch);
        menMap.put(natalie, natashaWatch);

        for (Map.Entry<Man, Watch> pair : menMap.entrySet()) {
            System.out.println(pair.getKey().getName() + ":" + pair.getValue());
        }

        menMap.put(andrey, natashaWatch);

        System.out.println("_______");
        for (Map.Entry<Man, Watch> pair : menMap.entrySet()) {
            System.out.println(pair.getKey().getName() + ":" + pair.getValue());
        }

        System.out.println(menMap.keySet());
        System.out.println(menMap.values());
        System.out.println("menMap.size() = " + menMap.size());
    }

}
