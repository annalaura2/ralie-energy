package com.example.ralie.repository

import com.example.ralie.model.Usina
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UsinaRepository : JpaRepository<Usina, Long> {

    @Query("SELECT u FROM Usina u ORDER BY u.capacidade DESC LIMIT 5")
    fun findTop5Geradores(): List<Usina>
}