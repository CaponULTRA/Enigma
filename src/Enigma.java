import java.util.Arrays;

public class Enigma {
     int rotorCount;
     Rotor [] rotor;
     PlugBoard plugBord;
     Reflector reflector;
    public Enigma(int rotorCount, int[] rotor, char[] setting, char []tackTheOther, String plugBord, char reflector ){
        this.rotorCount = rotorCount;
        this.rotor = new Rotor[rotorCount];
        for (int i = 0; i < rotorCount; i++){
            this.rotor[i] = new Rotor(rotor[i],setting[i],tackTheOther[i]);
        }
        this.plugBord = new PlugBoard(plugBord);
        this.reflector = new Reflector(reflector);
    }

    public String crypt(String input){
        char[] work = input.toCharArray();
        for (int i = 0;i<work.length;i++){
            work[i] = plugBord.change(work[i]);
            for (int j = 0; j < rotorCount;j++){
                work[i] = rotor[0].change(work[i],true);
            }
            work[i] = reflector.change(work[i]);
            for (int j = rotorCount-1; j == 0;j--){
                work[i] = rotor[0].change(work[i],false);
            }
            work[i] = plugBord.change(work[i]);

            int num;
            num = 0;
            rotor[num].rotate();
            while (rotor[num].rotateOther() && num < rotorCount-1){
                rotor[num + 1].rotate();
           }
        }
        return Arrays.toString(work);
    }
}
