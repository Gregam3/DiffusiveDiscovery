package dev.gregmitten.api

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.extensions.jsonBody
import com.google.gson.Gson

object ImageGenerationApi {
    fun txt2img(request: Txt2ImageRequest) = Fuel.post("http://localhost:7860/sdapi/v1/txt2img")
        .jsonBody(body = Gson().toJson(request.makeFullRequest()))
        .responseString()
}