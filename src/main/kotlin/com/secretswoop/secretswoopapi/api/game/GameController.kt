package com.secretswoop.secretswoopapi.api.game

import com.secretswoop.secretswoopapi.api.common.*
import com.secretswoop.secretswoopapi.service.game.GameService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/game")
class GameController(private val service: GameService) : ApiController<UUID, GameResponseDTO>,
  ModifyingController<CreateGameRequestDTO, GameResponseDTO> {

  @GetMapping
  override fun getAll() = ResponseEntity.ok(service.getAllGames())

  @GetMapping("/{id}")
  override fun getById(@PathVariable id: UUID) = ResponseEntity.ok(service.getGameById(id))

  @PostMapping
  override fun create(@RequestBody payload: CreateGameRequestDTO): ResponseEntity<GameResponseDTO> {
    val createdGame = service.createGame(payload)
    return created(createdGame)
  }

  @DeleteMapping("/{id}")
  override fun delete(@PathVariable id: UUID): ResponseEntity<Void> {
    service.deleteGame(id)
    return noContent()
  }

}
