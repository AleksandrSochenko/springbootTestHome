package org.learning.springbootHome.controllers;

import org.learning.springbootHome.models.Ball;
import org.learning.springbootHome.services.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BallController {

    @Autowired
    BallService ballService;

    @GetMapping(path = "/balls")
    public List<Ball> getBall() {
        return ballService.getAllBall();
    }

    @GetMapping(path = "/balls/{id}")
    public Ball getBallById(@PathVariable Long id) {
        return ballService.getBallById(id);
    }

    @DeleteMapping(path = "/balls/{id}")
    public void deleteBallById(@PathVariable Long id) {
        ballService.deleteBallById(id);
    }

    @PostMapping(path = "/balls/new")
    public void createAndSaveBall(@RequestBody Ball ball) {
        ballService.createAndSaveBall(ball);
    }

    }
