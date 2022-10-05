package demo;

import org.springframework.stereotype.Component;

@Component      // Spring IOC container tạo đối tượng
public class Student {
   private int id  = 1;
   private String name = "Van Trinh";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }
}
