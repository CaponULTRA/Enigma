
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
    public char change(char input){
        return exchange[(int)input-65];
    }
}