interface Machine {
    void run();
}
 
class WashingMachine (____빈칸____) Machine {  
    private String name;
 
    public WashingMachine() {
        this.name = "LG Washer";
    }
 
    public void run() {
        System.out.println("Washing machine running");
    }
}
 
public class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
    }
}
