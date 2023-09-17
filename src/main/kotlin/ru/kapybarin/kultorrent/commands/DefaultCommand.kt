package ru.kapybarin.kultorrent.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.help
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file

abstract class DefaultCommand(name: String? = null, help: String): CliktCommand(name = name, help = help) {
    val file by option().file(mustBeReadable = true, mustExist = true).help("Specify a torrent file")
    val magnet by option().help("Specify a magnet link")

    override fun run() {
        echo("executing")
    }
}