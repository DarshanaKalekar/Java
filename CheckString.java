public class CheckString {

    public static void main(String[] args){
        String s = "120420001";

        try{
                Integer.parseInt(s);
                System.out.println("The above string is a valid integer");

        }catch (NumberFormatException e){
                System.out.println("The above string is not a valid integer");
        }

        }
    }

