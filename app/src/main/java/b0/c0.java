package b0;
import n.l;
import n.w;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c0 implements z1.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final w f1162u;

    /* renamed from: v, reason: collision with root package name */
    public final z1.l1 f1163v;

    /* renamed from: w, reason: collision with root package name */
    public final z f1164w;

    /* renamed from: x, reason: collision with root package name */
    public final w f1165x;

    public c0(w wVar, z1.l1 l1Var) {
        this.f1162u = wVar;
        this.f1163v = l1Var;
        this.f1164w = (z) wVar.f1272b.invoke();
        w wVar2 = l.f20912a;
        this.f1165x = new w();
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f1163v.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f1163v.D0(j10);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f1163v.R(f10);
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f1163v.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f1163v.a();
    }

    @Override // y2.c
    public final float a0(float f10) {
        return this.f1163v.a0(f10);
    }

    public final List b(int i, long j10) {
        w wVar = this.f1165x;
        List list = (List) wVar.b(i);
        if (list != null) {
            return list;
        }
        z zVar = this.f1164w;
        Object b10 = zVar.b(i);
        List V = this.f1163v.V(this.f1162u.a(b10, i, zVar.c(i)), b10);
        int size = V.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((z1.o0) V.get(i10)).z(j10));
        }
        wVar.i(i, arrayList);
        return arrayList;
    }

    @Override // z1.t
    public final y2.m getLayoutDirection() {
        return this.f1163v.getLayoutDirection();
    }

    @Override // y2.c
    public final float i0() {
        return this.f1163v.i0();
    }

    @Override // z1.t
    public final boolean j0() {
        return this.f1163v.j0();
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f1163v.l0(f10);
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f1163v.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f1163v.p(j10);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f1163v.t0(f10);
    }

    @Override // z1.r0
    public final z1.q0 u0(int i, int i10, Map map, df.l lVar) {
        return this.f1163v.u0(i, i10, map, lVar);
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f1163v.x(j10);
    }

    @Override // z1.r0
    public final z1.q0 y(int i, int i10, Map map, df.l lVar, df.l lVar2) {
        return this.f1163v.y(i, i10, map, lVar, lVar2);
    }
}
