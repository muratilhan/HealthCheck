package org.example.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.dto.base.BaseDTO;

@Data
@EqualsAndHashCode(callSuper = true)
public class TeacherRequestDto extends BaseDTO {
    private String name;
    private String email;
}
