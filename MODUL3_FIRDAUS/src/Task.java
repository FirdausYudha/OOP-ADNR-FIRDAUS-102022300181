import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private LocalDate dueDate;
    private String title;
    private String priority;
    private String status;

    // TO DO: Buat constructor untuk kelas Task
    public void Task(LocalDate duDate, String title, String priority, String status){
        this.dueDate = dueDate;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    // TO DO: Buat getter untuk title
    public String getTitle() {
        return title;
    }

    // TO DO: Buat getter untuk priority
    public String getPriority() {
        return priority;
    }

    // TO DO: Buat getter untuk dueDate
    public LocalDate getDueDate() {
        return dueDate;
    }

    // TO DO: Buat getter untuk status
    public String getStatus() {
        return status;
    }

    // TO DO: Buat setter untuk status
    public void setStatus(String status) {
        this.status = status;
    }
}
