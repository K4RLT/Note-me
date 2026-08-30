package b6;
import s.a;
import u.a;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import androidx.work.impl.WorkDatabase;
import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.Fence;
import com.google.android.filament.Renderer;
import com.google.android.filament.SwapChain;
import com.google.android.filament.View;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.i81;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.x0;
import com.google.android.gms.internal.consent_sdk.a6;
import com.google.android.gms.internal.consent_sdk.c0;
import com.google.android.gms.internal.consent_sdk.d0;
import com.google.android.gms.internal.consent_sdk.d7;
import com.google.android.gms.internal.consent_sdk.e0;
import com.google.android.gms.internal.consent_sdk.e4;
import com.google.android.gms.internal.consent_sdk.e7;
import com.google.android.gms.internal.consent_sdk.f0;
import com.google.android.gms.internal.consent_sdk.p0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.bx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.cx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dv;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ea;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fs;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.p5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.qu;
import com.google.android.gms.internal.mlkit_vision_digital_ink.r0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ss;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.w9;
import com.google.android.gms.internal.mlkit_vision_digital_ink.wv;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import u7.l2;
import u7.q7;

/* loaded from: classes.dex */
public final class u implements i81, e0, e7 {
    public static volatile boolean C = false;
    public final Object A;
    public Object B;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1781u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1782v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1783w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f1784x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1785y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1786z;

    public u(Context context, a6.a aVar, m6.b bVar, h hVar, WorkDatabase workDatabase, j6.p pVar, ArrayList arrayList) {
        this.B = new ra.e(3);
        this.f1781u = context.getApplicationContext();
        this.f1783w = bVar;
        this.f1782v = hVar;
        this.f1784x = aVar;
        this.f1785y = workDatabase;
        this.f1786z = pVar;
        this.A = arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r7.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r7.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    @Override // com.google.android.gms.internal.consent_sdk.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a(java.lang.String, org.json.JSONObject):boolean");
    }

    public void b(Surface surface) {
        Display display;
        Engine engine = (Engine) this.f1782v;
        surface.getClass();
        l2 l2Var = (l2) this.f1781u;
        if (l2Var.f26441f != null) {
            engine.y();
            SwapChain swapChain = l2Var.f26441f;
            swapChain.getClass();
            engine.u(swapChain);
        }
        l2Var.f26441f = engine.i(surface);
        Display display2 = ((TextureView) this.f1783w).getDisplay();
        if (display2 != null) {
            q7 q7Var = (q7) this.f1784x;
            Renderer renderer = (Renderer) this.f1785y;
            q7Var.getClass();
            renderer.getClass();
            if (q7Var.f26764c != renderer || (display = q7Var.f26765d) == null || display.getDisplayId() != display2.getDisplayId()) {
                q7Var.a();
                q7Var.f26764c = renderer;
                q7Var.f26765d = display2;
                q7Var.f26762a.registerDisplayListener(q7Var.f26766f, q7Var.f26763b);
                q7Var.e = true;
                q7Var.b();
            }
        }
    }

    public void c(int i, int i10) {
        Engine engine = (Engine) this.f1782v;
        Fence f10 = engine.f();
        f10.a();
        engine.o(f10);
        ((View) this.f1786z).k(new com.google.android.filament.k(i, i10));
        double d2 = i / i10;
        ((l2) this.f1781u).f26445h = (float) d2;
        ((Camera) this.A).d(45.0d, d2);
        ((b8.l) this.B).invoke(Integer.valueOf(i), Integer.valueOf(i10));
    }

