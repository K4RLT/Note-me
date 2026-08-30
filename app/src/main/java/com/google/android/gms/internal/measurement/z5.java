package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public final m4 f13993a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13994b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f13995c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13996d;

    public z5(m4 m4Var, String str, Object[] objArr) {
        this.f13993a = m4Var;
        this.f13994b = str;
        this.f13995c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13996d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f13996d = i | (charAt2 << i10);
                return;
            }
        }
    }

    public final int a() {
        int i = this.f13996d;
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
