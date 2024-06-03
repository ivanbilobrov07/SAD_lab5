/**
 * CreateCommand class is a command to create an entity in the database.
 */
public class CreateCommand implements Command {
    private Database database;
    private Entity entity;

    /**
     * Constructs a CreateCommand with the specified database and entity.
     *
     * @param database the database where the entity will be created
     * @param entity the entity to be created
     */
    public CreateCommand(Database database, Entity entity) {
        this.database = database;
        this.entity = entity;
    }

    /**
     * Executes the create operation on the database.
     */
    @Override
    public void execute() {
        database.create(entity);
    }
}
