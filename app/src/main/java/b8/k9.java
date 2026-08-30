package b8;
import a.a;
import j.c;
import c0.j;
import w.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k9 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2327u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2328v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(int i, ArrayList arrayList) {
        super(1);
        this.f2327u = i;
        this.f2328v = arrayList;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        int i10;
        int i11;
        int i12;
        switch (this.f2327u) {
            case 0:
                this.f2328v.get(((Number) obj).intValue());
                return null;
            case 1:
                z1.z0 z0Var = (z1.z0) obj;
                ArrayList arrayList = this.f2328v;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    j jVar = (j) arrayList.get(i13);
                    List list = jVar.f3357b;
                    boolean z3 = jVar.i;
                    if (jVar.f3366m == Integer.MIN_VALUE) {
                        a.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        z1.a1 a1Var = (z1.a1) list.get(i14);
                        int i15 = i13;
                        long j10 = (r12[r13 + 1] & 4294967295L) | (jVar.f3364k[i14 * 2] << 32);
                        if (jVar.f3362h) {
                            if (z3) {
                                i10 = (int) (j10 >> 32);
                            } else {
                                int i16 = jVar.f3366m - ((int) (j10 >> 32));
                                if (z3) {
                                    i = a1Var.f31770v;
                                } else {
                                    i = a1Var.f31769u;
                                }
                                i10 = i16 - i;
                            }
                            if (z3) {
                                int i17 = jVar.f3366m - ((int) (j10 & 4294967295L));
                                if (z3) {
                                    i12 = a1Var.f31770v;
                                } else {
                                    i12 = a1Var.f31769u;
                                }
                                i11 = i17 - i12;
                            } else {
                                i11 = (int) (j10 & 4294967295L);
                            }
                            j10 = (i11 & 4294967295L) | (i10 << 32);
                        }
                        long c10 = j.c(j10, jVar.f3358c);
                        if (z3) {
                            z1.z0.r(z0Var, a1Var, c10);
                        } else {
                            z1.z0.m(z0Var, a1Var, c10);
                        }
                        i14++;
                        i13 = i15;
                    }
                    i13++;
                }
                return pe.z.f22715a;
            case 2:
                z1.z0 z0Var2 = (z1.z0) obj;
                ArrayList arrayList2 = this.f2328v;
                int size3 = arrayList2.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    z1.z0.k(z0Var2, (z1.a1) arrayList2.get(i18), 0, 0);
                }
                return pe.z.f22715a;
            case 3:
                z1.z0 z0Var3 = (z1.z0) obj;
                ArrayList arrayList3 = this.f2328v;
                int size4 = arrayList3.size() - 1;
                if (size4 >= 0) {
                    int i19 = 0;
                    while (true) {
                        z1.z0.k(z0Var3, (z1.a1) arrayList3.get(i19), 0, 0);
                        if (i19 != size4) {
                            i19++;
                        }
                    }
                }
                return pe.z.f22715a;
            case 4:
                z1.z0 z0Var4 = (z1.z0) obj;
                ArrayList arrayList4 = this.f2328v;
                int size5 = arrayList4.size();
                for (int i20 = 0; i20 < size5; i20++) {
                    z1.z0.k(z0Var4, (z1.a1) arrayList4.get(i20), 0, 0);
                }
                return pe.z.f22715a;
            case 5:
                z1.z0 z0Var5 = (z1.z0) obj;
                ArrayList arrayList5 = this.f2328v;
                int size6 = arrayList5.size();
                for (int i21 = 0; i21 < size6; i21++) {
                    z0Var5.h((z1.a1) arrayList5.get(i21), 0, 0, 0.0f);
                }
                return pe.z.f22715a;
            case 6:
                z1.z0 z0Var6 = (z1.z0) obj;
                ArrayList arrayList6 = this.f2328v;
                int size7 = arrayList6.size();
                for (int i22 = 0; i22 < size7; i22++) {
                    z0Var6.h((z1.a1) arrayList6.get(i22), 0, 0, 0.0f);
                }
                return pe.z.f22715a;
            case 7:
                this.f2328v.get(((Number) obj).intValue());
                return null;
            case 8:
                this.f2328v.get(((Number) obj).intValue());
                return null;
            default:
                z1.z0 z0Var7 = (z1.z0) obj;
                ArrayList arrayList7 = this.f2328v;
                int size8 = arrayList7.size();
                for (int i23 = 0; i23 < size8; i23++) {
                    z1.z0.l(z0Var7, (z1.a1) arrayList7.get(i23), 0, 0);
                }
                return pe.z.f22715a;
        }
    }
}
