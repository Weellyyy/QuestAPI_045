package com.example.questapi_045.viewmodel.provider

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id : Int,
    val nama : String,
    val alamat : String,
    val telpon : String
)

data class UIStateSiswa(
    val detailSIswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

data class DetailSiswa(
    val id : Int = 0,
    val nama : String = "",
    val alamat : String = "",
    val telpon : String = ""
)
fun DetailSiswa.toDataSiswa() : DataSIswa = DataSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)

