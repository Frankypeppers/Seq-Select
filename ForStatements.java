public class ForStatements
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("i is equal to "+i);
        }
        for (int j = 10; j > 0; j = j - 2) {
            System.out.println("j is equal to "+j);
        }
        for (int k = 10; k != 0; k = k - 3) {
            System.out.println( "k is equal to "+k);
        }
        /**
         * K cannot equal 0 in this loop, it will go infinitely.
         */
    }
    
    
    public static void main(String[] args)
    {        
        ForStatements fs = new ForStatements();
        fs.run();
    }
}


