public class ReplaceString {
    public static void main (String [] args) {
        String string1 = "Hello How Are You";
        String changeChar = string1.replace("M","I");
        String changeSentence = string1.replace("Hello", "Good Morning");
        System.out.println("To replace character: " +changeChar);
        System.out.println("To replace sentence: " + changeSentence);
    }
}
