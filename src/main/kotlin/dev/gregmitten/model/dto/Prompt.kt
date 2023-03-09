package dev.gregmitten.model.dto

class Prompt(
    private val promptComponents: List<String>
) {
    constructor(prompt: String) : this(prompt.split(","))

    override fun toString(): String {
        return promptComponents.joinToString(",")
    }
}