package org.leo.universalback.service

import org.leo.universalback.data.UserData
import org.leo.universalback.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired val userData: UserData) {

    fun getUserByPass(username: String, password: String): User {
        return userData.user
    }

    fun getSingleUserById(id: Int): User {
        return userData.getOne(id)
    }

}