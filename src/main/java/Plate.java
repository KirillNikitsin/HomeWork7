public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;

    }
    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }

    public void decreaseFood(int n) {
        if(food >= n) {
            food -= n;
        }
    }
    public int getFood(){
        return food;
    }
    public void replenishment(Cat cat){
        if(food < cat.getAppetite()){
            System.out.println("Нужно досыпать " + (cat.getAppetite() - food) + " корма");
            food +=(cat.getAppetite() - food);
            System.out.println("Корм досыпан.");
        }

    }
}
