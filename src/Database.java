/**
 * Database class simulates a database with basic CRUD operations.
 */
public class Database {
    /**
     * Creates a new entity in the database.
     *
     * @param entity the entity to be created
     */
    public void create(Entity entity) {
        System.out.println("Inserting record: " + entity);
    }

    /**
     * Deletes an entity from the database by ID.
     *
     * @param entityId the ID of the entity to be deleted
     */
    public void delete(String entityId) {
        System.out.println("Deleting entity with id: " + entityId);
    }

    /**
     * Retrieves all entities from the database.
     */
    public void getAllEntities() {
        System.out.println("Getting all entities");
    }

    /**
     * Retrieves an entity by ID from the database.
     *
     * @param entityId the ID of the entity to be retrieved
     */
    public void getEntitiyById(String entityId) {
        System.out.println("Getting entity with id: " + entityId);
    }
}
