package b8;
import b8.k2;
import g0.p1;
import k7.f;
import o6.a;
import r0.a1;
import u7.m3;
import v1.w;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class k2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2300u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2301v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2302w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f2300u = 9;
        this.f2302w = context;
        this.f2301v = a1Var;
        this.f2303x = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2300u) {
            case 0:
                return new k2((m3) this.f2301v, (Context) this.f2302w, (String) this.f2303x, cVar, 0);
            case 1:
                return new k2((m3) this.f2301v, (Context) this.f2302w, (f) this.f2303x, cVar, 1);
            case 2:
                return new k2((Set) this.f2301v, (o5) this.f2302w, (Set) this.f2303x, cVar, 2);
            case 3:
                k2 k2Var = new k2((w) this.f2302w, (p1) this.f2303x, cVar, 3);
                k2Var.f2301v = obj;
                return k2Var;
            case 4:
                k2 k2Var2 = new k2((Context) this.f2302w, (Collection) this.f2303x, cVar, 4);
                k2Var2.f2301v = obj;
                return k2Var2;
            case 5:
                return new k2((a) this.f2301v, (Context) this.f2302w, (String) this.f2303x, cVar, 5);
            case 6:
                return new k2((a1) this.f2301v, (a1) this.f2302w, (a1) this.f2303x, cVar, 6);
            case 7:
                return new k2((Context) this.f2302w, (String) this.f2303x, (w7.a8) this.f2301v, cVar);
            case 8:
                k2 k2Var3 = new k2(this.f2303x, (Context) this.f2302w, cVar, 8);
                k2Var3.f2301v = obj;
                return k2Var3;
            case 9:
                return new k2((Context) this.f2302w, (a1) this.f2301v, (a1) this.f2303x, cVar);
            case 10:
                k2 k2Var4 = new k2(this.f2303x, (Context) this.f2302w, cVar, 10);
                k2Var4.f2301v = obj;
                return k2Var4;
            default:
                return new k2((ArrayList) this.f2301v, (a1) this.f2302w, (a1) this.f2303x, cVar, 11);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2300u) {
            case 0:
                k2 k2Var = (k2) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                k2Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                k2 k2Var2 = (k2) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                k2Var2.invokeSuspend(zVar3);
                return zVar3;
            case 2:
                k2 k2Var3 = (k2) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                k2Var3.invokeSuspend(zVar4);
                return zVar4;
            case 3:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 5:
                k2 k2Var4 = (k2) create(zVar, cVar);
                pe.z zVar5 = pe.z.f22715a;
                k2Var4.invokeSuspend(zVar5);
                return zVar5;
            case 6:
                k2 k2Var5 = (k2) create(zVar, cVar);
                pe.z zVar6 = pe.z.f22715a;
                k2Var5.invokeSuspend(zVar6);
                return zVar6;
            case 7:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 9:
                k2 k2Var6 = (k2) create(zVar, cVar);
                pe.z zVar7 = pe.z.f22715a;
                k2Var6.invokeSuspend(zVar7);
                return zVar7;
            case 10:
                return ((k2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                k2 k2Var7 = (k2) create(zVar, cVar);
                pe.z zVar8 = pe.z.f22715a;
                k2Var7.invokeSuspend(zVar8);
                return zVar8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x063d A[LOOP:11: B:271:0x063b->B:272:0x063d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ef  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, String str, w7.a8 a8Var, te.c cVar) {
        super(2, cVar);
        this.f2300u = 7;
        this.f2302w = context;
        this.f2303x = str;
        this.f2301v = a8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, Context context, te.c cVar, int i) {
        super(2, cVar);
        this.f2300u = i;
        this.f2303x = obj;
        this.f2302w = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f2300u = i;
        this.f2301v = obj;
        this.f2302w = obj2;
        this.f2303x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f2300u = i;
        this.f2302w = obj;
        this.f2303x = obj2;
    }
}
