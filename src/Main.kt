class Main {
    companion object : CallBack {
        @JvmStatic
        fun main(args : Array<String>) {
            //         var lanjut = listOf<String>("y","n")
            do {
                var menu = Menu()
                menu.menuUtama()

                println("Main Lagi? (X/Y)")
                var inlanjut = readLine()!!.toLowerCase()
            } while (inlanjut == "y")
        }

        override fun kirimBalik(hasil: String) {
            kirimBalik(hasil)
        }
    }
}