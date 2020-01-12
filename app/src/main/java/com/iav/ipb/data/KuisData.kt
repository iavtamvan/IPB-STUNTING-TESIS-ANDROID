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
//            "Apakah di sekitar sumber air terdapat sumber pencemaran (air limbah/tangki septik/sampah) dengan jarak  ≤ 10 m ?",
            "Apakah saluran air limbah/tangki septik/sampah menimbulkan aroma tidak sedap ?"
//            "Apakah ibu mempunyai saluran pembuangan air limbah (SPAL) yang baik (tidak menimbulkan genangan air menjadi sarang serangga/nyamuk, tidak menimbulkan bau, tidak mencemari sumber air bersih) ?",
//            "Apakah jamban (tempat pembuangan  air besar) dilengkapi dengan dengan septic tank ?"
    ) as ArrayList<String>

    var pilihanJawabanSoal = mutableListOf(
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK", "Kehamilan Pertama"),
            mutableListOf("YA", "TIDAK", "Kehamilan Pertama"),
            mutableListOf("Kurang dari 140/90 mmHg", "140/90 mmHg atau lebih"),
            mutableListOf("Lebih dari 23,5 cm", "Kurang dari 23,5 cm"),
            mutableListOf("Normal 11 – 14,8 g/Dl ", "Kurang dari 11 g/dL", "Belum periksa hemoglobin"),
            mutableListOf("YA", "TIDAK", "Saat ini mengalami diabetes mellitus"),
            mutableListOf("YA", "TIDAK"),
//            mutableListOf("YA", "TIDAK"),
            mutableListOf("YA", "TIDAK")
//            mutableListOf("YA", "TIDAK"),
//            mutableListOf("YA", "TIDAK")
    ) as ArrayList<ArrayList<String>>


    /* Kalo jawabannya bernilai YA isi deskripsinya dengan null,
    * agar tidak tampil pada bagian akhir
    *
    * */
    var deskripsiJawabanSoal = mutableListOf(
            mutableListOf(null,
                    "Karena ibu belum pernah melakukan pemerksaan ditempat pelayanan kesehatan\n\n" +
                    "Saran :\n" +
                    "    1. Ibu harus melakukan pemeriksaan kehamilan ke dokter/bidan atau tenaga kesehatan lainnya yang berkompeten yang bertujuan untuk :\n" +
                    "    • Mendeteksi dan menatalaksana komplikasi-komplikasi yang dapat mengancam jiwa ibu hamil dan janinnya.\n" +
                    "    • Mendapatkan pendidikan kesehatan seputar masalah gizi, persiapan persalinan dan kemungkinan terjadinya komplikasi.\n" +
                    "    • Mempersiapkan kelahiran.\n\n" +
                    "Pemeriksaan kehamilan dalam Antenatal Care (ANC) harus memenuhi frekuensi  yaitu minimal 4 kali selama masa kehamilan.\n" +
                    "    * Trimester I (usia kehamilan 0-12 minggu) minimal 1 kali. \n" +
                    "    * Trimester II (usia kehamilan 12-24 minggu) minimal 1 kali. \n" +
                    "    * Trimester III (usia kehamilan 24 minggu sampai persalinan) minimal 2 kali."),
            mutableListOf(null,
                    "Karena usia kurang dari 20 tahun atau lebih dari \n" +
                            "35 tahun termasuk resiko tinggi pada kehamilan.\\n\" +\n" +
                    "Saran :\n"+
                    "    1. Rajin menjaga kebugaran (olahraga)\\n\" +\n" +
                    "    2. Rutin melakukan pemeriksaan kehamilan dengan dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten.\\n\" +\n" +
                    "    3. Rutin berkonsultasi kepada dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten mengenai asupan gizi yang perlu bagi kesehatan kehamilan.\""),
            mutableListOf(null,
                    "Karena melahirkan anak terlalu banyak atau lebih dari 4 orang termasuk resiko tinggi pada kehamilan.\n\n" +
                    "Saran\n" +
                    "    1. Konsultasi dengan bidan atau dokter.",
                    "       Karena melahirkan anak terlalu banyak atau lebih dari 4 orang termasuk resiko tinggi pada kehamilan.\n\n" +
                    "Saran\n" +
                    "    1. Konsultasi dengan bidan atau dokter."),
            mutableListOf(null,
                    "Karena jarak antara kehamilan sekarang dan sebelumnya kurang dari 2 tahun (24 bulan) termasuk resiko tinggi kehamilan.\n\n" +
                    "Saran: \n" +
                    "    1. Rutin melakukan pemeriksaan kehamilan dengan dokter/ bidan atau tenaga kesehatan lainnya yang berkompeten untuk mendeteksi risiko kehamilan serta mengatasinya.", "Kehamilan Pertama"),
            mutableListOf(null,
                    "Karena bisa mengalami hipertensi atau preeklamsa jika usia kehamilan sudah mencapai diatas 20 minggu\n \n" +
                    "Saran:\n" +
                    "    1. Tirah baring\n" +
                    "    2. Memeriksakan kehamilan secara rutin\n" +
                    "    3. melakukan diet\n" +
                    "    4. Istirahat yang cukup\n\n" +
                    "Apabila terjadi gejala tersebut maka ibu perlu untuk segera memeriksakan diri ke dokter."),
            mutableListOf(null,
                    "Karena ukuran ukuran lingkar lengan (LILA) ibu saat ini kurang dari 23,5 cm. Artinya ibu mengalami kekurangan energi kronik (KEK).\n\n" +
                    "Saran:\n" +
                    "    1. Rutin meminum tablet tambah darah (Fe) tiap hari selama masa kehamilan\n" +
                    "    2. Meningkatkan konsumsi makanan bergizi diantaranya:\n" +
                    "       • Bahan makanan hewani : daging, ikan, ayam, hati dan telur\n" +
                    "       • Bahan makanan nabati: sayuran berwarna hijau tua, kacang-kacangan, tempe, dan buah-buahan. "),
            mutableListOf(null,
                    "Karena kadar hemoglobin (Hb) ibu saat ini kurang dari 11 g/dL artinya ibu mengalami anemia.\n\n" +
                    "Saran:\n" +
                    "    1. Rutin meminum tablet tambah darah (Fe) selama masa kehamilan\n" +
                    "    2. Meningkatkan konsumsi makanan bergizi diantaranya:\n" +
                    "       • Bahan makanan hewani : daging, ikan, ayam, hati dan telur\n" +
                    "       • Bahan makanan nabati: sayuran berwarna hijau tua, kacang-kacangan, tempe, dan buah-buahan. ",
                    "Karena belum memerksaan hemoglobin\n\n" +
                    "Saran :\n" +
                    "    Segera memeriksakan kadar hemoglobin ke tempat pelayanan kesehatan"),
            mutableListOf(
                    "Karena ibu mempunyai riwayat diabetes mellitus\n\n" +
                    "Saran :\n" +
                    "    1. segera memeriksakan gula darah ke tempat pelayanan kesehatan\n" +
                    "    2. rutin melakukan pemeriksaan kehamilan ke tempat pelayanan kesehatan",
                    null,
                    "Karena saat ini mengalami diabetes mellitus\n\n" +
                    "Saran :\n" +
                    "    1. mengontrol mengkonsumsi makanan yang mengandung karbohidrat, lemak (kalori tinggi) dan makanan yang manis-manis.\n" +
                    "    2. Memperbanyak konsumsi buah-buahan, sayuran, dan kacang-kacangan.\n" +
                    "    3. Berolahraga secara teratur, seperti senam hamil, renang, dan jalan kaki.\n" +
                    "    4. rutin melakukan pemeriksaan kehamilan ke tempat pelayanan kesehatan"),
            mutableListOf(
                    "Air yang  digunakan sehari-hari berbau/berwarna/ keruh bisa mepengaruhi kesehatan, maka untuk mendapatkan air yang layak untuk dipakai, bisa dilakukan dengan cara :\n\n" +
                    "    1. Penyaringan (filtrasi)\n" +
                    "    2. Sendimentasi (pengendapan)\n" +
                    "    3. Bisa dengan menggunakan mesin penjernih air\n" +
                    "    4. Tidak membuang sampah ke sungai \n" +
                    "    5. Membuang sampah pada tempatnya", null),
            mutableListOf(
                    "Saluran air limbah/tangki septik/sampah menimbulkan aroma tidak sedap akan menurunkan derajat kesehatan. Maka bisa di hindari dengan cara :\n\n" +
                    "    1. Pastikan konstrusi saluran pembungan air limbah (saluran pembuangan air cuci piring, air cucian, dan lan-lan) tidak rusak (baik) dan kedap air.\n" +
                    "    2. Pastikan tidak ada genangan air disekitar rumah yang menjadi sarang serangga atau nyamuk dan menimbulkan bau tidak sedap. \n" +
                    "    3. Pastikan disekitar jamban bersih, bebas dari serangga, tikus, lalat, kecoa dan binatang lainnya.\n" +
                    "    4. Pastikan konstruksi septik tank tidak rusak atau memiliki cela sehingga menimbulkan aroma tidak sedap.\n" +
                    "    5. Pastika tempat sampah mempunyai penutup, mudah dibuka, dikosongkan isinya serta dibersihkan tiap saat.", "TIDAK")
//            mutableListOf(null, "TIDAK"),
//            mutableListOf(null, "TIDAK"),
//            mutableListOf(null, "TIDAK")
    ) as ArrayList<ArrayList<String>>

}