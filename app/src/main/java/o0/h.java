package o0;
import m.b;
import m1.h;
import j1.e;
import k1.h;
import k1.j;
import k1.r;
import m1.d;
import m1.g;
import p.b;
import u.a;
import x.m;
import x.o;
import z1.a1;
import z1.o0;
import z1.r0;
import z1.z0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import r0.n2;
import wa.p8;
import wa.r8;
import wa.u8;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21492u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f21493v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f21494w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f21495x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f21496y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f21497z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(1);
        this.f21492u = i;
        this.f21493v = obj;
        this.f21494w = obj2;
        this.f21495x = obj3;
        this.f21496y = obj4;
        this.f21497z = obj5;
        this.A = obj6;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        Path path;
        int i = this.f21492u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.A;
        Object obj3 = this.f21497z;
        Object obj4 = this.f21496y;
        Object obj5 = this.f21495x;
        Object obj6 = this.f21494w;
        Object obj7 = this.f21493v;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                float floor = (float) Math.floor(dVar.l0(k.f21535c));
                long j10 = ((r) ((n2) obj7).getValue()).f19523a;
                long j11 = ((r) ((n2) obj6).getValue()).f19523a;
                float l0 = dVar.l0(k.f21536d);
                float f10 = floor / 2.0f;
                m1.h hVar = new m1.h(floor, 0.0f, 0, 0, null, 30);
                float d2 = e.d(dVar.e());
                int i10 = r.f19522m;
                boolean a10 = pe.a(j10, j11);
                g gVar = g.f20429a;
                if (a10) {
                    d.z0(dVar, j10, 0L, u8.a(d2, d2), p8.a(l0), gVar, 226);
                } else {
                    float f11 = d2 - (2 * floor);
                    d.z0(dVar, j10, r8.a(floor, floor), u8.a(f11, f11), p8.a(Math.max(0.0f, l0 - floor)), gVar, 224);
                    float f12 = d2 - floor;
                    d.z0(dVar, j11, r8.a(f10, f10), u8.a(f12, f12), p8.a(l0 - f10), hVar, 224);
                }
                long j12 = ((r) ((n2) obj5).getValue()).f19523a;
                float floatValue = ((Number) ((n2) obj4).getValue()).floatValue();
                float floatValue2 = ((Number) ((n2) obj3).getValue()).floatValue();
                e eVar = (e) obj2;
                m1.h hVar2 = new m1.h(floor, 0.0f, 2, 0, null, 26);
                float d10 = e.d(dVar.e());
                float b10 = c7.b(0.4f, 0.5f, floatValue2);
                float b11 = c7.b(0.7f, 0.5f, floatValue2);
                float b12 = c7.b(0.5f, 0.5f, floatValue2);
                float b13 = c7.b(0.3f, 0.5f, floatValue2);
                eVar.f21453a.k();
                k1.h hVar3 = eVar.f21453a;
                hVar3.h(0.2f * d10, b12 * d10);
                hVar3.g(b10 * d10, b11 * d10);
                hVar3.g(0.8f * d10, d10 * b13);
                j jVar = eVar.f21454b;
                PathMeasure pathMeasure = jVar.f19488a;
                if (hVar3 != null) {
                    path = hVar3.f19481a;
                } else {
                    path = null;
                }
                pathMeasure.setPath(path, false);
                k1.h hVar4 = eVar.f21455c;
                hVar4.k();
                jVar.a(0.0f, jVar.f19488a.getLength() * floatValue, hVar4);
                d.o0(dVar, eVar.f21455c, j12, hVar2, 52);
                return zVar;
            default:
                z0 z0Var = (z0) obj;
                a1[] a1VarArr = (a1[]) obj7;
                List list = (List) obj6;
                r0 r0Var = (r0) obj5;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj4;
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) obj3;
                o oVar = (o) obj2;
                int length = a1VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    a1 a1Var = a1VarArr[i11];
                    a1Var.getClass();
                    m.b(z0Var, a1Var, (o0) list.get(i12), r0Var.getLayoutDirection(), wVar.f19785u, wVar2.f19785u, oVar.f29989a);
                    i11++;
                    i12++;
                }
                return zVar;
        }
    }
}
