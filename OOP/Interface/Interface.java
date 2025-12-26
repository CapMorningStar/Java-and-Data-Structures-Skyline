public class Interface{
    public static void main(String[] args) {
        Formula mycircle=new Circle(3);
        System.out.printf("%.2f \n\n",mycircle.getArea());

        System.out.println(mycircle.getPerimeter()+"\n");

        Formula myRectangle=new Rectangle(3.5, 4.5);
        System.out.println(myRectangle.getArea()+"\n");
        System.out.println(myRectangle.getPerimeter()+"\n");



        Formula[] formula=new Formula[2];
        formula[0]=new Circle(4);
        formula[1]=new Rectangle(3, 5);

        for(Formula num:formula){
            System.out.println(num.getArea());
            
            System.out.println(num.getPerimeter());
            System.out.println();
        }
    }


}