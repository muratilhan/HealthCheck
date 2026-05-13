package org.example.service.Interface;

import org.example.dto.request.StudentRequestDto;
import org.example.dto.response.StudentResponseDto;

import java.util.List;

public interface IStudentService {

    List<StudentResponseDto> getAll();

    StudentResponseDto getById(Long id);

    StudentResponseDto create(StudentRequestDto dto);

    StudentResponseDto update(Long id, StudentRequestDto dto);

    void delete(Long id);
}
