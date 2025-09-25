package de.aptcode.core.api.services

interface CommandService {
    val name: String;
    val descriptor: String;
    fun execute(args: List<String>);

    // Gibt die möglichen Sub-Argumente für Tab-Completion zurück
    fun tabComplete(args: List<String>): List<String> = emptyList()
}