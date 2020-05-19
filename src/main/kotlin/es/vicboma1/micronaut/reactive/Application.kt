package es.vicboma1.micronaut.reactive

import io.micronaut.runtime.Micronaut

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                 .packages("es.vicboma1.micronaut.reactive")
                 .mainClass(Application.javaClass)
                 .start()
    }
}


