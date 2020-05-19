package es.vicboma1.micronaut

import io.micronaut.runtime.Micronaut

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                 .packages("es.vicboma1.micronaut")
                 .mainClass(Application.javaClass)
                 .start()
    }
}


