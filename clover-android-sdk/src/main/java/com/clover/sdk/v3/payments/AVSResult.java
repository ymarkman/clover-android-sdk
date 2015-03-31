/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.payments;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum AVSResult implements Parcelable {
  SUCCESS, ZIP_CODE_MATCH, ADDRESS_MATCH, NEITHER_MATCH, SERVICE_FAILURE, SERVICE_UNAVAILABLE;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<AVSResult> CREATOR = new Creator<AVSResult>() {
    @Override
    public AVSResult createFromParcel(final Parcel source) {
      return AVSResult.valueOf(source.readString());
    }

    @Override
    public AVSResult[] newArray(final int size) {
      return new AVSResult[size];
    }
  };
}
