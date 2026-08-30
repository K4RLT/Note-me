package i2;
import c.a;

import a0.k0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import b8.l2;
import c2.x;
import j2.n;
import java.util.function.Consumer;
import k1.l0;
import o0.y1;
import pf.b0;
import pf.o1;
import pf.r1;
import r0.i1;
import y2.k;

/* loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f18152a;

    /* renamed from: b, reason: collision with root package name */
    public final k f18153b;

    /* renamed from: c, reason: collision with root package name */
    public final z5.h f18154c;

    /* renamed from: d, reason: collision with root package name */
    public final x f18155d;
    public final uf.c e;

    /* renamed from: f, reason: collision with root package name */
    public final f f18156f;

    public c(n nVar, k kVar, uf.c cVar, z5.h hVar, x xVar) {
        this.f18152a = nVar;
        this.f18153b = kVar;
        this.f18154c = hVar;
        this.f18155d = xVar;
        this.e = b0.z(cVar, d.f18157u);
        this.f18156f = new f(kVar.b(), new y1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r9 == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i2.c r11, android.view.ScrollCaptureSession r12, y2.k r13, ve.c r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.a(i2.c, android.view.ScrollCaptureSession, y2.k, ve.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        b0.x(this.e, o1.f22776v, new b5.a(this, runnable, null, 25), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        r1 x9 = b0.x(this.e, null, new l2(this, scrollCaptureSession, rect, consumer, (te.c) null, 11), 3);
        x9.p(new k0(21, cancellationSignal));
        cancellationSignal.setOnCancelListener(new i0.k(1, x9));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(l0.C(this.f18153b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f18156f.f18162b = 0.0f;
        ((i1) this.f18154c.f31922v).setValue(Boolean.TRUE);
        runnable.run();
    }
}
