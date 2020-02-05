package project.intel.a1;


public class Cat{
        String breed;
    boolean hasOwner;
    int age;
    double weight;
    double height;


public Cat(String catBreed,boolean catWoned,int catYears,double catWeight,double catHeight){
        this.breed=catBreed;
        this.hasOwner=catWoned;
        this.age=catYears;
        this.weight=catWeight;
        this.height=catHeight;
        }
        public static double total(double a,double b, double c, double d,double e){
    double total;
    total = a+b+c+d+e;
    return total;
        }
    public static double total(double a,double b){
        double total;
        total = a+b;
        return total;
    }
    public static int diff(int a, int b){
    int diff;
    diff = a-b;
    return diff;
    }
//    public void ageAfterOneyear(int increment){
//    age= age+increment;
//        System.out.println("It became older");
//    }
    public int ageAfterGivenYear(int a){
    int b=age+a;
    return b;
    }
public static void main(String[]args){
        System.out.println("I have different kind of Cat");

        Cat cito=new Cat("hoppi",true,3,4.5,2.5);
        boolean b=cito.hasOwner=false;


    System.out.println("Nancy is the woner of cito named cat and it is: "+b);
        Cat nido=new Cat("nicco",false,4,3.5,4.2);
        boolean c=nido.hasOwner=true;
    System.out.println("Nancy is the woner of cito named cat and it is: "+c);

        Cat slimo=new Cat("coppi",true,2,2.5,2.5);
    System.out.println("Slimo bbbbbbbbbbbbbbbb"+slimo.ageAfterGivenYear(5));
        Cat kimo=new Cat("goppi",true,2,3.2,2.6);
        Cat limo=new Cat("soppi",true,2,3.5,5.5);
        boolean areSlimoAndKimoSameOld=slimo.age==kimo.age;
        boolean kimoIsLighterThanLimo=kimo.weight<limo.weight;
        double totalWeightOfAllCat = Cat.total(cito.weight,nido.weight,slimo.weight,kimo.weight,limo.weight);
        System.out.println("The total weight of all cats are: "+totalWeightOfAllCat);
    System.out.println("Total weight of two cats are: "+ Cat.total(kimo.weight,limo.weight));
    System.out.println("The difference between the age"+Cat.diff(cito.age,nido.age));
    System.out.println("The difference between the age"+Cat.diff(nido.age,slimo.age));


        }
        }


