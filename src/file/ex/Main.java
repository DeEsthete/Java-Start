package file.ex;

public class Main {
    public static void main(String[] args) {
        FileWork fileWork = new FileWork("FileTest2.txt");

        try {
            fileWork.sheakespeareText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}