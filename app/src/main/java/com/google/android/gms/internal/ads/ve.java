package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ve extends an1 {
    public String O;
    public final long P;
    public final String Q;
    public final String R;
    public final String S;

    public ve(String str) {
        super(16);
        String str2;
        String str3;
        String str4;
        this.O = "E";
        this.P = -1L;
        this.Q = "E";
        this.R = "E";
        this.S = "E";
        HashMap s10 = an1.s(str);
        if (s10 != null) {
            if (s10.get(0) == null) {
                str2 = "E";
            } else {
                str2 = (String) s10.get(0);
            }
            this.O = str2;
            this.P = s10.get(1) != null ? ((Long) s10.get(1)).longValue() : -1L;
            if (s10.get(2) == null) {
                str3 = "E";
            } else {
                str3 = (String) s10.get(2);
            }
            this.Q = str3;
            if (s10.get(3) == null) {
                str4 = "E";
            } else {
                str4 = (String) s10.get(3);
            }
            this.R = str4;
            this.S = s10.get(4) != null ? (String) s10.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final HashMap e() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.O);
        hashMap.put(4, this.S);
        hashMap.put(3, this.R);
        hashMap.put(2, this.Q);
        hashMap.put(1, Long.valueOf(this.P));
        return hashMap;
    }
}
