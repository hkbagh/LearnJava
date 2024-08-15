import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double no1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number1 :"));
        double no2 = Math.floor(no1);
        JOptionPane.showMessageDialog(null, "age: "+ no2);
        }
    }