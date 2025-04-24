
package com.geradores.api.service

import com.geradores.api.model.Usina
import com.geradores.api.repository.UsinaRepository
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.net.URL
import java.nio.charset.Charset

@Service
class UsinaService(val repository: UsinaRepository) {

    @Scheduled(cron = "0 0 * * * *") // a cada hora
    fun importarCSV() {
        val csvUrl = "https://dadosabertos.aneel.gov.br/dataset/ralie-relatorio-de-acompanhamento-da-expansao-da-oferta-de-geracao-de-energia-eletrica/resource/a3c58ecb-e936-4dc1-884b-9941f7079a73/download/ralie-usina.csv"
        val linhas = URL(csvUrl).readText(Charset.forName("ISO-8859-1")).lines()
        val dados = linhas.drop(1).mapNotNull { linha ->
            val colunas = linha.split(";")
            try {
                Usina(
                    nome = colunas[3],
                    uf = colunas[4],
                    capacidade = colunas[14].replace(",", ".").toDouble()
                )
            } catch (e: Exception) {
                null
            }
        }
        repository.saveAll(dados)
    }

    fun top5(): List<Usina> = repository.findTop5ByCapacidade()
}
