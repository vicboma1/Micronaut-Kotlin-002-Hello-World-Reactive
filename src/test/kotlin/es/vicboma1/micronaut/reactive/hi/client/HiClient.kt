package es.vicboma1.micronaut.reactive.hi.client

import es.vicboma1.micronaut.reactive.hi.controller.IHiController
import es.vicboma1.micronaut.reactive.hi.model.HiModel
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

import javax.validation.constraints.NotBlank

@Client("/")
interface HiClient : IHiController {
    @Get("/hi/{name}")
    override fun hi(@NotBlank name: String): Single<HiModel>
}
