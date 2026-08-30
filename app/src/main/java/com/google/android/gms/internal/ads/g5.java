package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g5 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6304a;

    public g5(ArrayList arrayList) {
        this.f6304a = arrayList;
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((f5) arrayList.get(0)).f5932b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((f5) arrayList.get(i)).f5931a < j10) {
                    z3 = true;
                    break;
                } else {
                    j10 = ((f5) arrayList.get(i)).f5932b;
                    i++;
                }
            }
        }
        b80.l(!z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g5.class == obj.getClass()) {
            return this.f6304a.equals(((g5) obj).f6304a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6304a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f6304a.toString());
    }
}
