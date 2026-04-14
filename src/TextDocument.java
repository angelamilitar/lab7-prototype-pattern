public class TextDocument implements Document {
    private Integer filePath;
    private String fileName;
    private String encoding;
    private int wordCount;

    public TextDocument(Integer filePath, String fileName, String encoding, int wordCount) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.encoding = encoding;
        this.wordCount = wordCount;
        System.out.println("Creating a Text Document prototype.");
    }

    @Override
    public Document clone() {
        try { return (TextDocument) super.clone(); }
        catch (CloneNotSupportedException e) { return null; }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + fileName + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: Text, Path: " + fileName + ", Encoding: " + encoding + ", Words: " + wordCount);
    }

    @Override
    public String getType() { return "Text"; }

    public void setFilePath(Integer filePath) { this.filePath = filePath; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setEncoding(String encoding) { this.encoding = encoding; }
    public void setWordCount(int wordCount) { this.wordCount = wordCount; }
}
