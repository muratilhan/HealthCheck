package org.example.dto.response;

import lombok.Data;
import org.example.dto.base.BaseDTO;

@Data
public class StudentResponseDto extends BaseDTO {
    private String name;
    private String email;
    private String gender;
    private CourseResponseDto course; // opsiyonel, döngüsel referans kırmak için sadece courseId de kullanılabilir
}