import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        StudyTracker tracker = new StudyTracker();
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select from below: \n A: Add new session \n Q: Exit \n S: Show all sessions \n D: Delete a session");
            String choice = inputScanner.nextLine();

            if (choice.equals("S") || choice.equals("s")) {
                tracker.showAllSessions();

            } else if (choice.equals("Q") || choice.equals("q")) {
                System.out.println("Program Terminated");
                inputScanner.close();
                break;

            } else if (choice.equals("A") || choice.equals("a")) {

                System.out.println("Name of the module? : ");
                String moduleName;
                while (true) {
                    String mName = inputScanner.nextLine();
                    if(!mName.isEmpty()) {
                        System.out.println("Module name added successfully");           //add the module name
                        moduleName = mName;
                        break;
                    } else {
                        System.out.println("Cannot have empty module name!");
                    }
                }

                System.out.println("Number of minutes studied? : ");
                double minutesStudied;
                while(true) {
                    double mStudied = inputScanner.nextDouble();
                    if(mStudied < 0) {                                       //add minutes studied
                        System.out.println("Invalid minutes studied");
                    } else {
                        System.out.println("Minutes added successfully");
                        minutesStudied = mStudied;
                        break;
                    }
                }

                inputScanner.nextLine();

                System.out.println("What topic? : ");
                String topic;
                while(true) {
                    String tpic = inputScanner.nextLine();
                    if(!tpic.isEmpty()) {
                        System.out.println("Topic added successfully");
                        topic = tpic;                                          //add new topic
                        break;
                    } else {
                        System.out.println("Cannot have empty topic!");
                    }
                }

                LocalDate date = LocalDate.now();

                StudySession session;
                session = new StudySession(moduleName, minutesStudied, topic, date); //build new inputted object dynamically
                tracker.addSession(session);
                tracker.showAllSessions();

            } else if (choice.equals("D") || choice.equals("d")) {
                if (tracker.lengthOfSessionList() == 0) {
                    System.out.println("Session list is empty");
                } else {
                    tracker.showAllSessions();


                    String delete_index = "";  //initialise
                    int index_to_delete = 0;

                    while (true) {
                        System.out.println("What session would you like to delete?");
                        delete_index = inputScanner.nextLine();

                        if (!tracker.isValid(delete_index)) {          //use helper method in tracker
                            System.out.println("Not a valid number!");
                        } else {

                            index_to_delete = Integer.parseInt(delete_index); //wrap the string into an integer by parsing it
                            int listSizeBeforeDelete = tracker.lengthOfSessionList(); //to track, like snapshotting
                            tracker.deletebyIndex(index_to_delete); //deletes
                            if (tracker.lengthOfSessionList() < listSizeBeforeDelete) { //to check if it has been deleted or not
                                break;
                            }
                            System.out.println("Pick a valid session number:");

                        }

                    }

                }

            } else {
                System.out.println("Invalid choice\nProgram Terminated");
            }
        }
    }
}
