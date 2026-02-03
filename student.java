package model;

public class Student {
    private int id;
    private String name;
    private String skill;

    public Student(int id, String name, String skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }
}
