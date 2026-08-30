package q;
import n.v;
import n.w;
import q.k;
import x.l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c7.x f22914a;

    public h0(c7.x xVar) {
        this.f22914a = xVar;
    }

    @Override // v, k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final s1 a(l1 l1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        c7.x xVar = this.f22914a;
        w wVar = (w) xVar.f4003w;
        v vVar = new v(wVar.e + 2);
        w wVar2 = new w(wVar.e);
        int[] iArr3 = wVar.f20903b;
        Object[] objArr3 = wVar.f20904c;
        long[] jArr = wVar.f20902a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr3[i14];
                            i = i11;
                            g0 g0Var = (g0) objArr3[i14];
                            vVar.a(i15);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            wVar2.i(i15, new r1((q) l1Var.f22943a.invoke(g0Var.f22900a), g0Var.f22901b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i11;
                        }
                        j10 >>= i;
                        i13++;
                        iArr3 = iArr2;
                        i11 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!wVar.a(0)) {
            int i16 = vVar.f20953b;
            if (i16 >= 0) {
                vVar.b(i16 + 1);
                int[] iArr4 = vVar.f20952a;
                int i17 = vVar.f20953b;
                if (i17 != 0) {
                    qe.k.c(1, 0, i17, iArr4, iArr4);
                }
                iArr4[0] = 0;
                vVar.f20953b++;
            } else {
                l("Index must be between 0 and size");
                return null;
            }
        }
        if (!wVar.a(xVar.f4002v)) {
            vVar.a(xVar.f4002v);
        }
        int i18 = vVar.f20953b;
        if (i18 != 0) {
            int[] iArr5 = vVar.f20952a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i18);
        }
        return new s1(vVar, wVar2, xVar.f4002v, y.f23034d);
    }
}
