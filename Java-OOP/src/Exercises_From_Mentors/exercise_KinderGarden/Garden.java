package Exercises_From_Mentors.exercise_KinderGarden;

public class Garden {
    private String teacherFirstName;
    private String teacherLastName;
    private Child child;
    private Group group;


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        if (child.getAge() <= 2){
            final Group nursery = Group.NURSERY;
        }
        else {
            final Group preschool = Group.PRESCHOOL;
        }
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        if (group == Group.NURSERY){
            this.teacherFirstName = "Елена";
        }else {
            this.teacherFirstName = "Здравка";
        }
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        if (group == Group.NURSERY){
            this.teacherLastName = "Попова";
        }else {
            this.teacherLastName = "Георгиева";
        }
    }

    @Override
    public String toString() {
        return "Group: " + group + "\n"
                +"with teacher: " + teacherFirstName + " " + teacherLastName + "\n"
                +"and child: " + child + "\n";
    }
}
