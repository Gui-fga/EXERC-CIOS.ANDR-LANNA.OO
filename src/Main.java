import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String conta = JOptionPane.showInputDialog("Digite o valor total da conta:");
        double valorConta = Double.parseDouble(conta);
        String gorjeta = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta (por exemplo, 15 para 15%):");
        double porcentagemGorjeta = Double.parseDouble(gorjeta);
        double valorGorjeta = (porcentagemGorjeta / 100) * valorConta;
        double totalPago = valorConta + valorGorjeta;
        JOptionPane.showMessageDialog(null,String.format("Valor da gorjeta: $%.2f%nTotal a ser pago: $%.2f", valorGorjeta, totalPago));
    } }