package com.gupaoedu.vip.pattern.prototype;

import java.util.HashMap;

public class User {
    private int uid;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String birthday;

    private String activeCode;
    private int isActiving;
    private String verifycode;

    private HashMap<String, String> error;

    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getActiveCode() {
        return activeCode;
    }
    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public int getIsActiving() {
        return isActiving;
    }
    public void setIsActiving(int isActiving) {
        this.isActiving = isActiving;
    }

    public HashMap<String, String> getError() {
        return error;
    }
    public void setError(HashMap<String, String> error) {
        this.error = error;
    }

    public String getVerifycode() {
        return verifycode;
    }
    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }
    @Override
    public String toString() {
        return "User [uid="+uid+",username=" + username + ", nickname="
                + nickname + ", password=" + password + ", email=" + email
                + ", birthday=" + birthday + ",activeCode="+activeCode+",isActiving="+isActiving+"]";
    }
}
