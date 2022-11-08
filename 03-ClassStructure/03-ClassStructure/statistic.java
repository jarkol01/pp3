public class statistic
{
    public static int countNumbers(int x, int y)
    {
        return y - x + 1;
    }
    
    public static int sumOfRange(int x, int y)
    {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        };
        return sum;
    }
    
    public static int arithmeticMean(int x, int y)
    {
        return sumOfRange(x, y) / countNumbers(x, y);
    }
    
    public static void main(String[] args) 
    {
        System.out.println(sumOfRange(5, 10));
        System.out.println(countNumbers(5, 10));
        System.out.println(arithmeticMean(5, 10));
    }
}
