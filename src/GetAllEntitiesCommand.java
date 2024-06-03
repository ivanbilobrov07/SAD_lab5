/**
 * GetAllEntitiesCommand class is a command to retrieve all entities from the database.
 */
public class GetAllEntitiesCommand implements Command {
    private Database database;

    /**
     * Constructs a GetAllEntitiesCommand with the specified database.
     *
     * @param database the database from which all entities will be retrieved
     */
    public GetAllEntitiesCommand(Database database){
        this.database = database;
    }

    /**
     * Executes the operation to retrieve all entities from the database.
     */
    @Override
    public void execute() {
        database.getAllEntities();
    }
}
