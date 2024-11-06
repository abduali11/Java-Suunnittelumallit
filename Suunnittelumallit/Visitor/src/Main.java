public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("document1.txt", 1.2);
        File file2 = new File("photo.jpg", 2.5);
        File file3 = new File("presentation.pptx", 3.0);

        // Create directories and add files to them
        Directory directory1 = new Directory("Documents");
        directory1.addElement(file1);
        directory1.addElement(file3);

        Directory directory2 = new Directory("Pictures");
        directory2.addElement(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addElement(directory1);
        rootDirectory.addElement(directory2);

        // Use SearchVisitor to find files with .txt extension
        SearchVisitor searchVisitor = new SearchVisitor(".*\\.txt");
        rootDirectory.accept(searchVisitor);
        System.out.println("Files matching .txt pattern:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }

        // Use SizeCalculatorVisitor to calculate total size of all files
        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        rootDirectory.accept(sizeCalculatorVisitor);
        System.out.println("Total size of all files: " + sizeCalculatorVisitor.getTotalSize() + " MB");
    }
}