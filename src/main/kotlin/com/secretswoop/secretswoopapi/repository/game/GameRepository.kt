package com.secretswoop.secretswoopapi.repository.game

import com.secretswoop.secretswoopapi.service.game.Game
import java.util.*

interface GameRepository {

  fun findAll(): List<Game>

  fun findById(id: UUID): Game

  fun save(entity: Game): Game

  fun deleteById(id: UUID)

}
