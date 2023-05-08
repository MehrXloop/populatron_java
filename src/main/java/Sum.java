import java.util.List;

public class Sum {
    private long sum;
    public Sum(List<String[]> parse_data){
        sum = parse_data.stream().mapToInt(i-> Integer.parseInt(i[4].isEmpty() ? "0" : i[4])).sum();
    }

    public long GetSum(){
        return sum;
    }
}
