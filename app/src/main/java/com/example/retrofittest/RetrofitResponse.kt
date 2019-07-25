package com.example.retrofittest

import com.google.gson.annotations.SerializedName

class RetrofitResponse {

    @SerializedName("Version")
    var version: Int = 0
    @SerializedName("Data")
    var data: Data? = null

    class Data {
        @SerializedName("Korean")
        var korean: Korean? = null
        @SerializedName("English")
        var english: English? = null
        @SerializedName("Chinese")
        var chinese: Chinese? = null

        class Korean {
            @SerializedName("Link")
            var link: String? = null
            @SerializedName("Text")
            var text: String? = null
            @SerializedName("Origin")
            var origin: String? = null
            @SerializedName("Img")
            var img: String? = null
            @SerializedName("High")
            var high: String? = null
        }
        class English {
            @SerializedName("Link")
            var link: String? = null
        }
        class Chinese{
            @SerializedName("Link")
            var link: String? = null
        }
    }

/*    class Data {
        @SerializedName("Korean")
        var korean: Korean? = null

        class Korean {
            @SerializedName("Link")
            var link : String? = null
            @SerializedName("Text")
            var text : String? = null
            @SerializedName("Origin")
            var origin : String? = null
            @SerializedName("Img")
            var img : String? = null
            @SerializedName("High")
            var high  : String? = null
        }

    class Data {
        @SerializedName("English")
        var english: English? = null

        class English {
            @SerializedName("Link")
            var link : String? = null
            @SerializedName("Text")
            var text : String? = null
            @SerializedName("Origin")
            var origin : String? = null
            @SerializedName("Img")
            var img : String? = null
            @SerializedName("High")
            var high  : String? = null
        }
    }
   }*/

}
/*
class Data {
    @SerializedName("Korean")
    var korean: Info? = null
    @SerializedName("English")
    var english: Info? = null
    @SerializedName("Chinese")
    var chinese: Info? = null
    @SerializedName("ChineseTraditional")
    var chineseTraditional: Info? = null
    @SerializedName("Japanese")
    var japanese: Info? = null
    @SerializedName("Russian")
    var russian: Info? = null
    @SerializedName("French")
    var french: Info? = null
    @SerializedName("Spanish")
    var spanish: Info? = null
    @SerializedName("Hindi")
    var hindi: Info? = null
    @SerializedName("Mongolia")
    var mongolia: Info? = null
    @SerializedName("Polish")
    var polish: Info? = null
    @SerializedName("Turkish")
    var turkish: Info? = null
    @SerializedName("Nepali")
    var nepali: Info? = null
    @SerializedName("Indonesia")
    var indonesia: Info? = null
    @SerializedName("Thai")
    var thai: Info? = null
    @SerializedName("Cambodian")
    var cambodian: Info? = null
    @SerializedName("Filipino")
    var filipino: Info? = null
    @SerializedName("Vietnamese")
    var vietnamese: Info? = null
    @SerializedName("Arabic")
    var arabic: Info? = null
    @SerializedName("Lao")
    var lao: Info? = null
    @SerializedName("Persian")
    var persian: Info? = null
    @SerializedName("Pakistan")
    var pakistan: Info? = null
    @SerializedName("PakistanFemale")
    var pakistanFemale: Info? = null

}

class Info {
    @SerializedName("Link ")
    var link : String? = null
    @SerializedName("Text ")
    var text : String? = null
    @SerializedName("Origin ")
    var origin : String? = null
    @SerializedName("Img ")
    var img : String? = null
    @SerializedName("High  ")
    var high  : String? = null
}
*/