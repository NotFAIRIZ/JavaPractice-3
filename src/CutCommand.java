class CutCommand extends AbstractCommand {
    private String textToCut;
    private StringBuilder document;
    private int startIndex;

    public CutCommand(String textToCut, StringBuilder document) {
        this.textToCut = textToCut;
        this.document = document;
    }

    @Override
    public void execute() {
        startIndex = document.indexOf(textToCut);
        if (startIndex != -1) {
            document.delete(startIndex, startIndex + textToCut.length());
            System.out.println("Cut text: " + textToCut);
        } else {
            System.out.println("Text not found for cutting: " + textToCut);
        }
    }

    @Override
    public void undo() {
        if (startIndex != -1) {
            document.insert(startIndex, textToCut);
            System.out.println("Undo cut operation: " + textToCut);
        }
    }
}