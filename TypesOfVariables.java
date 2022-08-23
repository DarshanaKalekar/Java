public class TypesOfVariables {
    //Instance Variable
    int x = 10;

    //Static variable
    static int y = 100;

    //prmitive and reference variables
    int z = 10;                      //..Instance Primitive
    static String s ="durga";        //...Static Reference


    public static void main(String[] args) {

        TypesOfVariables r = new TypesOfVariables();
        System.out.println("The value of instance variable x is "+r.x);

        System.out.println("\n----------Static Variables---------");
        System.out.println("Using object reference "+r.y);
        System.out.println("Using Class reference "+TypesOfVariables.y);
        System.out.println("Without any reference "+y);

        System.out.println("\n----------Local Variables---------");
        int i = 0;
        for(int j=0; j<3;j++) {
            i=i+j;
        }
        System.out.println(i);


    }

    public void m1() {
        System.out.print(x);
    }

}
