package additional_task.Test;
import additional_task.Computer.Computer;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer(2312312 ," Forma " , 233232 , 34343);
        computer.print(computer.cost, computer.model,computer.RAM  , computer.HDD );
        Computer computer1 = new Computer(21312 , " Nokkia " , 2332 ,233232);
        computer1.print(computer1.cost, computer1.model, computer1.RAM, computer1.HDD);
    }
}
