public class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker t1 = new PalindromeChecker("noon");

        t1.display();
    }
}

class PalindromeChecker {
    String text;

    public PalindromeChecker(String t) {
        this.text = t;
    }

    public boolean check(String text) {
        int s = 0, e = text.length() - 1;

        while (s <= e) {
            if (text.charAt(s) != text.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public void display() {
        if(check(text))
            System.out.println("The entered text is Palindrome");
        else
            System.out.println("The entered text is not Palindrome");
    }
    
}
