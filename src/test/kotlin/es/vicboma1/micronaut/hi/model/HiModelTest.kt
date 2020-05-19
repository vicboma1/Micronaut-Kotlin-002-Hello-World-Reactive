package es.vicboma1.micronaut

import es.vicboma1.micronaut.hi.model.HiModel
import es.vicboma1.micronaut.hi.service.HiService
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
