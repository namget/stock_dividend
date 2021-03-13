package com.namget.stock.know.ext

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by Namget on 2020.02.20.
 */
inline fun <reified T> Gson.fromJson(json: String): T = fromJson<T>(json, object: TypeToken<T>() {}.type)