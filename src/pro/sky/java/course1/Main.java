package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        // write your code here//
        int a = 5;
        float b = 3.14f;
        long c = 15;
        double g = 4.67;
        char j = 'a';
        boolean h = true;
        // задача 2
        float first = 78.2f;
        float second = 82.7f;
        System.out.println(second - first);
        // задача 3
        int bananaWeight = 80;
        int bananacount = 5;
        int milkWeight = 105;
        int milkcount = 2;
        int icecreamWeight = 100;
        int icecreamcount = 2;
        int eggWeight = 70;
        int eggcount = 1;
        int totalWeight = bananaWeight * bananacount + milkWeight * milkcount + icecreamWeight * icecreamcount + eggWeight * eggcount;
        System.out.println("суммарный вес в граммах " + totalWeight);
        System.out.println("суммарный вес в килограммы " + totalWeight / 1000f);
        //задача 4
        int needToLoseWeight = 7000;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int maxDays = needToLoseWeight / minGramsPerDay;
        int minDays = needToLoseWeight / maxGramsPerDay;
        System.out.println("максимум дней " + maxDays);
        System.out.println("минимум дней " + minDays);
        System.out.println("среднее количество дней " + ((minDays + maxDays) / 2));
        //задача 5
        int mashasalary = 67760;
        int denissalary = 83690;
        int kristinasalary = 76230;
        int percent = 10;
        float newmashasalary = mashasalary * (1 + percent / 100f);
        float newmdenissalary = denissalary * (1 + percent / 100f);
        float newmkristinasalary = kristinasalary * (1 + percent / 100f);
        System.out.println("Новая зарплата маши " + newmashasalary);
        System.out.println("Новая зарплата дениса " + newmdenissalary);
        System.out.println("Новая зарплата кристины " + newmkristinasalary);
        System.out.println("Годовой доход Маши вырос на " + (newmashasalary - mashasalary) * 12);
        System.out.println("Годовой доход Дениса вырос на " + (newmdenissalary - denissalary) * 12);
        System.out.println("Годовой доход Кристины выроса на " + (newmkristinasalary - kristinasalary) * 12);

    }
}

