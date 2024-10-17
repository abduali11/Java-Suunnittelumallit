public class FilePrinter implements Printer {
    private Printer printer;

    public FilePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}