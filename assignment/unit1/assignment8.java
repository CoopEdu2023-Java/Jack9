import java.util.List;

public class assignment8 {

    public static void main(String[] args) {
        String connector = "123";
        List<String> items = List.of("a", "b", "c");
        String result = joinWithConnector(connector, items);
        System.out.println(result);
    }

    public static String joinWithConnector(String connector, List<String> items) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < items.size(); i++) {
            result.append(items.get(i));
            if (i < items.size() - 1) { // 在每个元素后面加连接符，除了最后一个元素
                result.append(connector);
            }
        }

        return result.toString();
    }
}
