package project.intel.a1;

public class Computer {
   protected int year=2007;
    String name="microsoft";
    boolean released=true;
    double version=4.230;

    public Computer(int year, String name, boolean released,double version){
        this.year=year;
        this.name=name;
        this.released=released;
        this.version=version;
    }
    public Computer(int year, String name, boolean released){
        this.year=year;
        this.name=name;
        this.released=released;

    }
    public Computer(int year, String name){
        this.year=year;
        this.name=name;

    }

    public Computer(){}

    public int getYear()
    {
        return year;
    }
    public String getName(){
        return name;
    }
    public boolean getReleased(){
        return released;
    }
    public double getVersion(){
        return version;
    }
    public void setYear(int newYear){
        this.year=newYear;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setReleased(boolean newReleased){
        this.released=newReleased;
    }
    public void setVersion(double newVersion){
        this.version=newVersion;
    }

    public void verifyComputerYear(int a, int b,int c){
        if(a>b){
            System.out.println(a+ " Year is greater than "+b);
        }
        else if (a==b){
            System.out.println(a+"Is equal to"+b);

        }
        else{
            System.out.println(a+"Is less than "+b);

        }}


    public static void main(String[]agrs){
        Computer lapTop=new Computer();
        lapTop.setYear(2050);
        System.out.println(lapTop.getYear());
        Computer tab=new Computer();
        tab.setName("Apple");
        System.out.println("The computer name is"+tab.getName());
        Computer desktop=new Computer();
        Computer desktop1=new Computer(2010,"Apple",false);
        System.out.println("Apple 5.230 is : "+desktop1.getReleased());
        Computer laptop1=new Computer(2051,"Apple",false,5.230);
        System.out.println("The version: "+laptop1.getVersion());
        tab.verifyComputerYear(laptop1.getYear(),lapTop.getYear(),88);

    }
}
