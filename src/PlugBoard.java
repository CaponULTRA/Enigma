public class PlugBoard {
    char [] exchange;
    public PlugBoard(String exchange){
       this.exchange = exchange.toCharArray();
    }
    public char change(char input) {
        return exchange[(int) input - 65];
    }
}
