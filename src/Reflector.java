import java.util.ArrayList;
import java.util.Random;

public class Reflector {

    char [] exchange;
    public Reflector(char type){
        String reflectorA = "EJMZALYXVBWFCRQUONTSPIKHGD";
        String reflectorB = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
        String reflectorC = "FVPJIAOYEDRZXWGCTKUQSBNMHL";
        switch (type) {
            case ('A') -> exchange = reflectorA.toCharArray();
            case ('B') -> exchange = reflectorB.toCharArray();
            case ('C') -> exchange = reflectorC.toCharArray();

        }
    }
    public Reflector(int type){
        exchange = random(type).toCharArray();
    }
    public char change(char input){
        return exchange[(int)input-65];
    }
    public String random(int seed){

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

        return String.valueOf(chars);

    }
}