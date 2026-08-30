package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c9.f;
import ca.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.mu;
import fa.y;
import ga.a;
import java.util.Arrays;
import wa.e7;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new f(6);

    /* renamed from: u, reason: collision with root package name */
    public final int f4283u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4284v;

    /* renamed from: w, reason: collision with root package name */
    public final PendingIntent f4285w;

    /* renamed from: x, reason: collision with root package name */
    public final b f4286x;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f4283u = i;
        this.f4284v = str;
        this.f4285w = pendingIntent;
        this.f4286x = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f4283u != status.f4283u || !y.l(this.f4284v, status.f4284v) || !y.l(this.f4285w, status.f4285w) || !y.l(this.f4286x, status.f4286x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4283u), this.f4284v, this.f4285w, this.f4286x});
    }

    public final String toString() {
        mu muVar = new mu(this);
        String str = this.f4284v;
        if (str == null) {
            int i = this.f4283u;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = a5.a.f(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case gl.zzm /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        muVar.f(str, "statusCode");
        muVar.f(this.f4285w, "resolution");
        return muVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4283u);
        e7.e(parcel, 2, this.f4284v);
        e7.d(parcel, 3, this.f4285w, i);
        e7.d(parcel, 4, this.f4286x, i);
        e7.l(parcel, k3);
    }
}
