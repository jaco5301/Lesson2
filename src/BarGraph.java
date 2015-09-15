import TurtleGraphics.*;
import hsa.*;
public class BarGraph {

    public static void main(String[] args) {
        Console c = new Console();
        int bar1, bar2, bar3, bar4;
        c.print("Enter bar graph 1: ");
        bar1=c.readInt();
        c.print("Enter bar graph 2: ");
        bar2=c.readInt();
        c.print("Enter bar graph 3: ");
        bar3=c.readInt();
        c.print("Enter bar graph 4: ");
        bar4=c.readInt();
        
        
        
        
        
        
        
        
        
        SketchPadWindow s = new SketchPadWindow(301, 250);
        Pen p = new RainbowPen(s);
        p.setWidth(30);
        p.up();
        p.move(20-150, 10-125);
        p.down();
        p.move(20-150, bar1-125);
        p.up();
        p.move(10-150, 200-125);
        p.down();
        p.drawString("" + bar1);
       
        p.up();
        p.move(70-150, 10-125);
        p.down();
        p.move(70-150, bar2-125);
        p.up();
        p.move(60-150, 200-125);
        p.down();
        p.drawString("" + bar2);
        
        p.up();
        p.move(120-150, 10-125);
        p.down();
        p.move(120-150, bar3-125);
        p.up();
        p.move(110-150, 200-125);
        p.down();
        p.drawString("" + bar3);
        
        p.up();
        p.move(170-150, 10-125);
        p.down();
        p.move(170-150, bar4-125);
        p.up();
        p.move(160-150, 200-125);
        p.down();
        p.drawString("" + bar4);
        
        
    }
    
}
