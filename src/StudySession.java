import java.time.LocalDate;


public class StudySession {
    private String moduleName;
    private double minutes;
    private String topic;
    private LocalDate date;


    public StudySession(String modName, double minutes, String topic, LocalDate date) {
        this.moduleName = modName;
        this.minutes = minutes;
        this.topic = topic;
        this.date = date;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public double getMinutes() {
        return this.minutes;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTopic() {
        return topic;
    }

    public String toString() {
        return "Module: " + getModuleName() + "\n"
                + "Topic: " + getTopic() + "\n"
                + "Minutes Spent: " + getMinutes() + "\n"
                + "Date: " + getDate() + "\n"
                + "----------------";
    }
}
