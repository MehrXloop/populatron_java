import java.util.LinkedList;
import java.util.List;

public class Parser {

    private List<String[]> array_list = new LinkedList<>();

    public Parser(List<String> data){
        for(int i=1; i<data.size();i++){
            String[] parse_array = data.get(i).split(",");
            array_list.add(parse_array);
        }        
    }

    public List<String[]> GetParseArray(){
        return array_list;
    }
}