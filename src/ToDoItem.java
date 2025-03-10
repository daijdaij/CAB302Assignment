
public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    // Constructor
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }
    // Getter for private description string
    public String getDescription(){
        return description;
    }
    // Setter for the obtained description string (void because no need to return any value)
    public void setDescription(String description){
        this.description = description;
    }
    // Get the item's state
    public boolean itemState(){
        return isDone;
    }
    // Set the item's state
    public void setDone(boolean isDone){
        this.isDone = isDone;
    }
}


