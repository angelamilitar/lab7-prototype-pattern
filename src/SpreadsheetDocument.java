public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        System.out.println("Creating a Spreadsheet Document prototype. ///Executed in the constructor");
    }

    @Override
    public Document clone() {
        try {
            return (SpreadsheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }

    @Override
    public String getType() { return "Spreadsheet"; }

    public void setSpreadsheetName(String spreadsheetName) { this.spreadsheetName = spreadsheetName; }
    public void setRowCount(int rowCount) { this.rowCount = rowCount; }
    public void setColumnCount(int columnCount) { this.columnCount = columnCount; }
}
