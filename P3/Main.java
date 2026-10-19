interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Hybrid inheritance using a class and an interface
class Printer {
    void powerOn() {
        System.out.println("Printer is switched on.");
    }
}

class AdvancedPrinter extends Printer implements Printable, Scannable {

    public void print() {
        System.out.println("Advanced printer is printing...");
    }

    public void scan() {
        System.out.println("Advanced printer is scanning...");
    }

    void copy() {
        System.out.println("Copying document...");
    }
}

public class Main {
    public static void main(String[] args) {

        // Demonstrating multiple inheritance through interfaces
        AllInOnePrinter p1 = new AllInOnePrinter();
        p1.print();
        p1.scan();

        System.out.println();

        // Demonstrating hybrid inheritance
        AdvancedPrinter p2 = new AdvancedPrinter();
        p2.powerOn();
        p2.print();
        p2.scan();
        p2.copy();
    }
}


