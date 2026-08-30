package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = wa.d7.p(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = wa.d7.m(parcel, readInt);
                    break;
                case 2:
                    j11 = wa.d7.m(parcel, readInt);
                    break;
                case 3:
                    z3 = wa.d7.j(parcel, readInt);
                    break;
                case 4:
                    str = wa.d7.d(parcel, readInt);
                    break;
                case 5:
                    str2 = wa.d7.d(parcel, readInt);
                    break;
                case 6:
                    str3 = wa.d7.d(parcel, readInt);
                    break;
                case 7:
                    bundle = wa.d7.a(parcel, readInt);
                    break;
                case '\b':
                    str4 = wa.d7.d(parcel, readInt);
                    break;
                default:
                    wa.d7.o(parcel, readInt);
                    break;
            }
        }
        wa.d7.i(parcel, p10);
        return new a1(j10, j11, z3, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a1[i];
    }
}
