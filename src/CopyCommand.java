class CopyCommand extends AbstractCommand {
    private String copy;
    private String textToCopy;

    public CopyCommand(String textToCopy) {
        this.textToCopy = textToCopy;
    }

    @Override
    public void execute() {
        copy = textToCopy;
        System.out.println("Copied text: " + textToCopy);
    }

    @Override
    public void undo() {
        copy = null;
        System.out.println("Undo copy: clipboard cleared.");
    }
}
