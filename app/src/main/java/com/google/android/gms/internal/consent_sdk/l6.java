package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final c5 f13483a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13484b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f13485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13486d;

    public l6(c5 c5Var, String str, Object[] objArr) {
        this.f13483a = c5Var;
        this.f13484b = str;
        this.f13485c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13486d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f13486d = i | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i = this.f13486d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
