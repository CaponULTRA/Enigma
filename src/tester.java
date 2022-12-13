import java.util.ArrayList;
import java.util.Random;

public class tester {
    public static void main(String[] args) {
        new tester(1);
    }
    public tester(int seed){

        Random random = new Random(seed);
        char [] chars = new char[26];
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < 26;i++ ){
            arrayList.add((char)(i + 65));
        }
        for (int i = 0; i < 26;i++){
            int place = random.nextInt();
            do {place = random.nextInt((arrayList.size()-1));}while (arrayList.get(place)==(char)(i+65));
            while (chars[i]!='\0'){
                i++;
            }
            while (!arrayList.isEmpty())   {
                chars[i]=arrayList.get(place);
                chars[(arrayList.get(place)-65)]=(char) (i+65);
                arrayList.remove((char) (i + 65));
                arrayList.remove(place);

            }

        }
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String string = String.valueOf(chars);
        System.out.println(string);
    }
}
