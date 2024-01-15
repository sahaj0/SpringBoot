package Entity;

public class Task {

    private  String title;
    private  String Description;

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public Task(String title, String description) {
        this.title = title;
        Description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
