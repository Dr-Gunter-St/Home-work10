package HW10.Fourth;

public class Fourth {

    static void f() throws MyException2 {
        try {
            g();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            throw new MyException2("second");
        }
    }

    static void g() throws MyException {
        throw new MyException("first");
    }

    public static void main(String[] args) {
        try{
            f();
        } catch (MyException2 e){
            System.out.println(e.getMessage());
        }
    }
}
