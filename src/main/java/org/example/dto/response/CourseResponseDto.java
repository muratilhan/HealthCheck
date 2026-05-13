package org.example.dto.response;

import lombok.Data;
import java.util.List;
import org.example.dto.base.BaseDTO;

@Data
public class CourseResponseDto extends BaseDTO {
    private String name;
    private TeacherResponseDto teacher;
    private List<StudentResponseDto> students;
}
