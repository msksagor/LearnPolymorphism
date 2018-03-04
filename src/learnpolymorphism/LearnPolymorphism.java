
package learnpolymorphism;

public class LearnPolymorphism {

    public static void main(String[] args) {
       Human sagor = new Human("sagor");
       
       
       Transport transport = new Bus("Hanif");
       sagor.travel(transport, "CTG");
       
       
       /*Bus bus = new Bus("Ena");
       sagor.travel(bus, "Dhaka");
       
        System.out.println("");
        Train t = new Train("InterCity");
        sagor.travel(t, "Chittagong");*/
    }
    
}
class Transport{
    String name;

    public Transport(String name) {
        this.name = name;
    }
    
    
}
class Bus extends Transport{
    
    public Bus(String name) {
        super(name);
    }
    
    
}
class Train extends Transport{
   
    public Train(String name) {
        super(name);
    }
   
    
}
class Human{
    String name;

    public Human(String name) {
        this.name = name;
    }
    /*public void travel(Bus bus,String des){
        System.out.println(this.name+" travelling to "+des+" by "+bus.name);
    }
     public void travel(Train train,String des){
        System.out.println(this.name+" travelling to "+des+" by "+train.name);
    }*/
    
    public void travel(Transport transport,String des){
            System.out.println(this.name+" travelling to "+des+" by "+transport.name);
        
    }
    
    
    
    
    
}


