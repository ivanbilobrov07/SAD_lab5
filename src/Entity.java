/**
 * Entity class represents an entity with an ID and a title.
 */
public class Entity {
    private String id;
    private String title;

    /**
     * Constructs an Entity with the specified ID and title.
     *
     * @param id the ID of the entity
     * @param title the title of the entity
     */
    public Entity(String id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * Returns a string representation of the entity.
     *
     * @return a string representation of the entity
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title;
    }
}
