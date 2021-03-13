package com.namget.stock.know.util

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend inline fun <T : Any> safeApiCall(
    crossinline body: suspend () -> T
): ResponseResult<T> {
    return try {
        val users = withContext(Dispatchers.IO) {
            body()
        }
        ResponseResult.Success(users)
    } catch (e: Exception) {
        ResponseResult.Failure(e)
    }
}