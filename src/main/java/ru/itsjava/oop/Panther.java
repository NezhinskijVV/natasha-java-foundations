package ru.itsjava.oop;

public class Panther extends Cat {
    public Panther(String nickname) {
        super(nickname);
    }

    @Override
    public void sayMeow() {
        System.out.println("RRRRR");
    }

    public String getVoice() {
        return "PANTHER MEOW";
    }
}
