package es.vicboma1.micronaut.reactive.hi.controller

import es.vicboma1.micronaut.reactive.hi.model.HiModel
import es.vicboma1.micronaut.reactive.hi.service.HiService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import javax.validation.constraints.NotBlank
import io.micronaut.validation.Validated
import io.reactivex.Single


@Controller("/")
class HiController(val hiService : HiService) : IHiController {

    @Get("/hi/{name}")
    override fun hi(@NotBlank name: String) = hiService.hi(name)
}
