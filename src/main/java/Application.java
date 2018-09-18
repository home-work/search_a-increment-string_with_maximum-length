import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String string = scanner.next();
        LinkedList<Character> listResult = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> linkedList = new LinkedList<>();
            linkedList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > linkedList.getLast()) {
                    linkedList.add(string.charAt(j));
                }
            }
            if (linkedList.size() > listResult.size()) {
                listResult.clear();
                listResult.addAll(linkedList);
            }
            linkedList.clear();
        }

        for (Character character : listResult) {
            System.out.print(character);
        }
    }

}
