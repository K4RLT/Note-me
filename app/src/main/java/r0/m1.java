package r0;
import n.w;
import n1.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24293b;

    /* renamed from: c, reason: collision with root package name */
    public int f24294c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24295d;
    public final w e;

    /* renamed from: f, reason: collision with root package name */
    public final pe.n f24296f;

    public m1(int i, ArrayList arrayList) {
        this.f24292a = arrayList;
        this.f24293b = i;
        if (i < 0) {
            a("Invalid start index");
        }
        this.f24295d = new ArrayList();
        w wVar = new w();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s0 s0Var = (s0) this.f24292a.get(i11);
            int i12 = s0Var.f24374c;
            int i13 = s0Var.f24375d;
            wVar.i(i12, new m0(i11, i10, i13));
            i10 += i13;
        }
        this.e = wVar;
        this.f24296f = new pe.n(new l1(this));
    }

    public final boolean a(int i, int i10) {
        int i11;
        w wVar = this.e;
        m0 m0Var = (m0) wVar.b(i);
        if (m0Var == null) {
            return false;
        }
        int i12 = m0Var.f24290b;
        int i13 = i10 - m0Var.f24291c;
        m0Var.f24291c = i10;
        if (i13 != 0) {
            Object[] objArr = wVar.f20904c;
            long[] jArr = wVar.f20902a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr[i14];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j10) < 128) {
                                m0 m0Var2 = (m0) objArr[(i14 << 3) + i16];
                                if (m0Var2.f24290b >= i12 && !m0Var2.equals(m0Var) && (i11 = m0Var2.f24290b + i13) >= 0) {
                                    m0Var2.f24290b = i11;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i15 != 8) {
                            return true;
                        }
                    }
                    if (i14 != length) {
                        i14++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
