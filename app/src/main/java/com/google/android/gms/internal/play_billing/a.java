package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class a extends oh implements c {
    public final Bundle A4(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel b42 = b4();
        b42.writeInt(i);
        b42.writeString(str);
        b42.writeString(str2);
        b42.writeString(str3);
        int i10 = e.f15409a;
        b42.writeInt(1);
        bundle.writeToParcel(b42, 0);
        Parcel i42 = i4(b42, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(i42);
        i42.recycle();
        return bundle2;
    }

    public final Bundle B4(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel b42 = b4();
        b42.writeInt(i);
        b42.writeString(str);
        b42.writeString(str2);
        int i10 = e.f15409a;
        b42.writeInt(1);
        bundle.writeToParcel(b42, 0);
        b42.writeInt(1);
        bundle2.writeToParcel(b42, 0);
        Parcel i42 = i4(b42, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) e.a(i42);
        i42.recycle();
        return bundle3;
    }

    public final int u4(int i, String str, String str2, Bundle bundle) {
        Parcel b42 = b4();
        b42.writeInt(i);
        b42.writeString(str);
        b42.writeString(str2);
        int i10 = e.f15409a;
        b42.writeInt(1);
        bundle.writeToParcel(b42, 0);
        Parcel i42 = i4(b42, 10);
        int readInt = i42.readInt();
        i42.recycle();
        return readInt;
    }

    public final Bundle v4(String str, Bundle bundle, String str2) {
        Parcel b42 = b4();
        b42.writeInt(9);
        b42.writeString(str);
        b42.writeString(str2);
        int i = e.f15409a;
        b42.writeInt(1);
        bundle.writeToParcel(b42, 0);
        Parcel i42 = i4(b42, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(i42);
        i42.recycle();
        return bundle2;
    }

    public final Bundle w4(String str, Bundle bundle, String str2) {
        Parcel b42 = b4();
        b42.writeInt(9);
        b42.writeString(str);
        b42.writeString(str2);
        int i = e.f15409a;
        b42.writeInt(1);
        bundle.writeToParcel(b42, 0);
        Parcel i42 = i4(b42, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(i42);
        i42.recycle();
        return bundle2;
    }

    public final Bundle x4(String str, String str2, String str3) {
        Parcel b42 = b4();
        b42.writeInt(3);
        b42.writeString(str);
        b42.writeString(str2);
        b42.writeString(str3);
        b42.writeString(null);
        Parcel i42 = i4(b42, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(i42);
        i42.recycle();
        return bundle;
    }

    public final Bundle y4(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel b42 = b4();
        b42.writeInt(i);
        b42.writeString(str);
        b42.writeString(str2);
        b42.writeString(str3);
        b42.writeString(null);
        int i10 = e.f15409a;
        b42.writeInt(1);
        bundle.writeToParcel(b42, 0);
        Parcel i42 = i4(b42, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(i42);
        i42.recycle();
        return bundle2;
    }

    public final Bundle z4(String str, String str2, String str3) {
        Parcel b42 = b4();
        b42.writeInt(3);
        b42.writeString(str);
        b42.writeString(str2);
        b42.writeString(str3);
        Parcel i42 = i4(b42, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(i42);
        i42.recycle();
        return bundle;
    }
}
