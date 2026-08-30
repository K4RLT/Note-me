package g1;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import df.l;
import k1.p;
import y2.m;

/* loaded from: classes.dex */
public final class b extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final y2.d f17378a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17379b;

    /* renamed from: c, reason: collision with root package name */
    public final l f17380c;

    public b(y2.d dVar, long j10, l lVar) {
        this.f17378a = dVar;
        this.f17379b = j10;
        this.f17380c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        m1.b bVar = new m1.b();
        Canvas canvas2 = k1.b.f19467a;
        k1.a aVar = new k1.a();
        aVar.f19463a = canvas;
        m1.a aVar2 = bVar.f20423u;
        y2.c cVar = aVar2.f20419a;
        m mVar = aVar2.f20420b;
        p pVar = aVar2.f20421c;
        long j10 = aVar2.f20422d;
        aVar2.f20419a = this.f17378a;
        aVar2.f20420b = m.f30814u;
        aVar2.f20421c = aVar;
        aVar2.f20422d = this.f17379b;
        aVar.l();
        this.f17380c.invoke(bVar);
        aVar.s();
        aVar2.f20419a = cVar;
        aVar2.f20420b = mVar;
        aVar2.f20421c = pVar;
        aVar2.f20422d = j10;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j10 = this.f17379b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        y2.d dVar = this.f17378a;
        point.set(dVar.t0(intBitsToFloat / dVar.a()), dVar.t0(Float.intBitsToFloat((int) (j10 & 4294967295L)) / dVar.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
