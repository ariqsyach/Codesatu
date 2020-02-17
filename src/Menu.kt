class Menu :CallBack {
    // var hasil : String
    var input = 0
    fun menuUtama() {
        println("              WELCOME!              ")
        println("====================================")
        println("         GAME SUIT TERMINAL         ")
        println("====================================")

        println("Pilihan : ")
        println("1.Versus Player")
        println("2.Versus CPU")
        println("3.Exit")
        print("Masukkan Pilihan : ")
        input = readLine()!!.toInt()
        when (input) {
            1 -> {
                var controller = Controller()
                controller.pilihansatu(this)
            }


            2 -> {
                var controller = Controller()
                controller.pilihandua(this)
            }

            3 -> {
                System.exit(0)
            }
        }
    }

    override fun kirimBalik(hasil: String) {
        println(hasil)
    }

}