package es.vicboma1.micronaut.reactive

import es.vicboma1.micronaut.reactive.hi.client.HiClient
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject
import javax.validation.ConstraintViolationException


@MicronautTest
class HiControllerClientTest {

    @Inject
    lateinit var hiclient: HiClient

    @Test
    fun testHiControllerClient() {
        val expected  = "HiModel(key=Hi vicboma1)"
        var result = hiclient
                .hi("vicboma1")
                .blockingGet()
                .toString()

        assertEquals(expected, result)
    }

    @Test()
    fun testHiControllerClientNotBlank() {
        Assertions.assertThrows(ConstraintViolationException::class.java) {
            hiclient
                    .hi("")
                    .toString()
        }
    }
}


