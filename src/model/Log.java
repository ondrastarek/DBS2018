package model;

public class Log {

    private int id;
    private int userID;
    private String log;

    public Log(int id, int userID, String log) {
        this.id = id;
        this.userID = userID;
        this.log = log;
    }

    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
    }

    public String getLog() {
        return log;
    }
}
