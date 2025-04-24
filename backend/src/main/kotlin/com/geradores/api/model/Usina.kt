
package com.geradores.api.model

import jakarta.persistence.*

@Entity
@Table(name = "usinas")
data class Usina(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val nome: String,
    val uf: String,
    val capacidade: Double
)
