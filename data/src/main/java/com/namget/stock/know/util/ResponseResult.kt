package com.namget.stock.know.util

sealed class ResponseResult<out T : Any>{
    data class Success<out T : Any>(val output : T) : ResponseResult<T>()
    data class Failure(val exception: Exception) : ResponseResult<Nothing>()
}


