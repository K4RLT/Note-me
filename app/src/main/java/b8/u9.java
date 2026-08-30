package b8;
import b8.u9;
import g0.p1;
import j.i0;
import k0.j1;
import o6.a;
import r0.a1;
import u7.m3;
import u7.s6;
import v1.w;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class u9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2841u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2842v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2843w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2844x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2845y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(s6 s6Var, Set set, Context context, String str, te.c cVar) {
        super(2, cVar);
        this.f2841u = 3;
        this.f2843w = s6Var;
        this.f2844x = set;
        this.f2842v = context;
        this.f2845y = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2841u) {
            case 0:
                return new u9((Context) this.f2842v, (a1) this.f2843w, (a1) this.f2844x, (a1) this.f2845y, cVar, 0);
            case 1:
                u9 u9Var = new u9((w) this.f2843w, (p1) this.f2844x, (j1) this.f2845y, cVar, 1);
                u9Var.f2842v = obj;
                return u9Var;
            case 2:
                return new u9((a) this.f2843w, (Context) this.f2842v, (String) this.f2844x, (String) this.f2845y, cVar, 2, false);
            case 3:
                return new u9((s6) this.f2843w, (Set) this.f2844x, (Context) this.f2842v, (String) this.f2845y, cVar);
            case 4:
                return new u9((kotlin.jvm.internal.y) this.f2842v, (Engine) this.f2843w, (Texture) this.f2844x, (df.l) this.f2845y, cVar, 4);
            case 5:
                return new u9((nd.o) this.f2843w, (Context) this.f2842v, (pe.o) this.f2844x, (Bitmap) this.f2845y, cVar, 5, false);
            case 6:
                return new u9((i0) this.f2843w, (Context) this.f2842v, (pe.o) this.f2844x, (List) this.f2845y, cVar, 6, false);
            case 7:
                return new u9((a1) this.f2843w, (w7.e3) this.f2842v, (a1) this.f2844x, (m3) this.f2845y, cVar, 7, false);
            default:
                u9 u9Var2 = new u9(this.f2843w, (b4.e) this.f2844x, (xd.i) this.f2845y, cVar, 8);
                u9Var2.f2842v = obj;
                return u9Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2841u) {
            case 0:
                u9 u9Var = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                u9Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                u9 u9Var2 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                u9Var2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                u9 u9Var3 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar3 = pe.z.f22715a;
                u9Var3.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                u9 u9Var4 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar4 = pe.z.f22715a;
                u9Var4.invokeSuspend(zVar4);
                return zVar4;
            case 4:
                u9 u9Var5 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar5 = pe.z.f22715a;
                u9Var5.invokeSuspend(zVar5);
                return zVar5;
            case 5:
                u9 u9Var6 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar6 = pe.z.f22715a;
                u9Var6.invokeSuspend(zVar6);
                return zVar6;
            case 6:
                u9 u9Var7 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar7 = pe.z.f22715a;
                u9Var7.invokeSuspend(zVar7);
                return zVar7;
            case 7:
                u9 u9Var8 = (u9) create((pf.z) obj, (te.c) obj2);
                pe.z zVar8 = pe.z.f22715a;
                u9Var8.invokeSuspend(zVar8);
                return zVar8;
            default:
                u9 u9Var9 = (u9) create((b4.b) obj, (te.c) obj2);
                pe.z zVar9 = pe.z.f22715a;
                u9Var9.invokeSuspend(zVar9);
                return zVar9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.u9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9(Object obj, Object obj2, Object obj3, Object obj4, te.c cVar, int i, boolean z3) {
        super(2, cVar);
        this.f2841u = i;
        this.f2843w = obj;
        this.f2842v = obj2;
        this.f2844x = obj3;
        this.f2845y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9(Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f2841u = i;
        this.f2843w = obj;
        this.f2844x = obj2;
        this.f2845y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9(Object obj, Object obj2, Object obj3, Object obj4, te.c cVar, int i) {
        super(2, cVar);
        this.f2841u = i;
        this.f2842v = obj;
        this.f2843w = obj2;
        this.f2844x = obj3;
        this.f2845y = obj4;
    }
}
