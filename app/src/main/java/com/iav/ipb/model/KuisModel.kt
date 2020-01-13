package com.iav.ipb.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KuisModel(
        var soal: String = "",
        var judul: String? = "",
        var deskripsi: ArrayList<String>? = ArrayList(),
        var visibility: Boolean = false
) : Parcelable