package org.leo.universalback.model

import com.fasterxml.jackson.annotation.JsonIgnore

interface Modelbase {

    @JsonIgnore
    fun getTable(): String

}