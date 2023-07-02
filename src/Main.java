public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
    }

    public static void task_1() {
        System.out.println("Задача 1");

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректные данные");
        }
    }

    public static void task_2() {
        System.out.println("Задача 2");

        int clientOs = 1;
        int clientDeviceYear = 2013;

        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченныю версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректные данные");
        }
    }

    public static void task_3() {
        System.out.println("Задача 3");

        int year = 2040;
        if (((year % 4) == 0) == true && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - это высокостный год");
        } else {
            System.out.println(year + " - это не высокостный год");
        }
    }

    public static void task_4() {
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней для доствки: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней для доставки: " + day * 2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней дней для доставки: " + day * 3);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task_5() {
        System.out.println("Задача 5");

        int monthNumber = 7;

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца нет");

        }
    }

}