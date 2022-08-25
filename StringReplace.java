
public class StringReplace {
    String input  = "Hello World";
    int length = input.length();
    char[] Arr = new char[length];

    public static void main(String[] args) {
        StringReplace s = new StringReplace();
        char replaceWith = '#';

        for(int i = 0; i < s.length; i++){
            s.Arr[i] = s.input.charAt(i);
        }
        System.out.println("Input : "+s.input);

        for(int i = 0; i < s.length; i++){
            if (i % 2 != 0){
                s.Arr[i] = replaceWith;
            }
        }
        System.out.print("Output : ");
        for(char c : s.Arr){
            System.out.print(c);
        }
    }
}
