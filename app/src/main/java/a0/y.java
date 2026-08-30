package a0;
import j.i0;
import p.a;

import java.util.ArrayList;
import java.util.List;
import r0.a1;
import z1.z0;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f156u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f157v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f158w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f159x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f160y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(df.a aVar, boolean z3, k1.f fVar, k1.l lVar) {
        super(1);
        this.f156u = 2;
        this.f157v = aVar;
        this.f160y = z3;
        this.f158w = fVar;
        this.f159x = lVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f156u) {
            case 0:
                z0 z0Var = (z0) obj;
                x xVar = new x((ArrayList) this.f158w, this.f159x, this.f160y, 0);
                z0Var.f31904u = true;
                xVar.invoke(z0Var);
                z0Var.f31904u = false;
                ((a1) this.f157v).getValue();
                return pe.z.f22715a;
            case 1:
                z0 z0Var2 = (z0) obj;
                x xVar2 = new x((ArrayList) this.f158w, this.f159x, this.f160y, 1);
                z0Var2.f31904u = true;
                xVar2.invoke(z0Var2);
                z0Var2.f31904u = false;
                ((a1) this.f157v).getValue();
                return pe.z.f22715a;
            default:
                b2.l0 l0Var = (b2.l0) obj;
                l0Var.b();
                m1.b bVar = l0Var.f1533u;
                if (((Boolean) ((df.a) this.f157v).invoke()).booleanValue()) {
                    k1.f fVar = (k1.f) this.f158w;
                    k1.l lVar = (k1.l) this.f159x;
                    if (this.f160y) {
                        long w02 = bVar.w0();
                        i0 i0Var = bVar.f20424v;
                        long r8 = i0Var.r();
                        i0Var.j().l();
                        try {
                            ((ic.c) i0Var.f18636v).A(-1.0f, 1.0f, w02);
                            m1.d.F(l0Var, fVar, 0L, 0.0f, lVar, 46);
                        } finally {
                            a.v(i0Var, r8);
                        }
                    } else {
                        m1.d.F(l0Var, fVar, 0L, 0.0f, lVar, 46);
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a1 a1Var, ArrayList arrayList, List list, boolean z3, int i) {
        super(1);
        this.f156u = i;
        this.f157v = a1Var;
        this.f158w = arrayList;
        this.f159x = list;
        this.f160y = z3;
    }
}
