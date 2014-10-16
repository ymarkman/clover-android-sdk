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

package com.clover.sdk.v3.inventory;

@SuppressWarnings("all")
public final class Category implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
   * Unique identifier
  */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }
 /**
   * 
  */
  public java.lang.String getName() {
    return cacheGet(CacheKey.name);
  }
  public java.lang.Integer getSortOrder() {
    return cacheGet(CacheKey.sortOrder);
  }
 /**
   * Items associated with this category
  */
  public java.util.List<com.clover.sdk.v3.base.Reference> getItems() {
    return cacheGet(CacheKey.items);
  }


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(Category instance) {
        return instance.extractId();
      }
    },
    name {
      @Override
      public Object extractValue(Category instance) {
        return instance.extractName();
      }
    },
    sortOrder {
      @Override
      public Object extractValue(Category instance) {
        return instance.extractSortOrder();
      }
    },
    items {
      @Override
      public Object extractValue(Category instance) {
        return instance.extractItems();
      }
    },
    ;

    public abstract Object extractValue(Category instance);
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
  public Category() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Category(String json) throws java.lang.IllegalArgumentException {
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
  public Category(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Category(Category src) {
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

    java.lang.String name = getName();
    if (name == null) throw new java.lang.IllegalArgumentException("'name' is required to be non-null");
    if (name != null && name.length() > 127) { throw new IllegalArgumentException("Maximum string length exceeded for 'name'");}
  }



  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }


  private java.lang.String extractName() {
    return getJSONObject().isNull("name") ? null :
      getJSONObject().optString("name");
  }


  private java.lang.Integer extractSortOrder() {
    return getJSONObject().isNull("sortOrder") ? null :
      getJSONObject().optInt("sortOrder");
  }


  private java.util.List<com.clover.sdk.v3.base.Reference> extractItems() {
    if (getJSONObject().isNull("items")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("items");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.base.Reference> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.base.Reference>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.base.Reference item = new com.clover.sdk.v3.base.Reference(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'sortOrder' field is set and is not null */
  public boolean isNotNullSortOrder() {
    return cacheValueIsNotNull(CacheKey.sortOrder);
  }

  /** Checks whether the 'items' field is set and is not null */
  public boolean isNotNullItems() {
    return cacheValueIsNotNull(CacheKey.items);
  }

  /** Checks whether the 'items' field is set and is not null and is not empty */
  public boolean isNotEmptyItems() {
    return isNotNullItems() && !getItems().isEmpty();
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'sortOrder' field has been set, however the value could be null */
  public boolean hasSortOrder() {
    return cacheHasKey(CacheKey.sortOrder);
  }

  /** Checks whether the 'items' field has been set, however the value could be null */
  public boolean hasItems() {
    return cacheHasKey(CacheKey.items);
  }


  /**
   * Sets the field 'id'.
   */
  public Category setId(java.lang.String id) {
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
   * Sets the field 'name'.
   */
  public Category setName(java.lang.String name) {
    logChange("name");

    try {
      getJSONObject().put("name", name == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(name));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.name);
    return this;
  }

  /**
   * Sets the field 'sortOrder'.
   */
  public Category setSortOrder(java.lang.Integer sortOrder) {
    logChange("sortOrder");

    try {
      getJSONObject().put("sortOrder", sortOrder == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(sortOrder));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.sortOrder);
    return this;
  }

  /**
   * Sets the field 'items'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Category setItems(java.util.List<com.clover.sdk.v3.base.Reference> items) {
    logChange("items");

    try {
      if (items == null) {
        getJSONObject().put("items", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.items);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.base.Reference obj : items) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("items", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.items);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    unlogChange("name");
    getJSONObject().remove("name");
    cacheRemoveValue(CacheKey.name);
  }

  /** Clears the 'sortOrder' field, the 'has' method for this field will now return false */
  public void clearSortOrder() {
    unlogChange("sortOrder");
    getJSONObject().remove("sortOrder");
    cacheRemoveValue(CacheKey.sortOrder);
  }

  /** Clears the 'items' field, the 'has' method for this field will now return false */
  public void clearItems() {
    unlogChange("items");
    getJSONObject().remove("items");
    cacheRemoveValue(CacheKey.items);
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
  public Category copyChanges() {
    Category copy = new Category();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Category src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new Category(src).getJSONObject();
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

    return "Category{" +
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

  public static final android.os.Parcelable.Creator<Category> CREATOR = new android.os.Parcelable.Creator<Category>() {
    @Override
    public Category createFromParcel(android.os.Parcel in) {
      Category instance = new Category(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public Category[] newArray(int size) {
      return new Category[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Category> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Category>() {
    @Override
    public Category create(org.json.JSONObject jsonObject) {
      return new Category(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean SORTORDER_IS_REQUIRED = false;

    public static final boolean ITEMS_IS_REQUIRED = false;

  }

}
