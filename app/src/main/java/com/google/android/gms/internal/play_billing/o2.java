package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f15499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15500b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f15501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15502d;

    public o2(b1 b1Var, String str, Object[] objArr) {
        this.f15499a = b1Var;
        this.f15500b = str;
        this.f15501c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15502d = charAt;
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
                this.f15502d = i | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i = this.f15502d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
