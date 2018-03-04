
package learnpolymorphism;

public class LearnPolymorphism {

    public static void main(String[] args) {
       Human sagor = new Human("sagor");
       Bus bus = new Bus("Ena");
       sagor.travel(bus, "Dhaka");
       
        System.out.println("");
        Train t = new Train("InterCity");
        sagor.travel(t, "Chittagong");
    }
    
}
class Bus{
    String name;

    public Bus(String name) {
        this.name = name;
    }
    
}
class Train{
    String name;

    public Train(String name) {
        this.name = name;
    }
    
}
class Human{
    String name;

    public Human(String name) {
        this.name = name;
    }
    public void travel(Bus bus,String des){
        System.out.println(this.name+" travelling to "+des+" by "+bus.name);
    }
     public void travel(Train train,String des){
        System.out.println(this.name+" travelling to "+des+" by "+train.name);
    }
    
    
}


