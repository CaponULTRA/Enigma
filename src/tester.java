import java.util.ArrayList;
import java.util.Random;

public class tester {
    public static void main(String[] args) {
        new tester(2);
    }
    public tester(int seed){

        Random random = new Random(seed);
        char [] chars = new char[26];
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < 26;i++ ){
            arrayList.add((char)(i + 65));
        }
        for (int i = 0; i < 26;i++){

            while (chars[i]!='\0'){
                i++;
            }int place = random.nextInt((arrayList.size()-1)-1) ;
            do {place = random.nextInt((arrayList.size()-1)-1 muss);}while (arrayList.get(place)==(char)(i+65));

            if (!arrayList.isEmpty())   {
                chars[i]=arrayList.get(place);
                chars[(arrayList.get(place)-65)]=(char) (i+65);
                arrayList.remove(place);
                arrayList.remove(arrayList.indexOf((char) (i + 65)));


            }

        }
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String string = String.valueOf(chars);
        System.out.println(string);
    }
}
