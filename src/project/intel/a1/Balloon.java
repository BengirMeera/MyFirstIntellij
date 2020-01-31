package project.intel.a1;

//import com.sun.org.apache.xpath.internal.operations.String;

public class Balloon {
    int howmany;
    String gasA;
    String gasB;
    String gasC;
    String gasD;


    public Balloon(int howmany, String gasA, String gasB, String gasC, String gasD) {
        this.howmany = howmany;
        this.gasA = gasA;
        this.gasB = gasB;
        this.gasC = gasC;
        this.gasD = gasD;
    }
    public Balloon(int howmany, String gasA, String gasB, String gasC) {
        this.howmany = howmany;
        this.gasA = gasA;
        this.gasB = gasB;
        this.gasC = gasC;

    }

    public Balloon(int howmany, String gasA, String gasB) {
        this.howmany = howmany;
        this.gasA = gasA;
        this.gasB = gasB;


    }
    public Balloon(){}

    public int getHowmany() {
        return howmany;
    }

    public void setHowmany(int howmany) {
        this.howmany = howmany;
    }

    public String getGasA() {
        return gasA;
    }

    public void setGasA(String gasA) {
        this.gasA = gasA;
    }

    public String getGasB() {
        return gasB;
    }

    public void setGasB(String gasB) {
        this.gasB = gasB;
    }

    public String getGasC() {
        return gasC;
    }

    public void setGasC(String gasC) {
        this.gasC = gasC;
    }

    public String getGasD() {
        return gasD;
    }

    public void setGasD(String gasD) {
        this.gasD = gasD;
    }

    @Override
    public String toString ()
    {
         return("I have " + this.getHowmany() + "pc ballon. " +
                "They are flexible bags and they contain " + this.getGasB() +","+this.getGasA()+
                 ","+ this.getGasC() + "," + this.getGasD()+".");
    }
        public static void main(String []args) {
            Balloon balloon = new Balloon(5, "helium", "nitrous", "oxide", "oxygen");
            System.out.println(balloon.toString());

            Balloon balloon1 = new Balloon();
            Balloon balloon2 = new Balloon(3,"carbon","methan","propen");
            System.out.println(balloon2.getGasB());
            Balloon balloon3 = new Balloon(2,"octane","tear gas");
            System.out.println(balloon2.getGasA()+""+balloon2.getGasB());
            System.out.println(balloon2.gasA);
            System.out.println(balloon3.toString());
            balloon2.setGasA("tony");
            System.out.println(balloon2.getGasA());
            balloon1.setGasC("gaan");
            System.out.println(balloon1.getGasC());
        }
    }




