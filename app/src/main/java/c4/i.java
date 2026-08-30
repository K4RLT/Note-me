package c4;

import android.content.Context;
import android.os.Looper;
import androidx.work.impl.foreground.SystemForegroundService;
import b2.d2;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.bm;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.dg;
import com.google.android.gms.internal.ads.et1;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.iu1;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.ku1;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.p01;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.rs1;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.vy;
import com.google.android.gms.internal.ads.x21;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import ya.m9;
import ya.o0;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3836u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3837v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f3838w;

    public i(List list, int i, Throwable th) {
        this.f3836u = 0;
        m9.a(list, "initCallbacks cannot be null");
        this.f3838w = new ArrayList(list);
        this.f3837v = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        je jeVar;
        boolean z3 = false;
        int i = 1;
        switch (this.f3836u) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3838w;
                int size = arrayList.size();
                if (this.f3837v != 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        ((h) arrayList.get(i10)).a();
                    }
                    return;
                } else {
                    for (int i11 = 0; i11 < size; i11++) {
                        ((h) arrayList.get(i11)).b();
                    }
                    return;
                }
            case 1:
                int i12 = this.f3837v;
                dg dgVar = (dg) this.f3838w;
                if (i12 > 0) {
                    try {
                        Thread.sleep(i12 * AdError.NETWORK_ERROR_CODE);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = dgVar.f5418a;
                    jeVar = x21.d(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    jeVar = null;
                }
                dg dgVar2 = (dg) this.f3838w;
                dgVar2.f5424h = jeVar;
                int i13 = this.f3837v;
                if (i13 < 4) {
                    if (jeVar == null || !jeVar.Z() || jeVar.u0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !jeVar.y0() || !jeVar.z0().z() || jeVar.z0().A() == -2) {
                        int i14 = i13 + 1;
                        if (dgVar2.f5427l) {
                            Future<?> submit = dgVar2.f5419b.submit(new i(dgVar2, i14, i));
                            if (i14 == 0) {
                                dgVar2.i = submit;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                bm bmVar = (bm) this.f3838w;
                int i15 = this.f3837v;
                be0 be0Var = bmVar.f4826x;
                if (be0Var != null) {
                    j6.s a10 = be0Var.a();
                    a10.k("action", "cct_nav");
                    a10.k("cct_navs", String.valueOf(i15));
                    a10.l();
                    return;
                }
                return;
            case 3:
                ((rx) this.f3838w).f10329b.onAudioFocusChange(this.f3837v);
                return;
            case 4:
                hy hyVar = (hy) this.f3838w;
                int i16 = this.f3837v;
                ly lyVar = hyVar.K;
                if (lyVar != null) {
                    lyVar.onWindowVisibilityChanged(i16);
                    return;
                }
                return;
            case 5:
                vy vyVar = (vy) this.f3838w;
                int i17 = this.f3837v;
                ly lyVar2 = vyVar.A;
                if (lyVar2 != null) {
                    lyVar2.onWindowVisibilityChanged(i17);
                    return;
                }
                return;
            case 6:
                ((p01) this.f3838w).b(this.f3837v + 1);
                return;
            case 7:
                et1 et1Var = (et1) this.f3838w;
                int i18 = et1Var.f5797u[this.f3837v].f4882a.f13314v;
                ku1 ku1Var = et1Var.P;
                ku1Var.p(ku1Var.u(), 1033, new iu1(i));
                return;
            case 8:
                mu muVar = (mu) this.f3838w;
                int i19 = this.f3837v;
                muVar.getClass();
                String str = bq0.f4860a;
                rs1 rs1Var = (rs1) muVar.f8423w;
                qs1 qs1Var = new qs1(i19);
                d2 d2Var = rs1Var.f10282u.U;
                if (Looper.myLooper() == ((io0) d2Var.f1438c).f7185a.getLooper()) {
                    z3 = true;
                }
                b80.K(z3);
                d2Var.f1436a++;
                ac.a aVar = new ac.a(d2Var, 14, qs1Var);
                io0 io0Var = (io0) d2Var.f1437b;
                if (io0Var.f7185a.getLooper().getThread().isAlive()) {
                    io0Var.e(aVar);
                }
                d2Var.f(Integer.valueOf(i19));
                return;
            case 9:
                ((ea.l) this.f3838w).f(this.f3837v);
                return;
            case 10:
                ((SystemForegroundService) this.f3838w).f1131y.cancel(this.f3837v);
                return;
            default:
                ((o0) this.f3838w).a(this.f3837v);
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i, int i10) {
        this.f3836u = i10;
        this.f3837v = i;
        this.f3838w = obj;
    }

    public /* synthetic */ i(et1 et1Var, int i, boolean z3) {
        this.f3836u = 7;
        this.f3838w = et1Var;
        this.f3837v = i;
    }
}
