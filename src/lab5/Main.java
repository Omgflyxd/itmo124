package lab5;

public class Main {

    static String max(String par) {
        String[] words = par.split(" ");
        String resstring = "";
        for (String word : words) {
            if (word.length() > resstring.length())
                resstring = word;
        }
        return (resstring);
    }

    static public void main(String[] args) {
        String longWord = "Текст для пойска слова в лабораторной";
        String maxWord = max(longWord);
        System.out.println(maxWord);
        System.out.println(maxWord.length());
    }

    public static class Palindrome {
        public static boolean isPalindrome(String word) {
            int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("Боб"));
            System.out.println(isPalindrome("боб"));
            System.out.println(isPalindrome("Яблоко"));
        }
    }

    public static class Censor {
        public static String censorWord(String text) {
            return text.replaceAll("бяка", "[вырезано цензурой]");
        }

        public static void main(String[] args) {
            String text = "Они-то знали, какая бяка плохая";
            String censoredText = censorWord(text);
            System.out.println(censoredText);
        }
    }

    public static class Substring {
        public static int count(String text, String substring) {
            int count = 0;
            int index = 0;

            while ((index = text.indexOf(substring, index)) != -1) {
                count++;
                index += substring.length();
            }

            return count;
        }

        public static void main(String[] args) {
            String text = "тест вхождения слов в текст тест";
            String substring = "тест";
            int a = count(text, substring);
            System.out.println("Количество вхождений: " + a);
        }
    }

    public static class Reverse {
        public static void main(String[] args) {
            String text = "This is a test string";

            for (String part : text.split(" ")) {
                System.out.print(new StringBuilder(part).reverse().toString());
                System.out.print(" ");
            }
            }
            }
        }

