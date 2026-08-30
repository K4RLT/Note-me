package b2;
import c2.x;
import c2.y1;
import n.i0;
import n.j0;
import t0.e;

import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements df.l {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;

    /* renamed from: v, reason: collision with root package name */
    public static final d f1424v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f1425w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f1426x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f1427y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f1428z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1429u;

    static {
        int i = 1;
        f1424v = new d(i, 0);
        f1425w = new d(i, 1);
        f1426x = new d(i, 2);
        f1427y = new d(i, 3);
        f1428z = new d(i, 4);
        A = new d(i, 5);
        B = new d(i, 6);
        C = new d(i, 7);
        D = new d(i, 8);
        E = new d(i, 9);
        F = new d(i, 10);
        G = new d(i, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i10) {
        super(i);
        this.f1429u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f1429u) {
            case 0:
                ((c) obj).a1();
                return pe.z.f22715a;
            case 1:
                z1 z1Var = (z1) obj;
                if (z1Var.r()) {
                    r0 r0Var = z1Var.f1638v;
                    if (!r0Var.E) {
                        df.l c10 = z1Var.f1637u.c();
                        i0 i0Var = r0Var.H;
                        if (c10 == null) {
                            if (i0Var != null) {
                                Object[] objArr = i0Var.f20894c;
                                long[] jArr = i0Var.f20892a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i = 0;
                                    while (true) {
                                        long j10 = jArr[i];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i - length)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((255 & j10) < 128) {
                                                    r0Var.U0((j0) objArr[(i << 3) + i11]);
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
                                i0Var.a();
                            }
                        } else {
                            r0Var.G0(z1Var, 9223372034707292159L, 0L);
                            r0Var.A = c10;
                        }
                    }
                }
                return pe.z.f22715a;
            case 2:
                u1 u1Var = ((k1) obj).f1531e0;
                if (u1Var != null) {
                    ((y1) u1Var).c();
                }
                return pe.z.f22715a;
            case 3:
                k1 k1Var = (k1) obj;
                if (k1Var.r() && k1Var.F1(true)) {
                    i0 i0Var2 = k1Var.I;
                    n0 n0Var = i0Var2.f1478a0;
                    if (n0Var.f1554l > 0) {
                        if (n0Var.f1553k || n0Var.f1552j) {
                            i0Var2.U(false);
                        }
                        n0Var.f1558p.H0();
                    }
                    i0Var2.F();
                    x xVar = (x) m0.a(i0Var2);
                    xVar.getRectManager().e(i0Var2);
                    if (i0Var2.f1487j0 > 0) {
                        iw iwVar = xVar.l0.e;
                        iwVar.getClass();
                        if (i0Var2.f1487j0 > 0) {
                            ((e) iwVar.f14489v).b(i0Var2);
                            i0Var2.f1486i0 = true;
                        }
                        xVar.F(null);
                    }
                }
                return pe.z.f22715a;
            case 4:
                r1 r1Var = (r1) obj;
                if (r1Var.r()) {
                    r1Var.f1588u.r0();
                }
                return pe.z.f22715a;
            case 5:
                i0 i0Var3 = (i0) obj;
                if (i0Var3.I()) {
                    i0Var3.U(false);
                }
                return pe.z.f22715a;
            case 6:
                i0 i0Var4 = (i0) obj;
                if (i0Var4.I()) {
                    i0Var4.U(false);
                }
                return pe.z.f22715a;
            case 7:
                i0 i0Var5 = (i0) obj;
                if (i0Var5.I()) {
                    i0Var5.S(false);
                }
                return pe.z.f22715a;
            case 8:
                i0 i0Var6 = (i0) obj;
                if (i0Var6.I()) {
                    i0Var6.S(false);
                }
                return pe.z.f22715a;
            case 9:
                i0 i0Var7 = (i0) obj;
                if (i0Var7.I()) {
                    i0.T(i0Var7, false, 7);
                }
                return pe.z.f22715a;
            case 10:
                i0 i0Var8 = (i0) obj;
                if (i0Var8.I()) {
                    i0.V(i0Var8, false, 7);
                }
                return pe.z.f22715a;
            default:
                i0 i0Var9 = (i0) obj;
                if (i0Var9.I()) {
                    i0Var9.G();
                }
                return pe.z.f22715a;
        }
    }
}
