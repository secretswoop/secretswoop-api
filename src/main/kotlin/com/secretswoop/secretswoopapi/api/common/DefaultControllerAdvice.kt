package com.secretswoop.secretswoopapi.api.common

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class DefaultControllerAdvice {

  @ExceptionHandler(NoSuchElementException::class)
  fun handleNoSuchElementException(exception: NoSuchElementException): ResponseEntity<ErrorResponseDTO> {
    val response = ErrorResponseDTO(
      message = "Resource not found",
      details = exception.message
    )

    return ResponseEntity.status(HttpStatus.NOT_FOUND)
      .body(response)
  }

}
