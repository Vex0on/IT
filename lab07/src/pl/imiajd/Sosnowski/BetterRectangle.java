package pl.imiajd.Sosnowski;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int z, int v){
        super();
        this.setLocation(x,y);
        this.setSize(z,v);
    }
    public double getPerimeter(){return 2*(this.height+this.width);}
    public double getArea(){return this.width*this.height;}
}