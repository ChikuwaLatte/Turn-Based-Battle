package constant;

public enum Type {
    WATER("水"),
    FIRE("火"),
    TREE("木"),
    LIGHT("光"),
    DARK("闇"),
    ;

    private final String description;

    private Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}