package q6;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements r6.a, c, l {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23534c;

    /* renamed from: d, reason: collision with root package name */
    public final o6.j f23535d;
    public final r6.e e;

    /* renamed from: f, reason: collision with root package name */
    public final r6.e f23536f;

    /* renamed from: g, reason: collision with root package name */
    public final r6.f f23537g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23539j;

    /* renamed from: a, reason: collision with root package name */
    public final Path f23532a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f23533b = new RectF();

    /* renamed from: h, reason: collision with root package name */
    public final f4.h f23538h = new f4.h(2);
    public r6.e i = null;

    public n(o6.j jVar, x6.b bVar, w6.i iVar) {
        this.f23534c = iVar.f27746c;
        this.f23535d = jVar;
        r6.e b10 = iVar.f27747d.b();
        this.e = b10;
        r6.e b11 = ((v6.e) iVar.e).b();
        this.f23536f = b11;
        r6.f b12 = iVar.f27745b.b();
        this.f23537g = b12;
        bVar.e(b10);
        bVar.e(b11);
        bVar.e(b12);
        b10.a(this);
        b11.a(this);
        b12.a(this);
    }

    @Override // r6.a
    public final void a() {
        this.f23539j = false;
        this.f23535d.invalidateSelf();
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
                        this.f23538h.f16717a.add(sVar);
                        sVar.e(this);
                        i++;
                    }
                }
                if (cVar instanceof p) {
                    this.i = ((p) cVar).f23548b;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // q6.l
    public final Path f() {
        float i;
        float f10;
        r6.e eVar;
        boolean z3 = this.f23539j;
        Path path = this.f23532a;
        if (z3) {
            return path;
        }
        path.reset();
        if (this.f23534c) {
            this.f23539j = true;
            return path;
        }
        PointF pointF = (PointF) this.f23536f.d();
        float f11 = pointF.x / 2.0f;
        float f12 = pointF.y / 2.0f;
        r6.f fVar = this.f23537g;
        if (fVar == null) {
            i = 0.0f;
        } else {
            i = fVar.i();
        }
        if (i == 0.0f && (eVar = this.i) != null) {
            i = Math.min(((Float) eVar.d()).floatValue(), Math.min(f11, f12));
        }
        float min = Math.min(f11, f12);
        if (i > min) {
            i = min;
        }
        PointF pointF2 = (PointF) this.e.d();
        path.moveTo(pointF2.x + f11, (pointF2.y - f12) + i);
        path.lineTo(pointF2.x + f11, (pointF2.y + f12) - i);
        RectF rectF = this.f23533b;
        if (i > 0.0f) {
            float f13 = pointF2.x + f11;
            float f14 = i * 2.0f;
            f10 = 2.0f;
            float f15 = pointF2.y + f12;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f10 = 2.0f;
        }
        path.lineTo((pointF2.x - f11) + i, pointF2.y + f12);
        if (i > 0.0f) {
            float f16 = pointF2.x - f11;
            float f17 = pointF2.y + f12;
            float f18 = i * f10;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f11, (pointF2.y - f12) + i);
        if (i > 0.0f) {
            float f19 = pointF2.x - f11;
            float f20 = pointF2.y - f12;
            float f21 = i * f10;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f11) - i, pointF2.y - f12);
        if (i > 0.0f) {
            float f22 = pointF2.x + f11;
            float f23 = i * f10;
            float f24 = pointF2.y - f12;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f23538h.b(path);
        this.f23539j = true;
        return path;
    }
}
