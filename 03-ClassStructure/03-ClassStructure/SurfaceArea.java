public class SurfaceArea
{
    public static double surfaceArea(double radious)
    {
        return Math.PI * radious * radious;
    }
    public static double surfaceArea(double sideA, double sideB)
    {
        return sideA * sideB;
    }
    public static double surfaceArea(double sideA, double sideB, double sideC)
    {
        double s = (sideA + sideB + sideC)/2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
    public static void main(String[] args) {
        System.out.println("Surface area of rectangle: " + surfaceArea(4, 5));
        System.out.println("Surface area of circle: " + surfaceArea(3));
        System.out.println("Surface area of triangle: " + surfaceArea(3, 4, 5));
    }
}
