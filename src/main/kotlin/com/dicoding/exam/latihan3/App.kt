/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan3

import com.dicoding.exam.latihan2.result

/**
 *  TODO
 *  Lengkapi fungsi di bawah ini agar dapat mengembalikkan tipe nilai sesuai dengan
 *  parameter yang dilampirkan. Contohnya seperti berikut:
 *
 *  input: checkType(10)
 *  output: "Yes! it's Integer"
 *
 *  Berikut adalah beberapa tipe nilai yang wajib ada.
 *  • Integer
 *  • String
 *  • Boolean
 *  • Double
 *  • List<String>
 *  • Map<String, String>
 *
 */
// DONE
//fun <T> checkType(args: T) {
//    //mengecek tipe data String
//    //jika argumennya adalah string
//    when (args){
//        is String -> println("Ini adalah string")
//    }
//}

fun <T> checkType(args: T): String{
    //mengecek tipe data
    when (args){
        is String -> return "Yes! it's String"
        is Boolean -> return "Yes! it's Boolean"
        is Double -> return "Yes! it's Double"
        is List<*> -> return "Yes! it's List"
        is Map<*, *> -> return "Yes! it's Map"
        is Int -> return "Yes! it's Integer"
    }
    return ""

}

fun main() {
    //agar semua bisa tepanggil, dibutuhkan fungsi generic
    println(
        """
        '[10, 9, 8 , 6]' is List? ${checkType(listOf(10, 9, 8, 6))}
        'Dicoding Indonesia' is String? ${checkType("Dicoding Indonesia")}
        'True' is Boolean? ${checkType(true)}
        '10.01' is Double? ${checkType(10.01)}
    """.trimIndent()
    )
}
