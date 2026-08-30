package b2;
import c2.p1;
import d1.q;
import d1.r;
import l.e;
import l1.c;
import r0.a0;
import r0.y;
import t0.e;
import z0.g;
import z1.p0;

import androidx.ink.storage.DecompressedBytes;
import c2.r2;
import r0.o2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final f f1449v;

    /* renamed from: w, reason: collision with root package name */
    public static final f f1450w;

    /* renamed from: x, reason: collision with root package name */
    public static final f f1451x;

    /* renamed from: y, reason: collision with root package name */
    public static final f f1452y;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1453u;

    static {
        int i = 2;
        f1449v = new f(i, 0);
        f1450w = new f(i, 1);
        f1451x = new f(i, 2);
        f1452y = new f(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i10) {
        super(i);
        this.f1453u = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1453u) {
            case 0:
                ((Number) obj2).intValue();
                ((h) obj).getClass();
                return pe.z.f22715a;
            case 1:
                ((i0) ((h) obj)).c0((p0) obj2);
                return pe.z.f22715a;
            case 2:
                ((i0) ((h) obj)).d0((r) obj2);
                return pe.z.f22715a;
            default:
                a0 a0Var = (a0) obj2;
                i0 i0Var = (i0) ((h) obj);
                i0Var.V = a0Var;
                f1 f1Var = i0Var.Z;
                o2 o2Var = p1.f3606h;
                g gVar = (g) a0Var;
                gVar.getClass();
                i0Var.Z((y2.c) y.E(gVar, o2Var));
                y2.m mVar = (y2.m) y.E(gVar, p1.f3611n);
                if (i0Var.T != mVar) {
                    i0Var.T = mVar;
                    i0Var.E();
                    i0 v2 = i0Var.v();
                    if (v2 != null) {
                        v2.C();
                    }
                    i0Var.D();
                    for (q qVar = (q) f1Var.A; qVar != null; qVar = qVar.f15693z) {
                        qVar.Z();
                    }
                }
                i0Var.e0((r2) y.E(gVar, p1.f3616s));
                q qVar2 = (q) f1Var.A;
                if ((qVar2.f15691x & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f15690w & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
                            k kVar = qVar2;
                            Object r22 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof i) {
                                    q qVar3 = ((q) ((i) kVar)).f15688u;
                                    if (qVar3.H) {
                                        c(qVar3);
                                    } else {
                                        qVar3.D = true;
                                    }
                                } else if ((kVar.f15690w & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0 && (kVar instanceof k)) {
                                    q qVar4 = kVar.J;
                                    int i = 0;
                                    kVar = kVar;
                                    r22 = r22;
                                    while (qVar4 != null) {
                                        if ((qVar4.f15690w & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
                                            i++;
                                            r22 = r22;
                                            if (i == 1) {
                                                kVar = qVar4;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new e(new q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r22.b(kVar);
                                                    kVar = 0;
                                                }
                                                r22.b(qVar4);
                                            }
                                        }
                                        qVar4 = qVar4.f15693z;
                                        kVar = kVar;
                                        r22 = r22;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                kVar = e(r22);
                            }
                        }
                        if ((qVar2.f15691x & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
                            qVar2 = qVar2.f15693z;
                        }
                    }
                }
                return pe.z.f22715a;
        }
    }
}