public class SwitchCase {
    public static void main(String args[]) {
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Case1: Value is : " + i);
            case 2:
                System.out.println("Case2: Value is: " + i);
            case 3: 
                System.out.println("Case3: Value is: " + i);
            default:
                System.out.println("Default: Value is: " + i);
        }
    }
}