package user_exception.ex.exceptions;

public class StupidQuestException extends Exception {
    private String uncorrectedQuest;

    public StupidQuestException(String uncorrectedQuest) {
        this.uncorrectedQuest = uncorrectedQuest;
    }

    public StupidQuestException(String message, String uncorrectedQuest) {
        super(message);
        this.uncorrectedQuest = uncorrectedQuest;
    }

    public String getUncorrectedQuest() {
        return uncorrectedQuest;
    }

    public void setUncorrectedQuest(String uncorrectedQuest) {
        this.uncorrectedQuest = uncorrectedQuest;
    }
}