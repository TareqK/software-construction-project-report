/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.chat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tareq
 */
public class ChatMessage implements Serializable {

  private String message;

  private Date sentOn = new Date();

  private String screenName;

  @JsonProperty
  public String getMessage() {
    return message;
  }

  @JsonProperty
  public void setMessage(String message) {
    this.message = message;
  }

  @JsonProperty
  public Date getSentOn() {
    return sentOn;
  }

  @JsonIgnore
  public void setSentOn(Date sentOn) {
    this.sentOn = sentOn;
  }

  @JsonProperty
  public String getScreenName() {
    return screenName;
  }

  @JsonProperty
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

}
