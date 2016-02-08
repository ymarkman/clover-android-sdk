/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.billing;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum InfoleaseChargeAttemptStatus implements Parcelable {
  BILLED, ACH_REJECT, REFUNDED;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<InfoleaseChargeAttemptStatus> CREATOR = new Creator<InfoleaseChargeAttemptStatus>() {
    @Override
    public InfoleaseChargeAttemptStatus createFromParcel(final Parcel source) {
      return InfoleaseChargeAttemptStatus.valueOf(source.readString());
    }

    @Override
    public InfoleaseChargeAttemptStatus[] newArray(final int size) {
      return new InfoleaseChargeAttemptStatus[size];
    }
  };
}
