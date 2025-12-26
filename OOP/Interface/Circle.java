public class Circle implements Formula
{
    public double myRadius;


    public Circle(double radius)
    {
    myRadius=radius;
    }
    public double getPerimeter()
    {   
        
        return 2*Math.PI*myRadius;
    }

    public double getCircuference(){
        return getPerimeter();
    }

    public double getArea(){
        return Math.PI*myRadius*myRadius;
    }

    
}