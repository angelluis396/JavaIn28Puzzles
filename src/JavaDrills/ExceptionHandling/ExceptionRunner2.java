package JavaDrills.ExceptionHandling;

public class ExceptionRunner2 {

    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    private static void method1(){
        method2();
        System.out.println("Method 1 Ended");
    }

    private static void method2(){
        try {
            String str = null;
            str.length();
            System.out.println("Method 2 Ended");

        }  catch (NullPointerException ex){
            System.out.println("Matched Null Exception");
            ex.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

