package es.vicboma1.micronaut

import io.micronaut.context.ApplicationContext.run
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.HttpClient.create
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject


@MicronautTest
class HiControllerTest {

    @Test
    fun testHiEmbeddedServer() {
        val expected  = "{\"key\":\"Hi vicboma1\"}"
        var embeddedServer = run(EmbeddedServer::class.java)
        var client: HttpClient = create(embeddedServer.url)
        var result: String = client.toBlocking().retrieve("/hi/vicboma1")

        assertEquals(expected, result)
    }
}


