package additional_task.Computer;

public class Computer {
    public int cost;
    public String model;
    public int RAM;
    public int HDD;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public Computer(int cost, String model, int RAM, int HDD) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void print(int cost, String model, int RAM, int HDD) {
        System.out.println( this.cost + this.model + this.RAM + " " + this.HDD );
    }
}


