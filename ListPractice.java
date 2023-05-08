package collection;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        String in = "";
        List<String> list = new ArrayList<>();

        var sc = new Scanner(System.in);

        System.out.println("名前を入力してください");

        while (true) {

            in = sc.nextLine();

            System.out.println(in);

            if (in.equals("exit")) {
                break;
            } else {
                list.add(in);
                continue;
            }

        }

        System.out.println("最初に入力された人：" + list.get(0));

        System.out.println("最後に入力された人：" + list.get(list.size() - 1));

        System.out.println("名前で並び替えます");
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        sc.close();

    }
}
