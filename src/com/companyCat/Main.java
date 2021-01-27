package com.companyCat;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Lesson_Task();
        //Task_Home1();
        //Task_Home2();
        //Task_Home2_var2();
        //Task_Home3();
        //Task_Home4();
        //Task_Home5();
        //Task_Home6();
        //Task_Home7();
        //Task_Home8();
        //Task_Home9();
        //Task_Home10();

    }

    private static void Task_Home10() {
        //85. Подсчитать количество отрицательных среди чисел a, b, c.
        Random ran = new Random();
        double a,b,c;
        int a1=0,b1=0,c1=0;
        //а чем отличаются эти random?? и тот и тот понимает диапазон [-20;20]
        a = Math.random()*(20+20+1)-20;
        b = ran.nextDouble()*(20+20+1)-20;
        c = ran.nextDouble()*(20+20+1)-20;
        System.out.println("Вводим 3 произвольных числа: "+System.lineSeparator()+a+System.lineSeparator()
                +b+System.lineSeparator()+c);

        if (a< 0) a1= 1;
        if (b< 0) b1 = 1;
        if(c < 0) c1= 1;
        System.out.println("из трех произвольных чисел - отрицательных  "+(a1+b1+c1));
    }

    private static void Task_Home9() {
        //83. На плоскости XOY задана своими координатами точка А.
        // Указать, где она расположена (на какой оси или в каком квадранте).
        double x1,y1;
        System.out.println("Вводим координаты точкиA: x1= "+(x1= (Math.random()*(20+20+1)-20))
                +" y1= "+(y1= (Math.random()*(20+20+1)-20)));
        // проверка на осях
        // x1=0;
        // y1=0;
        System.out.println("точка А находится" + (x1*y1==0? x1==0? " на Оси X ": " на Оси Y ":
                x1>0&&y1>0? "в 1 квадранте":x1<0&&y1<0? "в 3 квадранте":x1<0&&y1>0? "в 2 квадранте": "в 4 квадранте"));
    }

    private static void Task_Home8() {
        //82.Даны две точки A(x1, y1) и B(x2, у2).
        // Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
        double x1=0,y1=0,x2=0,y2=0,z1=0,z2=0;
        System.out.println("Вводим координаты точкиA: x1= "+(x1=(int) (Math.random()*(20+20+1)-20))+
                " y1= "+(y1=(int) (Math.random()*(20+20+1)-20))+" растояние от начала координат = "
                +(z1=Math.sqrt(x1*x1+y1*y1)));
        System.out.println("Вводим координаты точки B x2= "+(x2=(int) (Math.random()*(20+20+1)-20))+" y2= "+
                (y2=(int) (Math.random()*(20+20+1)-20))+" растояние от начала координат = "
                +(z2=Math.sqrt(x2*x2+y2*y2)));
        System.out.println("Точка " +(z1<z2? " А "+String.format("%.2f",z1): " B "+String.format("%.2f",z2))
                +" ближе к началу координат");
    }

    private static void Task_Home7() {
        //79.Даны три вещественных числа.
        // Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double One=0, Two=0,Three=0, OneS=0, TwoS=0, ThreeS=0;
        //тестирование сканером
        //System.out.println("Введите три произвольных числа");
        //One = scanner.nextDouble();
        //Two = scanner.nextDouble();
        //Three =scanner.nextDouble();
        One=random.nextDouble();
        Two= random.nextDouble();
        Three= random.nextDouble();
        System.out.println(( One==0||Two==0||Three==0? "ну можно же было без нулей((":" итого расчет:")
                +System.lineSeparator());
        System.out.println("первое число "+One+" становится "+(OneS= One > 0 ? One*One: One*One*One*One));
        System.out.println("второе число "+Two+" становится "+(TwoS = Two > 0? Two*Two: Two*Two*Two*Two));
        System.out.println("третье число "+Three+" становится "+(ThreeS = Three > 0?
                Three*Three: Three*Three*Three*Three));

    }

    private static void Task_Home6() {
        //Написать программу решения уравнения ax3 + bх = 0 для произвольных а, b.
        // a*b>0 & b<>0 -sqrt b/a, +sqrt b/a, 0 - else 0
        Scanner scanner = new Scanner(System.in);
        double x=0,a=0,b=0;
        System.out.println("Для уравнения ax3 + bх = 0"+System.lineSeparator());
        System.out.println("Введите значение a");
        a=scanner.nextDouble();
        System.out.println("Введите значение b");
        b=scanner.nextDouble();
        //условие после && наверное не нужно - первое его учитывает
        System.out.println((a*b>0)&&(Math.abs(b)>0)? " Корень 1 = "+(-Math.sqrt(b/a))+" Корень 2 = "
                +(Math.sqrt(b/a))+" Корень 3 = 0 ": " Корень = 0?");

    }

    private static void Task_Home5() {
        //Даны вещественные числа х и у, не равные друг другу. Меньшее из этих
        //двух чисел заменить половиной их суммы, а большее — их удвоенным
        //произведением.

        double x = 0, y = 0, x1 = 0, y1 = 0;
        //сканер для теста
        //Scanner scanner = new Scanner(System.in);
        //x= scanner.nextDouble();
        //y=scanner.nextDouble();
        x = Math.random();
        y = Math.random();
        System.out.println(" x = " + x + System.lineSeparator() + " y = " + y);
        if (x == y) System.out.println("Условие не выполнено");
        else {
            if (x < y) {
                x1 = (x + y) / 2;
                y1 = 2 * x * y;
                x = x1;
                y = y1;
                System.out.println(" Новое значение x = " + x + System.lineSeparator() + " Новое значение y = " + y);
            }
            else  {
                y1 = (x + y) / 2;
                x1 = 2 * x * y;
                x = x1;
                y = y1;
                System.out.println(" Новое значение x = " + x + System.lineSeparator() + " Новое значение y = " + y);
            }
        }

    }


    private static void Task_Home4() {
        // Дано трехзначное число. Определить, равен ли квадрат этого числа сумме
        //кубов его цифр.

        //Scanner scanner = new Scanner(System.in);
        int Number3 = 0;
        int Number3_1=0,Number3_2=0,Number3_3=0;
        //System.out.println("Введите трехзначное число");
        //Number3 = scanner.nextInt();
        Number3 = (int)(( Math.random() * (999 - 100 + 1) + 100));
        System.out.println(Number3);

        Number3_1 = Math.abs(Number3) / 100 % 10;
        Number3_2 = Math.abs(Number3) / 10 % 10;
        Number3_3 = Math.abs(Number3) % 10;

        double Quadro = Number3 * Number3;
        double SumKub = Math.pow(Number3_1, 3) + Math.pow(Number3_2, 3) + Math.pow(Number3_3, 3);
        System.out.println("у числа " + Number3 + ((Quadro == SumKub) ?
                " - его квадрат равен сумме кубов его цифр "
                        + Quadro + " == " + SumKub :
                " - его квадрат не равен сумме кубов его цифр " + Quadro + " <> " + SumKub));

    }

    private static void Task_Home3() {
        //Дано трехзначное число. Определить, какая из его цифр больше:
        //а) первая или последняя;
        //б) первая или вторая;
        //в) вторая или последняя.
        Scanner scanner = new Scanner(System.in);
        int Number3 = 0;
        System.out.println("Введите трехзначное число");
        Number3 = scanner.nextInt();

        if (Math.abs(Number3)<=999&&Math.abs(Number3)>99) {
            int Number3_1 = Math.abs(Number3)/100%10;
            int Number3_2 = Math.abs(Number3)/10%10;
            int Number3_3 = Math.abs(Number3)%10;
            if (Number3_1==Number3_2||Number3_1==Number3_3||Number3_2==Number3_3) {
                System.out.println("Такое себе число - считает так себе");
            }
            System.out.println("какая из его цифр больше - первая или последняя? Ответ: "+((Number3_1>Number3_3)?
                    " первое число "+Number3_1+" больше третьего "+Number3_3:
                    " третье число "+Number3_3+" больше первого "+Number3_1 ));
            System.out.println("какая из его цифр больше - первая или вторая? Ответ: "+((Number3_1>Number3_2)?
                    " первое число "+Number3_1+" больше второго "+Number3_2:
                    " второе число "+Number3_2+" больше первого "+Number3_1 ));
            System.out.println("какая из его цифр больше - вторая или последняя? Ответ: "+((Number3_2>Number3_3)?
                    " второе число "+Number3_2+" больше третьего "+Number3_3:
                    " третье число "+Number3_3+" больше второго "+Number3_2 ));
        }
        else {
            System.out.println("некорректное число для задачи ");
        }
    }

    private static void Task_Home2_var2() {
        // Написать программу для вычисления стоимости разговора по телефону с
        //учетом 20% скидки, предоставляемой по субботам и воскресеньям.
        // попытка коротенечко)))
        int TimeCall = 0;
        int NumberDay = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите продолжительность разговора");
        TimeCall = scanner.nextInt();
        System.out.println("Введите день недели: 1- понедельник...7 - воскресенье");
        NumberDay = scanner.nextInt();

        System.out.println((NumberDay>7)||(NumberDay<1)? "Вы ввели некорректный день недели. До свидания"
                : (NumberDay==7)||(NumberDay==6)? "При цене за минуту скидка 20% и стоимость разговора в выходные "
                + String.format("%.2f",(0.8 * TimeCall * 5.0)) + " грн." : "При цене за минуту 5 грн. " +
                "стоимость разговора в указанный будний день -"+ String.format("%.2f",(1 * TimeCall * 5.0)) + " грн.");

    }

    private static void Task_Home2() {
        // Написать программу для вычисления стоимости разговора по телефону с
        //учетом 20% скидки, предоставляемой по субботам и воскресеньям.
        int TimeCall = 0;
        int NumberDay = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите продолжительность разговора");
        TimeCall = scanner.nextInt();
        System.out.println("Введите день недели: 1- понедельник...7 - воскресенье");
        NumberDay = scanner.nextInt();
        if ((NumberDay < 1) || (NumberDay > 7)) {
            System.out.println("Вы ввели некорректный день недели. До свидания");
        } else {
            switch (NumberDay) {
                case 6:
                case 7: {
                    System.out.println("При цене за минуту 5 грн. скидка 20% и стоимость разговора в выходной "
                            + String.format("%.2f",(0.8 * TimeCall * 5.0)) + " грн.");
                    break;
                }
                default: {
                    System.out.println("При цене за минуту 5 грн. " +
                            "стоимость разговора в указанный будний день = "+(TimeCall * 5) + " грн.");

                }

            }
        }
    }

    private static void Task_Home1 () {
        //Написать программу, которая проверяет, является ли введённое пользователем целое число четным.
        int a = 0, z = 0;
        System.out.println("Введите четное число");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        z = a % 2;
        System.out.println(a == 0 ? " вы ввели 0 (((" : ((a % 2) == 0) ?
                "Ура - " + a + " это четное число" : "число " + a + " нечетное(((");

    }

    private static void Lesson_Task () {

        // выбранное задание на лекции (x+y)/(y+1)-(xy-12)/(34+x)
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        double z = 0;
        //System.out.println(" x y");
        //x = scanner.nextDouble();
        //y = scanner.nextDouble();
        double x = r.nextDouble() * 20;
        double y = r.nextDouble() * 10;
        //int x = r.nextInt(10);
        //int y = r.nextInt(25);
        if (y == -1) {
            System.out.println("уравнение (x+y)/(y+1)-(xy-12)/(34+x) нет решения");
        }
        else if (x == -34) {
            System.out.println("уравнение (x+y)/(y+1)-(xy-12)/(34+x) нет решения");
        }
        else {
            z = (x + y) / (y + 1) - (x * y - 12) / (34 + x);
            System.out.println("x = "+String.format("%8.3f", x)
                    + System.lineSeparator() +"y = "+ String.format("%8.3f", y)
                    + System.lineSeparator() + "z = "+String.format("%8.6f", z));
        }
    }
}
