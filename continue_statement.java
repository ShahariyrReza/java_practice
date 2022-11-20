
package mycompany.myproject1;

/**
 *
 * @author shahariyr reza
 */
public class continue_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5 || i==7) {
                continue; // 5 and 7 will not print...
            }
            System.out.println(i);
        }
    }
}
