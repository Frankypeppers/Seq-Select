public class CopyOfHelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        int k = 30;
        do {
            System.out.println("i is less than 15");
            i = i + 3;
        } while (i < 15);
        do {
            System.out.println("k is greater than 5");
            k = k - 3;
        } while (k > 15);
        do {
            System.out.println("a and/or b has met its condition");
            a = a + 4;
            b = b + 7;
        } while (a < 10 && b <= 20);
        System.out.println("Hello World!");
        
    }
    
    
    public static void main(String[] args)
    {        
        CopyOfHelloWorld hw = new CopyOfHelloWorld();
        hw.run();
    }
}
