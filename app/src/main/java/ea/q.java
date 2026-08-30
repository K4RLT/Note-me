package ea;
import l.b;
import q.a;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class q implements ib.c {

    /* renamed from: u, reason: collision with root package name */
    public final d f16027u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16028v;

    /* renamed from: w, reason: collision with root package name */
    public final a f16029w;

    /* renamed from: x, reason: collision with root package name */
    public final long f16030x;

    /* renamed from: y, reason: collision with root package name */
    public final long f16031y;

    public q(d dVar, int i, a aVar, long j10, long j11) {
        this.f16027u = dVar;
        this.f16028v = i;
        this.f16029w = aVar;
        this.f16030x = j10;
        this.f16031y = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fa.f a(ea.l r4, fa.e r5, int r6) {
        /*
            fa.g0 r5 = r5.P
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            fa.f r5 = r5.f16866x
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f16851v
            if (r1 == 0) goto L35
            int[] r1 = r5.f16853x
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f16855z
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.F
            int r6 = r5.f16854y
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.a(ea.l, fa.e, int):fa.f");
    }

    @Override // ib.c
    public final void f(ib.o oVar) {
        boolean z3;
        int i;
        int i10;
        int i11;
        int i12;
        long j10;
        long j11;
        if (this.f16027u.a()) {
            fa.m mVar = (fa.m) fa.b().f16895u;
            if (mVar == null || mVar.f16899v) {
                l lVar = (l) this.f16027u.D.get(this.f16029w);
                if (lVar != null) {
                    Object obj = lVar.f16017v;
                    if (obj instanceof fa.e) {
                        fa.e eVar = (fa.e) obj;
                        boolean z9 = true;
                        int i13 = 0;
                        if (this.f16030x > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i14 = eVar.K;
                        int i15 = 100;
                        if (mVar != null) {
                            z3 &= mVar.f16900w;
                            int i16 = mVar.f16901x;
                            int i17 = mVar.f16902y;
                            i = mVar.f16898u;
                            if (eVar.P != null && !eVar.e()) {
                                fa.f a10 = a(lVar, eVar, this.f16028v);
                                if (a10 != null) {
                                    if (!a10.f16852w || this.f16030x <= 0) {
                                        z9 = false;
                                    }
                                    i17 = a10.f16854y;
                                    z3 = z9;
                                } else {
                                    return;
                                }
                            }
                            i11 = i16;
                            i10 = i17;
                        } else {
                            i = 0;
                            i10 = 100;
                            i11 = 5000;
                        }
                        d dVar = this.f16027u;
                        int i18 = -1;
                        if (oVar.l()) {
                            i12 = 0;
                        } else {
                            if (!oVar.f18384d) {
                                Exception i19 = oVar.i();
                                if (i19 instanceof da.d) {
                                    Status status = ((da.d) i19).f15819u;
                                    i15 = status.f4283u;
                                    ca.b bVar = status.f4286x;
                                    if (bVar != null) {
                                        i13 = bVar.f4022v;
                                        i12 = i15;
                                    }
                                } else {
                                    i12 = 101;
                                    i13 = -1;
                                }
                            }
                            i12 = i15;
                            i13 = -1;
                        }
                        if (z3) {
                            long j12 = this.f16030x;
                            long j13 = this.f16031y;
                            long currentTimeMillis = System.currentTimeMillis();
                            i18 = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = currentTimeMillis;
                            j10 = j12;
                        } else {
                            j10 = 0;
                            j11 = 0;
                        }
                        r rVar = new r(new fa.k(this.f16028v, i12, i13, j10, j11, null, null, i14, i18), i, i11, i10);
                        bb.a aVar = dVar.G;
                        aVar.sendMessage(aVar.obtainMessage(18, rVar));
                    }
                }
            }
        }
    }
}
