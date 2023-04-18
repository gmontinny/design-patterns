package v2;

public class Website12306 implements Station{
    private String username;

    private String start;
    private String end;

    private Station station;

    public Website12306(String username, String start, String end) {
        this.username = username;
        this.start = start;
        this.end = end;
    }

    public void buy() {
        System.out.println(String.format("【Resultado】 %s %s %s", username, start, end));
        if (station == null) {
            station = new ZhuJiStation(username, start, end);
        }
        station.buy();
    }
}
