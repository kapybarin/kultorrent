package ru.kapybarin.kultorrent

fun main(args: Array<String>) {
    println("Hello, world!")
    println("args:")
    for (i in args.indices) {
        print("arg[${i}]=${args.get(i)}")
    }

}