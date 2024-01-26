public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задание 1");
        byte num1 = 10;
        System.out.println("Значение переменной с типом byte равно " + num1);
        short num2 = 50;
        System.out.println("Значение переменной с типом short равно " + num2);
        int num3 = 100;
        System.out.println("Значение переменной с типом int равно " + num3);
        long num4 = 250L;
        System.out.println("Значение переменной с типом long равно " + num4);
        float num5 = 3.5f;
        System.out.println("Значение переменной с типом float равно " + num5);
        double num6 = 8.35;
        System.out.println("Значение переменной с типом double равно " + num6);
        // Задача 2
        float num_1 = 27.12f;
        long num_2 = 987678965549L;
        double num_3 = 2.786;
        short num_4 = 569;
        short num_5 = -159;
        int num_6 = 27897;
        byte num_7 = 67;
        // Задача 3
        System.out.println("Задание 3");
        byte studentsLp = 23;
        byte studentsAc = 27;
        byte studentsEa = 30;
        short totalSheets = 480;
        int totalStudent = studentsLp + studentsAc + studentsEa;
        System.out.println("На каждого ученика рассчитано " + totalSheets / totalStudent + " листов бумаги");
        // Задача 4
        System.out.println("Задание 4");
        byte performanceMashin;
        byte performanceMashin2min = 16;
        int performanceMashin1min = performanceMashin2min / 2;
        int performanceMashin20min = performanceMashin1min * 20;
        System.out.println("За 20 минут, " + "машина произвела " + performanceMashin20min + " бутылок");
        int performanceMashinDay = (performanceMashin1min * 60) * 24;
        System.out.println("За сутки, " + "машина произвела " + performanceMashinDay + " бутылок");
        int performanceMashin3day = performanceMashinDay * 3;
        System.out.println("За 3 дня, " + "машина произвела " + performanceMashin3day + " бутылок");
        int performanceMashinMonth = performanceMashinDay * 31; // Смотря какой месяц)
        System.out.println("За 1 месяц, " + "машина произвела " + performanceMashinMonth + " бутылок");
        // Задача 5
        System.out.println("Задание 5");
        byte totalPaint = 120;
        byte paintWhite = 2;
        byte paintBrown = 4;
        int totalClasses = totalPaint / (paintWhite + paintBrown);
        int totalPaintWhite = totalClasses * paintWhite;
        int totalPaintBrown = totalClasses * paintBrown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalPaintWhite + " банок белой краски и " + totalPaintBrown + " банок коричневой краски");
        // Задача 6
        System.out.println("Задание 6");
        byte bananasGramsThing1 = 80;
        short milkGramsMilliliters100 = 105;
        byte iceGramsBriquette1 = 100;
        byte eggsThing1 = 70;
        byte totalBananasPieces= 5;
        byte totalMilk200Milliliters = 2;
        byte totalIceBriquette2 = 2;
        byte totalEggsThing4 = 4;
        int totalProductsGrams = (bananasGramsThing1 * totalBananasPieces) + (milkGramsMilliliters100 * totalMilk200Milliliters) + (iceGramsBriquette1 * totalIceBriquette2) + (eggsThing1 * totalEggsThing4);
        float kgTranslationgr = 1000;
        float translation = totalProductsGrams / kgTranslationgr;
        System.out.println(totalProductsGrams +  " граммов потребляет спортсмен\n" + translation + " килограмма потребляет спортсмен");
        // Задача 7
        System.out.println("Задание 7");
        byte targetWeightKg = 7;
        short kr1Vgr = 1000;
        int translationGr = kr1Vgr * targetWeightKg;
        short gr250Day = 250;
        short gr500Day = 500;
        int DayBy250gr = translationGr / gr250Day;
        int DayBy500gr  = translationGr / gr500Day;
        System.out.println("Спортсмен сбросит 7 кг. за " + DayBy250gr + " дней при потере " + gr250Day + " гр. в день.");
        System.out.println("Спортсмен сбросит 7 кг. за " + DayBy500gr + " дней при потере " + gr500Day + " гр. в день.");
        // Задача 8
        System.out.println("Задание 8");
        int mashaZp = 67760;
        int denisZp = 83690;
        int kristinaZp = 76320;
        float promotionZp = 1.1f;
        float newMashaZp = mashaZp * promotionZp;
        float newDenisZp = denisZp * promotionZp;
        float newKristinaZp = kristinaZp * promotionZp;
        System.out.println("Маша теперь получает " + newMashaZp + " рублей. Годовой доход вырос на " + (newMashaZp - mashaZp) + " рублей");
        System.out.println("Денис теперь получает " + newDenisZp + " рублей. Годовой доход вырос на " + (newDenisZp - denisZp) + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaZp+ " рублей. Годовой доход вырос на " + (newKristinaZp - kristinaZp) + " рублей");



































    }
}