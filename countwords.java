import java.util.Scanner;

class Class2{

    public String str;
    public int count = 0;

    Class2(String str){
        this.str = str;
    }

    public void count_words(){
        if(str.length() != 0){
            count++;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("There are "+count+" words in a sentence.");
    }
}

public class countwords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter words in one line separated by a space: ");
        String str = in.nextLine();

        Class2 class2 = new Class2(str);

        class2.count_words();
    }
}