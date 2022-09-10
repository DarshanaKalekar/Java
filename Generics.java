
class BankAccount<T>{
    T t1;
    BankAccount(T t1){
        this.t1 = t1;
    }

    public void display(){
        System.out.println(t1);
    }

    public <T> void depositeMoney(T[] money){
        System.out.println("\nMoney : ");
        for (T i : money){
            System.out.println(i);
        }
    }
}


public class Generics {

    public static void main(String[] args){
        BankAccount<String> b1 = new BankAccount<String>("Hello");
        BankAccount<Integer> b2 = new BankAccount<Integer>(4);
        b1.display();
        b2.display();

        Integer[] m1 = {100, 200, 300};
        Double[] m2 = {234.565, 36.234, 45.235};

        b1.depositeMoney(m1);
        b2.depositeMoney(m2);
    }
}
