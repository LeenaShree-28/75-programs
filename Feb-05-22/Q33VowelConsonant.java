public class Q33VowelConsonant {
    public static void main(String[] args) {
        char letter = 'e';
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
               System.out.println(letter+" is Vowel");
               break;
            default :
              System.out.println(letter+" is Consonant");
        }
    }
}
