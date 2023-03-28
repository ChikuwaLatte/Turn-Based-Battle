package constant;

public enum Config {
    STRING_DISPLAY_WAIT_TIME_PER_CHAR("文字列を表示する時の一文字ごとの待ち時間", "100"),
    ;

    private final String description;
    private final String value;

    private Config(String description, String value) {
        this.description = description;
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    public String getDescription() {
        return this.description;
    }

    public Integer getIntValue() {
        try{
            return Integer.parseInt(this.value);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return 0;
        }
        
    }
}
