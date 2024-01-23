public class NullPointerExceptDemo {
    
    
    public static void main(String[] args) {
            String s = "abcd";
            foo(null);	
    }

    // Using a try-catch block:
    static void foo(String x){
        try {
            System.out.println("Karakter Pertama adalah : " + x.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Terjadi Exception");
            System.out.println(e.getMessage());
        }
    }
}