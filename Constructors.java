//Q8
//Let us see another example of default constructor
//which displays the default values
class Constructors{
    int id;
    String name;
    //method to display the value of id and name
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
//creating objects
        Constructors s1=new Constructors();
        Constructors s2=new Constructors();
//displaying values of the object
        s1.display();
        s2.display();
    }
}