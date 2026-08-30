package com.google.android.gms.internal.ads;
import id.a;
import id.b;
import nc.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class jc implements bd {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jc f7396b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jc f7397c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jc f7398d;
    public static final /* synthetic */ jc e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jc f7399f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jc f7400g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ jc f7401h;
    public static final /* synthetic */ jc i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ jc f7402j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ jc f7403k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ jc f7404l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ jc f7405m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ jc f7406n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jc f7407o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ jc f7408p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ jc f7409q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ jc f7410r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ jc f7411s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ jc f7412t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ jc f7413u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ jc f7414v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7415a;

    static {
        int i10 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i11 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i12 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i13 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i14 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i15 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i16 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f7414v = new jc((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f7413u = new jc((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f7412t = new jc((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f7411s = new jc(i16);
        f7410r = new jc(i13);
        f7409q = new jc(i14);
        jc jcVar = new jc(i15);
        int i17 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i18 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i19 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i20 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i21 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i22 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i23 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i24 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i25 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f7408p = jcVar;
        f7407o = new jc(i12);
        f7406n = new jc(i17);
        f7405m = new jc(i18);
        f7404l = new jc(i19);
        f7403k = new jc(i11);
        f7402j = new jc(i20);
        i = new jc(i21);
        f7401h = new jc(i22);
        f7400g = new jc(i10);
        f7399f = new jc(i23);
        e = new jc(i24);
        f7398d = new jc(i25);
        f7397c = new jc(1);
        f7396b = new jc(0);
    }

    public /* synthetic */ jc(int i10) {
        this.f7415a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        dc dcVar;
        long j10 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f7415a) {
                                            case 0:
                                                dd ddVar = (dd) obj;
                                                ad adVar = ddVar.f5402a;
                                                long m4 = adVar.e().m();
                                                if (adVar.e().m() != 0) {
                                                    ddVar.f5404c.a(m4);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    ad adVar2 = ((dd) obj).f5402a;
                                                    long m10 = adVar2.e().m();
                                                    id e8 = adVar2.e();
                                                    id e10 = adVar2.e();
                                                    List o10 = e10.o();
                                                    if (m10 < 0) {
                                                        m10 += ((ArrayList) o10).size() + 1;
                                                    }
                                                    if (m10 >= 0) {
                                                        ArrayList arrayList = (ArrayList) o10;
                                                        if (m10 < arrayList.size() + 1) {
                                                            arrayList.add((int) m10, e8);
                                                            adVar2.d(e10);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new Exception();
                                                } catch (gd unused) {
                                                    dcVar = dc.f5390d0;
                                                    break;
                                                }
                                            case 2:
                                                dd ddVar2 = (dd) obj;
                                                ad adVar3 = ddVar2.f5402a;
                                                long m11 = adVar3.e().m();
                                                if (adVar3.e().m() == 0) {
                                                    ddVar2.f5404c.a(m11);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((dd) obj).f5402a.d(b(((ArrayList) r12.e().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((dd) obj).f5402a.d(b(r12.e().n().f9089a.length));
                                                return Optional.empty();
                                            case 5:
                                                ad adVar4 = ((dd) obj).f5402a;
                                                adVar4.d(id.c(Math.log(adVar4.e().q())));
                                                return Optional.empty();
                                            case 6:
                                                ad adVar5 = ((dd) obj).f5402a;
                                                long m12 = adVar5.e().m();
                                                long m13 = adVar5.e().m();
                                                if (m12 == 0 || m13 == 0) {
                                                    j10 = 0;
                                                }
                                                adVar5.d(b(j10));
                                                return Optional.empty();
                                            case 7:
                                                ad adVar6 = ((dd) obj).f5402a;
                                                if (adVar6.e().m() != 0) {
                                                    j10 = 0;
                                                }
                                                adVar6.d(b(j10));
                                                return Optional.empty();
                                            case 8:
                                                ad adVar7 = ((dd) obj).f5402a;
                                                long m14 = adVar7.e().m();
                                                long m15 = adVar7.e().m();
                                                if (m14 == 0 && m15 == 0) {
                                                    j10 = 0;
                                                }
                                                adVar7.d(b(j10));
                                                return Optional.empty();
                                            case 9:
                                                dd ddVar3 = (dd) obj;
                                                ad adVar8 = ddVar3.f5402a;
                                                try {
                                                    int compare = new ed(false).compare(adVar8.e(), adVar8.e());
                                                    ad adVar9 = ddVar3.f5402a;
                                                    if (compare >= 0) {
                                                        j10 = 0;
                                                    }
                                                    adVar9.d(b(j10));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(dc.f5396y);
                                                }
                                            case 10:
                                                dd ddVar4 = (dd) obj;
                                                try {
                                                    ad adVar10 = ddVar4.f5402a;
                                                    long m16 = adVar10.e().m();
                                                    ad adVar11 = new ad(0);
                                                    for (int i10 = 0; i10 < adVar10.f4459b; i10++) {
                                                        try {
                                                            adVar11.d(id.j((id) adVar10.f4458a.get(i10)));
                                                        } catch (zc e11) {
                                                            throw new AssertionError(a("CEiv6BFfPnitUE+D"), e11);
                                                        }
                                                    }
                                                    tc tcVar = ddVar4.f5404c;
                                                    oc ocVar = (oc) tcVar.f11315v;
                                                    int i11 = tcVar.f11314u;
                                                    hc mo211c = ((hc) tcVar.f11316w).mo211c();
                                                    s6 s6Var = (s6) tcVar.f11317x;
                                                    tc tcVar2 = new tc(ocVar, i11, mo211c);
                                                    tcVar2.f11317x = s6Var;
                                                    new jk0(7);
                                                    tcVar2.a(m16);
                                                    adVar10.d(a(new s6(23)));
                                                    return Optional.empty();
                                                } catch (rc | sc unused3) {
                                                    dcVar = dc.O;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    ad adVar12 = ((dd) obj).f5402a;
                                                    adVar12.d(a(adVar12.e().i((Class) adVar12.e().l())));
                                                    return Optional.empty();
                                                } catch (fd unused4) {
                                                    dcVar = dc.K;
                                                    break;
                                                }
                                            case 12:
                                                ad adVar13 = ((dd) obj).f5402a;
                                                long m17 = adVar13.e().m();
                                                long m18 = adVar13.e().m();
                                                if (m17 == 0) {
                                                    return Optional.of(dc.f5387a0);
                                                }
                                                adVar13.d(b(m18 % m17));
                                                return Optional.empty();
                                            case 13:
                                                ad adVar14 = ((dd) obj).f5402a;
                                                adVar14.d(id.c(adVar14.e().q() * adVar14.e().q()));
                                                return Optional.empty();
                                            case 14:
                                                ad adVar15 = ((dd) obj).f5402a;
                                                adVar15.d(b(adVar15.e().m() * adVar15.e().m()));
                                                return Optional.empty();
                                            case 15:
                                                ad adVar16 = ((dd) obj).f5402a;
                                                long m19 = adVar16.e().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j11 = 0; j11 < m19; j11++) {
                                                    arrayList2.add(adVar16.e());
                                                }
                                                Collections.reverse(arrayList2);
                                                adVar16.d(id.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                ad adVar17 = ((dd) obj).f5402a;
                                                adVar17.d(id.c(Math.pow(adVar17.e().q(), adVar17.e().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((dd) obj).f5402a.d(a(null));
                                                return Optional.empty();
                                            case 18:
                                                dd ddVar5 = (dd) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(ddVar5.f5404c.h(64L).a());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                ddVar5.f5402a.d(id.c(Double.longBitsToDouble(wrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                dd ddVar6 = (dd) obj;
                                                ddVar6.f5402a.d(b(ddVar6.f5404c.g()));
                                                return Optional.empty();
                                            default:
                                                dd ddVar7 = (dd) obj;
                                                tc tcVar3 = ddVar7.f5404c;
                                                long g8 = tcVar3.g();
                                                if (g8 >= 0 && g8 <= 2147483647L) {
                                                    if ((7 & g8) != 0) {
                                                        return Optional.of(dc.f5397z);
                                                    }
                                                    ddVar7.f5402a.d(id.d(tcVar3.h(g8)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(dc.U);
                                        }
                                    } catch (yc unused5) {
                                        dcVar = dc.S;
                                    }
                                } catch (zc e12) {
                                    e = e12;
                                    throw new AssertionError(a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (rc | sc unused6) {
                                dcVar = dc.D;
                            }
                        } catch (zc unused7) {
                            dcVar = dc.f5393v;
                        }
                    } catch (rc e13) {
                        e = e13;
                        throw new AssertionError(a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (qc unused8) {
                    dcVar = dc.Y;
                }
            } catch (fd unused9) {
                dcVar = dc.T;
            }
        } catch (sc unused10) {
            dcVar = dc.U;
        }
        return Optional.of(dcVar);
    }
}
