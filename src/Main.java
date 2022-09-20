public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: "+ (boxer1Weight + boxer2Weight));
        System.out.println("Разница весов бойцов: "+ (boxer2Weight - boxer1Weight));

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов бойцов (первый способ): "+ (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов бойцов (второй способ): "+ (boxer2Weight % boxer1Weight));

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalImployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании – "+ totalImployees +" человек");

        totalImployees = totalImployees + 94;
        totalWorkingHours = totalImployees * hoursPerDay;
        System.out.println("Если в компании работает "+ totalImployees +" человека, то всего "+ totalWorkingHours +" часа работы может быть поделено между сотрудниками");

    }
}
