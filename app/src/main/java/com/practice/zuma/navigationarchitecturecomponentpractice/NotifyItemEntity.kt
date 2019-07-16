package com.practice.zuma.navigationarchitecturecomponentpractice

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class NotifyItemEntity(var title: String = "", var body: String = "", var notifyDate: String = "") : Parcelable