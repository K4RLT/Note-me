package b2;
import z1.q;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 implements y2.c {

    /* renamed from: u, reason: collision with root package name */
    public boolean f1561u;

    /* renamed from: v, reason: collision with root package name */
    public long f1562v = 9223372034707292159L;

    /* renamed from: w, reason: collision with root package name */
    public long f1563w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f1564x;

    public o0(r0 r0Var) {
        this.f1564x = r0Var;
    }

    @Override // y2.c
    public final float a() {
        return this.f1564x.a();
    }

    public final void b(q qVar, float f10) {
        r0 r0Var = this.f1564x;
        d2 d2Var = r0Var.G;
        if (d2Var == null) {
            d2Var = new d2();
            r0Var.G = d2Var;
        }
        int p10 = qe.k.p(qVar, (q[]) d2Var.f1437b);
        if (p10 < 0) {
            int i = d2Var.f1436a;
            q[] qVarArr = (q[]) d2Var.f1437b;
            if (i == qVarArr.length) {
                int i10 = i * 2;
                d2Var.f1437b = (q[]) Arrays.copyOf(qVarArr, i10);
                d2Var.f1438c = Arrays.copyOf((float[]) d2Var.f1438c, i10);
                d2Var.f1439d = Arrays.copyOf((byte[]) d2Var.f1439d, i10);
            }
            ((q[]) d2Var.f1437b)[i] = qVar;
            ((byte[]) d2Var.f1439d)[i] = 3;
            ((float[]) d2Var.f1438c)[i] = f10;
            d2Var.f1436a++;
            return;
        }
        float[] fArr = (float[]) d2Var.f1438c;
        if (fArr[p10] == f10) {
            byte[] bArr = (byte[]) d2Var.f1439d;
            if (bArr[p10] == 2) {
                bArr[p10] = 0;
                return;
            }
            return;
        }
        fArr[p10] = f10;
        ((byte[]) d2Var.f1439d)[p10] = 1;
    }

    @Override // y2.c
    public final float i0() {
        return this.f1564x.i0();
    }
}
