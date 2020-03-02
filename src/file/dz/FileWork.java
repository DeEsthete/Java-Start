package file.dz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileWork<T> {
    private String filePath;

    public FileWork(String filePath) {
        this.filePath = filePath;
    }

    public T read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            return (T) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void write(T entity) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(entity);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}