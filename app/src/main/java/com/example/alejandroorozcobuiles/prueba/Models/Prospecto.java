package com.example.alejandroorozcobuiles.prueba.Models;


import java.util.HashMap;
import java.util.Map;
/**
 * Created by alejandroorozcobuiles on 22/10/17.
 */

public class Prospecto {
    private String id;
    private String name;
    private String surname;
    private String telephone;
    private String schProspectIdentification;
    private String address;
    private String createdAt;
    private String updatedAt;
    private Integer statusCd;
    private String zoneCode;
    private String neighborhoodCode;
    private String cityCode;
    private String sectionCode;
    private Integer roleId;
    private Object appointableId;
    private Object rejectedObservation;
    private String observation;
    private Boolean disable;
    private Boolean visited;
    private Boolean callcenter;
    private Boolean acceptSearch;
    private String campaignCode;
    private Object userId;

    public String getStatus(){
        String status = "";
        switch (statusCd) {
            case 0:
                status = "Pending";
                break;
            case 1:
                status = "Approved";
                break;
            case 2:
                status = "Accepted";
                break;
            case 3:
                status = "Rejected";
                break;
            case 4:
                status = "Disabled";
                break;
            default:
                status =  "error";
                break;
        }
        return status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prospecto withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prospecto withName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Prospecto withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Prospecto withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getSchProspectIdentification() {
        return schProspectIdentification;
    }

    public void setSchProspectIdentification(String schProspectIdentification) {
        this.schProspectIdentification = schProspectIdentification;
    }

    public Prospecto withSchProspectIdentification(String schProspectIdentification) {
        this.schProspectIdentification = schProspectIdentification;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Prospecto withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Prospecto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Prospecto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getStatusCd() {
        return getStatusCd();
    }

    public void setStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
    }

    public Prospecto withStatusCd(Integer statusCd) {
        this.statusCd = statusCd;
        return this;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public Prospecto withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    public String getNeighborhoodCode() {
        return neighborhoodCode;
    }

    public void setNeighborhoodCode(String neighborhoodCode) {
        this.neighborhoodCode = neighborhoodCode;
    }

    public Prospecto withNeighborhoodCode(String neighborhoodCode) {
        this.neighborhoodCode = neighborhoodCode;
        return this;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Prospecto withCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public Prospecto withSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Prospecto withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Object getAppointableId() {
        return appointableId;
    }

    public void setAppointableId(Object appointableId) {
        this.appointableId = appointableId;
    }

    public Prospecto withAppointableId(Object appointableId) {
        this.appointableId = appointableId;
        return this;
    }

    public Object getRejectedObservation() {
        return rejectedObservation;
    }

    public void setRejectedObservation(Object rejectedObservation) {
        this.rejectedObservation = rejectedObservation;
    }

    public Prospecto withRejectedObservation(Object rejectedObservation) {
        this.rejectedObservation = rejectedObservation;
        return this;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Prospecto withObservation(String observation) {
        this.observation = observation;
        return this;
    }

    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public Prospecto withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Prospecto withVisited(Boolean visited) {
        this.visited = visited;
        return this;
    }

    public Boolean getCallcenter() {
        return callcenter;
    }

    public void setCallcenter(Boolean callcenter) {
        this.callcenter = callcenter;
    }

    public Prospecto withCallcenter(Boolean callcenter) {
        this.callcenter = callcenter;
        return this;
    }

    public Boolean getAcceptSearch() {
        return acceptSearch;
    }

    public void setAcceptSearch(Boolean acceptSearch) {
        this.acceptSearch = acceptSearch;
    }

    public Prospecto withAcceptSearch(Boolean acceptSearch) {
        this.acceptSearch = acceptSearch;
        return this;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public Prospecto withCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
        return this;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Prospecto withUserId(Object userId) {
        this.userId = userId;
        return this;
    }


}
