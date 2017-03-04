package HW10.Fifth;

public class Main {
    static void throwerMethod(int ex) throws E1, E2, E3 {
        switch (ex) {
            case 1:
                throw new E1();
            case 2:
                throw new E2();
            case 3:
                throw new E3();
        }
    }

    public static void main(String[] args) {
        try {
            throwerMethod(2);
        } catch (E1 | E2 | E3 e) {
            e.printStackTrace();
        }
    }
}
