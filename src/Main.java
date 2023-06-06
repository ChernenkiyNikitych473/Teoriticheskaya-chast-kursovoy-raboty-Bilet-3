public class Main {
    public static void main (String[] args) {
        System.out.println("Привет, мир!");
        System.out.println("Задача: Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.");
        String str_1 = "Я, обожаю изучать профессию Java-разрабочткик";
        String str_2 = new String(new char[]{'Я',});
        String str_3 = new String(new char[]{'о', 'б', 'о', 'ж', 'а', 'ю',});
        String str_4 = new String(new char[]{'и', 'з', 'у', 'ч', 'а', 'т', 'ь'});
        String str_5 = new String(new char[]{'п', 'р', 'о', 'ф', 'е', 'с', 'с', 'и', 'ю',});
        String str_6 = new String(new char[]{'J', 'a', 'v', 'a',});
        String str_7 = new String(new char['-']);
        String str_8 = new String(new char[]{'р', 'а', 'з', 'р', 'а', 'б', 'о', 'т', 'ч', 'и', 'к',});

        System.out.println(str_1);
        System.out.println(str_2);
        System.out.println(str_3);
        System.out.println(str_4);
        System.out.println(str_5);
        System.out.println(str_6);
        System.out.println(str_8);
    }
}