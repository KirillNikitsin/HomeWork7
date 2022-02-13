public class Cat{
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void info() {
        System.out.println("Кот " + name + " съедает за раз " + appetite + " еды. В данный момент сытость кота = " + satiety);
    }

    public void as(){
        satiety = true;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }
    public int getAppetite(){
        return appetite;
    }

}
