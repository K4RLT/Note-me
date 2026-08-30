package i1;

import b2.k0;
import c2.x;
import java.io.Serializable;
import pe.z;
import x.n0;
import z1.a1;
import z1.r0;
import z1.z0;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18136u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f18137v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f18138w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f18139x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Serializable f18140y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f18141z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(a1[] a1VarArr, x.r rVar, int i, r0 r0Var, int[] iArr) {
        super(1);
        this.f18136u = 2;
        this.f18137v = a1VarArr;
        this.f18138w = rVar;
        this.f18139x = i;
        this.f18141z = r0Var;
        this.f18140y = iArr;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        n0 n0Var;
        int a10;
        switch (this.f18136u) {
            case 0:
                z1.i iVar = (z1.i) obj;
                s sVar = (s) this.f18137v;
                s sVar2 = (s) this.f18138w;
                if (sVar != ((j) ((x) b2.l.v(sVar2)).getFocusOwner()).f18112h) {
                    return Boolean.TRUE;
                }
                boolean B = f.B(sVar2, (s) this.f18141z, this.f18139x, (k0) this.f18140y);
                Boolean valueOf = Boolean.valueOf(B);
                if (!B && iVar.a()) {
                    return null;
                }
                return valueOf;
            case 1:
                z1.i iVar2 = (z1.i) obj;
                s sVar3 = (s) this.f18137v;
                s sVar4 = (s) this.f18138w;
                if (sVar3 != ((j) ((x) b2.l.v(sVar4)).getFocusOwner()).f18112h) {
                    return Boolean.TRUE;
                }
                boolean A = f.A(this.f18139x, (k0) this.f18140y, sVar4, (j1.c) this.f18141z);
                Boolean valueOf2 = Boolean.valueOf(A);
                if (!A && iVar2.a()) {
                    return null;
                }
                return valueOf2;
            default:
                z0 z0Var = (z0) obj;
                a1[] a1VarArr = (a1[]) this.f18137v;
                x.r rVar = (x.r) this.f18138w;
                r0 r0Var = (r0) this.f18141z;
                int[] iArr = (int[]) this.f18140y;
                int length = a1VarArr.length;
                int i = 0;
                int i10 = 0;
                while (i < length) {
                    a1 a1Var = a1VarArr[i];
                    int i11 = i10 + 1;
                    a1Var.getClass();
                    Object H = a1Var.H();
                    x.t tVar = null;
                    if (H instanceof n0) {
                        n0Var = (n0) H;
                    } else {
                        n0Var = null;
                    }
                    y2.m layoutDirection = r0Var.getLayoutDirection();
                    if (n0Var != null) {
                        tVar = n0Var.f29988c;
                    }
                    int i12 = this.f18139x;
                    if (tVar != null) {
                        a10 = tVar.a(i12 - a1Var.f31769u, layoutDirection);
                    } else {
                        a10 = rVar.f29998b.a(0, i12 - a1Var.f31769u, layoutDirection);
                    }
                    z0Var.h(a1Var, a10, iArr[i10], 0.0f);
                    i++;
                    i10 = i11;
                }
                return z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(s sVar, s sVar2, Object obj, int i, k0 k0Var, int i10) {
        super(1);
        this.f18136u = i10;
        this.f18137v = sVar;
        this.f18138w = sVar2;
        this.f18141z = obj;
        this.f18139x = i;
        this.f18140y = k0Var;
    }
}
