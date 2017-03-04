package HW10;

public class Second {

    static class MyException extends Exception{
        String str;
        public MyException(String s){
            super(s);
            this.str = s;
        }

        public void print(){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        try {
            throw new MyException("message");
        } catch (MyException e){
            e.print();
        }
    }
}
