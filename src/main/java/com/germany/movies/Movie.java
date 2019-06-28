
package com.germany.movies;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Movie. JSon object representation there are 1000 movie objects in
 * asset.json, each movie object's representation in in this POJO
 */
public class Movie {

	/** The asset id. */
	@SerializedName("asset_id")
	@Expose
	private String assetId;

	/** The userrating average. */
	@SerializedName("userrating_average")
	@Expose
	private String userratingAverage;

	/** The orders buy. */
	@SerializedName("orders_buy")
	@Expose
	private String ordersBuy;

	/** The poster url. */
	@SerializedName("poster_url")
	@Expose
	private String posterUrl;

	/** The timeframe start. */
	@SerializedName("timeframe_start")
	@Expose
	private String timeframeStart;

	/** The production year max. */
	@SerializedName("production_year_max")
	@Expose
	private String productionYearMax;

	/** The director list facet. */
	@SerializedName("director_list_facet")
	@Expose
	private List<String> directorListFacet = null;

	/** The production year list facet. */
	@SerializedName("production_year_list_facet")
	@Expose
	private List<String> productionYearListFacet = null;

	/** The title. */
	@SerializedName("title")
	@Expose
	private String title;

	/** The episode number. */
	@SerializedName("episode_number")
	@Expose
	private String episodeNumber;

	/** The media usage list. */
	@SerializedName("media_usage_list")
	@Expose
	private List<String> mediaUsageList = null;

	/** The production year. */
	@SerializedName("production_year")
	@Expose
	private String productionYear;

	/** The editorial hint. */
	@SerializedName("editorial_hint")
	@Expose
	private String editorialHint;

	/** The timeframe end. */
	@SerializedName("timeframe_end")
	@Expose
	private String timeframeEnd;

	/** The active license starttime. */
	@SerializedName("active_license_starttime")
	@Expose
	private String activeLicenseStarttime;

	/** The marking display list. */
	@SerializedName("marking_display_list")
	@Expose
	private List<String> markingDisplayList = null;

	/** The active license endtime. */
	@SerializedName("active_license_endtime")
	@Expose
	private String activeLicenseEndtime;

	/** The language list facet. */
	@SerializedName("language_list_facet")
	@Expose
	private List<String> languageListFacet = null;

	/** The production year min. */
	@SerializedName("production_year_min")
	@Expose
	private String productionYearMin;

	/** The description short. */
	@SerializedName("description_short")
	@Expose
	private String descriptionShort;

	/** The season number. */
	@SerializedName("season_number")
	@Expose
	private String seasonNumber;

	/** The price rent. */
	@SerializedName("price_rent")
	@Expose
	private String priceRent;

	/** The child id list. */
	@SerializedName("child_id_list")
	@Expose
	private List<String> childIdList = null;

	/** The userrating count four star. */
	@SerializedName("userrating_count_four_star")
	@Expose
	private String userratingCountFourStar;

	/** The orders subscription. */
	@SerializedName("orders_subscription")
	@Expose
	private String ordersSubscription;

	/** The description teaser. */
	@SerializedName("description_teaser")
	@Expose
	private String descriptionTeaser;

	/** The orders rent. */
	@SerializedName("orders_rent")
	@Expose
	private String ordersRent;

	/** The fsk level list facet. */
	@SerializedName("fsk_level_list_facet")
	@Expose
	private List<String> fskLevelListFacet = null;

	/** The userrating count one star. */
	@SerializedName("userrating_count_one_star")
	@Expose
	private String userratingCountOneStar;

	/** The change date. */
	@SerializedName("change_date")
	@Expose
	private String changeDate;

	/** The copyright. */
	@SerializedName("copyright")
	@Expose
	private String copyright;

	/** The object class. */
	@SerializedName("object_class")
	@Expose
	private String objectClass;

	/** The channel list facet. */
	@SerializedName("channel_list_facet")
	@Expose
	private List<String> channelListFacet = null;

	/** The cover url. */
	@SerializedName("cover_url")
	@Expose
	private String coverUrl;

	/** The trailer object. */
	@SerializedName("trailer_object")
	@Expose
	private String trailerObject;

	/** The actor list facet. */
	@SerializedName("actor_list_facet")
	@Expose
	private List<String> actorListFacet = null;

	/** The userrating count five star. */
	@SerializedName("userrating_count_five_star")
	@Expose
	private String userratingCountFiveStar;

	/** The author list facet. */
	@SerializedName("author_list_facet")
	@Expose
	private List<String> authorListFacet = null;

	/** The videocontainer format list. */
	@SerializedName("videocontainer_format_list")
	@Expose
	private List<String> videocontainerFormatList = null;

	/** The id. */
	@SerializedName("id")
	@Expose
	private String id;

	/** The description long. */
	@SerializedName("description_long")
	@Expose
	private String descriptionLong;

	/** The marking list. */
	@SerializedName("marking_list")
	@Expose
	private List<String> markingList = null;

	/** The price buy. */
	@SerializedName("price_buy")
	@Expose
	private String priceBuy;

	/** The userrating count three star. */
	@SerializedName("userrating_count_three_star")
	@Expose
	private String userratingCountThreeStar;

	/** The generation. */
	@SerializedName("generation")
	@Expose
	private String generation;

	/** The full object. */
	@SerializedName("full_object")
	@Expose
	private String fullObject;

	/** The language piff list facet. */
	@SerializedName("language_piff_list_facet")
	@Expose
	private List<String> languagePiffListFacet = null;

	/** The object type. */
	@SerializedName("object_type")
	@Expose
	private String objectType;

	/** The cover big url. */
	@SerializedName("cover_big_url")
	@Expose
	private String coverBigUrl;

