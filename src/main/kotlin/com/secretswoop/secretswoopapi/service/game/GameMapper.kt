package com.secretswoop.secretswoopapi.service.game

import com.secretswoop.secretswoopapi.api.game.CreateGameRequestDTO
import com.secretswoop.secretswoopapi.api.game.GameResponseDTO
import org.mapstruct.Mapper
import java.util.*

@Mapper
interface GameMapper {

  fun toModel(id: UUID, createRequest: CreateGameRequestDTO): Game

  fun toResponseDTO(model: Game): GameResponseDTO

}
