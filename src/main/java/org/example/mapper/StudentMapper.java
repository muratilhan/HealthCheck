package org.example.mapper;

import org.example.dto.request.StudentRequestDto;
import org.example.dto.response.StudentResponseDto;
import org.example.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student toEntity(StudentRequestDto dto);
    StudentResponseDto toResponse(Student entity);
}