	/** The tag list facet. */
	@SerializedName("tag_list_facet")
	@Expose
	private List<String> tagListFacet = null;

	/** The userrating count total. */
	@SerializedName("userrating_count_total")
	@Expose
	private String userratingCountTotal;

	/** The country list. */
	@SerializedName("country_list")
	@Expose
	private List<String> countryList = null;

	/** The userrating count two star. */
	@SerializedName("userrating_count_two_star")
	@Expose
	private String userratingCountTwoStar;

	/** The version. */
	@SerializedName("_version_")
	@Expose
	private String version;

	/** The erotic specifier. */
	@SerializedName("erotic_specifier")
	@Expose
	private String eroticSpecifier;

	/** The timestamp. */
	@SerializedName("timestamp")
	@Expose
	private String timestamp;

	/**
	 * Gets the asset id.
	 *
	 * @return the asset id
	 */
	public String getAssetId() {
		return assetId;
	}

	/**
	 * Sets the asset id.
	 *
	 * @param assetId the new asset id
	 */
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	/**
	 * With asset id.
	 *
	 * @param assetId the asset id
	 * @return the movie
	 */
	public Movie withAssetId(String assetId) {
		this.assetId = assetId;
		return this;
	}

	/**
	 * Gets the userrating average.
	 *
	 * @return the userrating average
	 */
	public String getUserratingAverage() {
		return userratingAverage;
	}

	/**
	 * Sets the userrating average.
	 *
	 * @param userratingAverage the new userrating average
	 */
	public void setUserratingAverage(String userratingAverage) {
		this.userratingAverage = userratingAverage;
	}

	/**
	 * With userrating average.
	 *
	 * @param userratingAverage the userrating average
	 * @return the movie
	 */
	public Movie withUserratingAverage(String userratingAverage) {
		this.userratingAverage = userratingAverage;
		return this;
	}

	/**
	 * Gets the orders buy.
	 *
	 * @return the orders buy
	 */
	public String getOrdersBuy() {
		return ordersBuy;
	}

	/**
	 * Sets the orders buy.
	 *
	 * @param ordersBuy the new orders buy
	 */
	public void setOrdersBuy(String ordersBuy) {
		this.ordersBuy = ordersBuy;
	}

	/**
	 * With orders buy.
	 *
	 * @param ordersBuy the orders buy
	 * @return the movie
	 */
	public Movie withOrdersBuy(String ordersBuy) {
		this.ordersBuy = ordersBuy;
		return this;
	}

	/**
	 * Gets the poster url.
	 *
	 * @return the poster url
	 */
	public String getPosterUrl() {
		return posterUrl;
	}

