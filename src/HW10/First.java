package HW10;

public class First {
    public static void main(String[] args) {
        try{
            throw new Exception("string");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
