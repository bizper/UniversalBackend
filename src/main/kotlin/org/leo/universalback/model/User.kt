package org.leo.universalback.model

import java.util.*

data class User (
    val id: Int,
    val username: String,
    val password: String,
    val role: Int,
    val level: Int,
    val loginDate: Date,
    val createDate: Date
) : Modelbase {

    constructor(username: String, password: String) : this(-1, username, password, 0, 0, Date(), Date())

    override fun getTable(): String {
        return "Users"
    }

}
