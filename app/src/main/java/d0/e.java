package d0;
import d.d;
import f.i;

import a0.o;
import af.l;
import android.content.Context;
import b2.k1;
import c0.h;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import df.p;
import fg.s;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import pe.k;
import pf.b0;
import pf.z;
import qe.m;
import r0.f1;
import u7.k6;
import u7.l2;
import u7.m3;
import u7.t6;
import u7.v1;
import v7.j;
import w7.a8;
import w7.e3;

/* loaded from: classes.dex */
public final class e extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15659u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f15660v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15661w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f15662x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f15663y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f15664z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, te.c cVar, int i) {
        super(2, cVar);
        this.f15659u = i;
        this.f15660v = obj;
        this.f15661w = obj2;
        this.f15662x = obj3;
        this.f15663y = obj4;
        this.f15664z = obj5;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f15659u) {
            case 0:
                e eVar = new e((f) this.f15661w, (k1) this.f15662x, (o) this.f15663y, (h) this.f15664z, cVar, 0);
                eVar.f15660v = obj;
                return eVar;
            case 1:
                e eVar2 = new e((a8) this.f15661w, (Context) this.f15662x, (String) this.f15663y, (String) this.f15664z, cVar, 1);
                eVar2.f15660v = obj;
                return eVar2;
            case 2:
                return new e((l2) this.f15660v, (List) this.f15661w, (f1) this.f15662x, (m3) this.f15663y, (Context) this.f15664z, cVar, 2);
            case 3:
                return new e((Context) this.f15660v, (m3) this.f15661w, (l2) this.f15662x, (f1) this.f15663y, (f1) this.f15664z, cVar, 3);
            default:
                return new e((e3) this.f15660v, (e3) this.f15661w, (e3) this.f15662x, (e3) this.f15663y, (e3) this.f15664z, cVar, 4);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f15659u) {
            case 0:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                e eVar = (e) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                eVar.invokeSuspend(zVar2);
                return zVar2;
            case 3:
                e eVar2 = (e) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                eVar2.invokeSuspend(zVar3);
                return zVar3;
            default:
                e eVar3 = (e) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                eVar3.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        Object obj2;
        Set u9;
        Texture texture;
        int i;
        int i10;
        Texture texture2;
        int i11;
        int i12 = this.f15659u;
        Object obj3 = pe.z.f22715a;
        Object obj4 = this.f15664z;
        Object obj5 = this.f15663y;
        Object obj6 = this.f15662x;
        Object obj7 = this.f15661w;
        switch (i12) {
            case 0:
                pe.a.e(obj);
                z zVar = (z) this.f15660v;
                f fVar = (f) obj7;
                te.c cVar = null;
                b0.x(zVar, null, new a6.f(fVar, (k1) obj6, (o) obj5, cVar, 11), 3);
                return b0.x(zVar, null, new b5.a(fVar, (h) obj4, cVar, 17), 3);
            case 1:
                pe.a.e(obj);
                a8 a8Var = (a8) obj7;
                Context context = (Context) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                try {
                    List h3 = m.h(a8Var.f27892b, a8Var.f27893c, a8Var.f27894d);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : h3) {
                        if (!mf.f.u((String) obj8)) {
                            arrayList.add(obj8);
                        }
                    }
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj9 = arrayList.get(i13);
                        i13++;
                        String str3 = (String) obj9;
                        s sVar = d8.f.f15790a;
                        File i14 = d8.i(context, str, str3);
                        if (i14 != null) {
                            l.b(i14, t6.d(context, str2, str3));
                        } else {
                            throw new IllegalStateException(("falta " + str3 + " en " + str).toString());
                        }
                    }
                    kVar = obj3;
                } catch (Throwable th) {
                    kVar = new k(th);
                }
                return Boolean.valueOf(!(kVar instanceof k));
            case 2:
                f1 f1Var = (f1) obj6;
                pe.a.e(obj);
                l2 l2Var = (l2) this.f15660v;
                Engine engine = l2Var.f26432a;
                if (engine != null) {
                    List list = (List) obj7;
                    float f10 = k6.f26414a;
                    int h10 = f1Var.h();
                    if (h10 >= 0 && h10 < list.size()) {
                        obj2 = list.get(h10);
                    } else {
                        obj2 = v1.f26943b;
                    }
                    float[] fArr = (float[]) obj2;
                    Integer num = l2Var.W;
                    if (num != null) {
                        u7.e.g0(engine, num.intValue(), fArr);
                    }
                    Integer num2 = l2Var.X;
                    if (num2 != null) {
                        u7.e.g0(engine, num2.intValue(), fArr);
                    }
                    Integer num3 = l2Var.f26473w0;
                    if (num3 != null) {
                        u7.e.g0(engine, num3.intValue(), fArr);
                    }
                    Integer num4 = l2Var.f26459p0;
                    if (num4 != null) {
                        u7.e.g0(engine, num4.intValue(), u7.e.X(((m3) obj5).d0((Context) obj4, f1Var.h()).f27417n));
                    }
                }
                return obj3;
            case 3:
                l2 l2Var2 = (l2) obj6;
                pe.a.e(obj);
                Context context2 = (Context) this.f15660v;
                f1 f1Var2 = (f1) obj5;
                float f11 = k6.f26414a;
                int h11 = f1Var2.h();
                m3 m3Var = (m3) obj7;
                f1 f1Var3 = (f1) obj4;
                int size2 = m3Var.q0(f1Var3.h(), f1Var2.h()).size();
                jf.d dVar = j.f27439a;
                context2.getClass();
                if (!z7.d(context2) && size2 <= 1) {
                    u9 = qe.k.u(new Integer[]{Integer.valueOf(h11 - 1), Integer.valueOf(h11), Integer.valueOf(h11 + 1), Integer.valueOf(h11 + 2)});
                } else {
                    u9 = qe.k.u(new Integer[]{Integer.valueOf(h11), Integer.valueOf(h11 + 1)});
                }
                int h12 = f1Var3.h();
                v7.k kVar2 = m3Var.f26542p;
                String y10 = m3Var.y(h12);
                kVar2.getClass();
                HashMap hashMap = kVar2.f27441b;
                Set keySet = hashMap.keySet();
                keySet.getClass();
                HashMap hashMap2 = kVar2.f27442c;
                Set keySet2 = hashMap2.keySet();
                keySet2.getClass();
                LinkedHashSet c10 = qe.b0.c(keySet, keySet2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj10 : c10) {
                    pe.j jVar = (pe.j) obj10;
                    Object obj11 = obj3;
                    if (kotlin.jvm.internal.l.a(jVar.f22693u, y10) && !u9.contains(jVar.f22694v)) {
                        arrayList2.add(obj10);
                    }
                    obj3 = obj11;
                }
                Object obj12 = obj3;
                int size3 = arrayList2.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj13 = arrayList2.get(i15);
                    i15++;
                    pe.j jVar2 = (pe.j) obj13;
                    qe.j jVar3 = (qe.j) hashMap.remove(jVar2);
                    if (jVar3 != null) {
                        Iterator it = jVar3.iterator();
                        while (it.hasNext()) {
                            ((v7.l) it.next()).d();
                        }
                    }
                    qe.j jVar4 = (qe.j) hashMap2.remove(jVar2);
                    if (jVar4 != null) {
                        Iterator it2 = jVar4.iterator();
                        while (it2.hasNext()) {
                            ((v7.l) it2.next()).d();
                        }
                    }
                    kVar2.f27443d.remove(jVar2);
                    kVar2.e.remove(jVar2);
                }
                nd.o oVar = m3Var.f26539m;
                String y11 = m3Var.y(h12);
                oVar.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oVar.f21272v;
                Set keySet3 = concurrentHashMap.keySet();
                keySet3.getClass();
                for (Object obj14 : qe.l.P(keySet3)) {
                    obj14.getClass();
                    pe.o oVar2 = (pe.o) obj14;
                    if (!kotlin.jvm.internal.l.a(oVar2.f22703u, y11) || !u9.contains(oVar2.f22704v)) {
                        if (!((ConcurrentHashMap.KeySetView) oVar.f21274x).contains(oVar2) && !((ConcurrentHashMap) oVar.f21273w).containsKey(oVar2)) {
                            concurrentHashMap.remove(oVar2);
                        }
                    }
                }
                int h13 = f1Var2.h() - 7;
                int h14 = f1Var2.h() + 7;
                String C0 = m3Var.C0(f1Var3.h());
                Set keySet4 = l2Var2.N.keySet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj15 : keySet4) {
                    pe.j jVar5 = (pe.j) obj15;
                    int intValue = ((Number) jVar5.f22694v).intValue();
                    if (intValue >= 2) {
                        i11 = (intValue - 2) / 2;
                    } else {
                        i11 = 0;
                    }
                    if (!kotlin.jvm.internal.l.a(jVar5.f22693u, C0) || i11 < h13 || i11 > h14) {
                        arrayList3.add(obj15);
                    }
                }
                int size4 = arrayList3.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj16 = arrayList3.get(i16);
                    i16++;
                    pe.j jVar6 = (pe.j) obj16;
                    l2Var2.P.remove(jVar6);
                    pe.j jVar7 = (pe.j) l2Var2.N.remove(jVar6);
                    if (jVar7 != null && (texture2 = (Texture) jVar7.f22694v) != null) {
                        l2Var2.D.add(texture2);
                    }
                    l2Var2.O.remove(jVar6);
                }
                Set keySet5 = l2Var2.C.keySet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj17 : keySet5) {
                    pe.j jVar8 = (pe.j) obj17;
                    int intValue2 = ((Number) jVar8.f22694v).intValue();
                    if (intValue2 % 2 == 0) {
                        i10 = intValue2 - 2;
                        i = 2;
                    } else {
                        i = 2;
                        i10 = intValue2 - 3;
                    }
                    int i17 = i10 / i;
                    if (!kotlin.jvm.internal.l.a(jVar8.f22693u, C0) || i17 < h13 || i17 > h14) {
                        arrayList4.add(obj17);
                    }
                }
                int size5 = arrayList4.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj18 = arrayList4.get(i18);
                    i18++;
                    pe.j jVar9 = (pe.j) l2Var2.C.remove((pe.j) obj18);
                    if (jVar9 != null && (texture = (Texture) jVar9.f22694v) != null) {
                        l2Var2.D.add(texture);
                    }
                }
                return obj12;
            default:
                pe.a.e(obj);
                if (((e3) this.f15660v).a() || ((e3) obj7).b() || ((e3) obj6).k() || ((e3) obj5).h()) {
                    ((e3) obj4).E(false);
                }
                return obj3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Serializable serializable, Serializable serializable2, te.c cVar, int i) {
        super(2, cVar);
        this.f15659u = i;
        this.f15661w = obj;
        this.f15662x = obj2;
        this.f15663y = serializable;
        this.f15664z = serializable2;
    }
}
