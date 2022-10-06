package student.model;

public class Course {
    private int pk_id;
    private String name;
    private String lecturer;
    private int duration;
    private Student student;

    public Course() {
    }

    public Course(String name, String lecturer, int duration, Student student) {
        this.name = name;
        this.lecturer = lecturer;
        this.duration = duration;
        this.student = student;
    }

    public int getPk_id() {
        return pk_id;
    }

    public void setPk_id(int pk_id) {
        this.pk_id = pk_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "| Course ID - " + pk_id + " | " +
                "Name: " + name + " | " +
                "Lecturer: " + lecturer + " | " +
                "Duration: " + duration + " | " +
                 student;
    }
}
