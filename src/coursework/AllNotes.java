package coursework;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllNotes extends CommonCode {

    protected ArrayList<Note> allNotes = new ArrayList<>();
    private String crse = "";
    private int maxID = 0;
    AllCourses allCourses = new AllCourses();

    AllNotes() {
        readAllNotes();
    }

    AllNotes(Main coursework) {
        readAllNotes();
    }

    public final int getMaxID() {
        maxID++;
        return maxID;
    }

    protected void readAllNotes() {

        String course = "All Notes";

        try {

            ArrayList<String> readNotes = new ArrayList<>();

            readNotes = readTextFile(appDir + fileSeparator + course.trim() + fileSeparator + course.trim() + ".txt");
            System.out.println(readNotes.get(0));

            if (!"File not found".equals(readNotes.get(0))) {
                allNotes.clear();
                for (String str : readNotes) {
                    String[] tmp = str.split("\t");

                    int nid = Integer.parseInt(tmp[0]);
                    Note n = new Note(nid, tmp[1], tmp[2], tmp[3]);
                    allNotes.add(n);

                    if (nid > maxID) {
                        maxID = nid;
                    }
                }
            }
            maxID++;

        } catch (Exception e) {
            System.out.println("Could not load the file properly");
        }
    }

    protected void readNotesFromCourse(String course) {

        try {

            ArrayList<String> readNotes = new ArrayList<>();

            readNotes = readTextFile(appDir + fileSeparator + course.trim() + fileSeparator + course.trim() + ".txt");
            System.out.println(readNotes.get(0));

            if (!"File not found".equals(readNotes.get(0))) {
                allNotes.clear();
                for (String str : readNotes) {
                    String[] tmp = str.split("\t");

                    int nid = Integer.parseInt(tmp[0]);
                    Note n = new Note(nid, tmp[1], tmp[2], tmp[3]);
                    allNotes.add(n);

                    if (nid > maxID) {
                        maxID = nid;
                    }
                }
            }
            maxID++;

            if ("File not found".equals(readNotes.get(0))) {
                allNotes.clear();
            }

        } catch (Exception e) {
            System.out.println("Could not load the file properly");
        }
    }

    protected void addNote(int maxID, String course, String note) {
        Note myNote = new Note(maxID, course, note);
        allNotes.add(myNote);
        writeAllNotes(course);
    }

    public ArrayList<Note> getAllNotes() {
        return allNotes;
    }

    private void writeAllNotes(String course) {
        String path = appDir + fileSeparator + course.trim() + fileSeparator + course.trim() + ".txt";
        ArrayList<String> writeNote = new ArrayList<>();

        for (Note n : allNotes) {
            String tmp = n.getNoteID() + "\t";
            tmp += n.getCourse() + "\t";
            tmp += n.getDayte() + "\t";
            tmp += n.getNote() + "\t";
            writeNote.add(tmp);

        }
        try {
            writeTextFile(path, writeNote);
        } catch (IOException ex) {
            System.out.println("Problem! " + path);
        }
    }

    public String searchAllNotesByKeyword(String noteList, int i, String s) {
        if (i == allNotes.size()) {
            return noteList;
        }

        if (allNotes.get(i).getNote().contains(s)) {
            noteList += allNotes.get(i).getNote() + "\n";
        }

        return searchAllNotesByKeyword(noteList, i + 1, s);
    }

}
