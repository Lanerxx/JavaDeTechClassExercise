package date0611;

public class Practice01 {
    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();

        testInterface.compareTest(new ComparableCircle(10), new ComparableCircle(20));

        testInterface.compareTest(new ComparableRectangle(12, 18), new ComparableRectangle(10, 20));
    }
}

interface CompareObject{
    int compareTo(Object o);
}

class Circle{
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    ComparableCircle(int radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        return this.getRadius() > ((ComparableCircle)o).getRadius() ? 1 : (this.getRadius() < ((ComparableCircle)o).getRadius() ? -1 : 0);
    }
}

class Rectangle{
    private int length;
    private int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class ComparableRectangle extends Rectangle implements CompareObject{

    ComparableRectangle(int length, int width){
        super(length,width);
    }

    @Override
    public int compareTo(Object o) {
        int areaThis = this.getLength() * this.getWidth();
        int areaO = ((ComparableRectangle)o).getLength() * ((ComparableRectangle)o).getWidth();
        return areaThis > areaO ? 1 : (areaThis < areaO ? -1 : 0);
    }
}

class TestInterface{
    public void compareTest(CompareObject compareObject1, CompareObject compareObject2){
        switch (compareObject1.compareTo(compareObject2)){
            case 0:
                System.out.println("Object1 = Object2");
                break;
            case 1:
                System.out.println("Object1 > Object2");
                break;
            case -1:
                System.out.println("Object1 < Object2");
                break;
        }
    }
}