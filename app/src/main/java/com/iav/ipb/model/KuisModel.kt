package com.iav.ipb.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KuisModel(
        var soal: String = "",
        var deskripsi: String = "",
        var visibility: Boolean = false
) : Parcelable