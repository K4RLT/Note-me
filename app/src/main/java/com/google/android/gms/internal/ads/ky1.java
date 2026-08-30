package com.google.android.gms.internal.ads;
import i0.m;
import r0.k;
import r0.l;
import r0.o;
import r5.g;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ky1 implements sy1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ my1 f7904b;

    public ky1(my1 my1Var, int i) {
        this.f7904b = my1Var;
        this.f7903a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r8 == (-1)) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.sy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r14) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.my1 r0 = r13.f7904b
            int r1 = r13.f7903a
            boolean r2 = o()
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            k(r1)
            com.google.android.gms.internal.ads.ry1[] r2 = r0.M
            r4 = r2[r1]
            boolean r2 = r0.f8490g0
            monitor-enter(r4)
            int r5 = r4.f10386r     // Catch: java.lang.Throwable -> L4b
            r6 = r5
            int r5 = r4.j(r6)     // Catch: java.lang.Throwable -> L4b
            int r7 = r4.f10386r     // Catch: java.lang.Throwable -> L4b
            int r8 = r4.f10383o     // Catch: java.lang.Throwable -> L4b
            r10 = 1
            if (r7 == r8) goto L26
            r7 = r10
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L4e
            long[] r7 = r4.f10381m     // Catch: java.lang.Throwable -> L4b
            r11 = r7[r5]     // Catch: java.lang.Throwable -> L4b
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 >= 0) goto L32
            goto L4e
        L32:
            long r11 = r4.f10390v     // Catch: java.lang.Throwable -> L4b
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 <= 0) goto L3d
            if (r2 == 0) goto L3d
            int r8 = r8 - r6
            monitor-exit(r4)
            goto L50
        L3d:
            int r6 = r8 - r6
            r9 = 1
            r7 = r14
            int r8 = r4.h(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4b
            r14 = -1
            monitor-exit(r4)
            if (r8 != r14) goto L50
        L49:
            r8 = r3
            goto L50
        L4b:
            r0 = move-exception
            r14 = r0
            goto L72
        L4e:
            monitor-exit(r4)
            goto L49
        L50:
            monitor-enter(r4)
            if (r8 < 0) goto L5b
            int r14 = r4.f10386r     // Catch: java.lang.Throwable -> L5d
            int r14 = r14 + r8
            int r15 = r4.f10383o     // Catch: java.lang.Throwable -> L5d
            if (r14 > r15) goto L5b
            goto L60
        L5b:
            r10 = r3
            goto L60
        L5d:
            r0 = move-exception
            r14 = r0
            goto L70
        L60:
            com.google.android.gms.internal.ads.b80.l(r10)     // Catch: java.lang.Throwable -> L5d
            int r14 = r4.f10386r     // Catch: java.lang.Throwable -> L5d
            int r14 = r14 + r8
            r4.f10386r = r14     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r4)
            if (r8 != 0) goto L6f
            l(r1)
            return r3
        L6f:
            return r8
        L70:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5d
            throw r14
        L72:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4b
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ky1.a(long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0111, code lost:
    
        if (r7 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c2, code lost:
    
        if (r5.f10393y != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c4, code lost:
    
        if (r17 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        r7 = r5.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ca, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cc, code lost:
    
        if (r8 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d0, code lost:
    
        if (r7 == r5.f10375f) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d2, code lost:
    
        g(r7, r20);
     */
    @Override // com.google.android.gms.internal.ads.sy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(m r20, com.google.android.gms.internal.ads.es1 r21, int r22) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ky1.b(m, com.google.android.gms.internal.ads.es1, int):int");
    }

    @Override // com.google.android.gms.internal.ads.sy1
    public final boolean zza() {
        my1 my1Var = this.f7904b;
        if (!my1Var.o() && my1Var.M[this.f7903a].m(my1Var.f8490g0)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.sy1
    public final void zzb() {
        int i;
        IOException iOException;
        int i10 = this.f7903a;
        my1 my1Var = this.f7904b;
        zq0 zq0Var = my1Var.M[i10].f10376g;
        if (zq0Var == null) {
            if (my1Var.W == 7) {
                i = 6;
            } else {
                i = 3;
            }
            hq0 hq0Var = my1Var.D;
            IOException iOException2 = (IOException) hq0Var.f6874x;
            if (iOException2 == null) {
                d0 d0Var = (d0) hq0Var.f6873w;
                if (d0Var != null && (iOException = d0Var.f5235w) != null && d0Var.f5236x > i) {
                    throw iOException;
                }
                return;
            }
            throw iOException2;
        }
        throw ((iw1) zq0Var.f13255v);
    }
}
