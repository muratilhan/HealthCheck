package org.example.mapper;

import org.example.dto.request.TeacherRequestDto;
import org.example.dto.response.TeacherResponseDto;
import org.example.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    Teacher toEntity(TeacherRequestDto dto);
    TeacherResponseDto toResponse(Teacher entity);
}
