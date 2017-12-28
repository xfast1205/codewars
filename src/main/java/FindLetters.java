
public class FindLetters {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a','b','c','e'}));
    }
    public static char findMissingLetter(char[] array)
    {

        Character[] alphabet = new Character[]{'a','b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == Character.toLowerCase(array[0])){
                for (int j = i; j < array.length; j++) {
                    if (alphabet[j] != Character.toLowerCase(array[j])){
                        return alphabet[j];
                    }
                }
            }
        }
        return ' ';
    }
}