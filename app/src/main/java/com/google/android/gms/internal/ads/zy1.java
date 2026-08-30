package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zy1 {

    /* renamed from: d, reason: collision with root package name */
    public static final zy1 f13336d = new zy1(new hi[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f13337a;

    /* renamed from: b, reason: collision with root package name */
    public final y51 f13338b;

    /* renamed from: c, reason: collision with root package name */
    public int f13339c;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
    }

    public zy1(hi... hiVarArr) {
        this.f13338b = d51.v(hiVarArr);
        this.f13337a = hiVarArr.length;
        int i = 0;
        while (i < this.f13338b.f12783x) {
            int i10 = i + 1;
            int i11 = i10;
            while (true) {
                y51 y51Var = this.f13338b;
                if (i11 < y51Var.f12783x) {
                    if (((hi) y51Var.get(i)).equals(this.f13338b.get(i11))) {
                        x21.P("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i11++;
                }
            }
            i = i10;
        }
    }

    public final hi a(int i) {
        return (hi) this.f13338b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zy1.class == obj.getClass()) {
                zy1 zy1Var = (zy1) obj;
                if (this.f13337a == zy1Var.f13337a && this.f13338b.equals(zy1Var.f13338b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f13339c;
        if (i == 0) {
            int hashCode = this.f13338b.hashCode();
            this.f13339c = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.f13338b.toString();
    }
}
