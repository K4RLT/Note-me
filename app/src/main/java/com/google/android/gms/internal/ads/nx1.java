package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class nx1 implements ty1 {

    /* renamed from: u, reason: collision with root package name */
    public final y51 f8888u;

    /* renamed from: v, reason: collision with root package name */
    public long f8889v;

    public nx1(List list, List list2) {
        boolean z3;
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        if (list.size() == list2.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        int i10 = 0;
        while (i < list.size()) {
            mx1 mx1Var = new mx1((ty1) list.get(i), (List) list2.get(i));
            int length = objArr.length;
            int i11 = i10 + 1;
            int d2 = y41.d(length, i11);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i10] = mx1Var;
            i++;
            i10 = i11;
        }
        this.f8888u = d51.w(objArr, i10);
        this.f8889v = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean a() {
        int i = 0;
        while (true) {
            y51 y51Var = this.f8888u;
            if (i >= y51Var.f12783x) {
                return false;
            }
            if (((mx1) y51Var.get(i)).f8479u.a()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long c() {
        int i = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            y51 y51Var = this.f8888u;
            if (i >= y51Var.f12783x) {
                break;
            }
            long c10 = ((mx1) y51Var.get(i)).f8479u.c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
            i++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean f(jt1 jt1Var) {
        boolean z3;
        boolean z9;
        boolean z10 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z3 = false;
            while (true) {
                y51 y51Var = this.f8888u;
                if (i >= y51Var.f12783x) {
                    break;
                }
                long c11 = ((mx1) y51Var.get(i)).f8479u.c();
                if (c11 != Long.MIN_VALUE && c11 <= jt1Var.f7539a) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (c11 == c10 || z9) {
                    z3 |= ((mx1) y51Var.get(i)).f8479u.f(jt1Var);
                }
                i++;
            }
            z10 |= z3;
        } while (z3);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void g(long j10) {
        int i = 0;
        while (true) {
            y51 y51Var = this.f8888u;
            if (i < y51Var.f12783x) {
                ((mx1) y51Var.get(i)).g(j10);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long zzb() {
        int i = 0;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        while (true) {
            y51 y51Var = this.f8888u;
            if (i >= y51Var.f12783x) {
                break;
            }
            mx1 mx1Var = (mx1) y51Var.get(i);
            long zzb = mx1Var.f8479u.zzb();
            d51 d51Var = mx1Var.f8480v;
            if ((d51Var.contains(1) || d51Var.contains(2) || d51Var.contains(4)) && zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j11 = Math.min(j11, zzb);
            }
            i++;
        }
        if (j10 != Long.MAX_VALUE) {
            this.f8889v = j10;
            return j10;
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j12 = this.f8889v;
        if (j12 != -9223372036854775807L) {
            return j12;
        }
        return j11;
    }
}
