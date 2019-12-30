package com.iav.ipb.data

object KuisData {

    var kuisSoal: ArrayList<String> = mutableListOf<String>(
            "Apakah ibu pernah melakukan pemeriksaan kehamilan di tempat pelayanan kesehatan ?",
            "Apakah umur ibu kurang dari 20 tahun atau lebih dari 35 tahun ?",
            "Apakah jumlah anak lebih dari 4 orang?",
            "Apakah jarak kelahiran anak kurang dari 2 tahun?",
            "Berapa tekanan darah ibu saat ini ?",
            "Berapa ukuran lingkar lengan (LILA) ibu saat ini ?",
            "Berapa kadar hemoglobin (Hb) ibu saat ini ?",
            "Apakah ibu mempunyai riwayat diabetes mellitus pada keluarga atau pada diri sendiri ?",
            "Apakah air yang ibu gunakan sehari-hari berbau/ berwarna/keruh ?",
            "Apakah di sekitar sumber air terdapat sumber pencemaran (air limbah/tangki septik/sampah) dengan jarak  ≤ 10 m ?",
            "Apakah saluran air limbah/tangki septik/sampah menimbulkan aroma tidak sedap ?",
            "Apakah ibu mempunyai saluran pembuangan air limbah (SPAL) yang baik (tidak menimbulkan genangan air menjadi sarang serangga/nyamuk, tidak menimbulkan bau, tidak mencemari sumber air bersih) ?",
            "Apakah jamban (tempat pembuangan  air besar) dilengkapi dengan dengan septic tank ?"
    ) as ArrayList<String>

    var pilihanJawabanSoal = mutableListOf(
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK", "Kehamilan Pertama"),
            mutableListOf("YA", "TIDAK", "Kehamilan Pertama"),
            mutableListOf("Kurang dari 140/90 mmHg", "Lebih dari 140/90 mmHg"),
            mutableListOf("Lebih dari 23,5 cm", "Kurang dari 23,5 cm"),
            mutableListOf("Normal 11,6 – 14,8 g/Dl ", "Kurang dari 11,6 g/dL", "Belum periksa hemoglobin"),
            mutableListOf("YA", "TIDAK", "Saat ini mengalami diabetes mellitus"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK")
    ) as ArrayList<ArrayList<String>>


    /* Kalo jawabannya bernilai YA isi deskripsinya dengan null,
    * agar tidak tampil pada bagian akhir
    *
    * */
    var deskripsiJawabanSoal = mutableListOf(
            mutableListOf(null, "TIDAK"),
            mutableListOf(null, "TIDAK"),
            mutableListOf(null, "TIDAK", "Kehamilan Pertama"),
            mutableListOf(null, "TIDAK", "Kehamilan Pertama"),
            mutableListOf(null, "Lebih dari 140/90 mmHg"),
            mutableListOf(null, "Kurang dari 23,5 cm"),
            mutableListOf(null, "Kurang dari 11,6 g/dL", "Belum periksa hemoglobin"),
            mutableListOf(null, "TIDAK", "Saat ini mengalami diabetes mellitus"),
            mutableListOf(null, "TIDAK"),
            mutableListOf(null, "TIDAK"),
            mutableListOf(null, "TIDAK"),
            mutableListOf(null, "TIDAK"),
            mutableListOf(null, "TIDAK")
    ) as ArrayList<ArrayList<String>>

    var kuisDeskripsi: ArrayList<String> = mutableListOf<String>(
            "Deskripsi 1",
            "Deskripsi 2",
            "Deskripsi 3",
            "Deskripsi 4",
            "Deskripsi 5",
            "Deskripsi 6",
            "Deskripsi 7",
            "Deskripsi 8",
            "Deskripsi 9",
            "Deskripsi 10",
            "Deskripsi 12",
            "Deskripsi 12",
            "Deskripsi 13"
    ) as ArrayList<String>

}