package r;
import j.i0;
import n.i0;
import o.a;
import r0.x;
import t.u0;
import t0.b;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24127u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f24128v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(df.a aVar) {
        super(0);
        this.f24127u = 3;
        this.f24128v = (kotlin.jvm.internal.m) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.internal.m, df.a] */
    @Override // df.a
    public final Object invoke() {
        f fVar;
        x xVar;
        switch (this.f24127u) {
            case 0:
                n1 n1Var = (n1) this.f24128v;
                g gVar = (g) b2.l.h(n1Var, a1.f24045a);
                n1Var.U = gVar;
                if (gVar != null) {
                    fVar = new f(gVar.f24074a, gVar.f24075b, gVar.f24076c, gVar.f24077d);
                } else {
                    fVar = null;
                }
                n1Var.V = fVar;
                return pe.z.f22715a;
            case 1:
                Object systemService = ((View) ((i0) this.f24128v).f18636v).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 2:
                return new BaseInputConnection(((r2.a0) this.f24128v).f24447a, false);
            case 3:
                ((kotlin.jvm.internal.m) this.f24128v).invoke();
                return pe.z.f22715a;
            case 4:
                return (u0) rf.a(((rf.l) this.f24128v).c());
            case 5:
                return ((u1.d) this.f24128v).f25812d;
            case 6:
                return ((u1.g) this.f24128v).Y0();
            case 7:
                return new xd.i((y3.f) this.f24128v);
            case 8:
                File file = (File) ((y3.z) this.f24128v).f30900a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (y3.z.f30899k) {
                    LinkedHashSet linkedHashSet = y3.z.f30898j;
                    if (!linkedHashSet.contains(absolutePath)) {
                        absolutePath.getClass();
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return file;
            case 9:
                z1.c0 c0Var = (z1.c0) this.f24128v;
                if (!((Boolean) c0Var.f31786f.getValue()).booleanValue() && (xVar = c0Var.f31784c) != null) {
                    xVar.k();
                }
                return pe.z.f22715a;
            default:
                z1.j0 a10 = ((z1.k1) this.f24128v).a();
                b2.i0 i0Var = a10.f31828u;
                if (a10.H != ((b) i0Var.o()).f25611u.f25619w) {
                    i0 i0Var2 = a10.f31833z;
                    Object[] objArr = i0Var2.f20894c;
                    long[] jArr = i0Var2.f20892a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j10 = jArr[i];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j10) < 128) {
                                        ((z1.c0) objArr[(i << 3) + i11]).f31785d = true;
                                    }
                                    j10 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                    if (i0Var.B != null) {
                        if (!i0Var.f1478a0.e) {
                            b2.i0.T(i0Var, false, 7);
                        }
                    } else if (!i0Var.q()) {
                        b2.i0.V(i0Var, false, 7);
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i, Object obj) {
        super(0);
        this.f24127u = i;
        this.f24128v = obj;
    }
}
