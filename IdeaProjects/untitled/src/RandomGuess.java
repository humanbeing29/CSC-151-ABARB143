import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hey! Think of a number and I'll try to guess it. Ready?");
        JOptionPane.showMessageDialog(null, "I'm going to guess.... " + (1 + (int)(Math.random() * 10)) + "!");
    }
}
