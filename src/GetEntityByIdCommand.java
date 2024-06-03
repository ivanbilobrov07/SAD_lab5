/**
 * GetEntityByIdCommand class is a command to retrieve an entity from the database by ID.
 */
public class GetEntityByIdCommand implements Command {
    private Database database;
    private String id;

    /**
     * Constructs a GetEntityByIdCommand with the specified database and entity ID.
     *
     * @param database the database from which the entity will be retrieved
     * @param id the ID of the entity to be retrieved
     */
    public GetEntityByIdCommand(Database database, String id){
        this.database = database;
        this.id = id;
    }

    /**
     * Executes the operation to retrieve an entity by ID from the database.
     */
    @Override
    public void execute() {
        database.getEntitiyById(id);
    }
}
