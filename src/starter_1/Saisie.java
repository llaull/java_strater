package starter_1;

import java.io.*;

public class Saisie {

    public static String lireString() {
        String ligneLue = null;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            ligneLue = br.readLine();
        } catch (IOException e) {

            System.err.println(e);
        }

        return ligneLue;
    }

    public static String lireString(String question) {
        System.out.print(question);
        return (lireString());
    }

    /**
     * pour un intier
     *
     * @return
     */
    public static int lireInt() {
        return Integer.parseInt(lireString());
    }

    public static int lireInt(String question) {
        System.out.print(question);
        return Integer.parseInt(lireString());
    }

    /**
     * pour une double
     *
     * @return
     */
    public static double liredouble() {
        return Double.parseDouble(lireString());
    }

    public static double liredouble(String question) {
        System.out.print(question);
        return Double.parseDouble(lireString());
    }

    /**
     * pour une char
     *
     * @return
     */
    public static char lireChar() {
        String reponse = lireString();
        return reponse.charAt(0);
    }

    public static char lireChar(String question) {
        System.out.print(question);
        String reponse = lireString();
        return reponse.charAt(0);
    }
}
