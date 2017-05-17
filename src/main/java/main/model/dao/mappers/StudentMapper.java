package main.model.dao.mappers;

import main.model.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Artem Panasyuk on 17.05.2017.
 */
@Component
public interface StudentMapper {
    List getAllStudents();
    Student getStudentById(long id);
}
