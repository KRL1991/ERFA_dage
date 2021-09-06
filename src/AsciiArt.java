import java.util.ArrayList;
import java.util.Scanner;

public class AsciiArt {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String asciiOne = "(()__(()\n" +
                "     /       \\ \n" +
                "    ( /    \\  \\\n" +
                "     \\ o o    /\n" +
                "     (_()_)__/ \\             \n" +
                "    / _,==.____ \\\n" +
                "   (   |--|      )\n" +
                "   /\\_.|__|'-.__/\\_\n" +
                "  / (        /     \\ \n" +
                "  \\  \\      (      /\n" +
                "   )  '._____)    /    \n" +
                "(((____.--(((____/mrf";

        String asciiTwo = "|\\   \\\\\\\\__     o\n" +
                "| \\_/    o \\    o \n" +
                "> _   (( <_  oo  \n" +
                "| / \\__+___/      \n" +
                "|/     |/";

        String asciiThree = "               ;'-. \n" +
                "    `;-._        )  '---.._\n" +
                "      >  `-.__.-'          `'.__\n" +
                "     /_.-'-._         _,   ^ ---)\n" +
                "jgs  `       `'------/_.'----```\n" +
                "                     `";


        System.out.println("Please enter a number: ");

        for (int i = 0; i < 10; i++) {

            int scInput = scanner.nextInt();


            if (scInput == 1) {
                System.out.println(asciiOne);
            }

            else if (scInput == 2) {
                    System.out.println(asciiTwo);
                }

            else if (scInput== 3) {
                        System.out.println(asciiThree);
                    }
                }
            }


        }
