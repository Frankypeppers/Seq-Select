public class SequencingSelection
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -0;
    
    public void run() {
        if (a == 5) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
        if (b == 2) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
        if (c != 1) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
        if (d == -8 && a == 4) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
        System.out.println("Hello WoRld!");
    }
    public static void main(String[] args)
    {
        SequencingSelection SqSl = new SequencingSelection();
        SqSl.run();
    }
}
