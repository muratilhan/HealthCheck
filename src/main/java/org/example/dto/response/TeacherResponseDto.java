package org.example.dto.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.dto.base.BaseDTO;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class TeacherResponseDto extends BaseDTO {
    private String name;
    private String email;
    private List<CourseResponseDto> courses;
}
