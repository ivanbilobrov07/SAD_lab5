//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Executor executor = new Executor();

        Entity entity = new Entity("1", "Title");

        executor.executeOperation(new CreateCommand(database, entity));
        System.out.println();

        executor.executeOperation(new GetAllEntitiesCommand(database));
        System.out.println();

        executor.executeOperation(new GetEntityByIdCommand(database, "1"));
        System.out.println();

        executor.executeOperation(new DeleteCommand(database, "1"));
        System.out.println();
    }
}