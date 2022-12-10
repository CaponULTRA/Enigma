public class Rotor {

    char[] exchange;
    char tackTheOther;

    public Rotor(int type, char setting,char tackTheOther) {
        String rotor1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        String rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
        String rotor3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
        String rotor4 = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
        String rotor5 = "VZBRGITYUPSDNHLXAWMJQOFECK";
        String rotor6 = "JPGVOUMFYQBENHZRDKASXLICTW";
        String rotor7 = "NZJHGRCXMYSWBOUFAIVLPEKQDT";
        String rotor8 = "FKQHTLXOCBJSPDZRAMEWNIUYGV";
        switch (type) {
            case (1) -> exchange = rotor1.toCharArray();
            case (2) -> exchange = rotor2.toCharArray();
            case (3) -> exchange = rotor3.toCharArray();
            case (4) -> exchange = rotor4.toCharArray();
            case (5) -> exchange = rotor5.toCharArray();
            case (6) -> exchange = rotor6.toCharArray();
            case (7) -> exchange = rotor7.toCharArray();
            case (8) -> exchange = rotor8.toCharArray();
        }
        this.tackTheOther = tackTheOther;
        while (setting != exchange[0]){
            rotate();
        }
    }

    public char change(char input) {
        return exchange[(int) input - 65];
    }
    public void rotate(){
        char cache = exchange[25];
        for (int i =exchange.length ; i>1; i--){
            exchange[i-1] = exchange[i-2];
        }
        exchange[0] = cache;
    }
    public boolean rotateOther(){
        return exchange[0] == tackTheOther;
    }
}

