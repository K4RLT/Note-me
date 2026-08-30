package b6;
import l.a;
import m.b;
import v.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import androidx.graphics.CanvasBufferedRendererV29;
import androidx.ink.strokes.Stroke;
import androidx.work.impl.WorkDatabase;
import b8.m4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import kotlin.jvm.internal.w;
import p7.c0;
import pe.z;
import ya.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1753u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1754v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1755w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1756x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1757y;

    public /* synthetic */ l(Context context, m3.c cVar, p7.d dVar, String str, CountDownLatch countDownLatch) {
        this.f1753u = 2;
        this.f1754v = context;
        this.f1755w = cVar;
        this.f1756x = dVar;
        this.f1757y = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object kVar;
        switch (this.f1753u) {
            case 0:
                List list = (List) this.f1754v;
                j6.j jVar = (j6.j) this.f1755w;
                a6.a aVar = (a6.a) this.f1756x;
                WorkDatabase workDatabase = (WorkDatabase) this.f1757y;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).d(jVar.f18928a);
                }
                b(aVar, workDatabase, list);
                return;
            case 1:
                CanvasBufferedRendererV29.dispatchRender$lambda$11$lambda$10((CanvasBufferedRendererV29) this.f1754v, (CanvasBufferedRendererV29.PreservedRenderStrategy) this.f1755w, (p3.a) this.f1756x, (w) this.f1757y);
                return;
            case 2:
                Context context = (Context) this.f1754v;
                m3.c cVar = (m3.c) this.f1755w;
                p7.d dVar = (p7.d) this.f1756x;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1757y;
                try {
                    p0.a(context, cVar, dVar, (Handler) p7.e.f22449g.getValue());
                    kVar = z.f22715a;
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (pe.a(kVar) != null) {
                    countDownLatch.countDown();
                    return;
                }
                return;
            case 3:
                Bitmap bitmap = (Bitmap) this.f1754v;
                Stroke stroke = (Stroke) this.f1755w;
                Matrix matrix = (Matrix) this.f1756x;
                c0 c0Var = (c0) this.f1757y;
                boolean z3 = p7.v.f22585a;
                m4 m4Var = new m4(bitmap, 3, c0Var);
                p7.u uVar = new p7.u(bitmap, stroke, matrix, m4Var);
                if (!p7.v.f22585a) {
                    m4Var.b(null, 0, 0);
                    return;
                }
                p7.v.f22594l.add(uVar);
                if (p7.v.f22595m == null) {
                    p7.e();
                    return;
                }
                return;
            default:
                s8.a aVar2 = (s8.a) this.f1754v;
                n8.i iVar = (n8.i) this.f1755w;
                String str = iVar.f21181a;
                k8.g gVar = (k8.g) this.f1756x;
                n8.h hVar = (n8.h) this.f1757y;
                aVar2.getClass();
                Logger logger = s8.a.f25031f;
                try {
                    o8.e a10 = aVar2.f25034c.a(str);
                    if (a10 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        aVar2.e.p(new e7.c(4, aVar2, iVar, ((l8.b) a10).a(hVar)));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    gVar.a(e);
                    return;
                }
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1753u = i;
        this.f1754v = obj;
        this.f1755w = obj2;
        this.f1756x = obj3;
        this.f1757y = obj4;
    }
}
