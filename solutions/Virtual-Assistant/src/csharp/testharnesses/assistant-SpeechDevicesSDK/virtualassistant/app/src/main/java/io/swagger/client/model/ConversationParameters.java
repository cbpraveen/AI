/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Activity;
import io.swagger.client.model.ChannelAccount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Parameters for creating a new conversation
 */
@ApiModel(description = "Parameters for creating a new conversation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class ConversationParameters {
  @SerializedName("isGroup")
  private Boolean isGroup = null;

  @SerializedName("bot")
  private ChannelAccount bot = null;

  @SerializedName("members")
  private List<ChannelAccount> members = null;

  @SerializedName("topicName")
  private String topicName = null;

  @SerializedName("activity")
  private Activity activity = null;

  @SerializedName("channelData")
  private Object channelData = null;

  public ConversationParameters isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

   /**
   * IsGroup
   * @return isGroup
  **/
  @ApiModelProperty(value = "IsGroup")
  public Boolean isIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public ConversationParameters bot(ChannelAccount bot) {
    this.bot = bot;
    return this;
  }

   /**
   * The bot address for this conversation
   * @return bot
  **/
  @ApiModelProperty(value = "The bot address for this conversation")
  public ChannelAccount getBot() {
    return bot;
  }

  public void setBot(ChannelAccount bot) {
    this.bot = bot;
  }

  public ConversationParameters members(List<ChannelAccount> members) {
    this.members = members;
    return this;
  }

  public ConversationParameters addMembersItem(ChannelAccount membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<ChannelAccount>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Members to add to the conversation
   * @return members
  **/
  @ApiModelProperty(value = "Members to add to the conversation")
  public List<ChannelAccount> getMembers() {
    return members;
  }

  public void setMembers(List<ChannelAccount> members) {
    this.members = members;
  }

  public ConversationParameters topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * (Optional) Topic of the conversation (if supported by the channel)
   * @return topicName
  **/
  @ApiModelProperty(value = "(Optional) Topic of the conversation (if supported by the channel)")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public ConversationParameters activity(Activity activity) {
    this.activity = activity;
    return this;
  }

   /**
   * (Optional) When creating a new conversation, use this activity as the initial message to the conversation
   * @return activity
  **/
  @ApiModelProperty(value = "(Optional) When creating a new conversation, use this activity as the initial message to the conversation")
  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }

  public ConversationParameters channelData(Object channelData) {
    this.channelData = channelData;
    return this;
  }

   /**
   * Channel specific payload for creating the conversation
   * @return channelData
  **/
  @ApiModelProperty(value = "Channel specific payload for creating the conversation")
  public Object getChannelData() {
    return channelData;
  }

  public void setChannelData(Object channelData) {
    this.channelData = channelData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationParameters conversationParameters = (ConversationParameters) o;
    return Objects.equals(this.isGroup, conversationParameters.isGroup) &&
        Objects.equals(this.bot, conversationParameters.bot) &&
        Objects.equals(this.members, conversationParameters.members) &&
        Objects.equals(this.topicName, conversationParameters.topicName) &&
        Objects.equals(this.activity, conversationParameters.activity) &&
        Objects.equals(this.channelData, conversationParameters.channelData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGroup, bot, members, topicName, activity, channelData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationParameters {\n");
    
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    channelData: ").append(toIndentedString(channelData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

