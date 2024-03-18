package io.test.coroutine

import jakarta.inject.Singleton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Singleton
class ServiceTest {
    suspend fun test(body: String) {
        withContext(Dispatchers.IO) {
                throw RuntimeException("ServiceTest.test: $body")
        }
    }
}