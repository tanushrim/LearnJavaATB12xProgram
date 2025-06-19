package Class_Tasks;

public class Lab_019_CheckIfCharacterIsVowelOrConsonantUsingIfElseLoop {
    public static void main(String[] args) {
        char text= 'U';
        text = Character. toLowerCase(text);
        if (text=='a' || text== 'e' || text=='i' || text== 'o' || text== 'u')
        {
            System.out.println(text + " is a vowel");
        } else if (text>='a' && text<='z') {
            System.out.println(text + " is a consonant");
        }
        else {
            System.out.println(text + " is not a valid alphabet");
        }
    }
}
