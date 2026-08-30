package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class rf extends an1 {
    public final /* synthetic */ int O = 0;
    public Long P;
    public Object Q;
    public Object R;

    public rf(String str) {
        super(16);
        HashMap s10 = an1.s(str);
        if (s10 != null) {
            this.P = (Long) s10.get(0);
            this.Q = (Boolean) s10.get(1);
            this.R = (Boolean) s10.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final HashMap e() {
        switch (this.O) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(0, this.P);
                hashMap.put(1, (Long) this.Q);
                hashMap.put(2, (Long) this.R);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(0, this.P);
                hashMap2.put(1, (Boolean) this.Q);
                hashMap2.put(2, (Boolean) this.R);
                return hashMap2;
        }
    }

    public /* synthetic */ rf() {
        super(16);
    }
}
