package com.secretswoop.secretswoopapi.service.game

import com.secretswoop.secretswoopapi.api.game.CreateGameRequestDTO
import com.secretswoop.secretswoopapi.api.game.GameResponseDTO
import java.util.*

interface GameService {

  fun getAllGames(): List<GameResponseDTO>

  fun getGameById(id: UUID): GameResponseDTO

  fun createGame(requestDTO: CreateGameRequestDTO): GameResponseDTO

  fun deleteGame(id: UUID)

}
