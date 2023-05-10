package com.yancorrea.dslist.repositories;

import com.yancorrea.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
