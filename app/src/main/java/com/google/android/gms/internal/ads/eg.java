package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class eg extends an1 {
    public final Long O;
    public final Long P;
    public final Long Q;
    public final Long R;
    public final Long S;
    public final Long T;
    public final Long U;
    public final Long V;
    public final Long W;
    public final Long X;
    public final Long Y;

    public eg(String str) {
        super(16);
        HashMap s10 = an1.s(str);
        if (s10 != null) {
            this.O = (Long) s10.get(0);
            this.P = (Long) s10.get(1);
            this.Q = (Long) s10.get(2);
            this.R = (Long) s10.get(3);
            this.S = (Long) s10.get(4);
            this.T = (Long) s10.get(5);
            this.U = (Long) s10.get(6);
            this.V = (Long) s10.get(7);
            this.W = (Long) s10.get(8);
            this.X = (Long) s10.get(9);
            this.Y = (Long) s10.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final HashMap e() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.O);
        hashMap.put(1, this.P);
        hashMap.put(2, this.Q);
        hashMap.put(3, this.R);
        hashMap.put(4, this.S);
        hashMap.put(5, this.T);
        hashMap.put(6, this.U);
        hashMap.put(7, this.V);
        hashMap.put(8, this.W);
        hashMap.put(9, this.X);
        hashMap.put(10, this.Y);
        return hashMap;
    }
}
