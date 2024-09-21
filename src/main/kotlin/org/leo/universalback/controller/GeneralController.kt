package org.leo.universalback.controller

import org.leo.universalback.model.Token
import org.leo.universalback.service.TokenService
import org.leo.universalback.service.UserService
import org.leo.universalback.v.CONSTANT.API_VERSION
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("$API_VERSION/general")
class GeneralController(
    private val tokenService: TokenService,
    private val userService: UserService
) {

    @RequestMapping("/login", method = [RequestMethod.POST])
    fun login(username: String, password: String): Token {
        val user = userService.getUserByPass(username, password)
        return tokenService.genToken(user)
    }

}