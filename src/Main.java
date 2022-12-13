import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the enigma");
        System.out.println("how many rotors do you want?");

        int rotorCount = scanner.nextInt();
        int [] rotor = new int[rotorCount];
        char [] pos = new char[rotorCount];
        char [] turn = new char[rotorCount];
        System.out.println("rotor 1 to 8 are historical ones. with a other integer you can generate a random seed " +
                "for the connections inside the rotor");
        for (int i = 0; i < rotorCount;i++){
            System.out.println("the "+(i+1)+". rotor is");
            rotor[i]=scanner.nextInt()+1;
            System.out.println("the letter is?");
            pos[i] = scanner.next().toUpperCase().charAt(0);
            System.out.println("and the turning the next configuration is?");
            turn[i]= scanner.next().toUpperCase().charAt(0);
        }
        System.out.println("the reflector is? there are historical reflectors A and B");
        char reflektor = scanner.next().toUpperCase().charAt(0);
        System.out.println("hte Plug bord alphabet is?");
        String plugboard = scanner.next().toUpperCase();
        Enigma enigma = new Enigma(rotorCount, rotor,pos,turn,plugboard,reflektor);
        System.out.println("The massage");
        String massage = scanner.next().toUpperCase();
        System.out.println(enigma.crypt(massage));



    }
}

