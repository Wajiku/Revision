import java.util.ArrayList;


public class StudyTracker {
    private ArrayList<StudySession> SessionList;

    public StudyTracker() {
        this.SessionList = new ArrayList<StudySession>();
    }

    public void addSession(StudySession session) {
        SessionList.add(session);
    }

    public void deleteSession(StudySession session) {
        SessionList.remove(session);
    }

    public void showAllSessions() {
        if(SessionList.size() <= 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < SessionList.size(); i++) {
                System.out.println(SessionList.get(i));
            }
        }
    }
}
