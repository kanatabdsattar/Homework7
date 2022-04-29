package kanat.gb;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }


    public void decreaseFood(int eaten, String satiety){
        if(this.food>eaten){
            this.food -= eaten;
            satiety = "Cat is full";
            System.out.println("Satiety: " + satiety);
        }else{
            System.out.println("-----------------------");
            System.out.println("Not enough food in plate! " + this.food + " food");
            System.out.println("Now we will add food");
            addFood();
            System.out.println("Amount of food now: " + this.food);
            this.food -= eaten;
            System.out.println("Amount of food now: " + this.food);
            System.out.println("-----------------------");
        }
    }
    public void addFood(){
        this.food += 400;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plate{");
               sb.append("food=").append(food);
               sb.append('}');
               return sb.toString();
    }
}
