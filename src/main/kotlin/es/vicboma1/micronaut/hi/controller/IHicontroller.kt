package es.vicboma1.micronaut.hi.controller

import es.vicboma1.micronaut.hi.model.HiModel
import io.micronaut.http.annotation.Get
import io.micronaut.validation.Validated
import io.reactivex.Single
import javax.validation.constraints.NotBlank

@Validated
interface IHiController {
    @Get("/hi/{name}")
    fun hi(@NotBlank name: String): Single<HiModel>
}
