package org.leo.universalback.service

import org.leo.universalback.model.*
import org.leo.universalback.utils.UniversalTools
import org.springframework.stereotype.Service

@Service
class TokenService {

    fun genToken(user: User): Token {
        return Token(-1, user.id, UniversalTools.getUUID(), System.currentTimeMillis() + (1000 * 60 * 60 * 24))
    }

}