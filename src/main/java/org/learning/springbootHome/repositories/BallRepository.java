package org.learning.springbootHome.repositories;

import org.learning.springbootHome.models.Ball;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BallRepository extends JpaRepository<Ball, Long> {

}
