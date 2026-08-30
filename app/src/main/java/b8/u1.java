package b8;
import b8.h4;
import c2.d;
import c2.e;
import c2.i;
import l7.b;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2816c;

    public /* synthetic */ u1(List list, String str) {
        this.f2814a = 2;
        this.f2816c = list;
        this.f2815b = str;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        i4 i4Var2 = i4Var;
        switch (this.f2814a) {
            case 0:
                String str = (String) this.f2815b;
                List list = (List) this.f2816c;
                i(i4Var2, str, true);
                d2 d2Var = i4Var2.e;
                int i = d2Var.f1964a;
                float k3 = i4Var2.k() / 3;
                int i10 = 0;
                while (i10 < 12) {
                    float h3 = (((i10 % 3) + 0.5f) * k3) + i4Var2.h();
                    float f10 = (0.175f * (i10 / 3)) + 0.205f;
                    if (i10 >= 0 && i10 < list.size()) {
                        obj = list.get(i10);
                    } else {
                        obj = "";
                    }
                    i4.t(i4Var2, (String) obj, h3, f10 + 0.03f, 0.021f, d2Var.f1966c, "dm-sans", Float.valueOf(0.86f * k3), 3456);
                    i4.o(h3, f10 + 0.064f, 0.46f * k3, d(i, 71), 16, i4Var);
                    for (int i11 = 0; i11 < 2; i11++) {
                        i4.o(h3, f10 + 0.104f + (i11 * 0.042f), k3 - 0.055f, d(i, 20), 16, i4Var);
                    }
                    i10++;
                    i4Var2 = i4Var;
                }
                return;
            case 1:
                String str2 = (String) this.f2815b;
                List list2 = (List) this.f2816c;
                d2 d2Var2 = i4Var2.e;
                i4Var2.l(str2, 0.11f, "serif-bold", 0.042f);
                float k4 = i4Var2.k() / 7.0f;
                int i12 = 0;
                while (true) {
                    int i13 = 7;
                    if (i12 < 7) {
                        if (i12 >= 0 && i12 < list2.size()) {
                            obj2 = list2.get(i12);
                        } else {
                            obj2 = "";
                        }
                        i4.t(i4Var2, (String) obj2, i4Var2.h() + ((i12 + 0.5f) * k4), 0.21f, 0.02f, d2Var2.f1965b, "sans", null, 3968);
                        i12++;
                        i4Var2 = i4Var;
                    } else {
                        int i14 = 0;
                        while (i14 < 5) {
                            int i15 = 0;
                            while (i15 < i13) {
                                i4.a(i4Var, ((i15 + 0.5f) * k4) + i4Var.h(), ((i14 + 0.9f) * 0.115f) + 0.21f, 0.88f * k4, 0.092f, null, Integer.valueOf(d2Var2.f1965b), 0.003f, 0.06f, 0.0f, null, 784);
                                i15++;
                                i14 = i14;
                                i13 = i13;
                            }
                            i14++;
                            i13 = i13;
                        }
                        return;
                    }
                }
                break;
            case 2:
                List list3 = (List) this.f2816c;
                String str3 = (String) this.f2815b;
                d2 d2Var3 = i4Var2.e;
                int size = list3.size();
                if (size != 1) {
                    if (size != 2) {
                        i4.g(i4Var2, (b) list3.get(0), i4Var2.i(), 0.26f, 0.74f, -2.0f, 32);
                        if (1 < list3.size()) {
                            obj3 = list3.get(1);
                        } else {
                            obj3 = (b) list3.get(0);
                        }
                        i4.g(i4Var, (b) obj3, i4Var.h() + 0.2f, 0.58f, 0.52f, 2.5f, 32);
                        if (2 < list3.size()) {
                            obj4 = list3.get(2);
                        } else {
                            obj4 = (b) list3.get(0);
                        }
                        i4.g(i4Var, (b) obj4, i4Var.j() - 0.2f, 0.6f, 0.52f, -3.0f, 32);
                        i4.r(i4Var.i() - 0.18f, 0.11f, -16.0f, 0, 20, i4Var);
                    } else {
                        i4.g(i4Var, (b) list3.get(0), i4Var.i(), 0.3f, 0.86f, -2.2f, 32);
                        i4.g(i4Var, (b) list3.get(1), i4Var.i(), 0.68f, 0.86f, 2.0f, 32);
                        i4.r(i4Var.i() - 0.2f, 0.13f, -18.0f, 0, 20, i4Var);
                        i4.r(i4Var.i() + 0.2f, 0.51f, 14.0f, d2Var3.f1967d, 16, i4Var);
                    }
                } else {
                    i4.g(i4Var, (b) list3.get(0), i4Var.i(), 0.44f, 1.02f, -1.8f, 32);
                    i4.r(i4Var.i() - 0.24f, 0.2f, -22.0f, 0, 20, i4Var);
                }
                if (!mf.f.u(str3)) {
                    i4.t(i4Var, str3, i4Var.i(), 0.9f, 0.03f, d2Var3.f1964a, "casual", null, 4032);
                    return;
                } else {
                    i4.o(i4Var.i(), 0.91f, 0.6f * i4Var.k(), 0, 24, i4Var);
                    return;
                }
            default:
                b bVar = (b) this.f2815b;
                b bVar2 = (b) this.f2816c;
                float e = e(bVar, 0.74f);
                float e8 = e(bVar2, 0.4f);
                float b10 = i4.b(e + 0.075f + e8 + 0.055f, 0.0f, 6, i4Var2);
                float f11 = e / 2.0f;
                float f12 = b10 + f11;
                i4.g(i4Var2, bVar, i4Var2.i(), f12, 0.74f, 0.0f, 48);
                i4.s(i4Var, i4Var.i(), f12, 0.259f, f11, false, 0, 0.16f, 160);
                float i16 = i4Var.i();
                d2 d2Var4 = i4Var.e;
                i4.s(i4Var, i16, f12, 0.259f, f11, true, d2Var4.f1967d, 0.16f, 128);
                float f13 = e8 / 2.0f;
                float f14 = b10 + e + 0.075f + f13;
                i4.g(i4Var, bVar2, i4Var.h() + 0.14f + 0.02f, f14, 0.4f, 0.0f, 48);
                i4.g(i4Var, bVar2, (i4Var.j() - 0.14f) - 0.02f, f14, 0.4f, 0.0f, 48);
                i4.s(i4Var, i4Var.h() + 0.14f + 0.02f, f14, 0.14f, f13, false, 0, 0.11f, 160);
                i4.s(i4Var, (i4Var.j() - 0.14f) - 0.02f, f14, 0.14f, f13, true, d2Var4.f1967d, 0.11f, 128);
                i4.o(i4Var.i(), f14 + f13 + 0.055f, i4Var.k() * 0.8f, d(d2Var4.f1964a, 46), 16, i4Var);
                return;
        }
    }

    public /* synthetic */ u1(Object obj, int i, Object obj2) {
        this.f2814a = i;
        this.f2815b = obj;
        this.f2816c = obj2;
    }
}
