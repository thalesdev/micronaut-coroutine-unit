package io.test.coroutine

import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post


data class TestDTO(
    val body: String
)

@Controller("/test")
class TestController(
    private val serviceTest: ServiceTest
) {
    @Post("/", produces = [APPLICATION_JSON])
    suspend fun test(
        @Body bodyDTO: TestDTO
    ) {
         serviceTest.test(bodyDTO.body)
    }
}