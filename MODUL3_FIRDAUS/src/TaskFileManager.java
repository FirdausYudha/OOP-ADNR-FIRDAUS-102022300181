import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TaskFileManager {
    private static final String FILE_PATH = "tasks.txt"; // Path file tempat tugas disimpan

    // Metode untuk memuat tugas dari file
    public static ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>(); // Daftar tugas yang akan dimuat
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    // Memisahkan data tugas yang ada di file menjadi atribut-atribut
                    String[] parts = line.split(";");
                    if (parts.length != 4) {
                        continue; // Lewati baris jika tidak sesuai format
                    }

                    // Parsing data dari file ke atribut tugas
                    String title = parts[0];
                    String priority = parts[1];
                    LocalDate dueDate = LocalDate.parse(parts[2]);
                    String status = parts[3];

                    // Membuat objek Task baru dan menambahkannya ke daftar
                    Task task = new Task(title, priority, dueDate, status);
                    tasks.add(task);
                } catch (Exception e) {
                    System.err.println("Error parsing task: " + e.getMessage()); // Menampilkan error parsing tugas
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Task file not found. A new one will be created."); // File tidak ditemukan, file baru akan dibuat
        } catch (IOException e) {
            System.err.println("Error reading task file: " + e.getMessage()); // Error saat membaca file
        }
        return tasks; // Mengembalikan daftar tugas yang dimuat
    }

    // Metode untuk menyimpan tugas ke file
    public static void saveTasks(ArrayList<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Task task : tasks) {
                // Menulis tugas ke file dalam format string
                writer.write(String.format("%s;%s;%s;%s",
                        task.getTitle(),
                        task.getPriority(),
                        task.getDueDate(),
                        task.getStatus()));
                writer.newLine(); // Menambahkan baris baru untuk setiap tugas
            }
        } catch (IOException e) {
            System.err.println("Error writing to task file: " + e.getMessage()); // Error saat menulis ke file
        }
    }
}
