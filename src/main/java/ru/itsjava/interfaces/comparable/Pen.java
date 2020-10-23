package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pen implements Cloneable, Comparable<Pen>{
    private final String color;
    private final double neckThickness;
    private final boolean isHelium;

    @Override
    public int compareTo(Pen o) {
        return Double.compare(neckThickness, o.neckThickness);
    }

//    @Override
//    public String toString() {


//        return "Pen{" + color + ", " + neckThickness + ", " + isHelium + "}";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Pen)) return false;
//
//        Pen pen = (Pen) o;
//
//        if (Double.compare(pen.neckThickness, neckThickness) != 0) return false;
//        if (isHelium != pen.isHelium) return false;
//        return color.equals(pen.color);
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("Hash code");
//        long temp = Double.doubleToLongBits(neckThickness);
//        return (int) (temp ^ (temp >>> 32));
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}