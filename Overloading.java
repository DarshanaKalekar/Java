public class Overloading {
    int add(int number1){
        return number1;
    }

    int add(int number1, int number2){
        return number1+number2;
    }

    float add(float number1, float number2){
        return number1+number2;
    }

    int add(int number1, int number2,int number3){
        return number1+number2+number3;
    }


    public static void main(String[] args){
        Overloading o = new Overloading();

        System.out.println(o.add(2));
        System.out.println(o.add(3,5));
        System.out.println(o.add(1,1,1));
        System.out.println(o.add(10.1f,5.4f));

    }
}
