package loopsconditionss;

public class OutputPattern {
        public static void main(String[] args) {
            printOutputPattern();
        }
        public static void printOutputPattern() {
            for (int i = 4; i >= 0; i--) {
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print("+");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("-");
                }

                System.out.println();
            }
        }


}
