package com.secretswoop.secretswoopapi.service.game

import com.secretswoop.secretswoopapi.api.game.CreateGameRequestDTO
import com.secretswoop.secretswoopapi.api.game.GameResponseDTO
import com.secretswoop.secretswoopapi.repository.game.GameRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class GameServiceImpl(
  private val mapper: GameMapper,
  private val repository: GameRepository
) : GameService {

  override fun getAllGames(): List<GameResponseDTO> {
    return repository.findAll()
      .map(this::toResponseDTO)
  }

  override fun getGameById(id: UUID): GameResponseDTO {
    val result = repository.findById(id)
    return toResponseDTO(result)
  }

  override fun createGame(requestDTO: CreateGameRequestDTO): GameResponseDTO {
    val game = mapper.toModel(UUID.randomUUID(), requestDTO)

    val result = repository.save(game)
    return toResponseDTO(result)
  }

  override fun deleteGame(id: UUID) {
    repository.deleteById(id)
  }

  private fun toResponseDTO(model: Game) = mapper.toResponseDTO(model)

}
