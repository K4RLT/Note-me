package ca;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.mu;
import fa.y;
import java.util.Arrays;
import wa.e7;

/* loaded from: classes.dex */
public final class b extends ga.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f4021u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4022v;

    /* renamed from: w, reason: collision with root package name */
    public final PendingIntent f4023w;

    /* renamed from: x, reason: collision with root package name */
    public final String f4024x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f4025y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f4020z = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new c9.f(2);

    public b(int i, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f4021u = i;
        this.f4022v = i10;
        this.f4023w = pendingIntent;
        this.f4024x = str;
        this.f4025y = num;
    }

    public static String a(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case gl.zzm /* 21 */:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                return a5.a.j(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4022v == bVar.f4022v && y.l(this.f4023w, bVar.f4023w) && y.l(this.f4024x, bVar.f4024x) && y.l(this.f4025y, bVar.f4025y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4022v), this.f4023w, this.f4024x, this.f4025y});
    }

    public final String toString() {
        mu muVar = new mu(this);
        muVar.f(a(this.f4022v), "statusCode");
        muVar.f(this.f4023w, "resolution");
        muVar.f(this.f4024x, "message");
        muVar.f(this.f4025y, "clientMethodKey");
        return muVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f4021u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f4022v);
        e7.d(parcel, 3, this.f4023w, i);
        e7.e(parcel, 4, this.f4024x);
        Integer num = this.f4025y;
        if (num != null) {
            e7.j(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        e7.l(parcel, k3);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
