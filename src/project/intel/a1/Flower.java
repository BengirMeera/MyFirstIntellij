package project.intel.a1;

public class Flower {

    //Instance variable
    String name;
    String color;
    int petals;
    double bloomingTime;
    String geologicalPosition;

    //constructor declaration of Class
    public Flower(String name,String color,int petals,double bloomingTime,String geologicalPosition){
        this.name = name;
        this.color = color;
        this.bloomingTime = bloomingTime;
        this.geologicalPosition = geologicalPosition;
    }


    //method 1
    public String getName()
    {
        return name;
    }

    //method 2
    public String getColor()
    {
        return color;
    }

    //method 3
    public int getPetals()
    {
        return petals;
    }

    //method 4
    public double getBloomingTime()
    {
        return bloomingTime;
    }

    //method 5
    public String getGeologicalPosition()
    {
        return geologicalPosition;
    }

    @Override
    public String toString(){
        return("That flower name is "+this.getName()+". The type of color,petal,blooming time and geological time are : " +
                this.getColor()+","+this.getPetals()+","+this.getBloomingTime()+","+this.getGeologicalPosition());
    }
    public static void main(String[]args){
        Flower rose = new Flower("rose","red",4,4.5,"iran");
        System.out.println(rose.toString());
    }

}


