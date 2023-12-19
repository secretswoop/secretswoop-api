package com.secretswoop.secretswoopapi.api.common

import org.springframework.http.ResponseEntity

interface ModifyingController<CREATE_DTO, RESPONSE_DTO> {

  fun create(payload: CREATE_DTO): ResponseEntity<RESPONSE_DTO>

}
