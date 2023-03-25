package com.cyril.bingo.Dao;

import com.cyril.bingo.entity.Bingo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BingoDao extends CrudRepository<Bingo, Integer> {

}
