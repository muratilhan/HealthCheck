package org.example.service.Impl;

import org.example.dto.request.StudentRequestDto;
import org.example.dto.response.StudentResponseDto;
import org.example.mapper.StudentMapper;
import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.example.service.Interface.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentService(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<StudentResponseDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public StudentResponseDto getById(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return mapper.toResponse(student);
    }

    @Override
    public StudentResponseDto create(StudentRequestDto studentCreateDto) {
        Student student = mapper.toEntity(studentCreateDto);
        Student saved = repository.save(student);
        return mapper.toResponse(saved);
    }

    @Override
    public StudentResponseDto update(Long id, StudentRequestDto dto) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // MapStruct mevcut entity üzerinde alanları güncelleyebilir
        Student updated = mapper.toEntity(dto);
        updated.setId(id);

        Student saved = repository.save(updated);
        return mapper.toResponse(saved);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
