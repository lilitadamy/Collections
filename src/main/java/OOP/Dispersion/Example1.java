package OOP.Dispersion;

import OOP.Dispersion.Example;

public class Example1 extends Example {

    static {
        System.out.println("Static block");
    }

    public Example1() {
        System.out.println("in OOP.Dispersion.Example1 Constructor");
    }

    public  void getFields () {
        System.out.println("in OOP.Dispersion.Example1 getFields");
    }

}
