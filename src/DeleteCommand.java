/**
 * DeleteCommand class is a command to delete an entity from the database by ID.
 */
public class DeleteCommand implements Command {
    private Database database;
    private String id;

    /**
     * Constructs a DeleteCommand with the specified database and entity ID.
     *
     * @param database the database from which the entity will be deleted
     * @param id the ID of the entity to be deleted
     */
    public DeleteCommand(Database database, String id){
        this.database = database;
        this.id = id;
    }

    /**
     * Executes the delete operation on the database.
     */
    @Override
    public void execute() {
        database.delete(id);
    }
}
