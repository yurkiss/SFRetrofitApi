
package com.ctmobile.okhttpxml.api.login.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * UserInfo<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "userInfo")
@Namespace(reference = "urn:partner.soap.sforce.com")
public class UserInfo {

    @Element(name = "accessibilityMode", required = false)
    private Boolean accessibilityMode;
    @Element(name = "currencySymbol", required = false)
    private String currencySymbol;
    @Element(name = "orgAttachmentFileSizeLimit", required = false)
    private Integer orgAttachmentFileSizeLimit;
    @Element(name = "orgDefaultCurrencyIsoCode", required = false)
    private String orgDefaultCurrencyIsoCode;
    @Element(name = "orgDisallowHtmlAttachments", required = false)
    private Boolean orgDisallowHtmlAttachments;
    @Element(name = "orgHasPersonAccounts", required = false)
    private String orgHasPersonAccounts;
    @Element(name = "organizationId", required = false)
    private String organizationId;
    @Element(name = "organizationMultiCurrency", required = false)
    private Boolean organizationMultiCurrency;
    @Element(name = "organizationName", required = false)
    private String organizationName;
    @Element(name = "profileId", required = false)
    private String profileId;
    @Element(name = "roleId", required = false)
    private String roleId;
    @Element(name = "sessionSecondsValid", required = false)
    private Integer sessionSecondsValid;
    @Element(name = "userDefaultCurrencyIsoCode", required = false)
    private String userDefaultCurrencyIsoCode;
    @Element(name = "userEmail", required = false)
    private String userEmail;
    @Element(name = "userFullName", required = false)
    private String userFullName;
    @Element(name = "userId", required = false)
    private String userId;
    @Element(name = "userLanguage", required = false)
    private String userLanguage;
    @Element(name = "userLocale", required = false)
    private String userLocale;
    @Element(name = "userName", required = false)
    private String userName;
    @Element(name = "userTimeZone", required = false)
    private String userTimeZone;
    @Element(name = "userType", required = false)
    private String userType;
    @Element(name = "userUiSkin", required = false)
    private String userUiSkin;

    public UserInfo() {
    }

    public Boolean isAccessibilityMode() {
        if (accessibilityMode == null) {
            return false;
        } else {
            return accessibilityMode;
        }
    }

    public void setAccessibilityMode(Boolean accessibilityMode) {
        this.accessibilityMode = accessibilityMode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Integer getOrgAttachmentFileSizeLimit() {
        return orgAttachmentFileSizeLimit;
    }

    public void setOrgAttachmentFileSizeLimit(Integer orgAttachmentFileSizeLimit) {
        this.orgAttachmentFileSizeLimit = orgAttachmentFileSizeLimit;
    }

    public String getOrgDefaultCurrencyIsoCode() {
        return orgDefaultCurrencyIsoCode;
    }

    public void setOrgDefaultCurrencyIsoCode(String orgDefaultCurrencyIsoCode) {
        this.orgDefaultCurrencyIsoCode = orgDefaultCurrencyIsoCode;
    }

    public Boolean isOrgDisallowHtmlAttachments() {
        if (orgDisallowHtmlAttachments == null) {
            return false;
        } else {
            return orgDisallowHtmlAttachments;
        }
    }

    public void setOrgDisallowHtmlAttachments(Boolean orgDisallowHtmlAttachments) {
        this.orgDisallowHtmlAttachments = orgDisallowHtmlAttachments;
    }

    public String getOrgHasPersonAccounts() {
        return orgHasPersonAccounts;
    }

    public void setOrgHasPersonAccounts(String orgHasPersonAccounts) {
        this.orgHasPersonAccounts = orgHasPersonAccounts;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public Boolean isOrganizationMultiCurrency() {
        if (organizationMultiCurrency == null) {
            return false;
        } else {
            return organizationMultiCurrency;
        }
    }

    public void setOrganizationMultiCurrency(Boolean organizationMultiCurrency) {
        this.organizationMultiCurrency = organizationMultiCurrency;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getSessionSecondsValid() {
        return sessionSecondsValid;
    }

    public void setSessionSecondsValid(Integer sessionSecondsValid) {
        this.sessionSecondsValid = sessionSecondsValid;
    }

    public String getUserDefaultCurrencyIsoCode() {
        return userDefaultCurrencyIsoCode;
    }

    public void setUserDefaultCurrencyIsoCode(String userDefaultCurrencyIsoCode) {
        this.userDefaultCurrencyIsoCode = userDefaultCurrencyIsoCode;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getUserLocale() {
        return userLocale;
    }

    public void setUserLocale(String userLocale) {
        this.userLocale = userLocale;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTimeZone() {
        return userTimeZone;
    }

    public void setUserTimeZone(String userTimeZone) {
        this.userTimeZone = userTimeZone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserUiSkin() {
        return userUiSkin;
    }

    public void setUserUiSkin(String userUiSkin) {
        this.userUiSkin = userUiSkin;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "accessibilityMode=" + accessibilityMode + '\n' +
                ", currencySymbol='" + currencySymbol + '\'' + '\n' +
                ", orgAttachmentFileSizeLimit=" + orgAttachmentFileSizeLimit + '\n' +
                ", orgDefaultCurrencyIsoCode='" + orgDefaultCurrencyIsoCode + '\'' + '\n' +
                ", orgDisallowHtmlAttachments=" + orgDisallowHtmlAttachments + '\n' +
                ", orgHasPersonAccounts='" + orgHasPersonAccounts + '\'' + '\n' +
                ", organizationId='" + organizationId + '\'' + '\n' +
                ", organizationMultiCurrency=" + organizationMultiCurrency + '\n' +
                ", organizationName='" + organizationName + '\'' + '\n' +
                ", profileId='" + profileId + '\'' + '\n' +
                ", roleId='" + roleId + '\'' + '\n' +
                ", sessionSecondsValid=" + sessionSecondsValid + '\n' +
                ", userDefaultCurrencyIsoCode='" + userDefaultCurrencyIsoCode + '\'' + '\n' +
                ", userEmail='" + userEmail + '\'' + '\n' +
                ", userFullName='" + userFullName + '\'' + '\n' +
                ", userId='" + userId + '\'' + '\n' +
                ", userLanguage='" + userLanguage + '\'' + '\n' +
                ", userLocale='" + userLocale + '\'' + '\n' +
                ", userName='" + userName + '\'' + '\n' +
                ", userTimeZone='" + userTimeZone + '\'' + '\n' +
                ", userType='" + userType + '\'' + '\n' +
                ", userUiSkin='" + userUiSkin + '\'' + '\n' +
                '}';
    }
}
