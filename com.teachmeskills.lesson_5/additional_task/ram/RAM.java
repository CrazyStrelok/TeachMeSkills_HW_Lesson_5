package additional_task.RAM;

public class RAM {
String name;
int capacity;
public RAM(){
}
public RAM( String name , int capacity){
    this.name = name;
    this.capacity = capacity;
}
    public void geting(String name , int capacity){
        System.out.println(this.name + this.capacity  );
    }
}
