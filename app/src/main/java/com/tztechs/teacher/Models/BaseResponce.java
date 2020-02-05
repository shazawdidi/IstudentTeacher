package com.tztechs.teacher.Models;

import com.google.gson.annotations.SerializedName;

public class BaseResponce {
    @SerializedName("error")
    private boolean bError;

    @SerializedName("message")
    private String bMessage;

    @SerializedName("data")
    private Object bData;

    public boolean isbError() {
        return bError;
    }

    public String getbMessage() {
        return bMessage;
    }

    public Object getbData() {
        return bData;
    }

    public void setbError(boolean bError) {
        this.bError = bError;
    }

    public void setbMessage(String bMessage) {
        this.bMessage = bMessage;
    }

    public void setbData(Object bData) {
        this.bData = bData;
    }
}
