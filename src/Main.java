public class Main {
    public static void main(String[] args) {
        int age = 6;
        switch (age) {
            case 18:
                System.out.println("С окончанием школы!");
                break;
            case 21:
                System.out.println("Теперь можно пить алкоголь");
                break;
            case 7:
                System.out.println("Иди в школу");
                break;
            default:
                System.out.println("Пока сказать нечего");
        }

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите обшеченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("У нас появилось мобильное приложение. Зайдите на сайт с телефона, чтобы получить ссылку на приложение");
            }
        } else if (clientDeviceYear >= 2015){
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("У нас появилось мобильное приложение. Зайдите на сайт с телефона, чтобы получить ссылку на приложение");

            }
        }


    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;

    }




    public static void task4 () {
        System.out.println("Задача 4");

    }
    public static void task5 () {
        System.out.println("Задача 5");

    }
}