package o0;
import a.a;
import b.a;
import j1.e;
import l.a;
import p.c;
import p0.o;
import r0.c;
import r0.d;
import x.j0;
import z1.a1;
import z1.o0;
import z1.p0;
import z1.q0;
import z1.r0;
import z1.t;

import java.util.List;
import wa.u8;

/* loaded from: classes.dex */
public final class u0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final df.l f21694a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21695b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21696c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f21697d;

    public u0(df.l lVar, boolean z3, float f10, j0 j0Var) {
        this.f21694a = lVar;
        this.f21695b = z3;
        this.f21696c = f10;
        this.f21697d = j0Var;
    }

    @Override // p0
    public final int a(t tVar, List list, int i) {
        return c(tVar, list, i, s0.f21657y);
    }

    public final int b(t tVar, List list, int i, df.p pVar) {
        Object obj;
        int i10;
        int i11;
        Object obj2;
        int i12;
        Object obj3;
        int i13;
        Object obj4;
        int i14;
        Object obj5;
        int i15;
        Object obj6;
        int i16;
        Object obj7;
        int i17;
        int size = list.size();
        int i18 = 0;
        while (true) {
            if (i18 < size) {
                obj = list.get(i18);
                if (kotlin.jvm.internal.a(o.c((o0) obj), "Leading")) {
                    break;
                }
                i18++;
            } else {
                obj = null;
                break;
            }
        }
        o0 o0Var = (o0) obj;
        if (o0Var != null) {
            int n10 = o0Var.n(Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                i10 = i;
            } else {
                i10 = i - n10;
            }
            i11 = ((Number) pVar.invoke(o0Var, Integer.valueOf(i))).intValue();
        } else {
            i10 = i;
            i11 = 0;
        }
        int size2 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 < size2) {
                obj2 = list.get(i19);
                if (kotlin.jvm.internal.a(o.c((o0) obj2), "Trailing")) {
                    break;
                }
                i19++;
            } else {
                obj2 = null;
                break;
            }
        }
        o0 o0Var2 = (o0) obj2;
        if (o0Var2 != null) {
            int n11 = o0Var2.n(Integer.MAX_VALUE);
            if (i10 != Integer.MAX_VALUE) {
                i10 -= n11;
            }
            i12 = ((Number) pVar.invoke(o0Var2, Integer.valueOf(i))).intValue();
        } else {
            i12 = 0;
        }
        int size3 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 < size3) {
                obj3 = list.get(i20);
                if (kotlin.jvm.internal.a(o.c((o0) obj3), "Label")) {
                    break;
                }
                i20++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (o0) obj3;
        if (obj8 != null) {
            i13 = ((Number) pVar.invoke(obj8, Integer.valueOf(c7.c(i10, i, this.f21696c)))).intValue();
        } else {
            i13 = 0;
        }
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 < size4) {
                obj4 = list.get(i21);
                if (kotlin.jvm.internal.a(o.c((o0) obj4), "Prefix")) {
                    break;
                }
                i21++;
            } else {
                obj4 = null;
                break;
            }
        }
        o0 o0Var3 = (o0) obj4;
        if (o0Var3 != null) {
            i14 = ((Number) pVar.invoke(o0Var3, Integer.valueOf(i10))).intValue();
            int n12 = o0Var3.n(Integer.MAX_VALUE);
            if (i10 != Integer.MAX_VALUE) {
                i10 -= n12;
            }
        } else {
            i14 = 0;
        }
        int size5 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 < size5) {
                obj5 = list.get(i22);
                if (kotlin.jvm.internal.a(o.c((o0) obj5), "Suffix")) {
                    break;
                }
                i22++;
            } else {
                obj5 = null;
                break;
            }
        }
        o0 o0Var4 = (o0) obj5;
        if (o0Var4 != null) {
            int intValue = ((Number) pVar.invoke(o0Var4, Integer.valueOf(i10))).intValue();
            int n13 = o0Var4.n(Integer.MAX_VALUE);
            if (i10 != Integer.MAX_VALUE) {
                i10 -= n13;
            }
            i15 = intValue;
        } else {
            i15 = 0;
        }
        int size6 = list.size();
        for (int i23 = 0; i23 < size6; i23++) {
            Object obj9 = list.get(i23);
            if (kotlin.jvm.internal.a(o.c((o0) obj9), "TextField")) {
                int intValue2 = ((Number) pVar.invoke(obj9, Integer.valueOf(i10))).intValue();
                int size7 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 < size7) {
                        obj6 = list.get(i24);
                        if (kotlin.jvm.internal.a(o.c((o0) obj6), "Hint")) {
                            break;
                        }
                        i24++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (o0) obj6;
                if (obj10 != null) {
                    i16 = ((Number) pVar.invoke(obj10, Integer.valueOf(i10))).intValue();
                } else {
                    i16 = 0;
                }
                int size8 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 < size8) {
                        Object obj11 = list.get(i25);
                        if (kotlin.jvm.internal.a(o.c((o0) obj11), "Supporting")) {
                            obj7 = obj11;
                            break;
                        }
                        i25++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj12 = (o0) obj7;
                if (obj12 != null) {
                    i17 = ((Number) pVar.invoke(obj12, Integer.valueOf(i))).intValue();
                } else {
                    i17 = 0;
                }
                return c(i11, i12, i14, i15, intValue2, i13, i16, i17, this.f21696c, o.f22343a, tVar.a(), this.f21697d);
            }
        }
        l4.a.h("Collection contains no element matching the predicate.");
        return 0;
    }

    public final int c(t tVar, List list, int i, df.p pVar) {
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        int i11;
        Object obj4;
        int i12;
        Object obj5;
        int i13;
        Object obj6;
        int i14;
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            Object obj7 = list.get(i16);
            if (kotlin.jvm.internal.a(o.c((o0) obj7), "TextField")) {
                int intValue = ((Number) pVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i17 = 0;
                while (true) {
                    obj = null;
                    if (i17 < size2) {
                        obj2 = list.get(i17);
                        if (kotlin.jvm.internal.a(o.c((o0) obj2), "Label")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                o0 o0Var = (o0) obj2;
                if (o0Var != null) {
                    i10 = ((Number) pVar.invoke(o0Var, Integer.valueOf(i))).intValue();
                } else {
                    i10 = 0;
                }
                int size3 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size3) {
                        obj3 = list.get(i18);
                        if (kotlin.jvm.internal.a(o.c((o0) obj3), "Trailing")) {
                            break;
                        }
                        i18++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                o0 o0Var2 = (o0) obj3;
                if (o0Var2 != null) {
                    i11 = ((Number) pVar.invoke(o0Var2, Integer.valueOf(i))).intValue();
                } else {
                    i11 = 0;
                }
                int size4 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size4) {
                        obj4 = list.get(i19);
                        if (kotlin.jvm.internal.a(o.c((o0) obj4), "Leading")) {
                            break;
                        }
                        i19++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                o0 o0Var3 = (o0) obj4;
                if (o0Var3 != null) {
                    i12 = ((Number) pVar.invoke(o0Var3, Integer.valueOf(i))).intValue();
                } else {
                    i12 = 0;
                }
                int size5 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size5) {
                        obj5 = list.get(i20);
                        if (kotlin.jvm.internal.a(o.c((o0) obj5), "Prefix")) {
                            break;
                        }
                        i20++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                o0 o0Var4 = (o0) obj5;
                if (o0Var4 != null) {
                    i13 = ((Number) pVar.invoke(o0Var4, Integer.valueOf(i))).intValue();
                } else {
                    i13 = 0;
                }
                int size6 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size6) {
                        obj6 = list.get(i21);
                        if (kotlin.jvm.internal.a(o.c((o0) obj6), "Suffix")) {
                            break;
                        }
                        i21++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                o0 o0Var5 = (o0) obj6;
                if (o0Var5 != null) {
                    i14 = ((Number) pVar.invoke(o0Var5, Integer.valueOf(i))).intValue();
                } else {
                    i14 = 0;
                }
                int size7 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i22);
                    if (kotlin.jvm.internal.a(o.c((o0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i22++;
                }
                o0 o0Var6 = (o0) obj;
                if (o0Var6 != null) {
                    i15 = ((Number) pVar.invoke(o0Var6, Integer.valueOf(i))).intValue();
                }
                return d(i12, i11, i13, i14, intValue, i10, i15, this.f21696c, o.f22343a, tVar.a(), this.f21697d);
            }
        }
        l4.a.h("Collection contains no element matching the predicate.");
        return 0;
    }

    @Override // p0
    public final int d(t tVar, List list, int i) {
        return c(tVar, list, i, s0.f21655w);
    }

    @Override // p0
    public final int f(t tVar, List list, int i) {
        return b(tVar, list, i, s0.f21654v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [a1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [a1] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [a1] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a1] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [a1] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [a1] */
    /* JADX WARN: Type inference failed for: r9v24 */
    @Override // p0
    public final q0 g(r0 r0Var, List list, long j10) {
        Object obj;
        a1 a1Var;
        int i;
        int i10;
        q0 q0Var;
        Object obj2;
        a1 a1Var2;
        int i11;
        int i12;
        Object obj3;
        a1 a1Var3;
        a1 a1Var4;
        int i13;
        int i14;
        Object obj4;
        int i15;
        a1 a1Var5;
        int i16;
        int i17;
        int i18;
        Object obj5;
        Object r12;
        long j11;
        Object obj6;
        int i19;
        int i20;
        Object obj7;
        Object r92;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object r22;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        u0 u0Var = this;
        List list2 = list;
        j0 j0Var = u0Var.f21697d;
        int t02 = r0Var.t0(j0Var.c());
        long a10 = y2.a(j10, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i38 = 0;
        while (true) {
            if (i38 < size) {
                obj = list2.get(i38);
                if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj), "Leading")) {
                    break;
                }
                i38++;
            } else {
                obj = null;
                break;
            }
        }
        o0 o0Var = (o0) obj;
        if (o0Var != null) {
            a1Var = o0Var.z(a10);
        } else {
            a1Var = null;
        }
        float f10 = o.f22344b;
        if (a1Var != null) {
            i = a1Var.f31769u;
        } else {
            i = 0;
        }
        if (a1Var != null) {
            i10 = a1Var.f31770v;
        } else {
            i10 = 0;
        }
        int max = Math.max(0, i10);
        int size2 = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 < size2) {
                obj2 = list2.get(i39);
                q0Var = null;
                if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj2), "Trailing")) {
                    break;
                }
                i39++;
            } else {
                q0Var = null;
                obj2 = null;
                break;
            }
        }
        o0 o0Var2 = (o0) obj2;
        if (o0Var2 != null) {
            a1Var2 = o0Var2.z(y2.b.j(-i, 0, 2, a10));
        } else {
            a1Var2 = q0Var;
        }
        if (a1Var2 != 0) {
            i11 = a1Var2.f31769u;
        } else {
            i11 = 0;
        }
        int i40 = i + i11;
        if (a1Var2 != 0) {
            i12 = a1Var2.f31770v;
        } else {
            i12 = 0;
        }
        int max2 = Math.max(max, i12);
        int size3 = list2.size();
        int i41 = 0;
        while (true) {
            if (i41 < size3) {
                obj3 = list2.get(i41);
                if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj3), "Prefix")) {
                    break;
                }
                i41++;
            } else {
                obj3 = q0Var;
                break;
            }
        }
        o0 o0Var3 = (o0) obj3;
        if (o0Var3 != null) {
            a1Var3 = a1Var;
            a1Var4 = o0Var3.z(y2.b.j(-i40, 0, 2, a10));
        } else {
            a1Var3 = a1Var;
            a1Var4 = q0Var;
        }
        if (a1Var4 != 0) {
            i13 = a1Var4.f31769u;
        } else {
            i13 = 0;
        }
        int i42 = i40 + i13;
        if (a1Var4 != 0) {
            i14 = a1Var4.f31770v;
        } else {
            i14 = 0;
        }
        int max3 = Math.max(max2, i14);
        int size4 = list2.size();
        int i43 = 0;
        while (true) {
            if (i43 < size4) {
                obj4 = list2.get(i43);
                if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj4), "Suffix")) {
                    break;
                }
                i43++;
            } else {
                obj4 = q0Var;
                break;
            }
        }
        o0 o0Var4 = (o0) obj4;
        if (o0Var4 != null) {
            i15 = i42;
            a1Var5 = o0Var4.z(y2.b.j(-i42, 0, 2, a10));
        } else {
            i15 = i42;
            a1Var5 = q0Var;
        }
        if (a1Var5 != 0) {
            i16 = a1Var5.f31769u;
        } else {
            i16 = 0;
        }
        int i44 = i15 + i16;
        if (a1Var5 != 0) {
            i17 = a1Var5.f31770v;
        } else {
            i17 = 0;
        }
        int max4 = Math.max(max3, i17);
        int t03 = r0Var.t0(j0Var.a(r0Var.getLayoutDirection())) + r0Var.t0(j0Var.b(r0Var.getLayoutDirection()));
        int i45 = -i44;
        int c10 = c7.c(i45 - t03, -t03, u0Var.f21696c);
        int i46 = -t02;
        long i47 = y2.b.i(a10, c10, i46);
        int size5 = list2.size();
        int i48 = 0;
        while (true) {
            if (i48 < size5) {
                obj5 = list2.get(i48);
                int i49 = i48;
                i18 = t02;
                if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj5), "Label")) {
                    break;
                }
                i48 = i49 + 1;
                t02 = i18;
            } else {
                i18 = t02;
                obj5 = q0Var;
                break;
            }
        }
        o0 o0Var5 = (o0) obj5;
        if (o0Var5 != null) {
            r12 = o0Var5.z(i47);
        } else {
            r12 = q0Var;
        }
        if (r12 != 0) {
            j11 = u8.a(r12.f31769u, r12.f31770v);
        } else {
            j11 = 0;
        }
        u0Var.f21694a.invoke(new e(j11));
        int size6 = list2.size();
        int i50 = 0;
        while (true) {
            if (i50 < size6) {
                obj6 = list2.get(i50);
                int i51 = size6;
                if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj6), "Supporting")) {
                    break;
                }
                i50++;
                size6 = i51;
            } else {
                obj6 = q0Var;
                break;
            }
        }
        o0 o0Var6 = (o0) obj6;
        if (o0Var6 != null) {
            i19 = o0Var6.Z(y2.a.j(j10));
        } else {
            i19 = 0;
        }
        if (r12 != 0) {
            i20 = r12.f31770v;
        } else {
            i20 = 0;
        }
        int max5 = Math.max(i20 / 2, r0Var.t0(j0Var.d()));
        long a11 = y2.a(y2.b.i(j10, i45, (i46 - max5) - i19), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i52 = 0;
        while (i52 < size7) {
            int i53 = i52;
            o0 o0Var7 = (o0) list2.get(i52);
            if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a(o0Var7), "TextField")) {
                a1 z3 = o0Var7.z(a11);
                long a12 = y2.a(a11, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i54 = 0;
                while (true) {
                    if (i54 < size8) {
                        obj7 = list2.get(i54);
                        int i55 = size8;
                        int i56 = i54;
                        if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a((o0) obj7), "Hint")) {
                            break;
                        }
                        i54 = i56 + 1;
                        size8 = i55;
                    } else {
                        obj7 = q0Var;
                        break;
                    }
                }
                o0 o0Var8 = (o0) obj7;
                if (o0Var8 != null) {
                    r92 = o0Var8.z(a12);
                } else {
                    r92 = q0Var;
                }
                int i57 = z3.f31770v;
                if (r92 != 0) {
                    i21 = r92.f31770v;
                } else {
                    i21 = 0;
                }
                int max6 = Math.max(max4, Math.max(i57, i21) + max5 + i18);
                a1 a1Var6 = a1Var3;
                if (a1Var3 != null) {
                    i22 = a1Var6.f31769u;
                } else {
                    i22 = 0;
                }
                if (a1Var2 != 0) {
                    i23 = a1Var2.f31769u;
                } else {
                    i23 = 0;
                }
                if (a1Var4 != 0) {
                    i24 = a1Var4.f31769u;
                } else {
                    i24 = 0;
                }
                if (a1Var5 != 0) {
                    i25 = a1Var5.f31769u;
                } else {
                    i25 = 0;
                }
                int i58 = z3.f31769u;
                if (r12 != 0) {
                    i26 = r12.f31769u;
                } else {
                    i26 = 0;
                }
                if (r92 != 0) {
                    i27 = r92.f31769u;
                } else {
                    i27 = 0;
                }
                int d2 = d(i22, i23, i24, i25, i58, i26, i27, u0Var.f21696c, j10, r0Var.a(), u0Var.f21697d);
                int i59 = 0;
                long a13 = y2.a(y2.b.j(0, -max6, 1, a10), 0, d2, 0, 0, 9);
                int i60 = d2;
                if (o0Var6 != null) {
                    r22 = o0Var6.z(a13);
                } else {
                    r22 = q0Var;
                }
                if (r22 != 0) {
                    i28 = r22.f31770v;
                } else {
                    i28 = 0;
                }
                if (a1Var6 != null) {
                    i29 = 0;
                    i59 = a1Var6.f31770v;
                } else {
                    i29 = 0;
                }
                if (a1Var2 != 0) {
                    i30 = a1Var2.f31770v;
                } else {
                    i30 = i29;
                }
                if (a1Var4 != 0) {
                    i31 = a1Var4.f31770v;
                } else {
                    i31 = i29;
                }
                if (a1Var5 != 0) {
                    i32 = a1Var5.f31770v;
                } else {
                    i32 = i29;
                }
                int i61 = z3.f31770v;
                if (r12 != 0) {
                    i33 = r12.f31770v;
                } else {
                    i33 = i29;
                }
                if (r92 != 0) {
                    i34 = r92.f31770v;
                } else {
                    i34 = i29;
                }
                if (r22 != 0) {
                    i35 = r22.f31770v;
                } else {
                    i35 = i29;
                }
                a1 a1Var7 = r12;
                int c11 = c(i59, i30, i31, i32, i61, i33, i34, i35, u0Var.f21696c, j10, r0Var.a(), u0Var.f21697d);
                int i62 = c11 - i28;
                int size9 = list2.size();
                int i63 = i29;
                a1 a1Var8 = r22;
                while (i63 < size9) {
                    o0 o0Var9 = (o0) list2.get(i63);
                    if (kotlin.jvm.internal.a(androidx.compose.ui.layout.a(o0Var9), "Container")) {
                        if (i60 != Integer.MAX_VALUE) {
                            i36 = i60;
                        } else {
                            i36 = i29;
                        }
                        if (i62 != Integer.MAX_VALUE) {
                            i37 = i62;
                        } else {
                            i37 = i29;
                        }
                        a1 z9 = o0Var9.z(y2.a(i36, i60, i37, i62));
                        a1 a1Var9 = z3;
                        a1 a1Var10 = a1Var8;
                        int i64 = i60;
                        return r0Var.u0(i64, c11, qe.t.f24024u, new t0(c11, i64, a1Var6, a1Var2, a1Var4, a1Var5, a1Var9, a1Var7, r92, z9, a1Var10, u0Var, r0Var));
                    }
                    i63++;
                    i60 = i60;
                    a1Var8 = a1Var8;
                    z3 = z3;
                    a1Var7 = a1Var7;
                    a1Var6 = a1Var6;
                    u0Var = this;
                    list2 = list;
                }
                l4.a.h("Collection contains no element matching the predicate.");
                return q0Var;
            }
            i52 = i53 + 1;
            u0Var = this;
            list2 = list;
            a11 = a11;
        }
        l4.a.h("Collection contains no element matching the predicate.");
        return q0Var;
    }

    @Override // p0
    public final int i(t tVar, List list, int i) {
        return b(tVar, list, i, s0.f21656x);
    }
}