public class staticvariable {
    
    //Instance variables
    
    String name;
    String address;

    //static variable

    static String city = "Karachi/Islamabad";


    staticvariable(String name, String address){
        this.name = name;
        this.address = address;
        System.out.println(name + " " + city);
    }

    public static void main(String[] args) {
        staticvariable sv = new staticvariable("Rahul", "test address");
        staticvariable sv2 = new staticvariable("Taha", "xyz address");
    }
}
