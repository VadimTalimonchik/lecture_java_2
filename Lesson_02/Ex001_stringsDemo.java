package Lesson_02;
public class Ex001_stringsDemo {
    public static void main(String[] args) {

        // String str = "";
        // for(int i = 0; i < 1_000_000; i++) {
        //     str += "+";
        // }
        // System.out.println(str);

        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < 1_000_000; i++) {
        //     sb.append("+");
        // }
        // System.out.println(sb);

        // var s = System.currentTimeMillis();
        // String

        String[] name = { "В", "а", "д", "и", "м" };
        String sk = "ВАДИМ КА.";
        System.out.println(sk.toLowerCase()); // вадим ка.
        System.out.println(String.join("", name)); // Вадим
        System.out.println(String.join("", "В", "а", "д", "и", "м")); // Вадим
        System.out.println(String.join(",", "В", "а", "д", "и", "м")); // В,а,д,и,м
    }
}