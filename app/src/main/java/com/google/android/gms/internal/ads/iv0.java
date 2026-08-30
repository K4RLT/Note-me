package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class iv0 extends iw0 {

    /* renamed from: c, reason: collision with root package name */
    public final long f7233c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7234d;
    public final ArrayList e;

    public iv0(int i, long j10) {
        super(i, 0);
        this.f7233c = j10;
        this.f7234d = new ArrayList();
        this.e = new ArrayList();
    }

    public final zv0 h(int i) {
        ArrayList arrayList = this.f7234d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zv0 zv0Var = (zv0) arrayList.get(i10);
            if (zv0Var.f7240b == i) {
                return zv0Var;
            }
        }
        return null;
    }

    public final iv0 i(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            iv0 iv0Var = (iv0) arrayList.get(i10);
            if (iv0Var.f7240b == i) {
                return iv0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final String toString() {
        String g8 = iw0.g(this.f7240b);
        String arrays = Arrays.toString(this.f7234d.toArray());
        String arrays2 = Arrays.toString(this.e.toArray());
        int length = g8.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        g3.a.t(sb2, g8, " leaves: ", arrays, " containers: ");
        sb2.append(arrays2);
        return sb2.toString();
    }
}
