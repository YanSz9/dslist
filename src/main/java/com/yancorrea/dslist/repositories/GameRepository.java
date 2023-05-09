package com.yancorrea.dslist.repositories;

import com.yancorrea.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
