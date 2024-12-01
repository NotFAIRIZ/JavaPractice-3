public class Main {
    public static void main(String[] args) {
        WindowController controller = new WindowController();

        StringBuilder document = new StringBuilder("new created test text 123");
        System.out.println("text before modification: " + document);
        System.out.println();
        CopyCommand copy = new CopyCommand("text 12");
        CutCommand cut = new CutCommand("new created test text", document);
        InsertCommand insert = new InsertCommand(" inserted NEW text", document);

        controller.addCommand(copy);
        controller.addCommand(cut);
        controller.addCommand(insert);

        controller.executeAllPendingCommands();

        System.out.println();
        System.out.println("text after modification: " + document);
        System.out.println();

        controller.undoChanges(1);

        System.out.println("After undo: " + document);
    }
}
