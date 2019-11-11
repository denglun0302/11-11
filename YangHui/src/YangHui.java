import java.util.ArrayList;
import java.util.List;

public class YangHui {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                list.get(i).add(1);
            }
        }
        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j <= i; j++) {
                int a = list.get(i - 1).get(j - 1);
                int b = list.get(i - 1).get(j);
                list.get(i).set(j, a + b);
            }
        }
    }


    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        // 第一行
        list.get(0).add(1);
        // 第二行
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        for (int i = 2; i < numRows; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(1);
            for (int j = 1; j < i; j++) {
                int a = list.get(i - 1).get(j - 1);
                int b = list.get(i - 1).get(j);
                list.get(i).add(a + b); // 这里不能调用 set
            }
            list.get(i).add(1);
        }

        return list;
    }
}




