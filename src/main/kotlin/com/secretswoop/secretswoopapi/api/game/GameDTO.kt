package com.secretswoop.secretswoopapi.api.game

import java.util.*

data class CreateGameRequestDTO(val name: String)

data class GameResponseDTO(val id: UUID, val name: String)