	/**
	 * Sets the poster url.
	 *
	 * @param posterUrl the new poster url
	 */
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	/**
	 * With poster url.
	 *
	 * @param posterUrl the poster url
	 * @return the movie
	 */
	public Movie withPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
		return this;
	}

	/**
	 * Gets the timeframe start.
	 *
	 * @return the timeframe start
	 */
	public String getTimeframeStart() {
		return timeframeStart;
	}

	/**
	 * Sets the timeframe start.
	 *
	 * @param timeframeStart the new timeframe start
	 */
	public void setTimeframeStart(String timeframeStart) {
		this.timeframeStart = timeframeStart;
	}

	/**
	 * With timeframe start.
	 *
	 * @param timeframeStart the timeframe start
	 * @return the movie
	 */
	public Movie withTimeframeStart(String timeframeStart) {
		this.timeframeStart = timeframeStart;
		return this;
	}

	/**
	 * Gets the production year max.
	 *
	 * @return the production year max
	 */
	public String getProductionYearMax() {
		return productionYearMax;
	}

	/**
	 * Sets the production year max.
	 *
	 * @param productionYearMax the new production year max
	 */
	public void setProductionYearMax(String productionYearMax) {
		this.productionYearMax = productionYearMax;
	}

	/**
	 * With production year max.
	 *
	 * @param productionYearMax the production year max
	 * @return the movie
	 */
	public Movie withProductionYearMax(String productionYearMax) {
		this.productionYearMax = productionYearMax;
		return this;
	}

	/**
	 * Gets the director list facet.
	 *
	 * @return the director list facet
	 */
	public List<String> getDirectorListFacet() {
		return directorListFacet;
	}

	/**
	 * Sets the director list facet.
	 *
	 * @param directorListFacet the new director list facet
	 */
	public void setDirectorListFacet(List<String> directorListFacet) {
		this.directorListFacet = directorListFacet;
	}

	/**
	 * With director list facet.
	 *
	 * @param directorListFacet the director list facet
	 * @return the movie
	 */
	public Movie withDirectorListFacet(List<String> directorListFacet) {
		this.directorListFacet = directorListFacet;
		return this;
	}

	/**
	 * Gets the production year list facet.
	 *
	 * @return the production year list facet
	 */
	public List<String> getProductionYearListFacet() {
		return productionYearListFacet;
	}

	/**
	 * Sets the production year list facet.
	 *
	 * @param productionYearListFacet the new production year list facet
	 */
	public void setProductionYearListFacet(List<String> productionYearListFacet) {
		this.productionYearListFacet = productionYearListFacet;
	}

	/**
	 * With production year list facet.
	 *
	 * @param productionYearListFacet the production year list facet
	 * @return the movie
	 */
	public Movie withProductionYearListFacet(List<String> productionYearListFacet) {
		this.productionYearListFacet = productionYearListFacet;
		return this;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * With title.
	 *
	 * @param title the title
	 * @return the movie
	 */
	public Movie withTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Gets the episode number.
	 *
	 * @return the episode number
	 */
	public String getEpisodeNumber() {
		return episodeNumber;
	}

	/**
	 * Sets the episode number.
	 *
	 * @param episodeNumber the new episode number
	 */
	public void setEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	/**
	 * With episode number.
	 *
	 * @param episodeNumber the episode number
	 * @return the movie
	 */
	public Movie withEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
		return this;
	}

	/**
	 * Gets the media usage list.
	 *
	 * @return the media usage list
	 */
	public List<String> getMediaUsageList() {
		return mediaUsageList;
	}

	/**
	 * Sets the media usage list.
	 *
	 * @param mediaUsageList the new media usage list
	 */
	public void setMediaUsageList(List<String> mediaUsageList) {
		this.mediaUsageList = mediaUsageList;
	}

	/**
	 * With media usage list.
	 *
	 * @param mediaUsageList the media usage list
	 * @return the movie
	 */
	public Movie withMediaUsageList(List<String> mediaUsageList) {
		this.mediaUsageList = mediaUsageList;
		return this;
	}

	/**
	 * Gets the production year.
	 *
	 * @return the production year
	 */
	public String getProductionYear() {
		return productionYear;
	}

	/**
	 * Sets the production year.
	 *
	 * @param productionYear the new production year
	 */
	public void setProductionYear(String productionYear) {
		this.productionYear = productionYear;
	}

	/**
	 * With production year.
	 *
	 * @param productionYear the production year
	 * @return the movie
	 */
	public Movie withProductionYear(String productionYear) {
		this.productionYear = productionYear;
		return this;
	}

	/**
	 * Gets the editorial hint.
	 *
	 * @return the editorial hint
	 */
	public String getEditorialHint() {
		return editorialHint;
	}

	/**
	 * Sets the editorial hint.
	 *
	 * @param editorialHint the new editorial hint
	 */
	public void setEditorialHint(String editorialHint) {
		this.editorialHint = editorialHint;
	}

	/**
	 * With editorial hint.
	 *
	 * @param editorialHint the editorial hint
	 * @return the movie
	 */
	public Movie withEditorialHint(String editorialHint) {
		this.editorialHint = editorialHint;
		return this;
	}

	/**
	 * Gets the timeframe end.
	 *
	 * @return the timeframe end
	 */
	public String getTimeframeEnd() {
		return timeframeEnd;
	}

	/**
	 * Sets the timeframe end.
	 *
	 * @param timeframeEnd the new timeframe end
	 */
	public void setTimeframeEnd(String timeframeEnd) {
		this.timeframeEnd = timeframeEnd;
	}

	/**
	 * With timeframe end.
	 *
	 * @param timeframeEnd the timeframe end
	 * @return the movie
	 */
	public Movie withTimeframeEnd(String timeframeEnd) {
		this.timeframeEnd = timeframeEnd;
		return this;
	}

	/**
	 * Gets the active license starttime.
	 *
	 * @return the active license starttime
	 */
	public String getActiveLicenseStarttime() {
		return activeLicenseStarttime;
	}

	/**
	 * Sets the active license starttime.
	 *
	 * @param activeLicenseStarttime the new active license starttime
	 */
	public void setActiveLicenseStarttime(String activeLicenseStarttime) {
		this.activeLicenseStarttime = activeLicenseStarttime;
	}

	/**
	 * With active license starttime.
	 *
	 * @param activeLicenseStarttime the active license starttime
	 * @return the movie
	 */
	public Movie withActiveLicenseStarttime(String activeLicenseStarttime) {
		this.activeLicenseStarttime = activeLicenseStarttime;
		return this;
	}

	/**
	 * Gets the marking display list.
	 *
	 * @return the marking display list
	 */
	public List<String> getMarkingDisplayList() {
		return markingDisplayList;
	}

	/**
	 * Sets the marking display list.
	 *
	 * @param markingDisplayList the new marking display list
	 */
	public void setMarkingDisplayList(List<String> markingDisplayList) {
		this.markingDisplayList = markingDisplayList;
	}

	/**
	 * With marking display list.
	 *
	 * @param markingDisplayList the marking display list
	 * @return the movie
	 */
	public Movie withMarkingDisplayList(List<String> markingDisplayList) {
		this.markingDisplayList = markingDisplayList;
		return this;
	}

	/**
	 * Gets the active license endtime.
	 *
	 * @return the active license endtime
	 */
	public String getActiveLicenseEndtime() {
		return activeLicenseEndtime;
	}

	/**
	 * Sets the active license endtime.
	 *
	 * @param activeLicenseEndtime the new active license endtime
	 */
	public void setActiveLicenseEndtime(String activeLicenseEndtime) {
		this.activeLicenseEndtime = activeLicenseEndtime;
	}

	/**
	 * With active license endtime.
	 *
	 * @param activeLicenseEndtime the active license endtime
	 * @return the movie
	 */
	public Movie withActiveLicenseEndtime(String activeLicenseEndtime) {
		this.activeLicenseEndtime = activeLicenseEndtime;
		return this;
	}

	/**
	 * Gets the language list facet.
	 *
	 * @return the language list facet
	 */
	public List<String> getLanguageListFacet() {
		return languageListFacet;
	}

	/**
	 * Sets the language list facet.
	 *
	 * @param languageListFacet the new language list facet
	 */
	public void setLanguageListFacet(List<String> languageListFacet) {
		this.languageListFacet = languageListFacet;
	}

	/**
	 * With language list facet.
	 *
	 * @param languageListFacet the language list facet
	 * @return the movie
	 */
	public Movie withLanguageListFacet(List<String> languageListFacet) {
		this.languageListFacet = languageListFacet;
		return this;
	}

	/**
	 * Gets the production year min.
	 *
	 * @return the production year min
	 */
	public String getProductionYearMin() {
		return productionYearMin;
	}

	/**
	 * Sets the production year min.
	 *
	 * @param productionYearMin the new production year min
	 */
	public void setProductionYearMin(String productionYearMin) {
		this.productionYearMin = productionYearMin;
	}

	/**
	 * With production year min.
	 *
	 * @param productionYearMin the production year min
	 * @return the movie
	 */
	public Movie withProductionYearMin(String productionYearMin) {
		this.productionYearMin = productionYearMin;
		return this;
	}

	/**
	 * Gets the description short.
	 *
	 * @return the description short
	 */
	public String getDescriptionShort() {
		return descriptionShort;
	}

	/**
	 * Sets the description short.
	 *
	 * @param descriptionShort the new description short
	 */
	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	/**
	 * With description short.
	 *
	 * @param descriptionShort the description short
	 * @return the movie
	 */
	public Movie withDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
		return this;
	}

	/**
	 * Gets the season number.
	 *
	 * @return the season number
	 */
	public String getSeasonNumber() {
		return seasonNumber;
	}

	/**
	 * Sets the season number.
	 *
	 * @param seasonNumber the new season number
	 */
	public void setSeasonNumber(String seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	/**
	 * With season number.
	 *
	 * @param seasonNumber the season number
	 * @return the movie
	 */
	public Movie withSeasonNumber(String seasonNumber) {
		this.seasonNumber = seasonNumber;
		return this;
	}

	/**
	 * Gets the price rent.
	 *
	 * @return the price rent
	 */
	public String getPriceRent() {
		return priceRent;
	}

	/**
	 * Sets the price rent.
	 *
	 * @param priceRent the new price rent
	 */
	public void setPriceRent(String priceRent) {
		this.priceRent = priceRent;
	}

	/**
	 * With price rent.
	 *
	 * @param priceRent the price rent
	 * @return the movie
	 */
	public Movie withPriceRent(String priceRent) {
		this.priceRent = priceRent;
		return this;
	}

	/**
	 * Gets the child id list.
	 *
	 * @return the child id list
	 */
	public List<String> getChildIdList() {
		return childIdList;
	}

	/**
	 * Sets the child id list.
	 *
	 * @param childIdList the new child id list
	 */
	public void setChildIdList(List<String> childIdList) {
		this.childIdList = childIdList;
	}

	/**
	 * With child id list.
	 *
	 * @param childIdList the child id list
	 * @return the movie
	 */
	public Movie withChildIdList(List<String> childIdList) {
		this.childIdList = childIdList;
		return this;
	}

	/**
	 * Gets the userrating count four star.
	 *
	 * @return the userrating count four star
	 */
	public String getUserratingCountFourStar() {
		return userratingCountFourStar;
	}

	/**
	 * Sets the userrating count four star.
	 *
	 * @param userratingCountFourStar the new userrating count four star
	 */
	public void setUserratingCountFourStar(String userratingCountFourStar) {
		this.userratingCountFourStar = userratingCountFourStar;
	}

	/**
	 * With userrating count four star.
	 *
	 * @param userratingCountFourStar the userrating count four star
	 * @return the movie
	 */
	public Movie withUserratingCountFourStar(String userratingCountFourStar) {
		this.userratingCountFourStar = userratingCountFourStar;
		return this;
	}

	/**
	 * Gets the orders subscription.
	 *
	 * @return the orders subscription
	 */
	public String getOrdersSubscription() {
		return ordersSubscription;
	}

	/**
	 * Sets the orders subscription.
	 *
	 * @param ordersSubscription the new orders subscription
	 */
	public void setOrdersSubscription(String ordersSubscription) {
		this.ordersSubscription = ordersSubscription;
	}

	/**
	 * With orders subscription.
	 *
	 * @param ordersSubscription the orders subscription
	 * @return the movie
	 */
	public Movie withOrdersSubscription(String ordersSubscription) {
		this.ordersSubscription = ordersSubscription;
		return this;
	}

	/**
	 * Gets the description teaser.
	 *
	 * @return the description teaser
	 */
	public String getDescriptionTeaser() {
		return descriptionTeaser;
	}

	/**
	 * Sets the description teaser.
	 *
	 * @param descriptionTeaser the new description teaser
	 */
	public void setDescriptionTeaser(String descriptionTeaser) {
		this.descriptionTeaser = descriptionTeaser;
	}

	/**
	 * With description teaser.
	 *
	 * @param descriptionTeaser the description teaser
	 * @return the movie
	 */
	public Movie withDescriptionTeaser(String descriptionTeaser) {
		this.descriptionTeaser = descriptionTeaser;
		return this;
	}

	/**
	 * Gets the orders rent.
	 *
	 * @return the orders rent
	 */
	public String getOrdersRent() {
		return ordersRent;
	}

	/**
	 * Sets the orders rent.
	 *
	 * @param ordersRent the new orders rent
	 */
	public void setOrdersRent(String ordersRent) {
		this.ordersRent = ordersRent;
	}

	/**
	 * With orders rent.
	 *
	 * @param ordersRent the orders rent
	 * @return the movie
	 */
	public Movie withOrdersRent(String ordersRent) {
		this.ordersRent = ordersRent;
		return this;
	}

	/**
	 * Gets the fsk level list facet.
	 *
	 * @return the fsk level list facet
	 */
	public List<String> getFskLevelListFacet() {
		return fskLevelListFacet;
	}

	/**
	 * Sets the fsk level list facet.
	 *
	 * @param fskLevelListFacet the new fsk level list facet
	 */
	public void setFskLevelListFacet(List<String> fskLevelListFacet) {
		this.fskLevelListFacet = fskLevelListFacet;
	}

	/**
	 * With fsk level list facet.
	 *
	 * @param fskLevelListFacet the fsk level list facet
	 * @return the movie
	 */
	public Movie withFskLevelListFacet(List<String> fskLevelListFacet) {
		this.fskLevelListFacet = fskLevelListFacet;
		return this;
	}

	/**
	 * Gets the userrating count one star.
	 *
	 * @return the userrating count one star
	 */
	public String getUserratingCountOneStar() {
		return userratingCountOneStar;
	}

	/**
	 * Sets the userrating count one star.
	 *
	 * @param userratingCountOneStar the new userrating count one star
	 */
	public void setUserratingCountOneStar(String userratingCountOneStar) {
		this.userratingCountOneStar = userratingCountOneStar;
	}

	/**
	 * With userrating count one star.
	 *
	 * @param userratingCountOneStar the userrating count one star
	 * @return the movie
	 */
	public Movie withUserratingCountOneStar(String userratingCountOneStar) {
		this.userratingCountOneStar = userratingCountOneStar;
		return this;
	}

	/**
	 * Gets the change date.
	 *
	 * @return the change date
	 */
	public String getChangeDate() {
		return changeDate;
	}

	/**
	 * Sets the change date.
	 *
	 * @param changeDate the new change date
	 */
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	/**
	 * With change date.
	 *
	 * @param changeDate the change date
	 * @return the movie
	 */
	public Movie withChangeDate(String changeDate) {
		this.changeDate = changeDate;
		return this;
	}

	/**
	 * Gets the copyright.
	 *
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * Sets the copyright.
	 *
	 * @param copyright the new copyright
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 * With copyright.
	 *
	 * @param copyright the copyright
	 * @return the movie
	 */
	public Movie withCopyright(String copyright) {
		this.copyright = copyright;
		return this;
	}

	/**
	 * Gets the object class.
	 *
	 * @return the object class
	 */
	public String getObjectClass() {
		return objectClass;
	}

	/**
	 * Sets the object class.
	 *
	 * @param objectClass the new object class
	 */
	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}

	/**
	 * With object class.
	 *
	 * @param objectClass the object class
	 * @return the movie
	 */
	public Movie withObjectClass(String objectClass) {
		this.objectClass = objectClass;
		return this;
	}

	/**
	 * Gets the channel list facet.
	 *
	 * @return the channel list facet
	 */
	public List<String> getChannelListFacet() {
		return channelListFacet;
	}

	/**
	 * Sets the channel list facet.
	 *
	 * @param channelListFacet the new channel list facet
	 */
	public void setChannelListFacet(List<String> channelListFacet) {
		this.channelListFacet = channelListFacet;
	}

	/**
	 * With channel list facet.
	 *
	 * @param channelListFacet the channel list facet
	 * @return the movie
	 */
	public Movie withChannelListFacet(List<String> channelListFacet) {
		this.channelListFacet = channelListFacet;
		return this;
	}

	/**
	 * Gets the cover url.
	 *
	 * @return the cover url
	 */
	public String getCoverUrl() {
		return coverUrl;
	}

	/**
	 * Sets the cover url.
	 *
	 * @param coverUrl the new cover url
	 */
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	/**
	 * With cover url.
	 *
	 * @param coverUrl the cover url
	 * @return the movie
	 */
	public Movie withCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
		return this;
	}

	/**
	 * Gets the trailer object.
	 *
	 * @return the trailer object
	 */
	public String getTrailerObject() {
		return trailerObject;
	}

	/**
	 * Sets the trailer object.
	 *
	 * @param trailerObject the new trailer object
	 */
	public void setTrailerObject(String trailerObject) {
		this.trailerObject = trailerObject;
	}

	/**
	 * With trailer object.
	 *
	 * @param trailerObject the trailer object
	 * @return the movie
	 */
	public Movie withTrailerObject(String trailerObject) {
		this.trailerObject = trailerObject;
		return this;
	}

	/**
	 * Gets the actor list facet.
	 *
	 * @return the actor list facet
	 */
	public List<String> getActorListFacet() {
		return actorListFacet;
	}

	/**
	 * Sets the actor list facet.
	 *
	 * @param actorListFacet the new actor list facet
	 */
	public void setActorListFacet(List<String> actorListFacet) {
		this.actorListFacet = actorListFacet;
	}

	/**
	 * With actor list facet.
	 *
	 * @param actorListFacet the actor list facet
	 * @return the movie
	 */
	public Movie withActorListFacet(List<String> actorListFacet) {
		this.actorListFacet = actorListFacet;
		return this;
	}

	/**
	 * Gets the userrating count five star.
	 *
	 * @return the userrating count five star
	 */
	public String getUserratingCountFiveStar() {
		return userratingCountFiveStar;
	}

	/**
	 * Sets the userrating count five star.
	 *
	 * @param userratingCountFiveStar the new userrating count five star
	 */
	public void setUserratingCountFiveStar(String userratingCountFiveStar) {
		this.userratingCountFiveStar = userratingCountFiveStar;
	}

	/**
	 * With userrating count five star.
	 *
	 * @param userratingCountFiveStar the userrating count five star
	 * @return the movie
	 */
	public Movie withUserratingCountFiveStar(String userratingCountFiveStar) {
		this.userratingCountFiveStar = userratingCountFiveStar;
		return this;
	}

	/**
	 * Gets the author list facet.
	 *
	 * @return the author list facet
	 */
	public List<String> getAuthorListFacet() {
		return authorListFacet;
	}

	/**
	 * Sets the author list facet.
	 *
	 * @param authorListFacet the new author list facet
	 */
	public void setAuthorListFacet(List<String> authorListFacet) {
		this.authorListFacet = authorListFacet;
	}

	/**
	 * With author list facet.
	 *
	 * @param authorListFacet the author list facet
	 * @return the movie
	 */
	public Movie withAuthorListFacet(List<String> authorListFacet) {
		this.authorListFacet = authorListFacet;
		return this;
	}

	/**
	 * Gets the videocontainer format list.
	 *
	 * @return the videocontainer format list
	 */
	public List<String> getVideocontainerFormatList() {
		return videocontainerFormatList;
	}

	/**
	 * Sets the videocontainer format list.
	 *
	 * @param videocontainerFormatList the new videocontainer format list
	 */
	public void setVideocontainerFormatList(List<String> videocontainerFormatList) {
		this.videocontainerFormatList = videocontainerFormatList;
	}

	/**
	 * With videocontainer format list.
	 *
	 * @param videocontainerFormatList the videocontainer format list
	 * @return the movie
	 */
	public Movie withVideocontainerFormatList(List<String> videocontainerFormatList) {
		this.videocontainerFormatList = videocontainerFormatList;
		return this;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * With id.
	 *
	 * @param id the id
	 * @return the movie
	 */
	public Movie withId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Gets the description long.
	 *
	 * @return the description long
	 */
	public String getDescriptionLong() {
		return descriptionLong;
	}

	/**
	 * Sets the description long.
	 *
	 * @param descriptionLong the new description long
	 */
	public void setDescriptionLong(String descriptionLong) {
		this.descriptionLong = descriptionLong;
	}

	/**
	 * With description long.
	 *
	 * @param descriptionLong the description long
	 * @return the movie
	 */
	public Movie withDescriptionLong(String descriptionLong) {
		this.descriptionLong = descriptionLong;
		return this;
	}

	/**
	 * Gets the marking list.
	 *
	 * @return the marking list
	 */
	public List<String> getMarkingList() {
		return markingList;
	}

	/**
	 * Sets the marking list.
	 *
	 * @param markingList the new marking list
	 */
	public void setMarkingList(List<String> markingList) {
		this.markingList = markingList;
	}

	/**
	 * With marking list.
	 *
	 * @param markingList the marking list
	 * @return the movie
	 */
	public Movie withMarkingList(List<String> markingList) {
		this.markingList = markingList;
		return this;
	}

	/**
	 * Gets the price buy.
	 *
	 * @return the price buy
	 */
	public String getPriceBuy() {
		return priceBuy;
	}

	/**
	 * Sets the price buy.
	 *
	 * @param priceBuy the new price buy
	 */
	public void setPriceBuy(String priceBuy) {
		this.priceBuy = priceBuy;
	}

	/**
	 * With price buy.
	 *
	 * @param priceBuy the price buy
	 * @return the movie
	 */
	public Movie withPriceBuy(String priceBuy) {
		this.priceBuy = priceBuy;
		return this;
	}

	/**
	 * Gets the userrating count three star.
	 *
	 * @return the userrating count three star
	 */
	public String getUserratingCountThreeStar() {
		return userratingCountThreeStar;
	}

	/**
	 * Sets the userrating count three star.
	 *
	 * @param userratingCountThreeStar the new userrating count three star
	 */
	public void setUserratingCountThreeStar(String userratingCountThreeStar) {
		this.userratingCountThreeStar = userratingCountThreeStar;
	}

	/**
	 * With userrating count three star.
	 *
	 * @param userratingCountThreeStar the userrating count three star
	 * @return the movie
	 */
	public Movie withUserratingCountThreeStar(String userratingCountThreeStar) {
		this.userratingCountThreeStar = userratingCountThreeStar;
		return this;
	}

	/**
	 * Gets the generation.
	 *
	 * @return the generation
	 */
	public String getGeneration() {
		return generation;
	}

	/**
	 * Sets the generation.
	 *
	 * @param generation the new generation
	 */
	public void setGeneration(String generation) {
		this.generation = generation;
	}

	/**
	 * With generation.
	 *
	 * @param generation the generation
	 * @return the movie
	 */
	public Movie withGeneration(String generation) {
		this.generation = generation;
		return this;
	}

	/**
	 * Gets the full object.
	 *
	 * @return the full object
	 */
	public String getFullObject() {
		return fullObject;
	}

	/**
	 * Sets the full object.
	 *
	 * @param fullObject the new full object
	 */
	public void setFullObject(String fullObject) {
		this.fullObject = fullObject;
	}

	/**
	 * With full object.
	 *
	 * @param fullObject the full object
	 * @return the movie
	 */
	public Movie withFullObject(String fullObject) {
		this.fullObject = fullObject;
		return this;
	}

	/**
	 * Gets the language piff list facet.
	 *
	 * @return the language piff list facet
	 */
	public List<String> getLanguagePiffListFacet() {
		return languagePiffListFacet;
	}

	/**
	 * Sets the language piff list facet.
	 *
	 * @param languagePiffListFacet the new language piff list facet
	 */
	public void setLanguagePiffListFacet(List<String> languagePiffListFacet) {
		this.languagePiffListFacet = languagePiffListFacet;
	}

	/**
	 * With language piff list facet.
	 *
	 * @param languagePiffListFacet the language piff list facet
	 * @return the movie
	 */
	public Movie withLanguagePiffListFacet(List<String> languagePiffListFacet) {
		this.languagePiffListFacet = languagePiffListFacet;
		return this;
	}

	/**
	 * Gets the object type.
	 *
	 * @return the object type
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * Sets the object type.
	 *
	 * @param objectType the new object type
	 */
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	/**
	 * With object type.
	 *
	 * @param objectType the object type
	 * @return the movie
	 */
	public Movie withObjectType(String objectType) {
		this.objectType = objectType;
		return this;
	}

	/**
	 * Gets the cover big url.
	 *
	 * @return the cover big url
	 */
	public String getCoverBigUrl() {
		return coverBigUrl;
	}

	/**
	 * Sets the cover big url.
	 *
	 * @param coverBigUrl the new cover big url
	 */
	public void setCoverBigUrl(String coverBigUrl) {
		this.coverBigUrl = coverBigUrl;
	}

	/**
	 * With cover big url.
	 *
	 * @param coverBigUrl the cover big url
	 * @return the movie
	 */
	public Movie withCoverBigUrl(String coverBigUrl) {
		this.coverBigUrl = coverBigUrl;
		return this;
	}

	/**
	 * Gets the tag list facet.
	 *
	 * @return the tag list facet
	 */
	public List<String> getTagListFacet() {
		return tagListFacet;
	}

	/**
	 * Sets the tag list facet.
	 *
	 * @param tagListFacet the new tag list facet
	 */
	public void setTagListFacet(List<String> tagListFacet) {
		this.tagListFacet = tagListFacet;
	}

	/**
	 * With tag list facet.
	 *
	 * @param tagListFacet the tag list facet
	 * @return the movie
	 */
	public Movie withTagListFacet(List<String> tagListFacet) {
		this.tagListFacet = tagListFacet;
		return this;
	}

	/**
	 * Gets the userrating count total.
	 *
	 * @return the userrating count total
	 */
	public String getUserratingCountTotal() {
		return userratingCountTotal;
	}

	/**
	 * Sets the userrating count total.
	 *
	 * @param userratingCountTotal the new userrating count total
	 */
	public void setUserratingCountTotal(String userratingCountTotal) {
		this.userratingCountTotal = userratingCountTotal;
	}

	/**
	 * With userrating count total.
	 *
	 * @param userratingCountTotal the userrating count total
	 * @return the movie
	 */
	public Movie withUserratingCountTotal(String userratingCountTotal) {
		this.userratingCountTotal = userratingCountTotal;
		return this;
	}

	/**
	 * Gets the country list.
	 *
	 * @return the country list
	 */
	public List<String> getCountryList() {
		return countryList;
	}

	/**
	 * Sets the country list.
	 *
	 * @param countryList the new country list
	 */
	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

	/**
	 * With country list.
	 *
	 * @param countryList the country list
	 * @return the movie
	 */
	public Movie withCountryList(List<String> countryList) {
		this.countryList = countryList;
		return this;
	}

	/**
	 * Gets the userrating count two star.
	 *
	 * @return the userrating count two star
	 */
	public String getUserratingCountTwoStar() {
		return userratingCountTwoStar;
	}

	/**
	 * Sets the userrating count two star.
	 *
	 * @param userratingCountTwoStar the new userrating count two star
	 */
	public void setUserratingCountTwoStar(String userratingCountTwoStar) {
		this.userratingCountTwoStar = userratingCountTwoStar;
	}

	/**
	 * With userrating count two star.
	 *
	 * @param userratingCountTwoStar the userrating count two star
	 * @return the movie
	 */
	public Movie withUserratingCountTwoStar(String userratingCountTwoStar) {
		this.userratingCountTwoStar = userratingCountTwoStar;
		return this;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * With version.
	 *
	 * @param version the version
	 * @return the movie
	 */
	public Movie withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Gets the erotic specifier.
	 *
	 * @return the erotic specifier
	 */
	public String getEroticSpecifier() {
		return eroticSpecifier;
	}

	/**
	 * Sets the erotic specifier.
	 *
	 * @param eroticSpecifier the new erotic specifier
	 */
	public void setEroticSpecifier(String eroticSpecifier) {
		this.eroticSpecifier = eroticSpecifier;
	}

	/**
	 * With erotic specifier.
	 *
	 * @param eroticSpecifier the erotic specifier
	 * @return the movie
	 */
	public Movie withEroticSpecifier(String eroticSpecifier) {
		this.eroticSpecifier = eroticSpecifier;
		return this;
	}

	/**
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp.
	 *
	 * @param timestamp the new timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * With timestamp.
	 *
	 * @param timestamp the timestamp
	 * @return the movie
	 */
	public Movie withTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("assetId", assetId).append("userratingAverage", userratingAverage)
				.append("ordersBuy", ordersBuy).append("posterUrl", posterUrl).append("timeframeStart", timeframeStart)
				.append("productionYearMax", productionYearMax).append("directorListFacet", directorListFacet)
				.append("productionYearListFacet", productionYearListFacet).append("title", title)
				.append("episodeNumber", episodeNumber).append("mediaUsageList", mediaUsageList)
				.append("productionYear", productionYear).append("editorialHint", editorialHint)
				.append("timeframeEnd", timeframeEnd).append("activeLicenseStarttime", activeLicenseStarttime)
				.append("markingDisplayList", markingDisplayList).append("activeLicenseEndtime", activeLicenseEndtime)
				.append("languageListFacet", languageListFacet).append("productionYearMin", productionYearMin)
				.append("descriptionShort", descriptionShort).append("seasonNumber", seasonNumber)
				.append("priceRent", priceRent).append("childIdList", childIdList)
				.append("userratingCountFourStar", userratingCountFourStar)
				.append("ordersSubscription", ordersSubscription).append("descriptionTeaser", descriptionTeaser)
				.append("ordersRent", ordersRent).append("fskLevelListFacet", fskLevelListFacet)
				.append("userratingCountOneStar", userratingCountOneStar).append("changeDate", changeDate)
				.append("copyright", copyright).append("objectClass", objectClass)
				.append("channelListFacet", channelListFacet).append("coverUrl", coverUrl)
				.append("trailerObject", trailerObject).append("actorListFacet", actorListFacet)
				.append("userratingCountFiveStar", userratingCountFiveStar).append("authorListFacet", authorListFacet)
				.append("videocontainerFormatList", videocontainerFormatList).append("id", id)
				.append("descriptionLong", descriptionLong).append("markingList", markingList)
				.append("priceBuy", priceBuy).append("userratingCountThreeStar", userratingCountThreeStar)
				.append("generation", generation).append("fullObject", fullObject)
				.append("languagePiffListFacet", languagePiffListFacet).append("objectType", objectType)
				.append("coverBigUrl", coverBigUrl).append("tagListFacet", tagListFacet)
				.append("userratingCountTotal", userratingCountTotal).append("countryList", countryList)
				.append("userratingCountTwoStar", userratingCountTwoStar).append("version", version)
				.append("eroticSpecifier", eroticSpecifier).append("timestamp", timestamp).toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ordersRent).append(userratingCountFourStar).append(trailerObject)
				.append(languageListFacet).append(fullObject).append(episodeNumber).append(videocontainerFormatList)
				.append(fskLevelListFacet).append(userratingCountOneStar).append(countryList)
				.append(languagePiffListFacet).append(productionYearListFacet).append(generation)
				.append(userratingCountTotal).append(userratingCountThreeStar).append(childIdList).append(coverUrl)
				.append(seasonNumber).append(objectClass).append(copyright).append(priceBuy).append(posterUrl)
				.append(eroticSpecifier).append(productionYear).append(changeDate).append(editorialHint)
				.append(directorListFacet).append(channelListFacet).append(timeframeEnd).append(userratingCountFiveStar)
				.append(activeLicenseEndtime).append(timeframeStart).append(priceRent).append(activeLicenseStarttime)
				.append(version).append(timestamp).append(id).append(mediaUsageList).append(coverBigUrl).append(title)
				.append(assetId).append(tagListFacet).append(descriptionLong).append(productionYearMin)
				.append(markingList).append(descriptionShort).append(actorListFacet).append(userratingAverage)
				.append(descriptionTeaser).append(userratingCountTwoStar).append(markingDisplayList).append(ordersBuy)
				.append(productionYearMax).append(objectType).append(ordersSubscription).append(authorListFacet)
				.toHashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Movie) == false) {
			return false;
		}
		Movie rhs = ((Movie) other);
		return new EqualsBuilder().append(ordersRent, rhs.ordersRent)
				.append(userratingCountFourStar, rhs.userratingCountFourStar).append(trailerObject, rhs.trailerObject)
				.append(languageListFacet, rhs.languageListFacet).append(fullObject, rhs.fullObject)
				.append(episodeNumber, rhs.episodeNumber).append(videocontainerFormatList, rhs.videocontainerFormatList)
				.append(fskLevelListFacet, rhs.fskLevelListFacet)
				.append(userratingCountOneStar, rhs.userratingCountOneStar).append(countryList, rhs.countryList)
				.append(languagePiffListFacet, rhs.languagePiffListFacet)
				.append(productionYearListFacet, rhs.productionYearListFacet).append(generation, rhs.generation)
				.append(userratingCountTotal, rhs.userratingCountTotal)
				.append(userratingCountThreeStar, rhs.userratingCountThreeStar).append(childIdList, rhs.childIdList)
				.append(coverUrl, rhs.coverUrl).append(seasonNumber, rhs.seasonNumber)
				.append(objectClass, rhs.objectClass).append(copyright, rhs.copyright).append(priceBuy, rhs.priceBuy)
				.append(posterUrl, rhs.posterUrl).append(eroticSpecifier, rhs.eroticSpecifier)
				.append(productionYear, rhs.productionYear).append(changeDate, rhs.changeDate)
				.append(editorialHint, rhs.editorialHint).append(directorListFacet, rhs.directorListFacet)
				.append(channelListFacet, rhs.channelListFacet).append(timeframeEnd, rhs.timeframeEnd)
				.append(userratingCountFiveStar, rhs.userratingCountFiveStar)
				.append(activeLicenseEndtime, rhs.activeLicenseEndtime).append(timeframeStart, rhs.timeframeStart)
				.append(priceRent, rhs.priceRent).append(activeLicenseStarttime, rhs.activeLicenseStarttime)
				.append(version, rhs.version).append(timestamp, rhs.timestamp).append(id, rhs.id)
				.append(mediaUsageList, rhs.mediaUsageList).append(coverBigUrl, rhs.coverBigUrl)
				.append(title, rhs.title).append(assetId, rhs.assetId).append(tagListFacet, rhs.tagListFacet)
				.append(descriptionLong, rhs.descriptionLong).append(productionYearMin, rhs.productionYearMin)
				.append(markingList, rhs.markingList).append(descriptionShort, rhs.descriptionShort)
				.append(actorListFacet, rhs.actorListFacet).append(userratingAverage, rhs.userratingAverage)
				.append(descriptionTeaser, rhs.descriptionTeaser)
				.append(userratingCountTwoStar, rhs.userratingCountTwoStar)
				.append(markingDisplayList, rhs.markingDisplayList).append(ordersBuy, rhs.ordersBuy)
				.append(productionYearMax, rhs.productionYearMax).append(objectType, rhs.objectType)
				.append(ordersSubscription, rhs.ordersSubscription).append(authorListFacet, rhs.authorListFacet)
				.isEquals();
	}

}