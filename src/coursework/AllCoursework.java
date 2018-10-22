package coursework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Willian Cieslak
 */
public class AllCoursework extends CommonCode {

    public AllCoursework() {

    }

    protected ArrayList<Coursework> allCoursework = new ArrayList<>();
    private int maxID = 0;
    protected ArrayList<String> courseworkList = new ArrayList<>();
    protected ArrayList<String> list = new ArrayList<>();

    //Requirements to create a Coursework
    public void addCoursework(int maxID, String name, String dueDate, String requirement) {

        String date = getDateAndTime();
        Coursework myCoursework = new Coursework(maxID, name, date, dueDate, requirement);
        allCoursework.add(myCoursework);
        writeAllCoursework(name);
    }

    //Creates a file inside the folder "Courseworks" with the same name choosen by the user
    private void writeAllCoursework(String name) {
        String path = appDir + fileSeparator + "Courseworks" + fileSeparator + name.trim() + ".txt";
        ArrayList<String> writeNote = new ArrayList<>();

        for (Coursework c : allCoursework) {
            String tmp = c.getCourseworkID() + "\t";
            tmp += c.getName() + "\t";
            tmp += c.getDate() + "\t";
            tmp += c.getDueDate() + "\t";
            tmp += c.getRequirement() + "\t";
            writeNote.add(tmp);

            System.out.println("ID: " + c.getCourseworkID());
            System.out.println("Name: " + c.getName());
            System.out.println("Date: " + c.getDate());
            System.out.println("Due date: " + c.getDueDate());
            System.out.println("Req: " + c.getRequirement());

        }
        try {
            writeTextFile(path, writeNote);
        } catch (IOException ex) {
            System.out.println("Problem! " + path);
        }
    }

    //Adds the Coursework name to the list "Coursework List"
    protected void writeCourseworkList() {

        String path = appDir + fileSeparator + "Coursework List.txt";
        //ArrayList<String> writeNote = new ArrayList<>();

        for (String s : courseworkList) {
            String tmp = s.toString() + "\t";
            list.add(tmp);

        }

        try {
            writeTextFile(path, list);
        } catch (IOException ex) {
            System.out.println("Problem! " + path);
        }

    }

    public final int getMaxID() {
        maxID++;
        return maxID;
    }

    //Reads all the courses from the list in "Coursework List"
    protected ArrayList<String> readAllCourseworks() throws FileNotFoundException, IOException {

        ArrayList<String> readCourses = new ArrayList<>();

        readCourses = readTextFile(appDir + fileSeparator + "Coursework List.txt");

        String tmp = "";
        for (int i = 0; i < readCourses.size(); i++) {
            courseworkList.add(readCourses.get(i));
        }

        return courseworkList;
    }

    //Returns all the couseworks
    protected ArrayList<Coursework> getAllCourseworks() {
        return allCoursework;
    }

    //Reads the coursework from the selected Coursework name
    protected void readCoursework(String course) {

        try {

            ArrayList<String> readNotes = new ArrayList<>();

            readNotes = readTextFile(appDir + fileSeparator + "Courseworks" + fileSeparator + course.trim() + ".txt");
            System.out.println(readNotes.get(0));

            if (!"File not found".equals(readNotes.get(0))) {
                allCoursework.clear();
                for (String str : readNotes) {
                    String[] tmp = str.split("\t");

                    int nid = Integer.parseInt(tmp[0]);
                    Coursework c = new Coursework(nid, tmp[1], tmp[2], tmp[3], tmp[4]);
                    allCoursework.add(c);

                    if (nid > maxID) {
                        maxID = nid;
                    }
                }
            }
            maxID++;

            if ("File not found".equals(readNotes.get(0))) {
                allCoursework.clear();
            }

        } catch (Exception e) {
            System.out.println("Could not load the file properly");
        }
    }

}
