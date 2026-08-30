package y6;
import d.a;
import g.a;
import l.c;
import n.q;
import q.a;

import android.graphics.Rect;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import n.s0;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final j6.e f30958a = j6.e.j("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final j6.e f30959b = j6.e.j(FacebookMediationAdapter.KEY_ID, "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final j6.e f30960c = j6.e.j("list");

    /* renamed from: d, reason: collision with root package name */
    public static final j6.e f30961d = j6.e.j("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static o6.a a(z6.b bVar) {
        float f10;
        o6.a aVar;
        float f11;
        o6.a aVar2;
        int i;
        float f12;
        o6.a aVar3;
        int i10;
        float f13;
        float f14;
        float c10 = a7.c();
        q qVar = new q((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        s0 s0Var = new s0(0);
        o6.a aVar4 = new o6.a();
        bVar.j();
        int i11 = 0;
        int i12 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (bVar.p()) {
            switch (bVar.L(f30958a)) {
                case 0:
                    i11 = bVar.A();
                    break;
                case 1:
                    i12 = bVar.A();
                    break;
                case 2:
                    f16 = (float) bVar.w();
                    aVar4 = aVar4;
                    break;
                case 3:
                    f10 = c10;
                    aVar = aVar4;
                    f15 = ((float) bVar.w()) - 0.01f;
                    aVar4 = aVar;
                    c10 = f10;
                    break;
                case 4:
                    f10 = c10;
                    aVar = aVar4;
                    f17 = (float) bVar.w();
                    aVar4 = aVar;
                    c10 = f10;
                    break;
                case 5:
                    f11 = c10;
                    aVar2 = aVar4;
                    i = i12;
                    f12 = f16;
                    String[] split = bVar.B().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        aVar2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
                case 6:
                    f11 = c10;
                    o6.a aVar5 = aVar4;
                    i = i12;
                    f12 = f16;
                    bVar.f();
                    int i13 = 0;
                    while (bVar.p()) {
                        o6.a aVar6 = aVar5;
                        x6.e a10 = a(bVar, aVar6);
                        if (a10.e == 3) {
                            i13++;
                        }
                        arrayList.add(a10);
                        qVar.d(a10.f30118d, a10);
                        if (i13 > 4) {
                            a7.a("You have " + i13 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        aVar5 = aVar6;
                    }
                    aVar2 = aVar5;
                    bVar.k();
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
                case 7:
                    f11 = c10;
                    i = i12;
                    f12 = f16;
                    bVar.f();
                    while (bVar.p()) {
                        ArrayList arrayList3 = new ArrayList();
                        q qVar2 = new q((Object) null);
                        bVar.j();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i14 = 0;
                        int i15 = 0;
                        while (bVar.p()) {
                            int L = bVar.L(f30959b);
                            if (L != 0) {
                                if (L != 1) {
                                    if (L != 2) {
                                        if (L != 3) {
                                            if (L != 4) {
                                                if (L != 5) {
                                                    bVar.M();
                                                    bVar.N();
                                                    aVar3 = aVar4;
                                                } else {
                                                    str3 = bVar.B();
                                                }
                                            } else {
                                                str2 = bVar.B();
                                            }
                                        } else {
                                            i15 = bVar.A();
                                        }
                                    } else {
                                        i14 = bVar.A();
                                    }
                                } else {
                                    bVar.f();
                                    while (bVar.p()) {
                                        x6.e a11 = a(bVar, aVar4);
                                        qVar2.d(a11.f30118d, a11);
                                        arrayList3.add(a11);
                                        aVar4 = aVar4;
                                    }
                                    aVar3 = aVar4;
                                    bVar.k();
                                }
                                aVar4 = aVar3;
                            } else {
                                str = bVar.B();
                            }
                        }
                        o6.a aVar7 = aVar4;
                        bVar.m();
                        if (str2 != null) {
                            hashMap2.put(str, new o6.l(str, i14, str2, str3, i15));
                        } else {
                            hashMap.put(str, arrayList3);
                        }
                        aVar4 = aVar7;
                    }
                    bVar.k();
                    aVar2 = aVar4;
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
                case 8:
                    f11 = c10;
                    int i16 = i12;
                    float f18 = f16;
                    bVar.j();
                    while (bVar.p()) {
                        if (bVar.L(f30960c) != 0) {
                            bVar.M();
                            bVar.N();
                        } else {
                            bVar.f();
                            while (bVar.p()) {
                                j6.e eVar = k.f30944a;
                                bVar.j();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (bVar.p()) {
                                    int i17 = i16;
                                    int L2 = bVar.L(k.f30944a);
                                    if (L2 != 0) {
                                        float f19 = f18;
                                        if (L2 != 1) {
                                            if (L2 != 2) {
                                                if (L2 != 3) {
                                                    bVar.M();
                                                    bVar.N();
                                                } else {
                                                    bVar.w();
                                                }
                                            } else {
                                                str6 = bVar.B();
                                            }
                                        } else {
                                            str5 = bVar.B();
                                        }
                                        i16 = i17;
                                        f18 = f19;
                                    } else {
                                        str4 = bVar.B();
                                        i16 = i17;
                                    }
                                }
                                bVar.m();
                                hashMap3.put(str5, new u6.c(str4, str5, str6));
                                i16 = i16;
                            }
                            bVar.k();
                        }
                    }
                    i = i16;
                    f12 = f18;
                    bVar.m();
                    aVar2 = aVar4;
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
                case 9:
                    f11 = c10;
                    i10 = i12;
                    f13 = f16;
                    bVar.f();
                    while (bVar.p()) {
                        j6.e eVar2 = j.f30942a;
                        ArrayList arrayList4 = new ArrayList();
                        bVar.j();
                        double d2 = 0.0d;
                        char c11 = 0;
                        String str7 = null;
                        String str8 = null;
                        while (bVar.p()) {
                            int L3 = bVar.L(j.f30942a);
                            if (L3 != 0) {
                                if (L3 != 1) {
                                    if (L3 != 2) {
                                        if (L3 != 3) {
                                            if (L3 != 4) {
                                                if (L3 != 5) {
                                                    bVar.M();
                                                    bVar.N();
                                                } else {
                                                    bVar.j();
                                                    while (bVar.p()) {
                                                        if (bVar.L(j.f30943b) != 0) {
                                                            bVar.M();
                                                            bVar.N();
                                                        } else {
                                                            bVar.f();
                                                            while (bVar.p()) {
                                                                arrayList4.add((w6.m) a(bVar, aVar4));
                                                            }
                                                            bVar.k();
                                                        }
                                                    }
                                                    bVar.m();
                                                }
                                            } else {
                                                str8 = bVar.B();
                                            }
                                        } else {
                                            str7 = bVar.B();
                                        }
                                    } else {
                                        d2 = bVar.w();
                                    }
                                } else {
                                    bVar.w();
                                }
                            } else {
                                c11 = bVar.B().charAt(0);
                            }
                        }
                        bVar.m();
                        u6.d dVar = new u6.d(arrayList4, c11, d2, str7, str8);
                        s0Var.c(dVar.hashCode(), dVar);
                    }
                    bVar.k();
                    i = i10;
                    f12 = f13;
                    aVar2 = aVar4;
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
                case 10:
                    bVar.f();
                    while (bVar.p()) {
                        bVar.j();
                        String str9 = null;
                        float f20 = 0.0f;
                        while (bVar.p()) {
                            int L4 = bVar.L(f30961d);
                            if (L4 != 0) {
                                f14 = c10;
                                if (L4 != 1) {
                                    if (L4 != 2) {
                                        bVar.M();
                                        bVar.N();
                                    } else {
                                        bVar.w();
                                    }
                                } else {
                                    f16 = f16;
                                    f20 = (float) bVar.w();
                                    i12 = i12;
                                }
                            } else {
                                f14 = c10;
                                str9 = bVar.B();
                            }
                            c10 = f14;
                        }
                        bVar.m();
                        arrayList2.add(new u6.f(str9, f20));
                        i12 = i12;
                        f16 = f16;
                        c10 = c10;
                    }
                    f11 = c10;
                    i10 = i12;
                    f13 = f16;
                    bVar.k();
                    i = i10;
                    f12 = f13;
                    aVar2 = aVar4;
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
                default:
                    bVar.M();
                    bVar.N();
                    f11 = c10;
                    aVar2 = aVar4;
                    i = i12;
                    f12 = f16;
                    aVar4 = aVar2;
                    i12 = i;
                    c10 = f11;
                    f16 = f12;
                    break;
            }
        }
        float f21 = c10;
        o6.a aVar8 = aVar4;
        Rect rect = new Rect(0, 0, (int) (i11 * f21), (int) (i12 * f21));
        float c12 = a7.c();
        aVar8.f21792k = rect;
        aVar8.f21793l = f16;
        aVar8.f21794m = f15;
        aVar8.f21795n = f17;
        aVar8.f21791j = arrayList;
        aVar8.i = qVar;
        aVar8.f21786c = hashMap;
        aVar8.f21787d = hashMap2;
        aVar8.e = c12;
        aVar8.f21790h = s0Var;
        aVar8.f21788f = hashMap3;
        aVar8.f21789g = arrayList2;
        return aVar8;
    }
}
