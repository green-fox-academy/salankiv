public class TakesLonger {
        public static void main(String... args){
            String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

            // When saving this quote a disk error has occured. Please fix it.
            // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
            // Using pieces of the quote variable (instead of just redefining the string)

            String missing = " always takes longer than";
            String firstPart = quote.substring(0, quote.indexOf("I") + 2);
            String lastPart = quote.substring(quote.indexOf("I") + 2);

            System.out.println(firstPart + missing + lastPart);
        }
}
