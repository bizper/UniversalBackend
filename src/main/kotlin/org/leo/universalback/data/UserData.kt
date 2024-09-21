package org.leo.universalback.data

import org.leo.universalback.model.User
import org.springframework.stereotype.Repository

@Repository
class UserData : FundamentalDatabase<User>() {

    val user = User("admin", "123456")

    override fun getOne(id: Int): User {
        return user
    }

}