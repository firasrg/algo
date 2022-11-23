public class NumberFilter {

    /** Filter every number out of a String, returns the value as Integer */
    public int getNumberFromString(String text) {
        int plusOrMinus = 1, pointer = 0, number = 0;
        text = text.replaceAll("[^0-9+-]", "");
        
        if (text.length() == 0) return 0; // return 0 if no text
        
        while (pointer < text.length() && text.charAt(pointer) == ' ') pointer++; // skip whitespaces

        // Check if the number is negative or posetive, go on to right after
        if (pointer < text.length() && (text.charAt(pointer) == '+' || text.charAt(pointer) == '-')) {
            plusOrMinus = text.charAt(pointer) == '-' ? -1 : 1;
            pointer++;
        }
        
        // Detect numbers, check if number is over Integer limit
        while (pointer < text.length() && Character.isDigit(text.charAt(pointer))) {
            int digit = text.charAt(pointer) - '0';
            int bound = Integer.MAX_VALUE / 10;
            
            if(number > bound || (number == bound && digit > Integer.MAX_VALUE % 10)) 
                return plusOrMinus == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

                number = number * 10 + digit;
            pointer++;
        }
        return number * plusOrMinus;
    }
}
