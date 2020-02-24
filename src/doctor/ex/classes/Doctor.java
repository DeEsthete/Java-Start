package doctor.ex.classes;

public interface Doctor <T extends Living> {
    boolean doOperation(T living);
    default void quit() {
        System.out.println("Просто уволился");
    }
}