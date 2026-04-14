public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("default.pdf", "Unknown", 0, "Default PDF");
        textDocumentPrototype = new TextDocument(0, "default.txt", "UTF-8", 0);
        spreadsheetPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);
    }

    public PdfDocument createSheep(String fileName, String author, int pageCount, String name) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pageCount);
        doc.setName(name);
        return doc;
    }

    public TextDocument createCow(Integer filePath, String fileName, String encoding, int wordCount) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.setFilePath(filePath);
        doc.setFileName(fileName);
        doc.setEncoding(encoding);
        doc.setWordCount(wordCount);
        return doc;
    }

    public SpreadsheetDocument createHorse(String name, int rows, int columns) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setSpreadsheetName(name);
        doc.setRowCount(rows);
        doc.setColumnCount(columns);
        return doc;
    }
}
