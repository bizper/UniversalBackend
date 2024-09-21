package org.leo.universalback.data

import org.leo.universalback.model.Modelbase

open class FundamentalDatabase<T : Modelbase> : Database<T> {



    override fun getOne(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getList(): List<T> {
        TODO("Not yet implemented")
    }

    override fun update(model: T) {
        TODO("Not yet implemented")
    }

    override fun delete(model: T) {
        TODO("Not yet implemented")
    }

    override fun save(model: T) {
        TODO("Not yet implemented")
    }


}