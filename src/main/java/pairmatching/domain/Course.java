package pairmatching.domain;

public enum Course {
    FRONT_END("프론트엔드"),
    BACK_END("백엔드");

    private final String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

