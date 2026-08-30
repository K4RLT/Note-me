package r0;
import n.j0;
import r0.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class t1 extends ve.i implements df.q {
    public Set A;
    public j0 B;
    public int C;
    public /* synthetic */ w0 D;
    public final /* synthetic */ u1 E;

    /* renamed from: u, reason: collision with root package name */
    public List f24386u;

    /* renamed from: v, reason: collision with root package name */
    public List f24387v;

    /* renamed from: w, reason: collision with root package name */
    public List f24388w;

    /* renamed from: x, reason: collision with root package name */
    public j0 f24389x;

    /* renamed from: y, reason: collision with root package name */
    public j0 f24390y;

    /* renamed from: z, reason: collision with root package name */
    public j0 f24391z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, te.c cVar) {
        super(3, cVar);
        this.E = u1Var;
    }

    public static final void j(u1 u1Var, List list, List list2, List list3, j0 j0Var, j0 j0Var2, j0 j0Var3, j0 j0Var4) {
        char c10;
        long j10;
        long j11;
        synchronized (u1Var.f24396b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    x xVar = (x) list3.get(i);
                    xVar.a();
                    u1Var.C(xVar);
                }
                list3.clear();
                Object[] objArr = j0Var.f20899b;
                long[] jArr = j0Var.f20898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    j10 = 255;
                    while (true) {
                        long j12 = jArr[i10];
                        c10 = 7;
                        j11 = -9187201950435737472L;
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j12 & 255) < 128) {
                                    x xVar2 = (x) objArr[(i10 << 3) + i12];
                                    xVar2.a();
                                    u1Var.C(xVar2);
                                }
                                j12 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    c10 = 7;
                    j10 = 255;
                    j11 = -9187201950435737472L;
                }
                j0Var.b();
                Object[] objArr2 = j0Var2.f20899b;
                long[] jArr2 = j0Var2.f20898a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j13 = jArr2[i13];
                        if ((((~j13) << c10) & j13 & j11) != j11) {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j13 & j10) < 128) {
                                    ((x) objArr2[(i13 << 3) + i15]).g();
                                }
                                j13 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length2) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                j0Var2.b();
                j0Var3.b();
                Object[] objArr3 = j0Var4.f20899b;
                long[] jArr3 = j0Var4.f20898a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j14 = jArr3[i16];
                        if ((((~j14) << c10) & j14 & j11) != j11) {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j14 & j10) < 128) {
                                    x xVar3 = (x) objArr3[(i16 << 3) + i18];
                                    xVar3.a();
                                    u1Var.C(xVar3);
                                }
                                j14 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            }
                        }
                        if (i16 == length3) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                j0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void k(List list, u1 u1Var) {
        list.clear();
        synchronized (u1Var.f24396b) {
            try {
                ArrayList arrayList = u1Var.f24402j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((z0) arrayList.get(i));
                }
                u1Var.f24402j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        t1 t1Var = new t1(this.E, (te.c) obj3);
        t1Var.D = (w0) obj2;
        t1Var.invokeSuspend(pe.z.f22715a);
        return ue.a.f27192u;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0142 -> B:6:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01e1 -> B:20:0x009f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.t1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
