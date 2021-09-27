interface Shape {

    void area();
    void perimeter();
}

abstract class EqualSidedQuadrilateral implements Shape {

    public int side;
    public EqualSidedQuadrilateral(int side){
        this.side=side;
    }

    @Override 
    public void perimeter() {
       System.out.println("The perimeter is: " + (4 * this.side)); 
    }
}

class Square extends EqualSidedQuadrilateral {
   
    public Square(int side){
        super(side);
        System.out.println("Square with size - "+side+"cm");
    }

    @Override 
    public void area() {
       System.out.println("The area is: " + (this.side*this.side)); 
    } 
}

class Rhombus extends EqualSidedQuadrilateral {

    public int diagonal1,diagonal2;
    public Rhombus(int side,int diagonal1,int diagonal2){
        super(side);
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
        System.out.printf("Rhombus with side - %dcm, Diagonal 1 - %dcm, Diagonal 2 - %dcm\n",side,diagonal1,diagonal2);        
    }

    @Override 
    public void area() {
       System.out.println("The area is: " + (0.5*this.diagonal1*this.diagonal2)); 
    } 
}


public class CoreJavaQuestion1 {
    public static void main(String[] args) {
    Square s=new Square(5);
    s.area();
    s.perimeter();
    Rhombus r=new Rhombus(5,8,6);
    r.area();
    r.perimeter();
    }
}