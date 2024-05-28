//Prompts were not written since it was already given in the Assignment.

public class Assignment2 {
    public static void main(String[] args) {

    }

}
//These are all the classes you need to write (per Questions) to solve the Assignment.


//Question 1
class DataType{
    String name;
    Object value;
    public DataType(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}

//Question 2
class Flower {
    String name, color;
    int petalNum;
    Flower(){
    }
    Flower(Flower otherFlower){
        this.name=otherFlower.name;
        this.color= otherFlower.color;
        this.petalNum=otherFlower.petalNum;
    }
}

//Question 3
class Joker {
    String name,power;
    boolean is_he_psycho;

    Joker(String name, String power , boolean is_he_psycho){
        this.name=name;
        this.power=power;
        this.is_he_psycho=is_he_psycho;
    }
}

//Question 4
class Pokemon{
    String pokemon1_name,pokemon2_name;
    int pokemon1_power,pokemon2_power,damage_rate,combined_power;
    Pokemon(String p1,String p2,int p1p,int p2p,int dmg){
        this.pokemon1_name=p1;
        this.pokemon2_name=p2;
        this.pokemon1_power=p1p;
        this.pokemon2_power=p2p;
        this.damage_rate=dmg;
        this.combined_power=(p1p+p2p)*dmg;

    }
}

//Question 5
class Player{
    String name,position;
    int jerseyNumber;
}

//Question 6
class Country{
    String name="Bangladesh",continent="Asia",capital="Dhaka";
    int fifaRanking=187;


}

//Question 7
class DemonSlayer{
    String name,style;
    int numberOfTechniques,kills;

    DemonSlayer(String name,String technique,int number_of_technique,int kill){
        this.name=name;
        this.style=technique;
        this.numberOfTechniques =number_of_technique;
        this.kills=kill;
    }
}

//Question 8
class Box{
    int height,width,breadth;
    Box(int height,int width,int breadth){
        this.height=height;
        this.width=width;
        this.breadth=breadth;
        System.out.printf("Volume of the box is %d cubic units ",height*width*breadth);
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

}

//Question 9
class Buttons{
    String word;
    int spaces;
    char border;

    Buttons(String word, int spaces, char border){
        this.word=word;
        this.spaces=spaces;
        this.border=border;

        for(int i=0 ;i< (spaces*2) + (word.length()+2) ; i++ ){
            System.out.print(border);
        }
        System.out.println();
        System.out.println(border+word+border);
        for(int i=0 ;i< (spaces*2) + (word.length()+2) ; i++ ){
            System.out.print(border);
        }
    }
}

// Question 10
class Wadiya{
    String name="Aladeen";
    String designation="President Prime Minister Admiral General";
    int noOfWife=100;
    boolean dictator=true;

    public void task(){
        Wadiya aladeen=new Wadiya();
        System.out.println("Name of the president: "+ aladeen.name +"\n"+
                "Designation"+aladeen.designation+"\n"+
                "Number of wife: "+ aladeen.noOfWife +"\n"+
                "Is he/she a dictator? "+aladeen.dictator
                );
        Wadiya trump=new Wadiya();
        trump.name="Donald Trump";
        trump.designation="President";
        trump.noOfWife=1;
        trump.dictator=false;
        System.out.println("Name of the president: "+ trump.name +"\n"+
                "Designation"+trump.designation+"\n"+
                "Number of wife: "+ trump.noOfWife +"\n"+
                "Is he/she a dictator? "+trump.dictator
        );
    }
}

//Rest of the questions are skipped since it was all prompt-based / Tracing
