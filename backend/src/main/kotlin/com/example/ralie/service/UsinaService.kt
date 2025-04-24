package com.example.ralie.service

import com.example.ralie.model.Usina
import com.example.ralie.repository.UsinaRepository
import org.springframework.stereotype.Service

@Service
class UsinaService(private val repository: UsinaRepository) {

    fun listarTop5(): List<Usina> = repository.findTop5Geradores()

    fun salvar(usina: Usina): Usina = repository.save(usina)
}