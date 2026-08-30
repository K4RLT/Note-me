package e7;
import c.c;
import c.i;
import l.a;

import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.wv;
import g9.s2;
import pe.z;

/* loaded from: classes.dex */
public final class l extends m9.b {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r9 != 3) goto L18;
     */
    @Override // z8.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(z8.l r9) {
        /*
            r8 = this;
            e7.o r0 = e7.o.f15975a
            r0 = 0
            e7.o.f15978d = r0
            r1 = 0
            e7.o.f15977c = r1
            int r1 = e7.o.f15983k
            r2 = 1
            int r1 = r1 + r2
            e7.o.f15983k = r1
            int r1 = e7.o.f15983k
            long r3 = android.os.SystemClock.elapsedRealtime()
            e7.o.f15985m = r3
            int r3 = r9.f31969a
            e7.o.f15986n = r3
            int r3 = r9.f31969a
            java.lang.String r4 = r9.f31970b
            java.lang.String r5 = ", código "
            java.lang.String r6 = "): "
            java.lang.String r7 = "rewarded no disponible (fallo "
            java.lang.StringBuilder r3 = g3.a.n(r7, r1, r5, r6, r3)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "AdsManager"
            android.util.Log.d(r4, r3)
            if (r1 != r2) goto L50
            int r3 = r9.f31969a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            pe.j r4 = new pe.j
            java.lang.String r5 = "code"
            r4.<init>(r5, r3)
            pe.j[] r3 = new pe.j[]{r4}
            android.os.Bundle r3 = f7.c(r3)
            java.lang.String r4 = "ad_load_failed"
            f7.i(r4, r3)
        L50:
            int r9 = r9.f31969a
            r3 = 4
            if (r1 <= r3) goto L56
            goto L76
        L56:
            if (r9 == 0) goto L6d
            r3 = 9
            if (r9 == r3) goto L63
            r3 = 2
            if (r9 == r3) goto L6d
            r3 = 3
            if (r9 == r3) goto L63
            goto L76
        L63:
            r3 = 30000(0x7530, double:1.4822E-319)
            int r1 = r1 - r2
            long r0 = r3 << r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L76
        L6d:
            r3 = 5000(0x1388, double:2.4703E-320)
            int r1 = r1 - r2
            long r0 = r3 << r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L76:
            if (r0 == 0) goto L8a
            boolean r9 = e7.o.i
            if (r9 == 0) goto L8a
            android.os.Handler r9 = e7.o.f15979f
            c2.m r1 = e7.o.f15984l
            r9.removeCallbacks(r1)
            long r2 = r0.longValue()
            r9.postDelayed(r1, r2)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a(z8.l):void");
    }

    @Override // z8.u
    public final void b(Object obj) {
        Object kVar;
        fw fwVar = (fw) obj;
        fwVar.getClass();
        o oVar = o.f15975a;
        o.f15978d = fwVar;
        o.f15981h = SystemClock.elapsedRealtime();
        o.f15977c = false;
        o.f15983k = 0;
        try {
            b1.h hVar = new b1.h(fwVar);
            try {
                wv wvVar = fwVar.f6189a;
                if (wvVar != null) {
                    wvVar.f4(new s2(hVar));
                }
            } catch (RemoteException e) {
                l9.i.i(e, "#007 Could not call remote method.");
            }
            kVar = z.f22715a;
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        Throwable a10 = pe.a(kVar);
        if (a10 != null) {
            wd0.o("no se pudo enganchar el aviso de cobro: ", a10.getMessage(), "AdsManager");
        }
        o oVar2 = o.f15975a;
        Handler handler = o.f15979f;
        c2.m mVar = o.f15988p;
        handler.removeCallbacks(mVar);
        if (o.i) {
            handler.postDelayed(mVar, 2700000L);
        }
    }
}
