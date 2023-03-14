package switchStatement;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char letter = 'A';
        switch(letter){
            case 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
