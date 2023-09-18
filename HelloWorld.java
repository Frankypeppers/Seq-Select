public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        int k = 30;
        while (i < 15) {
            System.out.println("i is less than 15");
            i = i + 3;
        }
        while (k > 15) {
            System.out.println("k is greater than 5");
            k = k - 3;
        }
        while (a < 10 && b <= 20) {} 
        System.out.println("Hello World!");
    }
    
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}