package ru.kapybarin.kultorrent.commands


class Edit: DefaultCommand(help = "Edit torrent") {
    override fun run() {
        echo("executing")
    }
}