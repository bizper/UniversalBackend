package org.leo.universalback.model

import com.fasterxml.jackson.annotation.JsonIgnore

data class Token (
    val id: Int,
    val userId: Int,
    val token: String,
    val expirationDate: Long
) : Modelbase {

    override fun getTable(): String {
        return "Tokens"
    }

}
