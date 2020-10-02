package ru.itsjava.oop;

public class Cat {
    private final String nickname;
    public static String voice = "MEOW-MEOW";

    public Cat(String nickname) {
        System.out.println("Cat");
        this.nickname = nickname;
    }

    public void sayMeow(){
        System.out.println("Meowww");
    }

    public String getVoice() {
        return voice;
    }

    //    public Cat() {
//    }
}
