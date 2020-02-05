package project.intel.a1;

public class Smartphone extends Computer implements Device  {
    String color;
    double weight;
    double size;
    String example;
    double version;

    public int getNewDevice(){
        return 10;
    }
    public String getNewDevice2(){
        return "NewDevice";
    }

    public int lostVersion(int defectPhone, int defectApplication){
        int newPhone=defectPhone - defectApplication;
        if(newPhone>0) {

            return newPhone;
        }else {
            return 0;
        }
    }





    public Smartphone(){}

    public Smartphone(String colorCode, double averageWeight, double averageSize,
                      String newPhoneOnMarket,double currentVersion)
    {
        this.color=colorCode;
        this.weight=averageWeight;
        this.size=averageSize;
        this.example=newPhoneOnMarket;
        this.version=currentVersion;
    }
   // public void setYear(int newValue){
        //this.year=newValue;
   // }
    //overiding toString method
    //of Computer to print more info
   // @Override
//    public String toString(){
//        return("phone year is"+super.year);

   // }
    public void verifyComputerYear(int a, int b){
        if(a>b){
            System.out.println(a+ " Year is overriden "+b);
        }
        else if (a==b){
            System.out.println(a+"Is equal to and overriden"+b);

        }
        else{
            System.out.println(a+"Is less than and overriden"+b);

        }}

    public static void main(String []args){
        Smartphone iPhone= new Smartphone();
        Smartphone samsung= new Smartphone();
        Smartphone nokia=new Smartphone();
        Smartphone blackBerry=new Smartphone("Black",3.4,4.5,
               "hawai",2.1);
       // iPhone.year=2003;

        System.out.println("Black blackberry 2.1 version has "+blackBerry.weight+" weight and " +
                "relesed on"+iPhone.year);
        Computer iPhone1=new Smartphone();
        Computer tablet=new Computer(2001,"appleTab",true,2.6);

        System.out.println(iPhone.toString());
        iPhone.verifyComputerYear(2001,777);






    }


}
