package com.giphy.gift.domain.api.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("rating")
    var rating: String?,

    @SerializedName("images")
    var images: Images,

    @SerializedName("user")
    var user: User
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        TODO("images"),
        TODO("user")
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Data> {
        override fun createFromParcel(parcel: Parcel): Data {
            return Data(parcel)
        }

        override fun newArray(size: Int): Array<Data?> {
            return arrayOfNulls(size)
        }
    }
}