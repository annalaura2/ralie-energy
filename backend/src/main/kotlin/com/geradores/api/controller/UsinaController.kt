
package com.geradores.api.controller

import com.geradores.api.model.Usina
import com.geradores.api.service.UsinaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/usinas")
class UsinaController(val service: UsinaService) {

    @GetMapping("/top5")
    fun top5(): List<Usina> = service.top5()
}
