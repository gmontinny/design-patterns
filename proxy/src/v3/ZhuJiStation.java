package v3;

public class ZhuJiStation implements Station{
    private String username;

    private String start;

    private String end;

    public ZhuJiStation(String username, String start, String end) {
        this.username = username;
        this.start = start;
        this.end = end;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void buy() {
        System.out.println(String.format("%s %s %s", username, start, end));
    }
}
