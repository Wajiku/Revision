import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        StudyTracker tracker = new StudyTracker();
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Select from below: \n A: Add new session \n Q: Exit");
        String choice = inputScanner.nextLine();
        if (choice.equals("Q") || choice.equals("q")) {
            System.out.println("Program Terminated");
            inputScanner.close();
        } else if (choice.equals("A") || choice.equals("a")) {

            System.out.println("Name of the module? : ");
            String moduleName = inputScanner.nextLine();
            if (moduleName.isEmpty()) {
                System.out.println("Cannot have an empty module name"); //add the module name
                return;
            } else {
                System.out.println("Module name added successfully");
            }

            System.out.println("Number of minutes studied? : ");
            double minutesStudied = inputScanner.nextDouble();
            if (minutesStudied < 0) {                                    //add the minutes studied
                System.out.println("Invalid minutes studied!");
                return;
            } else {
                System.out.println("Minutes studied added successfully!");
            }
            inputScanner.nextLine();

            System.out.println("What topic? : ");
            String topic = inputScanner.nextLine();
            if (topic.isEmpty()) {
                System.out.println("Cannot have an empty topic!");       //add the topic
                return;
            } else {
                System.out.println("Topic added successfully!");
            }

            LocalDate date = LocalDate.now();

            StudySession session;
            session = new StudySession(moduleName, minutesStudied, topic, date); //build new inputted object dynamically
            tracker.addSession(session);
            tracker.showAllSessions();

            inputScanner.close();
        } else {
            System.out.println("Invalid choice\nProgram Terminated");
            inputScanner.close();
        }
    }
}

//        LocalDate date = LocalDate.now();
//
//        StudySession session = new StudySession("OS", 40, "Week 5", date);
//        StudySession session2 = new StudySession("Mobile Application Development", 180, "Week 5", date);
//        StudySession session3 = new StudySession("Formal Methods", 65, "Week 5", date);
//        StudySession session4 = new StudySession("Team Projects", 45, "Week 5", date);
//        StudySession session5 = new StudySession("AI Methods", 200, "Week 5", date);
//        StudySession session6 = new StudySession("Professional Issues In Computing", 90, "Week 5", date);
//
//        StudyTracker tracker = new StudyTracker();
//
//        tracker.addSession(session);
//        tracker.addSession(session2);
//        tracker.addSession(session3);
//        tracker.addSession(session4);
//        tracker.addSession(session5);
//        tracker.addSession(session6);
//
//        tracker.deleteSession(session);
//        tracker.showAllSessions();
//
//    }
//}