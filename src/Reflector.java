
public class Reflector {
    String reflectorA = "EJMZALYXVBWFCRQUONTSPIKHGD";
    String reflectorB = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
    String reflectorC = "FVPJIAOYEDRZXWGCTKUQSBNMHL";
    char [] exchange;
    public Reflector(char type){
        switch (type) {
            case ('A') -> exchange = reflectorA.toCharArray();
            case ('B') -> exchange = reflectorB.toCharArray();
            case ('C') -> exchange = reflectorC.toCharArray();
        }
    }
    public char reverse(char input){
        return exchange[(int)input-65];
    }
}
