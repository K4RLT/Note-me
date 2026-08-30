package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r3 implements n3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10069c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10070d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10071f;

    public r3(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f10067a = i;
        this.f10068b = i10;
        this.f10069c = i11;
        this.f10070d = i12;
        this.e = i13;
        this.f10071f = i14;
    }

    public final int a() {
        int i = this.f10067a;
        if (i != 1935960438) {
            if (i != 1935963489) {
                if (i != 1937012852) {
                    x21.F("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.n3
    public final int zza() {
        return 1752331379;
    }
}
