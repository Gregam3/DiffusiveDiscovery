package dev.gregmitten.model.dto

class Prompt(
    val promptComponents: List<String>
) {
    constructor(prompt: String) : this(prompt.split(","))
}