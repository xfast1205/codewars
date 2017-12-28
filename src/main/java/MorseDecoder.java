public class MorseDecoder {
    public static void main(String[] args) {
        System.out.println(decode(".... . -.-- .--- ..- -.. ."));
    }
    public static String decode(String morseCode) {
        String[] line = morseCode.split(" ");
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        StringBuilder decoder = new StringBuilder();
        for (int j = 0; j < line.length; j++) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(line[j])) decoder.append(alphabet[i]);
            }
        }
        return decoder.toString();
    }
}
