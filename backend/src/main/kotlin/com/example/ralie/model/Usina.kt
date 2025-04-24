package com.example.ralie.model

import jakarta.persistence.*

@Entity
data class Usina(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val nome: String,
    val capacidade: Double,
    val uf: String,
)