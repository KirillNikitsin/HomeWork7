public class HomeWork7 {
    public static void main(String[] args) {
        Plate plate = new Plate(25);
        Cat cat1 = new Cat("Обжора", 27);
        Cat cat2 = new Cat("Барсик", 7);
        Cat cat3 = new Cat("Счастье", 13);
        Cat cat4 = new Cat("Мурзилка", 2);
        Cat cat5 = new Cat("Эльф", 14);
        Cat cat6 = new Cat("Гном", 6);
        Cat cat7 = new Cat("Чубака", 3);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5, cat6, cat7};
        for (Cat cat : cats) {
            cat.info();
            if (cat.getAppetite() > plate.getFood()) {
                plate.info();
                System.out.println("Коту мало еды, пожалуйста насыпьте еще корма");
                plate.replenishment(cat);
                plate.info();
                if (cat.getAppetite() <= plate.getFood()) {
                    cat.eat(plate);
                    System.out.println("Кот поел.");
                    plate.info();
                    cat.as();

                }
            } else {
                plate.info();
                cat.eat(plate);
                System.out.println("Кот поел");
                plate.info();
                cat.as();
            }
        }
        for(Cat cat: cats) {
            cat.info();
        }
    }
}
