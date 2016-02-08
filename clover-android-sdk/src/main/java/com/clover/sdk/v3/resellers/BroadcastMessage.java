/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.resellers;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class BroadcastMessage implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public String getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  public String getText() {
    return genClient.cacheGet(CacheKey.text);
  }

  public String getUrl() {
    return genClient.cacheGet(CacheKey.url);
  }

  public com.clover.sdk.v3.base.Reference getReseller() {
    return genClient.cacheGet(CacheKey.reseller);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<BroadcastMessage> {
    id {
      @Override
      public Object extractValue(BroadcastMessage instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    type {
      @Override
      public Object extractValue(BroadcastMessage instance) {
        return instance.genClient.extractOther("type", String.class);
      }
    },
    text {
      @Override
      public Object extractValue(BroadcastMessage instance) {
        return instance.genClient.extractOther("text", String.class);
      }
    },
    url {
      @Override
      public Object extractValue(BroadcastMessage instance) {
        return instance.genClient.extractOther("url", String.class);
      }
    },
    reseller {
      @Override
      public Object extractValue(BroadcastMessage instance) {
        return instance.genClient.extractRecord("reseller", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<BroadcastMessage> genClient = new GenericClient<BroadcastMessage>(this);

  /**
   * Constructs a new empty instance.
   */
  public BroadcastMessage() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BroadcastMessage(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public BroadcastMessage(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BroadcastMessage(BroadcastMessage src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'text' field is set and is not null */
  public boolean isNotNullText() {
    return genClient.cacheValueIsNotNull(CacheKey.text);
  }

  /** Checks whether the 'url' field is set and is not null */
  public boolean isNotNullUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.url);
  }

  /** Checks whether the 'reseller' field is set and is not null */
  public boolean isNotNullReseller() {
    return genClient.cacheValueIsNotNull(CacheKey.reseller);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'text' field has been set, however the value could be null */
  public boolean hasText() {
    return genClient.cacheHasKey(CacheKey.text);
  }

  /** Checks whether the 'url' field has been set, however the value could be null */
  public boolean hasUrl() {
    return genClient.cacheHasKey(CacheKey.url);
  }

  /** Checks whether the 'reseller' field has been set, however the value could be null */
  public boolean hasReseller() {
    return genClient.cacheHasKey(CacheKey.reseller);
  }


  /**
   * Sets the field 'id'.
   */
  public BroadcastMessage setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'type'.
   */
  public BroadcastMessage setType(String type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'text'.
   */
  public BroadcastMessage setText(String text) {
    return genClient.setOther(text, CacheKey.text);
  }

  /**
   * Sets the field 'url'.
   */
  public BroadcastMessage setUrl(String url) {
    return genClient.setOther(url, CacheKey.url);
  }

  /**
   * Sets the field 'reseller'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public BroadcastMessage setReseller(com.clover.sdk.v3.base.Reference reseller) {
    return genClient.setRecord(reseller, CacheKey.reseller);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'text' field, the 'has' method for this field will now return false */
  public void clearText() {
    genClient.clear(CacheKey.text);
  }
  /** Clears the 'url' field, the 'has' method for this field will now return false */
  public void clearUrl() {
    genClient.clear(CacheKey.url);
  }
  /** Clears the 'reseller' field, the 'has' method for this field will now return false */
  public void clearReseller() {
    genClient.clear(CacheKey.reseller);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public BroadcastMessage copyChanges() {
    BroadcastMessage copy = new BroadcastMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(BroadcastMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new BroadcastMessage(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<BroadcastMessage> CREATOR = new android.os.Parcelable.Creator<BroadcastMessage>() {
    @Override
    public BroadcastMessage createFromParcel(android.os.Parcel in) {
      BroadcastMessage instance = new BroadcastMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public BroadcastMessage[] newArray(int size) {
      return new BroadcastMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<BroadcastMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<BroadcastMessage>() {
    @Override
    public BroadcastMessage create(org.json.JSONObject jsonObject) {
      return new BroadcastMessage(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean TYPE_IS_REQUIRED = false;

    public static final boolean TEXT_IS_REQUIRED = false;

    public static final boolean URL_IS_REQUIRED = false;

    public static final boolean RESELLER_IS_REQUIRED = false;

  }

}
