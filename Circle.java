package lab1;

public class Circle extends Shape{
    protected int CenterX;
    protected int CenterY;
    protected int radius;

    public Circle (int centerX, int centerY, int radius)
    {
        this.name = "circle";
        this.CenterX = CenterX;
        this.CenterY = centerY;
        this.radius = radius;
    }

    public void draw()
    {
        System.out.println("This is a circle with center ("+CenterX+","+CenterY+") and radius"+ radius);
    }
}
