package myClasses.prevAssignments;

import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {

    }
}

//Task01
class Calculator01 {
    int x,y;
    char z;
    void add(){
        System.out.println(x+y);
    }
    void subtract(){
        System.out.println(x-y);
    }

    void multiply(){
        System.out.println(x*y);
    }

    void divide(){
        System.out.println(x/y);
    }

    Calculator01(int x,char z,int y){
        this.y=y;
        this.x=x;
        this.z=z;

        System.out.print("Lets calculate! "+"\n"+
            "Value 1: "+x+"\n"+
                "Operator: "+z+"\n"+
                "Value 2: "+y+"\n"+"Result: ");

        if(z=='+'){
            add();
        } else if (z=='-') {
            subtract();
        } else if (z=='*') {
            multiply();
        }
        else {
            divide();
        }
    }





}

//Task02
class Course{
    String course,status;
    int sec;
    Course(String course,String status,int sec) {
        this.course = course;
        this.status = status;
        this.sec = sec;
    }
    void detail(){
        System.out.println(course+" - "+status+" - "+sec);
    }
}

//Task03

class Patient{
    String name;
    int age;
    double height,weight,bmi;


    Patient(String name,
    int age,
    double weight,
    double height
    ){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.bmi=weight*10000/Math.pow(height,2);
    }

    void printDetails(){
        System.out.println("Name: "+name+"\n"+
                "Age: "+age+"\n"+
                "Weight: "+weight+"\n"+
                "Height: "+height+"\n"+
                "BMI: "+bmi);
    }
}
//Task 04

class Vehicle {
    int x=0,y=0;
    int moveLeft(){
        return this.x=x-1;
    }
    int moveRight(){
        return this.x=x+1;
    }

    int moveUp(){
        return this.y=y+1;
    }

    int moveDown(){
        return this.y=y-1;
    }

    void print_position(){
        System.out.println(x+","+y);
    }
}

//Task 05
class Shape{
    String shape;
    int x,y;
    Shape(String shape,int x,int y){
        this.shape=shape;
        this.x=x;
        this.y=y;
    }
    void area(){
        if(shape.equals("Triangle")||shape.equals("Rhombus")){
            System.out.println((double)0.5*x*y);
        }
        else {
            if(shape.equals("Square")||shape.equals("Rectangle")){
                System.out.println(x*y);
            }
            else {
                System.out.println("Shape unknown");
            }
        }
    }
}

//Task 06
class Calculator02{
    double x,y;
    char opr;
    double calculate(double x, double y, char opr){
        this.x=x;
        this.y=y;
        this.opr=opr;

        return switch (opr) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            default -> x / y;
        };
    }
    void showCalculation(){
        switch (opr){
            case '+' -> System.out.println((int)x +" + "+ (int)y+" = "+ (int)calculate(x,y,opr));
            case '-' -> System.out.println((int)x +" - "+ (int)y+" = "+ (int)calculate(x,y,opr));
            case '*' -> System.out.println((int)x +" * "+ (int)y+" = "+ (int)calculate(x,y,opr));
            default -> System.out.println((int)x +" / "+ (int)y+" = "+calculate(x,y,opr));
        }

    }

}

//Task 07
class Student{
    String name,major,idNum;
    double [] courses;

    Student(String name,String idNum,String major,double[] courses){
        this.name=name;
        this.idNum=idNum;
        this.major=major;
        this.courses=courses;
    }
    double calculateCGPA(){
        double total=0;
        for (double course : courses) {
            total += course ;
        }
        return (total/courses.length);
    }
    void printDetails(){
        System.out.print("Name: "+name+"\n"+
                "ID: "+ idNum +"\n"+
                "Department: "+major+"\n"+
                "CGPA: "
        );
        System.out.printf("%.2f%n", calculateCGPA());
        System.out.println();
        if(calculateCGPA()>3.80){
            System.out.println("Highest Distinction");
        }
        else if(calculateCGPA()>3.65){
            System.out.println("High Distinction");
        }
        else if (calculateCGPA()>3.50){
            System.out.println("Distinction");
        }
        else if (calculateCGPA()>2.00){
            System.out.println("Satisfactory");
        }
        else{
            System.out.println("Can't Graduate");
        }
    }
}

//Task 08
class Shinobi{
    String name,rank;
    int mission,salary;

    Shinobi(String name, String rank){
        this.rank=rank;
        this.name=name;
    }
    int calSalary(int mission){
        this.mission=mission;
        if(rank.equals("Genin")){
            return this.salary=mission*50;
        }
        else if (rank.equals("Chunin")){
            return this.salary=mission*100;
        }
        else {
            return this.salary=mission*500;
        }
    }
    void printInfo(){
        System.out.println("Name: "+name+"\n"+
                "Rank: "+rank+"\n"+
                "Number of missions: "+mission+"\n"+
                "Salary: "+salary);
    }

    String changeRank(String rank){
        return this.rank=rank;
    }
}

//Task 09
class Programmer{
    String name,language;
    int experience;

    public Programmer(String name, String language, int experience) {
        this.name = name;
        this.language = language;
        this.experience = experience;
    }
    void printDetails(){
        System.out.println("Horray! A new programmer is born"+"\n"+
                "Name: "+name+"\n"+
                "Language: "+language+"\n"+
                "Experience: "+experience);
    }
    int addExp(int exp){
        return this.experience+=exp;
    }
}

//Task 10
class UberEats{
    String name,location,item1,item2,number;
    int price1,price2;

    public UberEats(String name, String number ,String location) {
        this.name = name;
        this.location = location;
        this.number = number;
        System.out.println(name+", welcome to UberEats!");
    }

    void addItems(String item1,String item2,int price1,int price2){
        this.item1=item1;
        this.item2=item2;
        this.price1=price1;
        this.price2=price2;
    }
    String printOrderDetail() {
        double totalPrice = price1 + price2;
        return "Customer Name: " + name +
                "\nCustomer Phone: " + number +
                "\nDelivery Address: " + location +
                "\nFood Item: " + item1 +
                "\nBeverage Item: " + item2 +
                "\nTotal Price: " + totalPrice;
    }

}

//Task 11

class Spotify{
    ArrayList<String> songs=new ArrayList<>();
    Spotify(ArrayList<String>songs){
        this.songs=songs;
    }
    String playingNumber(int num){
        if(num>songs.size()){
            return num+" number song not found. Your playlist has "+songs.size()
                    +" songs only";
        }
        else {
            return "Playing "+num+" number song for you"+
                    "\nSong name: "+songs.get(num-1);
        }
    }
    void addToPlaylist(String song){
        songs.add(song);
    }
}

//Rest of the Tasks are skipped since they are all tracing-based

