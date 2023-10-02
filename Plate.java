package HomeworkSeminar2;

public class Plate {  //тарелка для еды
    
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }


    public void info() {
        System.out.println("В тарелка: " + food + " еды.");
    }

    public boolean catAte(int appetite) {
        int enoughFood = food - appetite;
        if (enoughFood < 0) {
            return false;
        } else {
            food = food - appetite;
            // System.out.println(food);
            return true;
        }
    }

    public void addFood(int appetite) {
        if (appetite > food) {
            food = (appetite - food) + food;
            System.out.println("А нам не хватило еды. Положи пожалуйста еще!");
            System.out.println("Тарелка пополнена. Еды " + food + ". Теперь должно хватить!");
        }
    }
}