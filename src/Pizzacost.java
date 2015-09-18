import hsa.*;
public class Pizzacost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
        double size, topnum, base, toppings, base2, total;
        base = 2.25;
        toppings= 0.75;
        base2= 0.5;
        total= 0;
        c.print("What size of pizza do you want (in inches): ");
        size=c.readDouble();
        c.print("\nHow many toppings do you want? ");
        topnum=c.readDouble();
        total= base + (toppings * topnum) + (size * base2);
        c.print("Your total cost for your pizza is: $" + total);
    }
    
}
