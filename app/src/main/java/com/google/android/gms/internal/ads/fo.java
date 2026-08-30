package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fo {

    /* renamed from: b, reason: collision with root package name */
    public static final fo f6135b;

    /* renamed from: a, reason: collision with root package name */
    public final d51 f6136a;

    static {
        b51 b51Var = d51.f5314v;
        f6135b = new fo(y51.f12781y);
        String str = bq0.f4860a;
        Integer.toString(0, 36);
    }

    public fo(y51 y51Var) {
        this.f6136a = d51.u(y51Var);
    }

    public final boolean a(int i) {
        int i10 = 0;
        while (true) {
            d51 d51Var = this.f6136a;
            if (i10 >= d51Var.size()) {
                return false;
            }
            ln lnVar = (ln) d51Var.get(i10);
            boolean[] zArr = lnVar.e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (zArr[i11]) {
                    if (lnVar.f8067b.f6821c == i) {
                        return true;
                    }
                } else {
                    i11++;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fo.class == obj.getClass()) {
            return this.f6136a.equals(((fo) obj).f6136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6136a.hashCode();
    }
}
