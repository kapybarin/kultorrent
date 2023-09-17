package ru.kapybarin.kultorrent.commands

class Info: DefaultCommand(help = "Print information about torrent") {
    override fun run() {
        echo("executing")
    }
}