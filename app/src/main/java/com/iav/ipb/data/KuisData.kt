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
            "Apakah saluran air limbah/tangki septik/sampah menimbulkan aroma tidak sedap ?"
    ) as ArrayList<String>

    var pilihanJawabanSoal = mutableListOf(
            mutableListOf("YA", "TIDAK"),
            mutableListOf("< 20 tahun", "> 20 tahun dan < 35 tahun", "> 35 tahun"),
            mutableListOf("YA", "TIDAK", "Kehamilan Pertama"),
            mutableListOf("YA", "TIDAK", "Kehamilan Pertama"),
            mutableListOf("Kurang dari 140/90 mmHg", "140/90 mmHg atau lebih"),
            mutableListOf("Lebih dari 23,5 cm", "Kurang dari 23,5 cm"),
            mutableListOf("Normal 11 – 14,8 g/Dl ", "Kurang dari 11 g/dL", "Belum periksa hemoglobin"),
            mutableListOf("YA", "TIDAK", "Saat ini mengalami diabetes mellitus"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK")
    ) as ArrayList<ArrayList<String>>


    var titleDeskripsiJawabanSoal = mutableListOf(
            mutableListOf(null, "Karena ibu belum pernah melakukan pemerksaan ditempat pelayanan kesehatan"),
            mutableListOf("Karena usia kurang dari 20 tahun atau lebih dari 35 tahun termasuk resiko tinggi pada kehamilan.", null, "Karena ibu belum pernah melakukan pemerksaan ditempat pelayanan kesehatan"),
            mutableListOf("Karena melahirkan anak terlalu banyak atau lebih dari 4 orang termasuk resiko tinggi pada kehamilan.", null, null),
            mutableListOf("Karena jarak antara kehamilan sekarang dan sebelumnya kurang dari 2 tahun (24 bulan) termasuk resiko tinggi kehamilan.", null, null),
            mutableListOf(null, "Karena bisa mengalami hipertensi atau preeklamsa jika usia kehamilan sudah mencapai diatas 20 minggu"),
            mutableListOf(null, "Karena ukuran ukuran lingkar lengan (LILA) ibu saat ini kurang dari 23,5 cm. Artinya ibu mengalami kekurangan energi kronik (KEK) Perbaikan gizi"),
            mutableListOf(null, "Karena kadar hemoglobin (Hb) ibu saat ini kurang dari 11 g/dL artinya ibu mengalami anemia.", "Karena belum memerksaan hemoglobin"),
            mutableListOf("Karena ibu mempunyai riwayat diabetes mellitus", null, "Karena saat ini mengalami diabetes mellitus"),
            mutableListOf("Air yang  digunakan sehari-hari berbau/berwarna/ keruh bisa mepengaruhi kesehatan.", null),
            mutableListOf("Saluran air limbah/tangki septik/sampah menimbulkan aroma tidak sedap akan menurunkan derajat kesehatan.", null)
    ) as ArrayList<ArrayList<String>>

    /* Kalo jawabannya bernilai YA isi deskripsinya dengan null,
    * agar tidak tampil pada bagian akhir
    *
    * */
    var deskripsiJawabanSoal = mutableListOf(
            mutableListOf(
                    null,
                    mutableListOf(
                            "Ibu harus melakukan pemeriksaan kehamilan ke dokter/bidan atau tenaga kesehatan lainnya yang berkompeten yang bertujuan untuk",
                            "*Mendeteksi dan menatalaksana komplikasi-komplikasi yang dapat mengancam jiwa ibu hamil dan janinnya.",
                            "*Memberikan edukasi pendidikan kepada ibu hamil seputar masalah gizi, persiapan persalinan dan kemungkinan terjadinya komplikasi.",
                            "*Mempersiapkan kelahiran.",
                            "",
                            "Pemeriksaan kehamilan dalam Antenatal Care (ANC) harus memenuhi frekuensi  yaitu minimal 4 kali selama masa kehamilan.",
                            "*Trimester I (usia kehamilan 0-12 minggu) -> minimal 1 kali.",
                            "*Trimester II (usia kehamilan 12-24 minggu) -> minimal 1 kali.",
                            "*Trimester III (usia kehamilan 24 minggu sampai persalinan) -> minimal 2 kali."
                    )),
            mutableListOf(
                    mutableListOf(
                            "*Rajin menjaga kebugaran (olahraga)",
                            "*Rutin melakukan pemeriksaan kehamilan dengan dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten.",
                            "*Rutin berkonsultasi kepada dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten mengenai asupan gizi yang perlu bagi kesehatan kehamilan."
                    ),
                    null,
                    mutableListOf(
                            "*Rajin menjaga kebugaran (olahraga)",
                            "*Rutin melakukan pemeriksaan kehamilan dengan dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten.",
                            "*Rutin berkonsultasi kepada dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten mengenai asupan gizi yang perlu bagi kesehatan kehamilan."
                    )),
            mutableListOf(
                    mutableListOf("*Konsultasi dengan bidan atau dokter."),
                    null,
                    null),
            mutableListOf(
                    mutableListOf("*Rutin melakukan pemeriksaan kehamilan dengan dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten untuk mendeteksi risiko kehamilan serta mengatasinya."),
                    null,
                    null
            ),
            mutableListOf(null,
                    mutableListOf(
                            "*Tirah baring",
                            "*Memeriksakan kehamilan secara rutin",
                            "*Melakukan Diet",
                            "*Istirahat yang cukup",
                            "Apabila terjadi gejala tersebut maka ibu perlu untuk segera memeriksakan diri ke dokter."
                    )),
            mutableListOf(null,
                    mutableListOf(
                            "*Rutin meminum tablet tambah darah (Fe) tiap hari selama masa kehamilan",
                            "*Meningkatkan konsumsi makanan bergizi diantaranya:\n" +
                                    "   - Bahan makanan hewani : daging, ikan, ayam, hati dan telur\n" +
                                    "   - Bahan makanan nabati: sayuran berwarna hijau tua, kacang-kacangan, tempe, dan buah-buahan."
                    )),
            mutableListOf(null,
                    mutableListOf(
                            "*Rutin meminum tablet tambah darah (Fe) selama masa kehamilan",
                            "*Meningkatkan konsumsi makanan bergizi diantaranya:\n" +
                                    "   - Bahan makanan hewani : daging, ikan, ayam, hati dan telur\\n\" +\n" +
                                    "   - Bahan makanan nabati: sayuran berwarna hijau tua, kacang-kacangan, tempe, dan buah-buahan. \""),
                    mutableListOf("Segera memeriksakan kadar hemoglobin ke tempat pelayanan kesehatan")),
            mutableListOf(
                    mutableListOf(
                            "*Segera memeriksakan gula darah ke tempat pelayanan kesehatan.",
                            "*Rutin melakukan pemeriksaan kehamilan ke tempat pelayanan kesehatan."),
                    null,
                    mutableListOf(
                            "*Mengontrol mengkonsumsi makanan yang mengandung karbohidrat, lemak (kalori tinggi) dan makanan yang manis-manis.",
                            "*Memperbanyak konsumsi buah-buahan, sayuran, dan kacang-kacangan",
                            "*Berolahraga secara teratur, seperti senam hamil, renang, dan jalan kaki.",
                            "*Rutin melakukan pemeriksaan kehamilan ke tempat pelayanan kesehatan")),
            mutableListOf(
                    mutableListOf(
                            "* Penyaringan (filtrasi).",
                            "* Sendimentasi (pengendapan).",
                            "* Bisa dengan menggunakan mesin penjernih air.",
                            "* Tidak membuang sampah ke sungai.",
                            "* Membuang sampah pada tempatnya."
                    ),
                    null),
            mutableListOf(
                    mutableListOf(
                            "*Pastikan konstrusi saluran pembungan air limbah (saluran pembuangan air cuci piring, air cucian, dan lan-lan) tidak rusak (baik) dan kedap air.",
                            "*Pastikan tidak ada genangan air disekitar rumah yang menjadi sarang serangga atau nyamuk dan menimbulkan bau tidak sedap.",
                            "*Pastikan disekitar jamban bersih, bebas dari serangga, tikus, lalat, kecoa dan binatang lainnya.",
                            "*Pastikan konstruksi septik tank tidak rusak atau memiliki cela sehingga menimbulkan aroma tidak sedap.",
                            "*Pastikan tempat sampah mempunyai penutup, mudah dibuka, dikosongkan isinya serta dibersihkan tiap saat."
                    ),
                    null)
    ) as ArrayList<ArrayList<ArrayList<String>>>

}