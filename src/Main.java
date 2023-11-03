public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
    }

    public static void zad1() {
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
        }
    }

    public static void zad2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else System.out.println("Установите версию приложения для iOS по ссылке");
                break;

            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
        }
    }

    public static void zad3() {
        int year = 2021;

        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void zad4() {
        int deliveryDistance = 100;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + days + 1);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void zad5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит к сезону зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Неправильно введено значение");
        }
    }

    public static void zad6() {
        int age = 19;
        int salary = 58_000;
        double limit = 0;

        if (age >= 23) {
            limit = 3 * salary;
        } else {
            limit = 2 * salary;
        }

        if (salary >= 50_000 && salary < 80_000) {
            limit *= 1.2;
        } else if (salary >= 80_000) {
            limit *= 1.5;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
    }

    public static void zad7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        float basicTax = 0.1f;
        int time = 12;
        int maxPay = salary / 2;
        float tax = 0;

        if (age < 23) {
            tax = basicTax + 0.1f;
        } else if (age >= 23 && age < 30) {
            tax = basicTax + 0.005f;
        }

        if (salary > 80_000) {
            tax -= 0.007;
        }

        float plat = (wantedSum * tax + wantedSum) / time;

        if (maxPay > plat) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту " + plat + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту " + plat + " рублей. Отказано.");
        }
    }
}
