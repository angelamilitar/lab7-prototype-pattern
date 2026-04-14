# Lab 7: Document Prototype Design Pattern

## Overview
This project demonstrates the **Prototype Design Pattern** in Java. Instead of creating new document objects from scratch each time, the program uses pre-built **prototype** objects that are **cloned** and customized as needed.

## Project Structure
lab7-prototype-pattern/
├── src/
│   ├── Document.java
│   ├── PdfDocument.java
│   ├── TextDocument.java
│   ├── SpreadsheetDocument.java
│   ├── DocumentRegistry.java
│   └── ProcessedDocument.java
├── out/
└── README.md

## Files Description

| File | Role | Description |
|------|------|-------------|
| `Document.java` | Interface | Defines the contract: `clone()`, `open()`, `getType()`. Extends `Cloneable`. |
| `PdfDocument.java` | Concrete Prototype | Represents a PDF document with fileName, author, pageCount, and name. |
| `TextDocument.java` | Concrete Prototype | Represents a text document with filePath, encoding, and wordCount. |
| `SpreadsheetDocument.java` | Concrete Prototype | Represents a spreadsheet with spreadsheetName, rowCount, and columnCount. |
| `DocumentRegistry.java` | Registry | Holds one prototype of each type and creates clones with custom values. |
| `ProcessedDocument.java` | Main Class | Entry point. Creates and opens various documents using the registry. |

## Design Pattern: Prototype

The **Prototype Pattern** is a creational design pattern that creates new objects by copying (cloning) an existing object called the **prototype**.

### Key Idea
- A prototype object is created **once** (constructor runs once per type).
- New objects are made by **cloning** the prototype — faster and more efficient.
- The clone is then customized with new values via setters.

### Why Use It?
- Avoids the cost of creating objects from scratch repeatedly.
- Useful when object creation is expensive or complex.
- Promotes flexibility — new document types can be added easily.

## How to Compile and Run

### 1. Compile
```bash
mkdir -p out && javac -d out src/*.java
```

### 2. Run
```bash
java -cp out ProcessedDocument
```

## Expected Output
Creating a PDF Document prototype. //Executed in the constructor
Creating a Text Document prototype. //Executed in the constructor
Creating a Spreadsheet Document prototype. ///Executed in the constructor
Opening PDF Document: annual_report_2024.pdf by Acme Corp (150 pages)
Type: PDF, File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150
Opening Text Document: meeting_notes.txt with encoding: UTF-8 (250 words)
Type: Text, Path: meeting_notes.txt, Encoding: UTF-8, Words: 250
Opening Spreadsheet Document: sales_data_q1.xlsx (1000 rows, 20 columns)
Type: Spreadsheet, Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20
Opening PDF Document: summary_report.pdf by Acme Corp (30 pages)
Type: PDF, File: summary_report.pdf, Author: Acme Corp, Pages: 30

### Key Observation
Notice that **"Creating a ... prototype"** only prints **3 times** — once per document type — even though **4 documents** are created. This is because only the **prototypes** call the constructor. The clones do not, making the pattern efficient.

## UML Diagram
<img width="912" height="462" alt="image" src="https://github.com/user-attachments/assets/77b1aeb4-fb8f-4980-9e28-387ee419f3f9" />


## Author
Angela Militar
Lab 7 — Prototype Design Pattern
April 2026
