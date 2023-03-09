package dev.gregmitten.controller

import dev.gregmitten.api.ImageGenerationApi
import dev.gregmitten.api.Txt2ImageRequest
import dev.gregmitten.model.dto.Prompt
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/generate/")
class ImageGenerationController {
    @GetMapping("/txt2img") fun txt2Image() =
        ImageGenerationApi.txt2img(Txt2ImageRequest(Prompt("Hello, world!")))
}