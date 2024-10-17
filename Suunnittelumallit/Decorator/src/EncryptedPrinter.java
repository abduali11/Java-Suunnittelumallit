public class EncryptedPrinter implements Printer {
    private Printer printer;

    public EncryptedPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        printer.print(encryptedMessage);
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}