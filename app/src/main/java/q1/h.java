package q1;
import k.a;
import l.a;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import ya.s9;

/* loaded from: classes.dex */
public final class h extends v {

    /* renamed from: b, reason: collision with root package name */
    public k1.n f23264b;

    /* renamed from: c, reason: collision with root package name */
    public List f23265c;

    /* renamed from: d, reason: collision with root package name */
    public float f23266d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public k1.n f23267f;

    /* renamed from: g, reason: collision with root package name */
    public int f23268g;

    /* renamed from: h, reason: collision with root package name */
    public int f23269h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f23270j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23271k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23272l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23273m;

    /* renamed from: n, reason: collision with root package name */
    public m1.h f23274n;

    /* renamed from: o, reason: collision with root package name */
    public final k1.h f23275o;

    /* renamed from: p, reason: collision with root package name */
    public k1.h f23276p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f23277q;

    public h() {
        int i = a0.f23216a;
        this.f23265c = qe.s.f24023u;
        this.f23266d = 1.0f;
        this.f23268g = 0;
        this.f23269h = 0;
        this.i = 4.0f;
        this.f23270j = 1.0f;
        this.f23271k = true;
        this.f23272l = true;
        k1.h a10 = k1.a();
        this.f23275o = a10;
        this.f23276p = a10;
        this.f23277q = pe.a.c(pe.h.f22691v, g.f23261v);
    }

    @Override // q1.v
    public final void a(m1.d dVar) {
        m1.h hVar;
        if (this.f23271k) {
            s9.a(this.f23265c, this.f23275o);
            e();
        } else if (this.f23273m) {
            e();
        }
        this.f23271k = false;
        this.f23273m = false;
        k1.n nVar = this.f23264b;
        if (nVar != null) {
            m1.d.g0(dVar, this.f23276p, nVar, 1.0f, null, 56);
        }
        k1.n nVar2 = this.f23267f;
        if (nVar2 != null) {
            m1.h hVar2 = this.f23274n;
            if (!this.f23272l && hVar2 != null) {
                hVar = hVar2;
            } else {
                m1.h hVar3 = new m1.h(this.e, this.i, this.f23268g, this.f23269h, null, 16);
                this.f23274n = hVar3;
                this.f23272l = false;
                hVar = hVar3;
            }
            m1.d.g0(dVar, this.f23276p, nVar2, this.f23266d, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, pe.g] */
    public final void e() {
        int i;
        Path path;
        float f10 = this.f23270j;
        k1.h hVar = this.f23275o;
        if (f10 == 1.0f) {
            this.f23276p = hVar;
            return;
        }
        if (kotlin.jvm.internal.a(this.f23276p, hVar)) {
            this.f23276p = k1.a();
        } else {
            if (this.f23276p.f19481a.getFillType() == Path.FillType.EVEN_ODD) {
                i = 1;
            } else {
                i = 0;
            }
            this.f23276p.f19481a.rewind();
            this.f23276p.l(i);
        }
        Object r02 = this.f23277q;
        PathMeasure pathMeasure = ((k1.j) r02.getValue()).f19488a;
        if (hVar != null) {
            path = hVar.f19481a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((k1.j) r02.getValue()).f19488a.getLength();
        float f11 = 0.0f * length;
        float f12 = ((this.f23270j + 0.0f) % 1.0f) * length;
        if (f11 > f12) {
            ((k1.j) r02.getValue()).a(f11, length, this.f23276p);
            ((k1.j) r02.getValue()).a(0.0f, f12, this.f23276p);
        } else {
            ((k1.j) r02.getValue()).a(f11, f12, this.f23276p);
        }
    }

    public final String toString() {
        return this.f23275o.toString();
    }
}