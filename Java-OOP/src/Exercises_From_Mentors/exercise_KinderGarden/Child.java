package Exercises_From_Mentors.exercise_KinderGarden;

import java.util.List;

public class Child {
    private String firstName;
    private String lastName;
    private int age;
    private List<Parent> parents;

    public Child(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Child " + firstName + " " + lastName + "\n"
                + "is " + age + " years old and his parents are \n"
                + parents;
    }
}
