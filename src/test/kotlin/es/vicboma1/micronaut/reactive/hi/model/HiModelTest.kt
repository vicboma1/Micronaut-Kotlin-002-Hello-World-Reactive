package es.vicboma1.micronaut.reactive

import es.vicboma1.micronaut.reactive.hi.model.HiModel
import es.vicboma1.micronaut.reactive.hi.service.HiService
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import javax.inject.Inject

class HiModelTest {

    @Test
    fun getKey() {
        val expected = "hi"
        val hiModel = HiModel("hi")
        assertEquals(expected, hiModel.key)
    }
}
