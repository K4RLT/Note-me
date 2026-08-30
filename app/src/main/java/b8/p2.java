package b8;
import b0.u0;
import b0.u;
import b1.c0;
import b1.v;
import c0.a0;
import j6.n;
import l.a;
import t.f1;
import u7.b;
import u7.c;
import u7.d;
import u7.m3;
import u7.o1;
import y2.c;
import z.i;
import z.m;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class p2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2509u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2510v;

    /* renamed from: w, reason: collision with root package name */
    public int f2511w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2512x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2513y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(v vVar, m3 m3Var, int i, int i10, te.c cVar) {
        super(2, cVar);
        this.f2509u = 4;
        this.f2513y = vVar;
        this.f2510v = m3Var;
        this.f2511w = i;
        this.f2512x = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2509u) {
            case 0:
                return new p2((m3) this.f2510v, this.f2511w, this.f2512x, (m1) this.f2513y, cVar, 0);
            case 1:
                return new p2((m3) this.f2510v, this.f2511w, this.f2512x, (Context) this.f2513y, cVar, 1);
            case 2:
                return new p2((m3) this.f2510v, (String) this.f2513y, this.f2512x, cVar);
            case 3:
                o1 o1Var = (o1) this.f2510v;
                return new p2(this.f2512x, (List) this.f2513y, cVar, o1Var);
            case 4:
                return new p2((v) this.f2513y, (m3) this.f2510v, this.f2511w, this.f2512x, cVar);
            default:
                p2 p2Var = new p2((m) this.f2513y, this.f2512x, cVar);
                p2Var.f2510v = obj;
                return p2Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2509u) {
            case 0:
                return ((p2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                p2 p2Var = (p2) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                p2Var.invokeSuspend(zVar);
                return zVar;
            case 2:
                return ((p2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((p2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                p2 p2Var2 = (p2) create((pf.z) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                p2Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                return ((p2) create((f1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        switch (this.f2509u) {
            case 0:
                pe.a.e(obj);
                m3 m3Var = (m3) this.f2510v;
                int i = this.f2511w;
                m1 m1Var = (m1) this.f2513y;
                df.l lVar = m1Var.f2397r;
                String str3 = m1Var.f2390k;
                int i10 = this.f2512x;
                if (lVar == null || (str = (String) lVar.invoke(new Integer(i10 * 2))) == null) {
                    str = str3;
                }
                df.l lVar2 = m1Var.f2397r;
                if (lVar2 != null && (str2 = (String) lVar2.invoke(new Integer((i10 * 2) + 1))) != null) {
                    str3 = str2;
                }
                m3Var.Y0(str, i, i10, str3);
                return new Integer(1);
            case 1:
                Context context = (Context) this.f2513y;
                int i11 = this.f2511w;
                m3 m3Var2 = (m3) this.f2510v;
                pe.a.e(obj);
                jf.d dVar = v7.j.f27439a;
                int i12 = dVar.f19189u;
                int i13 = dVar.f19190v;
                if (i12 <= i13) {
                    while (pf.u(getContext())) {
                        int i14 = this.f2512x;
                        if (m3Var2.k0(i11, i14, i12, context)) {
                            try {
                                m3Var2.g0(i11, i14, i12, context);
                            } catch (OutOfMemoryError unused) {
                            }
                        }
                        if (i12 != i13) {
                            i12++;
                        }
                    }
                }
                return pe.z.f22715a;
            case 2:
                int i15 = this.f2511w;
                if (i15 != 0) {
                    if (i15 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    n nVar = ((m3) this.f2510v).f26530b;
                    String str4 = (String) this.f2513y;
                    this.f2511w = 1;
                    Object m4 = nVar.m(this.f2512x, str4, this);
                    ue.a aVar = ue.a.f27192u;
                    if (m4 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 3:
                int i16 = this.f2511w;
                if (i16 != 0) {
                    if (i16 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    o1 o1Var = (o1) this.f2510v;
                    int size = ((List) this.f2513y).size();
                    this.f2511w = 1;
                    Object d2 = o1Var.d(this.f2512x, size, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (d2 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            case 4:
                pe.a.e(obj);
                v vVar = (v) this.f2513y;
                if (!vVar.isEmpty()) {
                    m3 m3Var3 = (m3) this.f2510v;
                    int i17 = this.f2511w;
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = vVar.listIterator();
                    while (true) {
                        c0 c0Var = (c0) listIterator;
                        if (c0Var.hasNext()) {
                            Object next = c0Var.next();
                            String str5 = (String) next;
                            int i18 = this.f2512x;
                            List f12 = m3Var3.f1(i17, i18);
                            if (!(f12 instanceof Collection) || !f12.isEmpty()) {
                                Iterator it = f12.iterator();
                                while (it.hasNext()) {
                                    if (kotlin.jvm.internal.a(((b) it.next()).f25917a, str5)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                            List k12 = m3Var3.k1(i17, i18);
                            if (!(k12 instanceof Collection) || !k12.isEmpty()) {
                                Iterator it2 = k12.iterator();
                                while (it2.hasNext()) {
                                    if (kotlin.jvm.internal.a(((d) it2.next()).f26033a, str5)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                            List j12 = m3Var3.j1(i17, i18);
                            if (!(j12 instanceof Collection) || !j12.isEmpty()) {
                                Iterator it3 = j12.iterator();
                                while (it3.hasNext()) {
                                    if (kotlin.jvm.internal.a(((c) it3.next()).f25969a, str5)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        } else if (arrayList.size() != vVar.size()) {
                            vVar.clear();
                            if (arrayList.size() >= 2) {
                                vVar.addAll(arrayList);
                            }
                        }
                    }
                }
                return pe.z.f22715a;
            default:
                int i19 = this.f2511w;
                if (i19 != 0) {
                    if (i19 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    f1 f1Var = (f1) this.f2510v;
                    m mVar = (m) this.f2513y;
                    a0 a0Var = new a0(f1Var, mVar, 1);
                    c cVar = ((i) mVar.e.getValue()).i;
                    this.f2511w = 1;
                    Object b10 = u0.b(a0Var, this.f2512x, 100, cVar, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (b10 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(int i, List list, te.c cVar, o1 o1Var) {
        super(2, cVar);
        this.f2509u = 3;
        this.f2510v = o1Var;
        this.f2512x = i;
        this.f2513y = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(m3 m3Var, int i, int i10, Object obj, te.c cVar, int i11) {
        super(2, cVar);
        this.f2509u = i11;
        this.f2510v = m3Var;
        this.f2511w = i;
        this.f2512x = i10;
        this.f2513y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(m3 m3Var, String str, int i, te.c cVar) {
        super(2, cVar);
        this.f2509u = 2;
        this.f2510v = m3Var;
        this.f2513y = str;
        this.f2512x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(m mVar, int i, te.c cVar) {
        super(2, cVar);
        this.f2509u = 5;
        this.f2513y = mVar;
        this.f2512x = i;
    }
}
