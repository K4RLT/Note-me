package j9;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class e extends ga.a {
    public static final Parcelable.Creator<e> CREATOR = new i9.b(4);
    public final String A;
    public final Intent B;
    public final a C;
    public final boolean D;
    public final Bundle E;

    /* renamed from: u, reason: collision with root package name */
    public final String f19069u;

    /* renamed from: v, reason: collision with root package name */
    public final String f19070v;

    /* renamed from: w, reason: collision with root package name */
    public final String f19071w;

    /* renamed from: x, reason: collision with root package name */
    public final String f19072x;

    /* renamed from: y, reason: collision with root package name */
    public final String f19073y;

    /* renamed from: z, reason: collision with root package name */
    public final String f19074z;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z3, Bundle bundle) {
        this.f19069u = str;
        this.f19070v = str2;
        this.f19071w = str3;
        this.f19072x = str4;
        this.f19073y = str5;
        this.f19074z = str6;
        this.A = str7;
        this.B = intent;
        this.C = (a) oa.b.z1(oa.b.v1(iBinder));
        this.D = z3;
        this.E = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f19069u);
        e7.e(parcel, 3, this.f19070v);
        e7.e(parcel, 4, this.f19071w);
        e7.e(parcel, 5, this.f19072x);
        e7.e(parcel, 6, this.f19073y);
        e7.e(parcel, 7, this.f19074z);
        e7.e(parcel, 8, this.A);
        e7.d(parcel, 9, this.B, i);
        e7.c(parcel, 10, new oa.b(this.C));
        e7.j(parcel, 11, 4);
        parcel.writeInt(this.D ? 1 : 0);
        e7.a(parcel, 12, this.E);
        e7.l(parcel, k3);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new oa.b(aVar), false, new Bundle());
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new oa.b(aVar), false, new Bundle());
    }
}
