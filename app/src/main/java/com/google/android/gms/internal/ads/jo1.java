package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jo1 {

    /* renamed from: a, reason: collision with root package name */
    public final cm1 f7499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7500b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f7501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7502d;

    public jo1(cm1 cm1Var, String str, Object[] objArr) {
        this.f7499a = cm1Var;
        this.f7500b = str;
        this.f7501c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7502d = charAt;
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
                this.f7502d = i | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i = this.f7502d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
