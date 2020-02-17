import java.util.*

class Controller () {
    val pil = mutableListOf<String>("gunting","batu","kertas")
    var hasil = ""

    fun pilihansatu(listener: CallBack) {
        println("1. Masukkan Pemain 1 : ")
        var playerSatu = readLine()!!.toLowerCase()
        println("2. Masukkan Pemain 2 : ")
        var playerDua = readLine()!!.toLowerCase()
        println("Hasil : ")

        if (playerSatu == "gunting" && playerDua == "kertas" || playerSatu == "batu" && playerDua == "gunting" || playerSatu == "kertas" && playerDua == "batu") {
            hasil = "Player Satu Menang"
        } else if (playerSatu == "kertas" && playerDua == "gunting" || playerSatu == "gunting" && playerDua == "batu" || playerSatu == "batu" && playerDua == "kertas") {
            hasil = "Player Satu Kalah"
        } else if (playerSatu == "kertas" && playerDua == "kertas" || playerSatu == "gunting" && playerDua == "gunting" || playerSatu == "batu" && playerDua == "batu") {
            hasil = "Permainan Seri"
        } else {
            hasil = "Input Salah"
        }
        listener.kirimBalik(hasil)
    }
    fun pilihandua(listener: CallBack) {
        println("1. Masukkan Pemain 1 : ")
        var playerSatu = readLine()!!.toLowerCase()
        var computer = pil.random()
        println("Computer Menggunakan : $computer")

        if (playerSatu == "gunting" && computer == "kertas" || playerSatu == "batu" && computer == "gunting" || playerSatu == "kertas" && computer == "batu") {
            hasil = "Player Satu Menang"
        } else if (playerSatu == "kertas" && computer == "gunting" || playerSatu == "gunting" && computer == "batu" || playerSatu == "batu" && computer == "kertas") {
            hasil ="Player Satu Kalah"
        } else if (playerSatu == "kertas" && computer == "kertas" || playerSatu == "gunting" && computer == "gunting" || playerSatu == "batu" && computer == "batu") {
            hasil = "Permainan Seri"
        } else {
            hasil = "Input Salah"
        }
        listener.kirimBalik(hasil)
    }
}