public class thisclass {
    int a = 2;

    public void thisMethod(){
        int a = 4;
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        thisclass tc = new thisclass();
        tc.thisMethod();
    }
}
