object nquest extends App {

// Initializing values
    val val_a = 'a'.toInt
    val frstSimp = 78
    val scndSimp = 104
    val val_z = 'z'.toInt
    val val_A = 'A'.toInt
    val frstCapt = 52
    val scndCapt = 78
    val val_Z = 'Z'.toInt
    val alph = 26
    val val_amod = val_a % alph
    val val_Amod = val_A % alph

// Code for Encrypting and Decrypting
    def ceaser_code(value:Int, ind:Int):Int = {

        if (value >= val_a && value <= val_z) {
            val upd_value = (value - ind) % alph
            if (upd_value >= val_amod) { return upd_value + frstSimp } else { return upd_value + scndSimp } 

        } else if (value >= val_A && value <= val_Z) {
            val upd_value = (value - ind) % alph
            if (upd_value >= val_Amod) { return upd_value + frstCapt } else { return upd_value + scndCapt }
            
        } else { return value }
    }

// Encode Function
    def encode(text: String, ciper_ind: Int): Unit = {
        text.foreach { char => print(ceaser_code(char.toInt, ciper_ind).toChar) }
    }

// Decode Function
    def decode(text: String, ciper_ind: Int): Unit = {
        text.foreach { char => print(ceaser_code(char.toInt, (ciper_ind)*(-1)).toChar)  }
    }

// Start Operation Function
    def doOpt(ciper_index:Int, operation: (String, Int) => Unit): Unit = {
        print("Text: ")
        val get_text = scala.io.StdIn.readLine()
        operation(get_text, ciper_index)
    }


    print("(e)Encode or (d)Decode\nChoose: ")
    val choice = scala.io.StdIn.readChar()

    print("Ciper Index: ")
    val index = scala.io.StdIn.readInt()
    
    if (choice=='e') {doOpt(index, encode)}
    else if (choice=='d') {doOpt(index, decode)}
    else print("Wrong Choice")

}