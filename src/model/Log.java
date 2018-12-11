package model;

import java.time.LocalDateTime;

public class Log {

    private int id;
    private int userID;
    private String log;
    private LocalDateTime date;

    public Log(int id, int userID, String log, LocalDateTime date) {
        this.id = id;
        this.userID = userID;
        this.log = log;
        this.date = date;
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

    public LocalDateTime getDate() {
        return date;
    }
}
