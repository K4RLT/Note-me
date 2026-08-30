package c0;
import a0.r;
import a0.u;
import b.b;
import b0.c0;
import b0.f0;
import b0.i0;
import k.a;
import l.a;
import u.m;
import w.a;
import x.e;
import x.j0;

import java.util.ArrayList;
import java.util.List;
import r0.a1;
import r0.f1;
import t.z0;
import wa.b9;
import ya.ua;
import z1.l1;
import z1.q0;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ d1.i A;
    public final /* synthetic */ m B;
    public final /* synthetic */ pf.z C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f3413u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f3414v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f3415w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f3416x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.a f3417y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.a f3418z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d dVar, j0 j0Var, float f10, k kVar, kf.e eVar, df.a aVar, d1.i iVar, m mVar, pf.z zVar) {
        super(2);
        this.f3413u = dVar;
        this.f3414v = j0Var;
        this.f3415w = f10;
        this.f3416x = kVar;
        this.f3417y = eVar;
        this.f3418z = aVar;
        this.A = iVar;
        this.B = mVar;
        this.C = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v4, types: [qe.s] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        df.l lVar;
        int i10;
        int i11;
        d1.i iVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        z0 z0Var;
        c0 c0Var;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        d1.i iVar2;
        int i25;
        c0 c0Var2;
        long j11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3;
        boolean z9;
        boolean z10;
        qe.j jVar;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Object obj3;
        boolean z11;
        int i26;
        boolean z12;
        float d2;
        boolean z13;
        x xVar;
        boolean z14;
        int i27;
        int i28;
        w wVar = this;
        c0 c0Var3 = (c0) obj;
        long j12 = ((y2.a) obj2).f30799a;
        d dVar = wVar.f3413u;
        dVar.D.getValue();
        z0 z0Var2 = z0.f25598v;
        ua.a(j12, z0Var2);
        y2.m layoutDirection = c0Var3.f1163v.getLayoutDirection();
        j0 j0Var = wVar.f3414v;
        int t02 = c0Var3.f1163v.t0(androidx.compose.foundation.layout.a.e(j0Var, layoutDirection));
        int t03 = c0Var3.f1163v.t0(androidx.compose.foundation.layout.a.d(j0Var, c0Var3.f1163v.getLayoutDirection()));
        float d10 = j0Var.d();
        l1 l1Var = c0Var3.f1163v;
        int t04 = l1Var.t0(d10);
        int t05 = l1Var.t0(j0Var.c()) + t04;
        int i29 = t03 + t02;
        int i30 = i29 - t02;
        long i31 = y2.b.i(j12, -i29, -t05);
        dVar.f3346q = c0Var3;
        int t06 = l1Var.t0(wVar.f3415w);
        int h3 = y2.a.h(j12) - i29;
        long j13 = (t02 << 32) | (t04 & 4294967295L);
        wVar.f3416x.getClass();
        if (h3 < 0) {
            i = 0;
        } else {
            i = h3;
        }
        dVar.A = y2.b(i, y2.a.g(i31), 5);
        u uVar = (u) wVar.f3417y.invoke();
        m mVar = wVar.B;
        b1.i d11 = b1.w.d();
        if (d11 != null) {
            lVar = d11.e();
        } else {
            lVar = null;
        }
        b1.i g8 = b1.w.g(d11);
        int i32 = i;
        try {
            int j14 = dVar.j();
            z zVar = dVar.f3335d;
            int i33 = f0.i(j14, uVar, zVar.f3440y);
            if (j14 != i33) {
                ((f1) zVar.f3438w).i(i33);
                ((i0) zVar.f3441z).a(j14);
            }
            dVar.j();
            float k3 = dVar.k();
            dVar.m();
            mVar.getClass();
            float f10 = 0;
            int i34 = i32 + t06;
            int b10 = ff.a.b(f10 - (k3 * i34));
            b1.w.j(d11, g8, lVar);
            List g10 = f0.g(uVar, dVar.B, dVar.f3352w);
            int intValue = ((Number) wVar.f3418z.invoke()).intValue();
            a1 a1Var = dVar.C;
            l1 l1Var2 = l1Var;
            d1.h hVar = d1.c.H;
            c0 c0Var4 = c0Var3;
            int i35 = i34;
            z0 z0Var3 = z0Var2;
            a1 a1Var2 = a1Var;
            r rVar = new r(c0Var4, j12, i29, t05, 1);
            if (t02 < 0) {
                a.a("negative beforeContentPadding");
            }
            if (i30 < 0) {
                a.a("negative afterContentPadding");
            }
            if (i35 < 0) {
                i10 = 0;
            } else {
                i10 = i35;
            }
            m mVar2 = wVar.B;
            pf.z zVar2 = wVar.C;
            if (intValue <= 0) {
                xVar = new x(i32, t06, i30, -t02, h3 + i30, mVar2, (q0) rVar.b(Integer.valueOf(y2.a.j(i31)), Integer.valueOf(y2.a.i(i31)), c.f3285w), zVar2);
                z14 = false;
            } else {
                int i36 = t02;
                int i37 = i32;
                int i38 = h3;
                long b11 = y2.b(i37, y2.a.g(i31), 5);
                int i39 = i33;
                while (i39 > 0 && b10 > 0) {
                    i39--;
                    b10 -= i10;
                }
                int i40 = b10 * (-1);
                if (i39 >= intValue) {
                    i39 = intValue - 1;
                    i40 = 0;
                }
                qe.j jVar2 = new qe.j();
                int i41 = -i36;
                if (t06 < 0) {
                    i11 = t06;
                } else {
                    i11 = 0;
                }
                int i42 = i41 + i11;
                int i43 = i40 + i42;
                int i44 = i39;
                int i45 = 0;
                while (true) {
                    iVar = wVar.A;
                    i12 = i43;
                    if (i12 >= 0 || i44 <= 0) {
                        break;
                    }
                    int i46 = i44 - 1;
                    r rVar2 = rVar;
                    c0 c0Var5 = c0Var4;
                    int i47 = i45;
                    int i48 = i36;
                    u uVar2 = uVar;
                    z0 z0Var4 = z0Var3;
                    int i49 = i10;
                    int i50 = i37;
                    long j15 = j13;
                    j a10 = wa.a(c0Var5, i46, b11, uVar2, j15, z0Var4, hVar, iVar, l1Var2.getLayoutDirection(), false, i50);
                    jVar2.add(0, a10);
                    i43 = i12 + i49;
                    i44 = i46;
                    a1Var2 = a1Var2;
                    i38 = i38;
                    g10 = g10;
                    i10 = i49;
                    c0Var4 = c0Var5;
                    z0Var3 = z0Var4;
                    i35 = i35;
                    rVar = rVar2;
                    j13 = j15;
                    i37 = i50;
                    i36 = i48;
                    uVar = uVar2;
                    i45 = Math.max(i47, a10.f3363j);
                    wVar = this;
                }
                r rVar3 = rVar;
                c0 c0Var6 = c0Var4;
                int i51 = i38;
                int i52 = i45;
                int i53 = i36;
                int i54 = i12;
                u uVar3 = uVar;
                z0 z0Var5 = z0Var3;
                int i55 = i10;
                int i56 = i37;
                long j16 = j13;
                long j17 = b11;
                int i57 = i35;
                a1 a1Var3 = a1Var2;
                List list = g10;
                int i58 = i42;
                if (i54 < i58) {
                    i54 = i58;
                }
                int i59 = i54 - i58;
                int i60 = i51 + i30;
                if (i60 < 0) {
                    i13 = 0;
                } else {
                    i13 = i60;
                }
                int i61 = i52;
                int i62 = -i59;
                c0 c0Var7 = c0Var6;
                d1.i iVar3 = iVar;
                int i63 = i44;
                int i64 = 0;
                boolean z15 = false;
                while (true) {
                    i14 = i58;
                    if (i64 >= jVar2.f24021w) {
                        break;
                    }
                    if (i62 >= i13) {
                        jVar2.b(i64);
                        i58 = i14;
                        z15 = true;
                    } else {
                        i63++;
                        i62 += i55;
                        i64++;
                        i58 = i14;
                    }
                }
                boolean z16 = z15;
                int i65 = i63;
                int i66 = intValue;
                int i67 = i44;
                int i68 = i59;
                while (true) {
                    if (i65 < i66) {
                        if (i62 < i13 || i62 <= 0 || jVar2.isEmpty()) {
                            z0 z0Var6 = z0Var5;
                            int i69 = i62;
                            int i70 = i66;
                            int i71 = i61;
                            c0 c0Var8 = c0Var7;
                            d1.i iVar4 = iVar3;
                            int i72 = i51;
                            int i73 = i13;
                            j a11 = wa.a(c0Var8, i65, j17, uVar3, j16, z0Var6, hVar, iVar4, l1Var2.getLayoutDirection(), false, i56);
                            int i74 = i65;
                            int i75 = i70 - 1;
                            if (i74 == i75) {
                                i28 = i56;
                            } else {
                                i28 = i55;
                            }
                            int i76 = i69 + i28;
                            long j18 = j17;
                            int i77 = i14;
                            if (i76 <= i77 && i74 != i75) {
                                i68 -= i55;
                                i67 = i74 + 1;
                                z16 = true;
                            } else {
                                int max = Math.max(i71, a11.f3363j);
                                jVar2.addLast(a11);
                                i71 = max;
                            }
                            i66 = i70;
                            i62 = i76;
                            i65 = i74 + 1;
                            i14 = i77;
                            z0Var5 = z0Var6;
                            iVar3 = iVar4;
                            i13 = i73;
                            c0Var7 = c0Var8;
                            i51 = i72;
                            j17 = j18;
                            i61 = i71;
                        } else {
                            j10 = j17;
                            i17 = i62;
                            i15 = i66;
                            i16 = i65;
                            i18 = i51;
                            break;
                        }
                    } else {
                        int i78 = i62;
                        i15 = i66;
                        i16 = i65;
                        j10 = j17;
                        i17 = i78;
                        i18 = i51;
                        break;
                    }
                }
                z0 z0Var7 = z0Var5;
                int i79 = i61;
                d1.i iVar5 = iVar3;
                c0 c0Var9 = c0Var7;
                if (i17 < i18) {
                    int i80 = i18 - i17;
                    int i81 = i17 + i80;
                    int i82 = i79;
                    int i83 = i68 - i80;
                    while (true) {
                        i27 = i53;
                        if (i83 >= i27 || i67 <= 0) {
                            break;
                        }
                        i67--;
                        int i84 = i16;
                        i53 = i27;
                        c0 c0Var10 = c0Var9;
                        j a12 = wa.a(c0Var10, i67, j10, uVar3, j16, z0Var7, hVar, iVar5, l1Var2.getLayoutDirection(), false, i56);
                        jVar2.add(0, a12);
                        i83 += i55;
                        i82 = Math.max(i82, a12.f3363j);
                        i18 = i18;
                        c0Var9 = c0Var10;
                        i16 = i84;
                    }
                    int i85 = i82;
                    int i86 = i83;
                    i19 = i16;
                    i53 = i27;
                    z0Var = z0Var7;
                    c0Var = c0Var9;
                    i20 = i18;
                    if (i86 < 0) {
                        i21 = i81 + i86;
                        i22 = i85;
                        i23 = i67;
                        i24 = 0;
                    } else {
                        i21 = i81;
                        i24 = i86;
                        i22 = i85;
                        i23 = i67;
                    }
                } else {
                    i19 = i16;
                    z0Var = z0Var7;
                    c0Var = c0Var9;
                    i20 = i18;
                    i21 = i17;
                    i22 = i79;
                    i23 = i67;
                    i24 = i68;
                }
                if (i24 < 0) {
                    a.a("invalid currentFirstPageScrollOffset");
                }
                int i87 = -i24;
                j jVar3 = (j) jVar2.first();
                if (i53 <= 0 && t06 >= 0) {
                    iVar2 = iVar5;
                    i25 = i55;
                } else {
                    int a13 = jVar2.a();
                    int i88 = 0;
                    while (i88 < a13 && i24 != 0) {
                        iVar2 = iVar5;
                        i25 = i55;
                        if (i25 > i24) {
                            break;
                        }
                        c0Var2 = c0Var;
                        if (i88 == jVar2.a() - 1) {
                            break;
                        }
                        i24 -= i25;
                        i88++;
                        jVar3 = (j) jVar2.get(i88);
                        c0Var = c0Var2;
                        i55 = i25;
                        iVar5 = iVar2;
                    }
                    iVar2 = iVar5;
                    i25 = i55;
                }
                c0Var2 = c0Var;
                int i89 = i24;
                j jVar4 = jVar3;
                int i90 = i25;
                qe.j jVar5 = jVar2;
                z0 z0Var8 = z0Var;
                d1.i iVar6 = iVar2;
                int i91 = i87;
                long j19 = j10;
                v vVar = new v(c0Var2, j19, uVar3, j16, iVar6, i56, 1);
                d1.i iVar7 = iVar6;
                int max2 = Math.max(0, i23);
                int i92 = i23 - 1;
                if (max2 <= i92) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        j11 = j19;
                        arrayList.add(vVar.invoke(Integer.valueOf(i92)));
                        if (i92 == max2) {
                            break;
                        }
                        i92--;
                        j19 = j11;
                    }
                } else {
                    j11 = j19;
                    arrayList = null;
                }
                List list2 = list;
                int size = list2.size();
                int i93 = 0;
                while (i93 < size) {
                    d1.i iVar8 = iVar7;
                    List list3 = list;
                    int i94 = size;
                    int intValue2 = ((Number) list3.get(i93)).intValue();
                    if (intValue2 < max2) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(vVar.invoke(Integer.valueOf(intValue2)));
                    }
                    i93++;
                    size = i94;
                    list = list3;
                    iVar7 = iVar8;
                }
                d1.i iVar9 = iVar7;
                List list4 = list;
                Object r31 = qe.s.f24023u;
                if (arrayList == null) {
                    arrayList2 = r31;
                } else {
                    arrayList2 = arrayList;
                }
                ArrayList arrayList9 = arrayList2;
                int size2 = arrayList9.size();
                int i95 = i22;
                for (int i96 = 0; i96 < size2; i96++) {
                    i95 = Math.max(i95, ((j) arrayList2.get(i96)).f3363j);
                }
                int i97 = ((j) jVar5.last()).f3356a;
                int i98 = i95;
                c0 c0Var11 = c0Var2;
                ArrayList arrayList10 = arrayList2;
                v vVar2 = new v(c0Var11, j11, uVar3, j16, iVar9, i56, 0);
                int min = Math.min(i97, i15 - 1);
                int i99 = i97 + 1;
                ArrayList arrayList11 = null;
                if (i99 <= min) {
                    while (true) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        arrayList11.add(vVar2.invoke(Integer.valueOf(i99)));
                        if (i99 == min) {
                            break;
                        }
                        i99++;
                    }
                }
                int size3 = list2.size();
                for (int i100 = 0; i100 < size3; i100++) {
                    int intValue3 = ((Number) list4.get(i100)).intValue();
                    if (min + 1 <= intValue3 && intValue3 < i15) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        arrayList11.add(vVar2.invoke(Integer.valueOf(intValue3)));
                    }
                }
                if (arrayList11 == null) {
                    arrayList3 = r31;
                } else {
                    arrayList3 = arrayList11;
                }
                ArrayList arrayList12 = arrayList3;
                int size4 = arrayList12.size();
                int i101 = i98;
                for (int i102 = 0; i102 < size4; i102++) {
                    i101 = Math.max(i101, ((j) arrayList3.get(i102)).f3363j);
                }
                if (kotlin.jvm.internal.a(jVar4, jVar5.first()) && arrayList10.isEmpty() && arrayList3.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int g11 = y2.b.g(i21, i31);
                int f11 = y2.b.f(i101, i31);
                int i103 = i20;
                if (i21 < Math.min(g11, i103)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && i91 != 0) {
                    a.c("non-zero pagesScrollOffset=" + i91);
                }
                ArrayList arrayList13 = new ArrayList(arrayList3.size() + arrayList10.size() + jVar5.a());
                if (z9) {
                    if (!arrayList10.isEmpty() || !arrayList3.isEmpty()) {
                        a.a("No extra pages");
                    }
                    int a14 = jVar5.a();
                    int[] iArr = new int[a14];
                    for (int i104 = 0; i104 < a14; i104++) {
                        iArr[i104] = i56;
                    }
                    int[] iArr2 = new int[a14];
                    z10 = z3;
                    new e(l1Var2.Y(t06), false, null).c(c0Var11, g11, iArr, y2.m.f30814u, iArr2);
                    jf.d m4 = qe.k.m(iArr2);
                    int i105 = m4.f19189u;
                    int i106 = m4.f19190v;
                    int i107 = m4.f19191w;
                    if ((i107 > 0 && i105 <= i106) || (i107 < 0 && i106 <= i105)) {
                        while (true) {
                            int i108 = iArr2[i105];
                            jVar = jVar5;
                            int i109 = i107;
                            j jVar6 = (j) jVar.get(i105);
                            jVar6.b(i108, g11, f11);
                            arrayList13.add(jVar6);
                            if (i105 == i106) {
                                break;
                            }
                            i105 += i109;
                            i107 = i109;
                            jVar5 = jVar;
                        }
                    } else {
                        jVar = jVar5;
                    }
                    arrayList4 = arrayList10;
                    l1Var2 = l1Var2;
                } else {
                    z10 = z3;
                    jVar = jVar5;
                    int size5 = arrayList9.size();
                    int i110 = i91;
                    int i111 = 0;
                    while (i111 < size5) {
                        ArrayList arrayList14 = arrayList10;
                        ArrayList arrayList15 = arrayList12;
                        j jVar7 = (j) arrayList14.get(i111);
                        i110 -= i57;
                        jVar7.b(i110, g11, f11);
                        arrayList13.add(jVar7);
                        i111++;
                        arrayList12 = arrayList15;
                        arrayList10 = arrayList14;
                    }
                    arrayList4 = arrayList10;
                    ArrayList arrayList16 = arrayList12;
                    int a15 = jVar.a();
                    for (int i112 = 0; i112 < a15; i112++) {
                        j jVar8 = (j) jVar.get(i112);
                        jVar8.b(i91, g11, f11);
                        arrayList13.add(jVar8);
                        i91 += i57;
                    }
                    int size6 = arrayList16.size();
                    for (int i113 = 0; i113 < size6; i113++) {
                        j jVar9 = (j) arrayList3.get(i113);
                        jVar9.b(i91, g11, f11);
                        arrayList13.add(jVar9);
                        i91 += i57;
                    }
                }
                if (z10) {
                    arrayList5 = arrayList13;
                } else {
                    arrayList5 = new ArrayList(arrayList13.size());
                    int size7 = arrayList13.size();
                    int i114 = 0;
                    while (i114 < size7) {
                        Object obj4 = arrayList13.get(i114);
                        j jVar10 = (j) obj4;
                        ArrayList arrayList17 = arrayList3;
                        int i115 = size7;
                        if (jVar10.f3356a >= ((j) jVar.first()).f3356a && jVar10.f3356a <= ((j) jVar.last()).f3356a) {
                            arrayList5.add(obj4);
                        }
                        i114++;
                        arrayList3 = arrayList17;
                        size7 = i115;
                    }
                }
                ArrayList arrayList18 = arrayList3;
                if (arrayList4.isEmpty()) {
                    arrayList6 = r31;
                } else {
                    arrayList6 = new ArrayList(arrayList13.size());
                    int size8 = arrayList13.size();
                    for (int i116 = 0; i116 < size8; i116++) {
                        Object obj5 = arrayList13.get(i116);
                        if (((j) obj5).f3356a < ((j) jVar.first()).f3356a) {
                            arrayList6.add(obj5);
                        }
                    }
                }
                if (arrayList18.isEmpty()) {
                    arrayList7 = r31;
                    arrayList8 = arrayList6;
                } else {
                    ArrayList arrayList19 = new ArrayList(arrayList13.size());
                    int size9 = arrayList13.size();
                    int i117 = 0;
                    ArrayList arrayList20 = arrayList6;
                    while (i117 < size9) {
                        Object obj6 = arrayList13.get(i117);
                        ArrayList arrayList21 = arrayList20;
                        if (((j) obj6).f3356a > ((j) jVar.last()).f3356a) {
                            arrayList19.add(obj6);
                        }
                        i117++;
                        arrayList20 = arrayList21;
                    }
                    arrayList7 = arrayList19;
                    arrayList8 = arrayList20;
                }
                ArrayList arrayList22 = arrayList8;
                if (arrayList5.isEmpty()) {
                    z11 = true;
                    obj3 = null;
                } else {
                    obj3 = arrayList5.get(0);
                    int i118 = ((j) obj3).f3365l;
                    mVar2.getClass();
                    float f12 = -Math.abs(i118 - f10);
                    int size10 = arrayList5.size() - 1;
                    z11 = true;
                    if (1 <= size10) {
                        int i119 = 1;
                        while (true) {
                            Object obj7 = arrayList5.get(i119);
                            float f13 = -Math.abs(((j) obj7).f3365l - f10);
                            if (Float.compare(f12, f13) < 0) {
                                obj3 = obj7;
                                f12 = f13;
                            }
                            if (i119 == size10) {
                                break;
                            }
                            i119++;
                        }
                    }
                }
                j jVar11 = (j) obj3;
                mVar2.getClass();
                if (jVar11 != null) {
                    i26 = jVar11.f3365l;
                } else {
                    i26 = 0;
                }
                if (i90 == 0) {
                    d2 = 0.0f;
                    z12 = false;
                } else {
                    z12 = false;
                    d2 = b9.d((0 - i26) / i90, -0.5f, 0.5f);
                }
                q0 q0Var = (q0) rVar3.b(Integer.valueOf(g11), Integer.valueOf(f11), new u(a1Var3, 9, arrayList13));
                if (i19 >= i15 && i21 <= i103) {
                    z13 = z12;
                } else {
                    z13 = z11;
                }
                float f14 = d2;
                z14 = z12;
                xVar = new x(arrayList5, i56, t06, i30, z0Var8, i41, i60, jVar4, jVar11, f14, i89, z13, mVar2, q0Var, z16, arrayList22, arrayList7, zVar2);
            }
            dVar.h(xVar, l1Var2.j0(), z14);
            return xVar;
        } catch (Throwable th) {
            b1.w.j(d11, g8, lVar);
            throw th;
        }
    }
}