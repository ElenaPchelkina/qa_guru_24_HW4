package guru.qa;

public class Main {
    public static void main (String[] args) {
//      1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
//      посмотреть результаты (вывести в консоль)
//      математические операторы - + - / * % ++ --
        int a = 5;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(++a);
        System.out.println(--b);

//      логические операторы - &, |, &&, ||, !
//      Оператор || или
        int c = 10;
        int d = 30;

        if (c > 20 || d < 20) {
            System.out.println("Числа подходят");
        }
        else {
            System.out.println("Числа не подходят");
        };

//      Оператор && и
        int i = 10;
        int f = 30;

        if (i < 20 && f > 20) {
            System.out.println("Числа подходят");
        }
        else {
            System.out.println("Числа не подходят");
        };

//      Оператор ! не
        int j = 10;

        System.out.println(!(j > 2));  // prints true
        System.out.println(!(j <= 2));

//      Переполнения при вычислениях
        byte z = 100;
        byte y = 50;
//      byte w = z + y;


//      2) попробовать вычисления комбинаций типов данных (int и double)
        int n = 100;
        double m = 13.56;

        System.out.println(n + m);
        System.out.println(m + n);
        System.out.println((int) (n + m));
    }
}
