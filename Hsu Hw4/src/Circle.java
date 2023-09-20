public class Circle {
    public Point center;
    public int radius;
    public Circle(Point center,int radius){
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter(){
        return center;
    }
    public int getRadius(){
        return radius;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public boolean equals(Circle circle){
        if(radius == circle.radius){
            return true;
        }
        else{
            return false;
        }
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public String toString(){
        return "The Center is: " + center + "The radius is: " + radius;
    }

}
