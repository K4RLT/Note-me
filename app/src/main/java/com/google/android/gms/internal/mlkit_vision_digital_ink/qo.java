package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    public final km f14852a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14853b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f14854c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14855d;

    public qo(km kmVar, String str, Object[] objArr) {
        this.f14852a = kmVar;
        this.f14853b = str;
        this.f14854c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14855d = charAt;
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
                this.f14855d = i | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i = this.f14855d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
