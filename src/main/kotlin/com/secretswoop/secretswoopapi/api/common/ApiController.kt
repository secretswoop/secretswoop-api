package com.secretswoop.secretswoopapi.api.common

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

interface ApiController<ID, DTO> {

  fun getById(id: ID): ResponseEntity<DTO>

  fun getAll(): ResponseEntity<List<DTO>>

  fun delete(id: ID): ResponseEntity<Void>

  fun <T> created(body: T): ResponseEntity<T> =
    ResponseEntity.status(HttpStatus.CREATED)
      .body(body)

  fun noContent(): ResponseEntity<Void> =
    ResponseEntity.noContent()
      .build()

}
