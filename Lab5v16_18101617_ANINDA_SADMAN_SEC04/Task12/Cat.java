public class Cat{ 
    public String color = "White"; 
    public String action = "sitting"; 
    public Cat(){
    }
    public Cat(String color){
        this.color=color;
    }
    public Cat(String color,String action){
        this.color=color;
        this.action=action;
    }
    public void printCat(){
        System.out.println(color+" dog is "+action);
    }
    public void changeColor(String color){
        this.color=color;
    }
 
} 
