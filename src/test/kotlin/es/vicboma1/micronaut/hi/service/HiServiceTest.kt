package es.vicboma1.micronaut

import es.vicboma1.micronaut.hi.service.HiService
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import javax.inject.Inject

@MicronautTest
class HiServiceTest {

    @Inject
    lateinit var hiService: HiService

    @Test
    fun testHiControllerClient() {
        val expected = "Hi vicboma1"
        var result = hiService.hi("vicboma1").blockingGet().key

        assertEquals(expected, result)
    }
}
