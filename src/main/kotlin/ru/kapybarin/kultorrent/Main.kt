package ru.kapybarin.kultorrent

import com.github.ajalt.clikt.core.subcommands
import ru.kapybarin.kultorrent.commands.*

fun main(args: Array<String>) {
    Main().subcommands(Info(), Download(), Create(), Edit()).main(args)
}