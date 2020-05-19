package es.vicboma1.micronaut.hi.service

import es.vicboma1.micronaut.hi.model.HiModel
import io.reactivex.Single
import javax.inject.Singleton

@Singleton
class HiService {
    fun hi(name: String) =  Single.create<HiModel> {
        it.onSuccess(HiModel("Hi $name"))
    }
}
