
package dao;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class SQLiteTaskDAO implements DAO<Task> {

    @Override
    public void save(Task task) {
        // Add SQLite database interaction code to save a task
    }

    @Override
    public void delete(int id) {
        // Add SQLite database interaction code to delete a task by ID
    }

    @Override
    public Task findById(int id) {
        // Add SQLite database interaction code to find a task by ID
        return null;
    }

    @Override
    public List<Task> findAll() {
        // Add SQLite database interaction code to retrieve all tasks
        return new ArrayList<>();
    }
}
