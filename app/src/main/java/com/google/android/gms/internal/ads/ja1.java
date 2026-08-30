package com.google.android.gms.internal.ads;
import f9.k;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class ja1 implements s81, n80, dr0 {
    public static final ja1 A;
    public static final ja1 B;
    public static final ja1 C;
    public static final ja1 D;
    public static final ja1 E;
    public static final ja1 F;
    public static final ja1 G;
    public static final ja1 H;
    public static final ja1 I;
    public static final ja1 J;
    public static final ja1 K;
    public static final ja1 L;
    public static final ja1 M;
    public static final ja1 N;

    /* renamed from: w, reason: collision with root package name */
    public static final ja1 f7385w;

    /* renamed from: x, reason: collision with root package name */
    public static final ja1 f7386x;

    /* renamed from: y, reason: collision with root package name */
    public static final ja1 f7387y;

    /* renamed from: z, reason: collision with root package name */
    public static final ja1 f7388z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7389u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7390v;

    static {
        int i = 0;
        f7385w = new ja1("SHA1", i);
        f7386x = new ja1("SHA224", i);
        f7387y = new ja1("SHA256", i);
        f7388z = new ja1("SHA384", i);
        A = new ja1("SHA512", i);
        int i10 = 1;
        B = new ja1("TINK", i10);
        C = new ja1("CRUNCHY", i10);
        D = new ja1("NO_PREFIX", i10);
        int i11 = 2;
        E = new ja1("TINK", i11);
        F = new ja1("NO_PREFIX", i11);
        int i12 = 3;
        G = new ja1("TINK", i12);
        H = new ja1("CRUNCHY", i12);
        I = new ja1("LEGACY", i12);
        J = new ja1("NO_PREFIX", i12);
        int i13 = 4;
        K = new ja1("TINK", i13);
        L = new ja1("CRUNCHY", i13);
        M = new ja1("LEGACY", i13);
        N = new ja1("NO_PREFIX", i13);
    }

    public /* synthetic */ ja1(String str, int i) {
        this.f7389u = i;
        this.f7390v = str;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        switch (this.f7389u) {
            case 6:
                ((u80) obj).t(this.f7390v);
                return;
            default:
                ((j90) obj).G(this.f7390v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        f9.k.C.f16817h.d(this.f7390v, th);
    }

    public String toString() {
        switch (this.f7389u) {
            case 0:
                return this.f7390v;
            case 1:
                return this.f7390v;
            case 2:
                return this.f7390v;
            case 3:
                return this.f7390v;
            case 4:
                return this.f7390v;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public Object l(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f7390v, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
    }
}
