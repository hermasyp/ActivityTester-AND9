package com.catnip.activitytester.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
@Parcelize
data class Student(
    var id : Int,
    var name : String,
    var className : String,
) : Parcelable
