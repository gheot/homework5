public class Main {
    ;

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {

            System.out.println("Сегодня пятница " + friday + "-ое число. Необходимо подготовить отчет.");


        }

        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year < end; year++) {
            if (year % 79 == 0) {

                System.out.println(year);
            }
        }
    }
}

