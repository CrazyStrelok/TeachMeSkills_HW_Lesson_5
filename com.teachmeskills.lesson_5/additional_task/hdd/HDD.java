package additional_task.HDD;

public class HDD {
    String name;
    int capacity;
    String type;
public HDD(){
}
public HDD(String name , int capacity , String type ){
this.name = name;
this.capacity = capacity;
this.type = type;
}
public void get(String name , int capacity , String type){
    System.out.println(this.name + this.capacity + this.type );
}
}
