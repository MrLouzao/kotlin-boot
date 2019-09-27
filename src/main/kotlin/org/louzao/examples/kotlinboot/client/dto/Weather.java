package org.louzao.examples.kotlinboot.client.dto;

import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("id")
    private Integer id;
    @SerializedName("humidity")
    private Integer humidity;
    @SerializedName("predictability")
    private Integer predictability;
    @SerializedName("min_temp")
    private Double min_temp;
    @SerializedName("max_temp")
    private Double max_temp;
    @SerializedName("wind_speed")
    private Double wind_speed;
    @SerializedName("wind_direction")
    private Double wind_direction;
    @SerializedName("visibility")
    private Double visibility;
    @SerializedName("the_temp")
    private Double the_temp;
    @SerializedName("air_pressure")
    private Double air_pressure;
    @SerializedName("weather_state_name")
    private String weather_state_name;
    @SerializedName("weather_state_abbr")
    private String weather_state_abbr;
    @SerializedName("wind_direction_compass")
    private String wind_direction_compass;
    @SerializedName("created")
    private String created;
    @SerializedName("applicable_date")
    private String applicable_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getPredictability() {
        return predictability;
    }

    public void setPredictability(Integer predictability) {
        this.predictability = predictability;
    }

    public Double getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(Double min_temp) {
        this.min_temp = min_temp;
    }

    public Double getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(Double max_temp) {
        this.max_temp = max_temp;
    }

    public Double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public Double getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(Double wind_direction) {
        this.wind_direction = wind_direction;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getThe_temp() {
        return the_temp;
    }

    public void setThe_temp(Double the_temp) {
        this.the_temp = the_temp;
    }

    public Double getAir_pressure() {
        return air_pressure;
    }

    public void setAir_pressure(Double air_pressure) {
        this.air_pressure = air_pressure;
    }

    public String getWeather_state_name() {
        return weather_state_name;
    }

    public void setWeather_state_name(String weather_state_name) {
        this.weather_state_name = weather_state_name;
    }

    public String getWeather_state_abbr() {
        return weather_state_abbr;
    }

    public void setWeather_state_abbr(String weather_state_abbr) {
        this.weather_state_abbr = weather_state_abbr;
    }

    public String getWind_direction_compass() {
        return wind_direction_compass;
    }

    public void setWind_direction_compass(String wind_direction_compass) {
        this.wind_direction_compass = wind_direction_compass;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getApplicable_date() {
        return applicable_date;
    }

    public void setApplicable_date(String applicable_date) {
        this.applicable_date = applicable_date;
    }
}
