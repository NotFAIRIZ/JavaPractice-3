class InsertCommand extends AbstractCommand {
    private String textToInsert;
    private StringBuilder target;

    public InsertCommand(String textToInsert, StringBuilder target) {
        this.textToInsert = textToInsert;
        this.target = target;
    }

    @Override
    public void execute() {
        target.append(textToInsert);
        System.out.println("Inserted text: " + textToInsert);
    }

    @Override
    public void undo() {
        int start = target.length() - textToInsert.length();
        if (start >= 0) {
            target.delete(start, target.length());
            System.out.println("Undo insert operation: " + textToInsert);
        }
    }
}
