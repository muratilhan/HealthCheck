package org.example.mapper;

import org.example.dto.request.CourseRequestDto;
import org.example.dto.response.CourseResponseDto;
import org.example.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    Course toEntity(CourseRequestDto dto);
    CourseResponseDto toResponse(Course entity);
}
