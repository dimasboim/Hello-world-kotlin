package majumundur.kena.layoutpertemuan3.data

import com.google.gson.annotations.SerializedName

data class ResultBannerTop(

	@field:SerializedName("ResultBannerTopItem")
	val resultBannerTop: List<ResultBannerTopItem?>? = null
)

data class ResultBannerTopItem(

	@field:SerializedName("bannerID")
	val bannerID: String? = null,

	@field:SerializedName("bannerImageURL")
	val bannerImageURL: String? = null,

	@field:SerializedName("bannerName")
	val bannerName: String? = null,

	@field:SerializedName("bannerURLTarget")
	val bannerURLTarget: String? = null
)
