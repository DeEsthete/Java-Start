package salary.ex;

public class Main {
    public static void main(String[] args) {
        try {
            AAAAA.iThrowException();
        } catch (Exception e) {
            System.out.println("Принял " + e.toString());
        }
    }
}