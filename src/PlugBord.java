public class PlugBord {
    char [] exchange;
    public PlugBord(String exchange){
       this.exchange = exchange.toCharArray();
    }
    public char change(char input) {
        return exchange[(int) input - 65];
    }
}
