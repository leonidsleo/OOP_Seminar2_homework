package HomeworkSeminar2;

public class Cat {

    private String name;

    private int appetite;

    private boolean hungry;

    public String getName() {
        return name;
    }    
    
    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }



    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        
        if (plate.catAte(appetite) == false) {
            System.out.println("Котик останется голодным! Добавь пожалуйста еды " + (appetite - plate.getFood()));
            int supporter = plate.getFood() + (appetite - plate.getFood()); // кормилец
            System.out.println("Кормилец добавил тебе " + (appetite - plate.getFood()) + " еды. Теперь у тебя есть " + supporter + " еды.");
            System.out.println(name + " благодарит тебя кормилец! Я теперь сыт!");
            
        } else {
            System.out.println("Котик " + name + " поел! Спасибо!");
        }
    }

    public void eat2(Plate plate) {
        
        if (plate.catAte(appetite) == true) {
            hungry = false;
            System.out.println(name + " поел! Спасибо! " + hungry);
            
            
        } else {
            System.out.println(name + " не хватило еды! " + hungry);
        }
    }

}
