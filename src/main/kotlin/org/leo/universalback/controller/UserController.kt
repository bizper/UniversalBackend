package org.leo.universalback.controller

import org.leo.universalback.model.User
import org.leo.universalback.service.UserService
import org.leo.universalback.v.CONSTANT.API_VERSION
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("$API_VERSION/user")
class UserController(
    @Autowired val userService: UserService
) {

    @RequestMapping("/all")
    fun getUsers(): List<User> {
        TODO()
    }

    @RequestMapping("/getOne", method = [(RequestMethod.POST)])
    fun getUser(id: Int): User {
        return userService.getSingleUserById(id)
    }

    @RequestMapping("/create")
    fun add(): User {
        TODO()
    }

}