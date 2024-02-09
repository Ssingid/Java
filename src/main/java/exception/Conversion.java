 package exception;

    public class Conversion {
        public int convertString(String input) {
            try{
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                throw new NumberFormatException("Not an integer");
            }
        }
    }

