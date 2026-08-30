package f6;

import android.util.Log;
import df.q;
import kotlin.jvm.internal.l;
import pe.z;
import q.x;
import r0.a1;
import t.c1;

/* loaded from: classes.dex */
public final class g extends ve.i implements q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16764u;

    /* renamed from: v, reason: collision with root package name */
    public int f16765v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f16766w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f16767x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a1 a1Var, te.c cVar) {
        super(3, cVar);
        this.f16764u = 2;
        this.f16767x = a1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f16764u) {
            case 0:
                g gVar = new g(3, (te.c) obj3, 0);
                gVar.f16766w = (sf.h) obj;
                gVar.f16767x = (Object[]) obj2;
                return gVar.invokeSuspend(z.f22715a);
            case 1:
                g gVar2 = new g(3, (te.c) obj3, 1);
                gVar2.f16766w = (sf.h) obj;
                gVar2.f16767x = (Throwable) obj2;
                return gVar2.invokeSuspend(z.f22715a);
            default:
                long j10 = ((j1.b) obj2).f18762a;
                g gVar3 = new g((a1) this.f16767x, (te.c) obj3);
                gVar3.f16766w = (c1) obj;
                return gVar3.invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        switch (this.f16764u) {
            case 0:
                int i = this.f16765v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    sf.h hVar = (sf.h) this.f16766w;
                    c[] cVarArr = (c[]) ((Object[]) this.f16767x);
                    int length = cVarArr.length;
                    int i10 = 0;
                    while (true) {
                        cVar = a.f16757a;
                        if (i10 < length) {
                            cVar2 = cVarArr[i10];
                            if (l.a(cVar2, cVar)) {
                                i10++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.f16765v = 1;
                    Object e = hVar.e(cVar, this);
                    ue.a aVar = ue.a.f27192u;
                    if (e == aVar) {
                        return aVar;
                    }
                }
                return z.f22715a;
            case 1:
                int i11 = this.f16765v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    sf.h hVar2 = (sf.h) this.f16766w;
                    Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f16767x);
                    b4.b bVar = new b4.b(true);
                    this.f16766w = null;
                    this.f16765v = 1;
                    Object e8 = hVar2.e(bVar, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (e8 == aVar2) {
                        return aVar2;
                    }
                }
                return z.f22715a;
            default:
                a1 a1Var = (a1) this.f16767x;
                c1 c1Var = (c1) this.f16766w;
                int i12 = this.f16765v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    a1Var.setValue(Boolean.TRUE);
                    this.f16766w = null;
                    this.f16765v = 1;
                    Object f10 = c1Var.f(this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (f10 == aVar3) {
                        return aVar3;
                    }
                }
                a1Var.setValue(Boolean.FALSE);
                return z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f16764u = i10;
    }
}
