package ru.kapybarin.kultorrent.commands

class Download: DefaultCommand(help = "Download torrent") {
    override fun run() {
        echo("executing")
    }
}