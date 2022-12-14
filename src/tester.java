import java.util.ArrayList;
import java.util.Random;

public class tester {
    public static void main(String[] args) {
        new tester(3);
    }
    public tester(int seed){

        Random random = new Random(seed);
        char [] chars = new char[26];
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < 26;i++ ){
            arrayList.add((char)(i + 65));
        }
        for (int i = 0; i < 26;i++){
            if (!arrayList.isEmpty())   {
            while (chars[i]!='\0'){
                i++;
            }int place  ;
            do {place = random.nextInt(0,(arrayList.size()) );
                System.out.println(place);}while (arrayList.get(place)==(char)(i+65));


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
