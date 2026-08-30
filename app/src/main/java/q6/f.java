package q6;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements l, r6.a, c {

    /* renamed from: b, reason: collision with root package name */
    public final o6.j f23477b;

    /* renamed from: c, reason: collision with root package name */
    public final r6.h f23478c;

    /* renamed from: d, reason: collision with root package name */
    public final r6.e f23479d;
    public final w6.a e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23481g;

    /* renamed from: a, reason: collision with root package name */
    public final Path f23476a = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final f4.h f23480f = new f4.h(2);

    public f(o6.j jVar, x6.b bVar, w6.a aVar) {
        this.f23477b = jVar;
        r6.e b10 = aVar.f27709b.b();
        this.f23478c = (r6.h) b10;
        r6.e b11 = aVar.f27708a.b();
        this.f23479d = b11;
        this.e = aVar;
        bVar.e(b10);
        bVar.e(b11);
        b10.a(this);
        b11.a(this);
    }

    @Override // r6.a
    public final void a() {
        this.f23481g = false;
        this.f23477b.invalidateSelf();
    }

    @Override // q6.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                c cVar = (c) arrayList.get(i);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f23559c == 1) {
                        this.f23480f.f16717a.add(sVar);
                        sVar.e(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // q6.l
    public final Path f() {
        boolean z3 = this.f23481g;
        Path path = this.f23476a;
        if (z3) {
            return path;
        }
        path.reset();
        w6.a aVar = this.e;
        if (aVar.f27711d) {
            this.f23481g = true;
            return path;
        }
        PointF pointF = (PointF) this.f23478c.d();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f27710c) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f23479d.d();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f23480f.b(path);
        this.f23481g = true;
        return path;
    }
}
