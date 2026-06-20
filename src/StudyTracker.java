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
        if (SessionList.size() <= 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < SessionList.size(); i++) {
                System.out.println(SessionList.get(i));
            }
//            System.out.println("\n" + "Minutes studied: " + totalMinutes() + " " + "minutes");
            System.out.println("Total time studied: ");
            if (totalMinutes() < 60) {
                System.out.println("Total time studied: " + totalMinutes());
            } else {
                convertMinutesToHours();
                System.out.println("\n");
            }
        }
    }

    public double totalMinutes() {
        double total = 0;
        for (StudySession session : SessionList) {
            total += session.getMinutes();
        }
        return total;
    }

    public void convertMinutesToHours() {
        double time = totalMinutes();
        if (time == 60) {
            System.out.println("1 hour");
        } else if (time > 60) {
            int hours = (int) time / 60;
            double remainder = time % 60;
            System.out.println(hours + " " + "hours" + " " + "and" + " " + remainder + " " + "minutes");
        }

    }

    public int lengthOfSessionList() {
        return SessionList.size();

    }
}

//    public double convertMinutesToHours () {
//        double timeStudied = totalMinutes();
//        if (timeStudied == 60) {
//            System.out.println("1 hour");
//        } else if (totalMinutes() > 60) {
//            double hours = timeStudied / 60;
//            double remainder = timeStudied - (1*60);
//        }
//    }

//    public double convertMinutesToHours () {
//        double timeStudied = 0;
//        if (totalMinutes() == 60) {
//            System.out.println("1 hour");
//        } else if (totalMinutes() > 60) {
//            double hours = totalMinutes() / 60;
//            double remainder = hours % 60;
//            timeStudied = hours + remainder;
//        }
//        return timeStudied;
//    }
//}
//    @Override
//    public String toString() {
//        return SessionList.toString() + "\n" + "Total " + totalMinutes();
//    }
//}

