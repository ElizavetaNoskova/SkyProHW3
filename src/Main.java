public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 35;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 15;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 98;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 80;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageKid = 6;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему нельзя кататься на аттракционе");
        } else if (ageKid>=5||ageKid<=14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + ageKid + " , можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int place = 102;
        if (place <= 102) {
            if (place <= 60) {
                System.out.println("Есть сидячие места в вагоне");
            } else {
                System.out.println("Есть стоячие места в вагоне");
            }
        } else {
            System.out.println("Мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a=2390;
        int b= 23;
        int c= 7809;
        if (a>b&&a>c)
        {
            System.out.println("Самое большое число а = "+ a);
        }
        else if (b>a&&b>c)
        {
            System.out.println("Самое большое число b = "+ b);
        }
        else
        {
            System.out.println("Самое большое число c = "+ c);
        }
        }
    }