    public w9 d(final fs fsVar, final boolean z3) {
        cx.b("%s getFileGroup %s %s", "MDDManager", fsVar.w(), fsVar.x());
        ya e = e();
        ea eaVar = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.fv
            @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
            public final ya l(Object obj) {
                return ((com.google.android.gms.internal.ads.hb) b6.u.this.f1782v).s(fsVar, z3);
            }
        };
        int i = g2.f14354a;
        return n5.q(e, new r0(q1.b(), 3, eaVar), (Executor) this.A);
    }

    public ya e() {
        if (C) {
            return va.f15125v;
        }
        lx w10 = lx.w(va.f15125v);
        dv dvVar = new dv(this, 4);
        Executor executor = (Executor) this.A;
        return w10.y(dvVar, executor).y(new dv(this, 5), executor).y(new dv(this, 6), executor).y(new dv(this, 7), executor).x(new ys(12), executor);
    }

    public w9 f() {
        i60 i60Var = (i60) this.f1784x;
        com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) i60Var.f7026d;
        Context context = (Context) i60Var.f7023a;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                com.google.android.gms.internal.mlkit_vision_digital_ink.r a10 = com.google.android.gms.internal.mlkit_vision_digital_ink.a(context);
                a10.f14879a = "*.lease";
                iVar.d(a10.c());
            } catch (y unused) {
                Random random = cx.f14175a;
                s5 s5Var = bx.f14126a;
                s5Var.getClass();
                Level level = Level.FINER;
                ((p5) s5Var.f(level).b(35, "v")).d("SharedFileManager", "%s: Failed to release the leases in the android shared storage. UnsupportedFileStorageOperation was thrown");
                s5Var.f(level).j();
            } catch (IOException e) {
                cx.j(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
            }
        }
        try {
            iVar.f(n5.a(context, (q2) i60Var.f7029h));
        } catch (IOException unused2) {
        }
        va vaVar = va.f15125v;
        dv dvVar = new dv(this, 1);
        int i = g2.f14354a;
        return n5.q(vaVar, new r0(q1.b(), 3, dvVar), (Executor) this.A);
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public lw zzb() {
        Application application = (Application) ((a6) this.f1781u).f13354v;
        Handler handler = d0.f13387a;
        f0.c(handler);
        c0 c0Var = d0.f13388b;
        f0.c(c0Var);
        return new lw(application, handler, c0Var, (com.google.android.gms.internal.consent_sdk.g) ((d7) this.f1783w).zzb(), (com.google.android.gms.internal.consent_sdk.n) ((d7) this.f1784x).zzb(), ((e4) this.f1785y).a(), ((j6.n) this.f1786z).v(), (p0) ((d7) this.A).zzb(), (com.google.android.gms.internal.consent_sdk.y) ((d7) this.B).zzb());
    }

    public void h(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("action");
        String queryParameter2 = parse.getQueryParameter("args");
        e0[] e0VarArr = {this, (nd.o) this.f1786z};
        p0 p0Var = (p0) this.f1785y;
        p0Var.getClass();
        p0Var.f13521a.execute(new ba.j(5, queryParameter, queryParameter2, e0VarArr));
    }

    @Override // com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public ac.b mo207zza() {
        fp fpVar = f9.k.C.f16814d;
        Context context = (Context) this.f1781u;
        x0 x0Var = new x0(0, 0, 0);
        j6.l lVar = (j6.l) this.f1784x;
        jj jjVar = new jj();
        wh0 wh0Var = (wh0) this.f1785y;
        cq0 cq0Var = (cq0) this.f1786z;
        be0 be0Var = (be0) this.A;
        h00 e = fp.e(context, x0Var, "", false, false, (of) this.f1782v, null, (l9.a) this.f1783w, null, lVar, jjVar, null, null, wh0Var, cq0Var, be0Var);
        fj fjVar = new fj(e);
        e.j0().A = new m00(fjVar, 0);
        e.loadUrl((String) this.B);
        return fjVar;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f1781u = obj;
        this.f1782v = obj2;
        this.f1783w = obj3;
        this.f1784x = obj4;
        this.f1785y = obj5;
        this.f1786z = obj6;
        this.A = obj7;
        this.B = obj8;
    }

    public u(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, gw gwVar) {
        this.f1781u = str;
        this.f1782v = str2;
        this.A = arrayList;
        this.f1783w = str3;
        this.f1784x = str4;
        this.f1785y = str5;
        this.f1786z = str6;
        this.B = gwVar;
    }

    public u(Context context, dx dxVar, i60 i60Var, wv wvVar, hb hbVar, qu quVar, q2 q2Var, Executor executor, ss ssVar) {
        this.f1781u = context;
        this.f1784x = i60Var;
        this.f1785y = wvVar;
        this.f1782v = hbVar;
        this.f1783w = quVar;
        this.f1786z = q2Var;
        this.A = executor;
        this.B = ssVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e0
    /* renamed from: zza, reason: collision with other method in class */
    public Executor mo192zza() {
        final Handler handler = (Handler) this.f1783w;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.s
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
