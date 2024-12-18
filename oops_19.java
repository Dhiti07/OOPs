import java.util.*;
class Car{
    private String Car_name;
    Car(){
        String Car_name;
    }
    Car(String Car_name){
        this.Car_name = Car_name;
    }
    void setname(String Car_name){
        System.out.println("enter the car name");
        Car_name = sc.next();
    }
    String getname(){
        return Car_name;
    }
    public void display(){
        System.out.println("The name of the car is: "+getname());
    }
}
class Model{
    private String Model_name;
    Model(){
        this.Model_name = Model_name;
    }
    Model(String Model_name){
        Model_name = model;
    }
    String setmodel(String Model_name){
        System.out.println("enter the model name");
        Model_name = sc.next();
    }
    String getmodel(){
        return Model_name;
    }
    public void display(){
        System.out.println("The name of the model is: "+getmodel());
    }
}
class Result{
    public void merge(String cname, String mname){
       mergedname = cname.concat(mname);
       System.out.println("The concatenated string is: "+ mergedname);
    }
    public displaymerge(String mergedname){
        System.out.println("the merged name is: "+mergedname);
    }
}
class MainDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of cars");
        int n = sc.nextInt();
        Car car[] = new Car[n];
        Model model[] = new Model[n];
        Result r = new Result();
        for(int i=0;i<n;i++){
            System.out.println("enter the name of the car");
            String carname = sc.next();
            car[i] = new Car(carname);
            System.out.println("enter the name of the model");
            String modelname = sc.next();
            model[i] = new Model(modelname);
            r.merge(carname,modelname);
        }
        for(int i=0;i<n;i++){
            car.display();
            model.display();
        }
        for(int i=0;i<n;i++){
            r.displaymerge();
        }
    }
}
