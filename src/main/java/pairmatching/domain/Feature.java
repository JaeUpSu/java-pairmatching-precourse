package pairmatching.domain;

public enum Feature {
    MATCHING("1"),
    CHECK("2"),
    CLEAR("3"),
    EXIT("Q");

    private final String code;

    Feature(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
