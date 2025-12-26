public class Rectangle implements Formula{
    public double myLength;
    public double myWidth;
    public Rectangle(double length, double width){
        myLength=length;
        myWidth=width;

    }

    public double getPerimeter(){
        return 2*(myLength+myWidth);
    }

    public double getArea(){
        return myLength*myWidth;
    }


}