public class Groups {
    public static void main(String[] args) {
        System.out.println(groupCheck("({})"));
        System.out.println(groupCheck("[[]()]"));
        System.out.println(groupCheck("[{()}]"));
//        System.out.println(groupCheck("{(})"));
//        System.out.println(groupCheck("([]"));
//        System.out.println(groupCheck("[])"));
    }
    public static boolean groupCheck(String s){
        int a = 0;
        int b = 0;
        char[] str = s.toCharArray();
        char[] opened = new char[]{'(', '[', '{'};
        char[] closed = new char[]{')', ']', '}'};
        if (s.length() % 2 == 1) return false;
        for (char aStr : str) {
            for (char anOpened : opened) {
                if (aStr == anOpened) a++;
            }
        }
        for (char aStr : str) {
            for (char aClosed : closed) {
                if (aStr == aClosed) b++;
            }
        }
        return a == b;
    }
}