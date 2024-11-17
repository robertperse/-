public class Main {
    public static void main(String[] args) {
        var dog = 0.8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sumWeight = boxer1 + boxer2;
        System.out.println(sumWeight);
        var difWeight = boxer2 - boxer1;
        System.out.println(difWeight);
        var residual = boxer2 % boxer1;
        System.out.println(residual);

        var avgTime = 640;
        var timePerWorker = 8;
        var staff = avgTime / timePerWorker;
        System.out.println("Всего работников в компании - " +staff +" человек");

        staff = staff + 94;
        avgTime = staff * timePerWorker;
        System.out.println("Если в компании работает " +staff +" человек, то всего " +avgTime +" часов работы может быть поделено между сотрудниками");
    }
}