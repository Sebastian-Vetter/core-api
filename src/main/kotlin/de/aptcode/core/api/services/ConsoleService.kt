package de.aptcode.core.api.services

import org.jline.reader.Parser
import org.jline.terminal.TerminalBuilder

interface ConsoleService {

    val terminal: TerminalBuilder
    val parser: Parser

    fun bootingScreen()
    fun setupScreen()
    fun screen();

}