package org.learning.springbootHome.services;

import org.learning.springbootHome.models.Ball;
import org.learning.springbootHome.repositories.BallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BallService {

    @Autowired
    BallRepository repository;

    public List<Ball> getAllBall() {
        return repository.findAll();
    }

    public Ball getBallById(Long id) {
        Optional<Ball> ballOptional = repository.findById(id);
        if (ballOptional.isPresent()) {
            return ballOptional.get();
        } else {
            throw new RuntimeException();
        }
    }

    public void createAndSaveBall(Ball ball) {
        repository.save(ball);
    }

    public void deleteBallById(Long id) {
        repository.deleteById(id);
    }
}

