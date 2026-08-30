package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a4 implements Comparable, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final a4 f14011v = new a4(0);

    /* renamed from: w, reason: collision with root package name */
    public static final a4 f14012w = new a4(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14013u;

    public /* synthetic */ a4(int i) {
        this.f14013u = i;
    }

    public final int a(a4 a4Var) {
        switch (this.f14013u) {
            case 0:
                return a4Var == this ? 0 : 1;
            default:
                return a4Var == this ? 0 : -1;
        }
    }

    public final void b(StringBuilder sb2) {
        switch (this.f14013u) {
            case 0:
                throw new AssertionError();
            default:
                sb2.append("(-∞");
                return;
        }
    }

    public final void c(StringBuilder sb2) {
        switch (this.f14013u) {
            case 0:
                sb2.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f14013u) {
            case 0:
                if (((a4) obj) == this) {
                    return 0;
                }
                return 1;
            default:
                if (((a4) obj) == this) {
                    return 0;
                }
                return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a4) {
            try {
                if (a((a4) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        switch (this.f14013u) {
            case 0:
                return System.identityHashCode(this);
            default:
                return System.identityHashCode(this);
        }
    }

    public final String toString() {
        switch (this.f14013u) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
