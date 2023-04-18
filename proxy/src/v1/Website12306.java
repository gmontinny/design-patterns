package v1;

public class Website12306 extends Station{
    public Website12306(String username, String start, String end) {
        super(username, start, end);
    }

    @Override
    public void buy() {
        // 模拟日志打印
        System.out.println(String.format("【Resultado】 %sNome%sInicio%sFim", getUsername(), getStart(), getEnd()));
        super.buy();
    }
}
