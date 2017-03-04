package HW10;


public class Third {
    public static void main(String[] args) {
        String string = null;
        //string.equals("str");

        try{
            string.equals("str");
        } catch (NullPointerException e){
            System.out.println("null");
        }
    }
}
