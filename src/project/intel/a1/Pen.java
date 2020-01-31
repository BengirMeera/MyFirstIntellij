package project.intel.a1;

public class Pen {

    //Instance Variable
    String name;
    String color;
    int howMany;
    double diameterOfOnePen;
    byte canProduce;

    //Constructor Declaration of Class
    public Pen(String name,String color,int howMany, double diameterOfOnePen, byte canProduce)
    {
        this.name=name;
        this.color=color;
        this.howMany=howMany;
        this.diameterOfOnePen=diameterOfOnePen;
        this.canProduce=canProduce;
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
    public int getHowMany()
    {
        return howMany;
    }
    //method 4
    public double getDiameterOfOnePen()
    {
        return  diameterOfOnePen;
    }
    //method 5
    public byte getCanProduce(){
        return canProduce;
    }
@Override
    public String toString()
{
    return("Pen's brand name is "+this.getName()+".This one is a "+this.getColor()+
            " color pen. "+this.getHowMany()+" production can make "+this.getDiameterOfOnePen()
            +" cm per pen size up to "+this.getCanProduce()+"pens.");
}
public static void main (String[]agrs){
        Pen metador = new Pen("Metador","purple",1,2, (byte) 15);
    System.out.println(metador.toString());
    }
}
class Byte  {
    public static void main(String args[])
    {
        byte a = 126;

        // byte is 8 bit value
        System.out.println(a);

        a++;
        System.out.println(a);

        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);

        // Looping back within the range
        a++;
        System.out.println(a);
    }
}
class GeeksforGeeks {
    public static void main(String args[])
    {
        byte a = 123;

        // byte is 8 bit value
        System.out.println(a);

        a++;
        System.out.println(a);

        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);

        // Looping back within the range
        a++;
        System.out.println(a);
    }
}