package coursework;

/**
 *
 * @author Willian Cieslak
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AllCourses extends CommonCode {

    protected ArrayList<String> courses = new ArrayList<>();
    protected ArrayList<String> courseList = new ArrayList<>();

    AllCourses() {

    }

    //Creates a new file and text file using the same name.
    protected void newCourseFile(String newCourse) {

        String file = appDir + fileSeparator + newCourse;
        String path = file + fileSeparator + newCourse + ".txt";

        //Verifies if the directory exists. If not then a new one is created
        File directory = new File(file);
        if (!directory.exists()) {
            directory.mkdir();

            JOptionPane.showMessageDialog(null, "Course added!");

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(path), "utf-8"))) {
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(AllCourses.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AllCourses.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else { //If the folder already exists, display an error message.
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(null, "Course name already exists", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("File already exists");
            courseList.remove(courseList.size() - 1);
        }
    }

    //List all the courses in the txt file "Course List"
    protected void writeAllCourses() {

        String path = appDir + fileSeparator + "Course List.txt";

        for (String s : courses) {
            String tmp = s.toString() + "\t";
            courseList.add(tmp);

        }

        try {
            writeTextFile(path, courseList);
        } catch (IOException ex) {
            System.out.println("Problem! " + path);
        }
    }

    //Read all the courses in "Course List"
    protected ArrayList<String> readAllCourses() throws FileNotFoundException, IOException {

        ArrayList<String> readCourses = new ArrayList<>();

        readCourses = readTextFile(appDir + fileSeparator + "Course List.txt");

        String tmp = "";
        for (int i = 0; i < readCourses.size(); i++) {
            courseList.add(readCourses.get(i));
        }

        return courseList;
    }

    //Returns all the courses listed in the file "Course List"
    protected ArrayList<String> getAllCourses() {
        return courseList;
    }

}
