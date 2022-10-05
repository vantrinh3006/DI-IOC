package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller biến 1 java class thông thường thành 1 API
                // @ResponseBody : Trả về kết quả là 1 chuỗi JSON
public class DIController {
    @Autowired      //Spring IOC container tiêm chích Bean đã được tạo vào biến student
    private Student  student;

    @RequestMapping("test") //tìm kiếm theo đúng URL của request từ client
    public Student test(){
        return student;
    }


}
