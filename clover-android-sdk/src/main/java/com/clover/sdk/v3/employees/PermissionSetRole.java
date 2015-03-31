/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2015 Clover Network, Inc.
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

package com.clover.sdk.v3.employees;

@SuppressWarnings("all")
public final class PermissionSetRole implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
   * Unique identifier
  */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }
 /**
   * The role
  */
  public com.clover.sdk.v3.base.Reference getRole() {
    return cacheGet(CacheKey.role);
  }
 /**
   * The role
  */
  public com.clover.sdk.v3.base.Reference getPermissionSet() {
    return cacheGet(CacheKey.permissionSet);
  }

  public static final String AUTHORITY = "com.clover.roles";

  private enum CacheKey {
    id {
      @Override
      public Object extractValue(PermissionSetRole instance) {
        return instance.extractId();
      }
    },
    role {
      @Override
      public Object extractValue(PermissionSetRole instance) {
        return instance.extractRole();
      }
    },
    permissionSet {
      @Override
      public Object extractValue(PermissionSetRole instance) {
        return instance.extractPermissionSet();
      }
    },
    ;

    public abstract Object extractValue(PermissionSetRole instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public PermissionSetRole() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PermissionSetRole(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PermissionSetRole(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PermissionSetRole(PermissionSetRole src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) { throw new IllegalArgumentException("Maximum string length exceeded for 'id'");}
  }



  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }


  private com.clover.sdk.v3.base.Reference extractRole() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("role");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("role"));
    }
    return null;
  }


  private com.clover.sdk.v3.base.Reference extractPermissionSet() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("permissionSet");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("permissionSet"));
    }
    return null;
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'role' field is set and is not null */
  public boolean isNotNullRole() {
    return cacheValueIsNotNull(CacheKey.role);
  }

  /** Checks whether the 'permissionSet' field is set and is not null */
  public boolean isNotNullPermissionSet() {
    return cacheValueIsNotNull(CacheKey.permissionSet);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'role' field has been set, however the value could be null */
  public boolean hasRole() {
    return cacheHasKey(CacheKey.role);
  }

  /** Checks whether the 'permissionSet' field has been set, however the value could be null */
  public boolean hasPermissionSet() {
    return cacheHasKey(CacheKey.permissionSet);
  }


  /**
   * Sets the field 'id'.
   */
  public PermissionSetRole setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'role'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PermissionSetRole setRole(com.clover.sdk.v3.base.Reference role) {
    logChange("role");

    try {
      getJSONObject().put("role",
          role == null ? org.json.JSONObject.NULL : role.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.role);
    return this;
  }

  /**
   * Sets the field 'permissionSet'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PermissionSetRole setPermissionSet(com.clover.sdk.v3.base.Reference permissionSet) {
    logChange("permissionSet");

    try {
      getJSONObject().put("permissionSet",
          permissionSet == null ? org.json.JSONObject.NULL : permissionSet.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.permissionSet);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'role' field, the 'has' method for this field will now return false */
  public void clearRole() {
    unlogChange("role");
    getJSONObject().remove("role");
    cacheRemoveValue(CacheKey.role);
  }

  /** Clears the 'permissionSet' field, the 'has' method for this field will now return false */
  public void clearPermissionSet() {
    unlogChange("permissionSet");
    getJSONObject().remove("permissionSet");
    cacheRemoveValue(CacheKey.permissionSet);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PermissionSetRole copyChanges() {
    PermissionSetRole copy = new PermissionSetRole();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PermissionSetRole src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new PermissionSetRole(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "PermissionSetRole{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<PermissionSetRole> CREATOR = new android.os.Parcelable.Creator<PermissionSetRole>() {
    @Override
    public PermissionSetRole createFromParcel(android.os.Parcel in) {
      PermissionSetRole instance = new PermissionSetRole(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public PermissionSetRole[] newArray(int size) {
      return new PermissionSetRole[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PermissionSetRole> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PermissionSetRole>() {
    @Override
    public PermissionSetRole create(org.json.JSONObject jsonObject) {
      return new PermissionSetRole(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean ROLE_IS_REQUIRED = false;

    public static final boolean PERMISSIONSET_IS_REQUIRED = false;

  }

}
