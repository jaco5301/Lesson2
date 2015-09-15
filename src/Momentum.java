import hsa.*;
public class Momentum {
    public static void main(String[] args) {
        Console c = new Console();
        int mass;
        int velocity;
        int momentumE;
        c.print("Enter object's mass: ");
        mass = c.readInt();
        c.print("Enter the object's velocity: ");
        velocity=c.readInt();
        momentumE = mass * velocity;
         c.print("The momentum is " + momentumE);
    }
    
}
