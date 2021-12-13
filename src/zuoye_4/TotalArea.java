package zuoye_4;

public class TotalArea {
    public static void main(String[] args) {
        CircleWithPrivate[] circleArray = createCircleArray();

        printCircleArray(circleArray);
    }

    public static CircleWithPrivate[] createCircleArray(){
        CircleWithPrivate[] circleArray = new CircleWithPrivate[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivate(Math.random() * 100);
        }

        return circleArray;
    }

    public static void printCircleArray(CircleWithPrivate[] circleArray){
        System.out.printf("%-30s%-15s\n", "radius", "area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }
        System.out.println("___________________________________________");

        System.out.printf("%-30s%-15f\n", "The total area of circles is",
                sum(circleArray));
    }

    public static double sum(CircleWithPrivate[] circleArray){
        double sum = 0;

        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}
