public class Main {
    public static void main(String[] args) {
        //Задание №1
        int n = 5;

        System.out.print("1) ");
        System.out.println((n % 2) == 0 ? "Число " + n + " четное" : "Число " + n + " нечетное");

        //Задание №2
        double m = 8.5;
        double m1 = 11.45;

        if ((Math.abs(10 - m)) > (Math.abs(10 - m1))) {
            System.out.println("2) Число " + m1 + " ближе к 10 чем число " + m);
        } else {
            System.out.println("2) Число " + m + " ближе к 10 чем число " + m1);
        }

        //Задание №3
        double a = 1;
        double b = 3;
        double c = 2;

        double d, x1, x2;
        System.out.print("3) ");
        d = (b * b) - (4 * a * c);
        if (d == 0) //Если дискриминант = 0, будет 1 корень.
        {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x = " + x1);
        }
        if (d > 0) //Если дискриминант > 0, будет 2 корня.
        {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.print("Корень 1 = " + x1);
            System.out.println("; Корень 2 = " + x2);
        }
        if (d < 0) //Если дискриминант меньше нуля - нет корней.
        {
            System.out.println(" Нет корней ");
        }

        //Задание №4
        int k = 45;

        System.out.print("4) ");
        if (k > 5 && k < 155) {
            if (k > 25 && k < 100) System.out.println("Число " + k + " содержится в интервале (25,100)");
            else System.out.println("Число " + k + " не содержится в интервале (25,100)");
        } else System.out.println("Число " + k + " не  принадлежит заданному отрезку (5,155)");

        //Задание №5
        System.out.print("5) ");
        for (int count = 1, y = 1; count <= 55; count++, y += 2) {
            System.out.print(y + " ");
        }
        System.out.println();

        //Задание №6
        System.out.print("6) ");
        int winner = 0;
        for (int count = 1; count < 1000000; count++) {
            int temp = ((count / 1000) / 100 + ((count / 1000) % 100) / 10 + (count / 1000) % 10);
            int temp1 = ((count % 1000) / 100 + ((count % 1000) % 100) / 10 + (count % 1000) % 10);
            if (temp == temp1) winner += 1;
        }
        System.out.println("Число счастливых билетов в одном рулоне равно " + winner);

        //Задание №7
        System.out.print("7) ");
        int symmetric = 0;
        for (int hour = 0; hour < 24; hour++) {
            for (int minuts = 0; minuts < 60; minuts++) {
                if ((hour / 10 == minuts % 10) && (hour % 10 == minuts / 10)) symmetric += 1;
            }
        }
        System.out.println("За сутки симметричная комбинация бывает " + symmetric + " раз.");
    }
}
