fun createNote() {
    scanner.nextLine()
    println("Введите название новой заметки:")
    val noteName = scanner.nextLine()
    println("Введите текст новой заметки:")
    val noteText = scanner.nextLine()
    archives[archiveName]!![noteName] = noteText
    println("Создана заметка: $noteName\n")
}
fun showNote(input: Int) {
    while (true) {
        val noteText = archives[archiveName]!![archives[archiveName]!!.keys.elementAt(input - 1)]
        println("Текст заметки:\n$noteText \nВведите любой символ для возврата")
        scanner.next()
        break
    }
}