package coursework;

/**
 *
 * @author Willian Cieslak
 */
public class Coursework {

    private int courseworkID = 0;
    private String name = "";
    private String date = "";
    private String requirement = "";
    private String dueDate = "";

    public Coursework() {

    }

    public Coursework(int max, String name, String date, String dueDate, String requirement) {
        setCourseworkID(max);
        setName(name);
        setDate(date);
        setDueDate(dueDate);
        setRequirement(requirement);
    }

    public Coursework(int max, String name, String dueDate, String requirement) {
        setCourseworkID(max);
        setName(name);
        //setDate(date);
        setDueDate(dueDate);
        setRequirement(requirement);
    }

    public Coursework(int max, String name, String requirement) {
        setCourseworkID(max);
        setName(name);
        setRequirement(requirement);
    }

    /**
     * @return the courseworkID
     */
    public int getCourseworkID() {
        return courseworkID;
    }

    /**
     * @param courseworkID the courseworkID to set
     */
    public void setCourseworkID(int courseworkID) {
        this.courseworkID = courseworkID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the requirement
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * @param requirement the requirement to set
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

}
