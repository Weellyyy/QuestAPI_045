package com.example.questapi_045.viewmodel

import com.example.questapi_045.modeldata.DataSiswa

sealed interface StatusUIDetail{
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}