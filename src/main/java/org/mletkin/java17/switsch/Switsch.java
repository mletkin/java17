package org.mletkin.java17.switsch;

public class Switsch {

    enum Animal {
        SPIDER, CENTIPEDE, ANT, BEE;
    }

    public void oldStyleWithoutBreak(Animal animal) {
        switch (animal) {
        case SPIDER:
            System.out.println("8 legs");
        case ANT, BEE:
            System.out.println("6 legs");
        default:
            System.out.println("strange animal");
        }
    }

    public void oldStyleWithBreak(Animal animal) {
        switch (animal) {
        case SPIDER:
            System.out.println("8 legs");
            break;
        case ANT, BEE:
            System.out.println("6 legs");
            break;
        default:
            System.out.println("strange animal");
        }
    }

    public void newStyle(Animal animal) {
        switch (animal) {
        case SPIDER -> System.out.println("8 legs");
        case ANT, BEE -> System.out.println("6 legs");
        default -> System.out.println("strange animal");
        }
    }

    public void newStyleWithYield(Animal animal) {
        String legs = switch (animal) {
        case SPIDER -> "8 legs";
        case ANT, BEE -> "6 legs";
        case CENTIPEDE -> {
            yield "many legs";
        }
        default -> "strange animal";
        };
        System.out.println(legs);
    }

    public void oldStyleWithYield(Animal animal) {
        String legs = switch (animal) {
        case SPIDER:
            yield "8 legs";
        case ANT, BEE:
            yield "6 legs";
        default:
            yield "strange animal";
        };
        System.out.println(legs);
    }

}
