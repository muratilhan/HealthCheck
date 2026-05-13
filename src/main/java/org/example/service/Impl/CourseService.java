package org.example.service.Impl;
import org.example.model.Course;
import org.example.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> getAll() {
        return repository.findAll();
    }

    public Optional<Course> getById(Long id) {
        return repository.findById(id);
    }

    public Course create(Course course) {
        return repository.save(course);
    }

    public Course update(Long id, Course course) {
        course.setId(id);
        return repository.save(course);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}