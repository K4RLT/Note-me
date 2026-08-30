package a6;
import x.o;
import a.a;
import c.k;
import n.w;
import p.m;
import q.d;
import q.q;
import q.x;
import r.b;
import v.c;
import v.f;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.graphics.RenderQueue;
import androidx.graphics.lowlatency.CanvasFrontBufferedRenderer;
import androidx.graphics.lowlatency.CanvasFrontBufferedRenderer$mHolderCallback$1;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.graphics.surface.SurfaceControlWrapper$Transaction$addTransactionCommittedListener$1;
import androidx.hardware.SyncFenceBindings;
import androidx.lifecycle.h0;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c2.f0;
import com.daren.scraply.MainActivity;
import com.daren.scraply.data.local.ScraplyDatabase;
import com.daren.scraply.ui.canvas.CameraKeepAliveService;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import eb.h2;
import eb.u1;
import j.i0;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import pf.f1;
import r.m1;
import r2.a0;
import u7.m3;
import wa.f8;
import wa.v8;
import wa.w8;
import ya.gd;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f265u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f266v;

    public /* synthetic */ e(h2 h2Var, Intent intent) {
        this.f265u = 19;
        this.f266v = intent;
    }

    private final void a() {
        androidx.hardware.a aVar = (androidx.hardware.a) this.f266v;
        File[] listFiles = aVar.f835b.listFiles();
        int i = 0;
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    long nGetSignalTime = SyncFenceBindings.f831a.nGetSignalTime(parseInt);
                    if (androidx.hardware.a(nGetSignalTime) > 3000) {
                        aVar.f838f.add(new j4.d(parseInt, nGetSignalTime));
                        if (aVar.f838f.size() > 100) {
                            ArrayList arrayList = aVar.f838f;
                            if (arrayList.size() > 1) {
                                qe.m(arrayList, new u1(1));
                            }
                            while (arrayList.size() > 100) {
                                try {
                                    int i10 = ((j4.d) qe.q(arrayList)).f18904a;
                                    SyncFenceBindings.Companion companion = SyncFenceBindings.f831a;
                                    if (androidx.hardware.a(companion.nGetSignalTime(i10)) > 3000) {
                                        companion.nForceClose(i10);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                } catch (NumberFormatException unused2) {
                    Log.w("FileDescriptorMonitor", "Unable to parse fd value from name " + file.getName());
                }
            }
        }
        if (aVar.f834a.get()) {
            if (aVar.e.isRunning()) {
                aVar.e.postDelayed(aVar.f839g, 1000L);
            }
        } else if (aVar.f837d.get() && aVar.e.isRunning()) {
            aVar.e.quit();
        }
        synchronized (aVar.f836c) {
            try {
                ArrayList arrayList2 = aVar.f836c;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((df.a) obj).invoke();
                }
                aVar.f836c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f266v;
        if (constraintTrackingWorker.B.f19962u instanceof l6.a) {
            return;
        }
        String b10 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        q d2 = d();
        d2.getClass();
        if (b10 != null && b10.length() != 0) {
            p a10 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b10, constraintTrackingWorker.f1133y);
            constraintTrackingWorker.C = a10;
            if (a10 == null) {
                d2.a(n6.a.f21151a, "No worker to delegate to.");
                l6.j jVar = constraintTrackingWorker.B;
                jVar.getClass();
                jVar.j(new l());
                return;
            }
            b6.r b11 = b6.b(constraintTrackingWorker.getApplicationContext());
            j6.q C = b11.f1774c.C();
            String uuid = constraintTrackingWorker.getId().toString();
            uuid.getClass();
            j6.p j10 = C.j(uuid);
            if (j10 == null) {
                l6.j jVar2 = constraintTrackingWorker.B;
                jVar2.getClass();
                String str = n6.a.f21151a;
                jVar2.j(new l());
                return;
            }
            h6.j jVar3 = b11.f1779j;
            jVar3.getClass();
            c7.n nVar = new c7.n(jVar3);
            pf.v vVar = ((m6.b) b11.f1775d).f20614b;
            vVar.getClass();
            constraintTrackingWorker.B.a(new e(18, f6.a(nVar, j10, vVar, constraintTrackingWorker)), new fc.d(2));
            if (nVar.a(j10)) {
                d2.a(n6.a.f21151a, "Constraints met for delegate ".concat(b10));
                try {
                    p pVar = constraintTrackingWorker.C;
                    pVar.getClass();
                    ac.b startWork = pVar.startWork();
                    startWork.getClass();
                    startWork.a(new b6.g(constraintTrackingWorker, 16, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str2 = n6.a.f21151a;
                    String k3 = a.k("Delegated worker ", b10, " threw exception in startWork.");
                    if (d2.f288a <= 3) {
                        Log.d(str2, k3, th);
                    }
                    synchronized (constraintTrackingWorker.f1134z) {
                        try {
                            if (constraintTrackingWorker.A) {
                                d2.a(str2, "Constraints were unmet, Retrying.");
                                l6.j jVar4 = constraintTrackingWorker.B;
                                jVar4.getClass();
                                jVar4.j(new Object());
                                return;
                            }
                            l6.j jVar5 = constraintTrackingWorker.B;
                            jVar5.getClass();
                            jVar5.j(new l());
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            d2.a(n6.a.f21151a, "Constraints not met for delegate " + b10 + ". Requesting retry.");
            l6.j jVar6 = constraintTrackingWorker.B;
            jVar6.getClass();
            jVar6.j(new Object());
            return;
        }
        d2.b(n6.a.f21151a, "No worker to delegate to.");
        l6.j jVar7 = constraintTrackingWorker.B;
        jVar7.getClass();
        jVar7.j(new l());
    }

    private final void c() {
        u0 u0Var = (u0) this.f266v;
        synchronized (((ArrayDeque) u0Var.f15039y)) {
            SharedPreferences.Editor edit = ((SharedPreferences) u0Var.f15036v).edit();
            String str = (String) u0Var.f15037w;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) u0Var.f15039y).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) u0Var.f15038x);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, pe.g] */
    @Override // java.lang.Runnable
    public final void run() {
        c2.x xVar;
        c2.x xVar2;
        p7.u uVar;
        boolean z3;
        View findFocus;
        Boolean bool = null;
        int i = 0;
        switch (this.f265u) {
            case 0:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f266v;
                if (coroutineWorker.f1098z.f19962u instanceof l6.a) {
                    coroutineWorker.f1097y.j(null);
                    return;
                }
                return;
            case 1:
                h0 h0Var = (h0) this.f266v;
                androidx.lifecycle.y yVar = h0Var.f1036z;
                if (h0Var.f1032v == 0) {
                    h0Var.f1033w = true;
                    yVar.d(androidx.lifecycle.o.ON_PAUSE);
                }
                if (h0Var.f1031u == 0 && h0Var.f1033w) {
                    yVar.d(androidx.lifecycle.o.ON_STOP);
                    h0Var.f1034x = true;
                    return;
                }
                return;
            case 2:
                k kVar = (k) this.f266v;
                Runnable runnable = kVar.f3245v;
                if (runnable != null) {
                    runnable.run();
                    kVar.f3245v = null;
                    return;
                }
                return;
            case 3:
                c3.b((c3.v) this.f266v);
                return;
            case 4:
                c2.x xVar3 = (c2.x) this.f266v;
                xVar3.U0 = false;
                MotionEvent motionEvent = xVar3.M0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    xVar3.H(motionEvent);
                    return;
                } else {
                    x.o("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 5:
                m1 m1Var = (m1) this.f266v;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    m1Var.invoke();
                    return;
                } finally {
                }
            case 6:
                f0 f0Var = (f0) this.f266v;
                Trace.beginSection("measureAndLayout");
                try {
                    f0Var.f3516d.v(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        f0Var.g();
                        Trace.endSection();
                        f0Var.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 7:
                c4.u uVar2 = (c4.u) this.f266v;
                synchronized (uVar2.f3867x) {
                    try {
                        if (uVar2.B != null) {
                            try {
                                m3.g c10 = uVar2.c();
                                int i10 = c10.e;
                                if (i10 == 2) {
                                    synchronized (uVar2.f3867x) {
                                    }
                                }
                                if (i10 == 0) {
                                    try {
                                        int i11 = l3.e.f19887a;
                                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        ed.e eVar = uVar2.f3866w;
                                        Context context = uVar2.f3864u;
                                        eVar.getClass();
                                        m3.g[] gVarArr = {c10};
                                        v8 v8Var = j3.f.f18880a;
                                        gd.a("TypefaceCompat.createFromFontInfo");
                                        try {
                                            Typeface b10 = j3.f.f18880a.b(context, gVarArr, 0);
                                            Trace.endSection();
                                            MappedByteBuffer d2 = w8.d(uVar2.f3864u, c10.f20605a);
                                            if (d2 != null && b10 != null) {
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    j6.n nVar = new j6.n(b10, wa.a(d2));
                                                    Trace.endSection();
                                                    synchronized (uVar2.f3867x) {
                                                        try {
                                                            wa.r rVar = uVar2.B;
                                                            if (rVar != null) {
                                                                rVar.b(nVar);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    uVar2.b();
                                                    return;
                                                } finally {
                                                    int i12 = l3.e.f19887a;
                                                }
                                            }
                                            throw new RuntimeException("Unable to open file.");
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            } catch (Throwable th) {
                                synchronized (uVar2.f3867x) {
                                    try {
                                        wa.r rVar2 = uVar2.B;
                                        if (rVar2 != null) {
                                            rVar2.a(th);
                                        }
                                        uVar2.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 8:
                ((MainActivity) this.f266v).O = true;
                return;
            case 9:
                f1.d dVar = (f1.d) this.f266v;
                boolean e = dVar.e();
                c2.x xVar4 = dVar.f16637u;
                if (e) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        xVar4.v(true);
                        w wVar = dVar.F;
                        int[] iArr = wVar.f20903b;
                        long[] jArr = wVar.f20902a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j10 = jArr[i13];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    int i15 = i;
                                    while (i15 < i14) {
                                        if ((255 & j10) < 128) {
                                            int i16 = iArr[(i13 << 3) + i15];
                                            if (!dVar.d().a(i16)) {
                                                xVar2 = xVar4;
                                                dVar.f16640x.add(new f1.e(i16, dVar.E, f1.f.f16648v, null));
                                                dVar.B.e(pe.z.f22715a);
                                                j10 >>= 8;
                                                i15++;
                                                xVar4 = xVar2;
                                            }
                                        }
                                        xVar2 = xVar4;
                                        j10 >>= 8;
                                        i15++;
                                        xVar4 = xVar2;
                                    }
                                    xVar = xVar4;
                                    if (i14 == 8) {
                                    }
                                } else {
                                    xVar = xVar4;
                                }
                                if (i13 != length) {
                                    i13++;
                                    xVar4 = xVar;
                                    i = 0;
                                }
                            }
                        } else {
                            xVar = xVar4;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        dVar.h(xVar.getSemanticsOwner().a(), dVar.G);
                        Trace.endSection();
                        dVar.b(dVar.d());
                        dVar.n();
                        dVar.H = false;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    } finally {
                    }
                }
                return;
            case 10:
                RenderQueue.c((RenderQueue) this.f266v);
                return;
            case 11:
                CanvasFrontBufferedRenderer.mCancelRunnable$lambda$1((CanvasFrontBufferedRenderer) this.f266v);
                return;
            case 12:
                CanvasFrontBufferedRenderer$mHolderCallback$1.a((CountDownLatch) this.f266v);
                return;
            case 13:
                SurfaceControlWrapper$Transaction$addTransactionCommittedListener$1.a((SurfaceControlCompat.TransactionCommittedListener) this.f266v);
                return;
            case 14:
                try {
                    ((Runnable) this.f266v).run();
                    return;
                } catch (RuntimeException e8) {
                    if (f8.a(e8)) {
                        Log.w("ScraplyDb", "SQLite sin memoria nativa; trabajo interno de Room saltado", e8);
                        eb.y yVar2 = ScraplyDatabase.f4148l;
                        try {
                            kc.c cVar = (kc.c) bc.g.c().b(kc.c.class);
                            if (cVar != null) {
                                cVar.a(e8);
                                return;
                            }
                            throw new NullPointerException("FirebaseCrashlytics component is not present.");
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e8;
                }
            case 15:
                a();
                return;
            case 16:
                n0.i.a((n0.i) this.f266v);
                return;
            case 17:
                b();
                return;
            case 18:
                ((f1) this.f266v).j(null);
                return;
            case 19:
                h2.a((Intent) this.f266v);
                return;
            case 20:
                c();
                return;
            case gl.zzm /* 21 */:
                nd.x xVar5 = (nd.x) this.f266v;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + xVar5.f21304a.getAction() + " finishing.");
                xVar5.f21305b.d(null);
                return;
            case 22:
                ((o6.p) this.f266v).c();
                return;
            case 23:
                if (p7.v.f22597o == this.f266v && (uVar = p7.v.f22595m) != null) {
                    p7.v.f22597o = null;
                    p7.v.f22595m = null;
                    p7.v.f22596n = null;
                    p7.f("la GPU tardó más de 2000 ms");
                    uVar.f22580d.b(null, 0, 0);
                    while (true) {
                        p7.u uVar3 = (p7.u) p7.v.f22594l.poll();
                        if (uVar3 == null) {
                            p7.c();
                            return;
                        }
                        uVar3.f22580d.b(null, 0, 0);
                    }
                } else {
                    return;
                }
                break;
            case 24:
                View view = (View) this.f266v;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 25:
                a0 a0Var = (a0) this.f266v;
                i0 i0Var = a0Var.f24448b;
                a0Var.f24458n = null;
                t0.e eVar2 = a0Var.f24457m;
                View view2 = a0Var.f24447a;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    eVar2.j();
                    return;
                }
                Object[] objArr = eVar2.f25617u;
                int i17 = eVar2.f25619w;
                Boolean bool2 = null;
                for (int i18 = 0; i18 < i17; i18++) {
                    r2.z zVar = (r2.z) objArr[i18];
                    int ordinal = zVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                l4.a.o();
                                return;
                            }
                            if (!kotlin.jvm.internal.a(bool, Boolean.FALSE)) {
                                if (zVar == r2.z.f24522w) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                bool2 = Boolean.valueOf(z3);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                }
                eVar2.j();
                if (kotlin.jvm.internal.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) i0Var.f18637w.getValue()).restartInput((View) i0Var.f18636v);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((ic.c) ((k6.i) i0Var.f18638x).f19569v).C();
                    } else {
                        ((ic.c) ((k6.i) i0Var.f18638x).f19569v).v();
                    }
                }
                if (kotlin.jvm.internal.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) i0Var.f18637w.getValue()).restartInput((View) i0Var.f18636v);
                    return;
                }
                return;
            case 26:
                nd.o oVar = (nd.o) this.f266v;
                ((u8.f) oVar.f21274x).p(new b1.h(24, oVar));
                return;
            case 27:
                v7.k kVar2 = ((m3) this.f266v).f26542p;
                v7.k.h(kVar2.f27441b, kVar2.f27443d);
                v7.k.h(kVar2.f27442c, kVar2.e);
                return;
            default:
                CameraKeepAliveService cameraKeepAliveService = (CameraKeepAliveService) this.f266v;
                int i19 = CameraKeepAliveService.f4158v;
                cameraKeepAliveService.stopSelf();
                return;
        }
    }

    public /* synthetic */ e(int i, Object obj) {
        this.f265u = i;
        this.f266v = obj;
    }
}
