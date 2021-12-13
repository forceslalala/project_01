package zuoye_4;

public class TestCircleWithPrivate {
    public static void main(String[] args) {
        CircleWithPrivate myCircle = new CircleWithPrivate(5.0);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is "
                + CircleWithPrivate.getNumberOfObjects());
    }
}
