package com.example.ralie.controller

import com.example.ralie.model.Usina
import com.example.ralie.service.UsinaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/usinas")
class UsinaController(private val service: UsinaService) {

    @GetMapping("/top5")
    fun top5(): List<Usina> = service.listarTop5()

    @PostMapping
    fun salvar(@RequestBody usina: Usina): Usina = service.salvar(usina)
}