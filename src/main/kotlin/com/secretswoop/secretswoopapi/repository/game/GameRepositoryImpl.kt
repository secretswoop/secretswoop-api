package com.secretswoop.secretswoopapi.repository.game

import com.secretswoop.secretswoopapi.service.game.Game
import org.springframework.stereotype.Repository
import java.util.*
import java.util.concurrent.ConcurrentHashMap

@Repository
class GameRepositoryImpl : GameRepository {

  val storage = ConcurrentHashMap<UUID, Game>()

  override fun findAll(): List<Game> {
    return storage.values.toList()
  }

  override fun findById(id: UUID): Game {
    return storage.getValue(id)
  }

  override fun save(entity: Game): Game {
    storage.putIfAbsent(entity.id, entity)
    return entity
  }

  override fun deleteById(id: UUID) {
    storage.remove(id) ?: throw NoSuchElementException()
  }
}
