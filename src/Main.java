import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        StudySession session = new StudySession("OS", 40, "Week 5", date);
        StudySession session2 = new StudySession("Mobile Application Development", 180, "Week 5", date);
        StudySession session3 = new StudySession("Formal Methods", 65, "Week 5", date);
        StudySession session4 = new StudySession("Team Projects", 45, "Week 5", date);
        StudySession session5 = new StudySession("AI Methods", 200, "Week 5", date);
        StudySession session6 = new StudySession("Professional Issues In Computing", 90, "Week 5", date);

        StudyTracker tracker = new StudyTracker();

        tracker.addSession(session);
        tracker.addSession(session2);
        tracker.addSession(session3);
        tracker.addSession(session4);
        tracker.addSession(session5);
        tracker.addSession(session6);

        tracker.deleteSession(session);
        tracker.showAllSessions();

    }
}