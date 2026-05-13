package org.example.service.Impl;
import org.example.model.Teacher;
import org.example.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository repository;

    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

    public List<Teacher> getAll() {
        return repository.findAll();
    }

    public Optional<Teacher> getById(Long id) {
        return repository.findById(id);
    }

    public Teacher create(Teacher teacher) {
        return repository.save(teacher);
    }

    public Teacher update(Long id, Teacher teacher) {
        teacher.setId(id);
        return repository.save(teacher);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}