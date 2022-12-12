package pairmatching.domain;

public class Crew {
    private Course course;
    private String name;

    Crew(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
