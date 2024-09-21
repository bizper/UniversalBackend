package org.leo.universalback.data

import org.leo.universalback.model.Modelbase


interface Database<T : Modelbase> {

    fun getOne(id: Int): T

    fun getList(): List<T>

    fun save(model: T)

    fun delete(model: T)

    fun update(model: T)

}