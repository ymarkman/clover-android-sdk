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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class AppCarousel implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  public String getCountryCode() {
    return genClient.cacheGet(CacheKey.countryCode);
  }

  public com.clover.sdk.v3.base.Reference getReseller() {
    return genClient.cacheGet(CacheKey.reseller);
  }

  public Integer getMaxSize() {
    return genClient.cacheGet(CacheKey.maxSize);
  }

  public java.util.List<com.clover.sdk.v3.base.Reference> getCarouselApps() {
    return genClient.cacheGet(CacheKey.carouselApps);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppCarousel> {
    id {
      @Override
      public Object extractValue(AppCarousel instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    name {
      @Override
      public Object extractValue(AppCarousel instance) {
        return instance.genClient.extractOther("name", String.class);
      }
    },
    countryCode {
      @Override
      public Object extractValue(AppCarousel instance) {
        return instance.genClient.extractOther("countryCode", String.class);
      }
    },
    reseller {
      @Override
      public Object extractValue(AppCarousel instance) {
        return instance.genClient.extractRecord("reseller", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    maxSize {
      @Override
      public Object extractValue(AppCarousel instance) {
        return instance.genClient.extractOther("maxSize", Integer.class);
      }
    },
    carouselApps {
      @Override
      public Object extractValue(AppCarousel instance) {
        return instance.genClient.extractListRecord("carouselApps", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<AppCarousel> genClient = new GenericClient<AppCarousel>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppCarousel() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppCarousel(String json) throws IllegalArgumentException {
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
  public AppCarousel(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppCarousel(AppCarousel src) {
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

    genClient.validateLength(getName(), 127);

    genClient.validateLength(getCountryCode(), 2);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'countryCode' field is set and is not null */
  public boolean isNotNullCountryCode() {
    return genClient.cacheValueIsNotNull(CacheKey.countryCode);
  }

  /** Checks whether the 'reseller' field is set and is not null */
  public boolean isNotNullReseller() {
    return genClient.cacheValueIsNotNull(CacheKey.reseller);
  }

  /** Checks whether the 'maxSize' field is set and is not null */
  public boolean isNotNullMaxSize() {
    return genClient.cacheValueIsNotNull(CacheKey.maxSize);
  }

  /** Checks whether the 'carouselApps' field is set and is not null */
  public boolean isNotNullCarouselApps() {
    return genClient.cacheValueIsNotNull(CacheKey.carouselApps);
  }

  /** Checks whether the 'carouselApps' field is set and is not null and is not empty */
  public boolean isNotEmptyCarouselApps() { return isNotNullCarouselApps() && !getCarouselApps().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'countryCode' field has been set, however the value could be null */
  public boolean hasCountryCode() {
    return genClient.cacheHasKey(CacheKey.countryCode);
  }

  /** Checks whether the 'reseller' field has been set, however the value could be null */
  public boolean hasReseller() {
    return genClient.cacheHasKey(CacheKey.reseller);
  }

  /** Checks whether the 'maxSize' field has been set, however the value could be null */
  public boolean hasMaxSize() {
    return genClient.cacheHasKey(CacheKey.maxSize);
  }

  /** Checks whether the 'carouselApps' field has been set, however the value could be null */
  public boolean hasCarouselApps() {
    return genClient.cacheHasKey(CacheKey.carouselApps);
  }


  /**
   * Sets the field 'id'.
   */
  public AppCarousel setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public AppCarousel setName(String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'countryCode'.
   */
  public AppCarousel setCountryCode(String countryCode) {
    return genClient.setOther(countryCode, CacheKey.countryCode);
  }

  /**
   * Sets the field 'reseller'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppCarousel setReseller(com.clover.sdk.v3.base.Reference reseller) {
    return genClient.setRecord(reseller, CacheKey.reseller);
  }

  /**
   * Sets the field 'maxSize'.
   */
  public AppCarousel setMaxSize(Integer maxSize) {
    return genClient.setOther(maxSize, CacheKey.maxSize);
  }

  /**
   * Sets the field 'carouselApps'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppCarousel setCarouselApps(java.util.List<com.clover.sdk.v3.base.Reference> carouselApps) {
    return genClient.setArrayRecord(carouselApps, CacheKey.carouselApps);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'countryCode' field, the 'has' method for this field will now return false */
  public void clearCountryCode() {
    genClient.clear(CacheKey.countryCode);
  }
  /** Clears the 'reseller' field, the 'has' method for this field will now return false */
  public void clearReseller() {
    genClient.clear(CacheKey.reseller);
  }
  /** Clears the 'maxSize' field, the 'has' method for this field will now return false */
  public void clearMaxSize() {
    genClient.clear(CacheKey.maxSize);
  }
  /** Clears the 'carouselApps' field, the 'has' method for this field will now return false */
  public void clearCarouselApps() {
    genClient.clear(CacheKey.carouselApps);
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
  public AppCarousel copyChanges() {
    AppCarousel copy = new AppCarousel();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppCarousel src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppCarousel(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<AppCarousel> CREATOR = new android.os.Parcelable.Creator<AppCarousel>() {
    @Override
    public AppCarousel createFromParcel(android.os.Parcel in) {
      AppCarousel instance = new AppCarousel(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppCarousel[] newArray(int size) {
      return new AppCarousel[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppCarousel> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppCarousel>() {
    @Override
    public AppCarousel create(org.json.JSONObject jsonObject) {
      return new AppCarousel(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean COUNTRYCODE_IS_REQUIRED = false;
    public static final long COUNTRYCODE_MAX_LEN = 2;

    public static final boolean RESELLER_IS_REQUIRED = false;

    public static final boolean MAXSIZE_IS_REQUIRED = false;

    public static final boolean CAROUSELAPPS_IS_REQUIRED = false;

  }

}
