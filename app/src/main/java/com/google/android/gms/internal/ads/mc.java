package com.google.android.gms.internal.ads;
import id.b;
import nc.a;
import oc.e;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class mc implements bd {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ mc f8304b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ mc f8305c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ mc f8306d;
    public static final /* synthetic */ mc e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mc f8307f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mc f8308g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mc f8309h;
    public static final /* synthetic */ mc i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ mc f8310j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ mc f8311k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ mc f8312l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ mc f8313m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ mc f8314n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mc f8315o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ mc f8316p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ mc f8317q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8318a;

    static {
        int i10 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i11 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i12 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i13 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i14 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i15 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i16 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i17 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i18 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i19 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i20 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i21 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f8317q = new mc((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f8316p = new mc((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f8315o = new mc(i21);
        f8314n = new mc(i12);
        f8313m = new mc(i13);
        f8312l = new mc(i14);
        f8311k = new mc(i11);
        f8310j = new mc(i15);
        i = new mc(i16);
        f8309h = new mc(i17);
        f8308g = new mc(i10);
        f8307f = new mc(i18);
        e = new mc(i19);
        f8306d = new mc(i20);
        f8305c = new mc(1);
        f8304b = new mc(0);
    }

    public /* synthetic */ mc(int i10) {
        this.f8318a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        dc dcVar;
        id idVar;
        int i10 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f8318a) {
                                case 0:
                                    return ((dd) obj).a();
                                case 1:
                                    try {
                                        ad adVar = ((dd) obj).f5402a;
                                        long m4 = adVar.e().m();
                                        id e8 = adVar.e();
                                        List o10 = e8.o();
                                        if (m4 < 0) {
                                            m4 += ((ArrayList) o10).size();
                                        }
                                        if (m4 >= 0) {
                                            ArrayList arrayList = (ArrayList) o10;
                                            if (m4 < arrayList.size()) {
                                                arrayList.remove((int) m4);
                                                adVar.d(e8);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new Exception();
                                    } catch (gd unused) {
                                        dcVar = dc.f5390d0;
                                        break;
                                    }
                                case 2:
                                    dd ddVar = (dd) obj;
                                    ad adVar2 = ddVar.f5402a;
                                    id e10 = adVar2.e();
                                    oc n10 = adVar2.e().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    e10.k(byteArrayOutputStream);
                                    ddVar.f5402a.d(id.d(n10.d(e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    dd ddVar2 = (dd) obj;
                                    ad adVar3 = ddVar2.f5402a;
                                    id e11 = adVar3.e();
                                    oc n11 = adVar3.e().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    s6.u(e11.m(), new hx0(5, byteArrayOutputStream2), false);
                                    ddVar2.f5402a.d(id.d(n11.d(e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    dd ddVar3 = (dd) obj;
                                    tc tcVar = ddVar3.f5404c;
                                    ad adVar4 = ddVar3.f5402a;
                                    adVar4.f4458a.set(adVar4.c(-(ddVar3.f5403b.E().f11883b + tcVar.g())), adVar4.e());
                                    return Optional.empty();
                                case 5:
                                    ad adVar5 = ((dd) obj).f5402a;
                                    adVar5.d(b(adVar5.e().m() << ((int) adVar5.e().m())));
                                    return Optional.empty();
                                case 6:
                                    ad adVar6 = ((dd) obj).f5402a;
                                    adVar6.d(b(adVar6.e().m() >>> ((int) adVar6.e().m())));
                                    return Optional.empty();
                                case 7:
                                    ad adVar7 = ((dd) obj).f5402a;
                                    adVar7.d(id.c(adVar7.e().q() - adVar7.e().q()));
                                    return Optional.empty();
                                case 8:
                                    ad adVar8 = ((dd) obj).f5402a;
                                    adVar8.d(b(adVar8.e().m() - adVar8.e().m()));
                                    return Optional.empty();
                                case 9:
                                    dd ddVar4 = (dd) obj;
                                    ad adVar9 = ddVar4.f5402a;
                                    long m10 = adVar9.e().m();
                                    id e12 = adVar9.e();
                                    ad adVar10 = ddVar4.f5402a;
                                    id f10 = adVar10.f(m10);
                                    adVar10.f4458a.set(adVar10.c(m10), e12);
                                    adVar10.d(f10);
                                    return Optional.empty();
                                case 10:
                                    dd ddVar5 = (dd) obj;
                                    ad adVar11 = ddVar5.f5402a;
                                    long m11 = ddVar5.f5403b.E().f11883b + adVar11.e().m();
                                    id e13 = adVar11.e();
                                    ad adVar12 = ddVar5.f5402a;
                                    long j10 = -m11;
                                    id f11 = adVar12.f(j10);
                                    adVar12.f4458a.set(adVar12.c(j10), e13);
                                    adVar12.d(f11);
                                    return Optional.empty();
                                case 11:
                                    dd ddVar6 = (dd) obj;
                                    tc tcVar2 = ddVar6.f5404c;
                                    ad adVar13 = ddVar6.f5402a;
                                    long g8 = ddVar6.f5403b.E().f11883b + tcVar2.g();
                                    id e14 = adVar13.e();
                                    long j11 = -g8;
                                    id f12 = adVar13.f(j11);
                                    adVar13.f4458a.set(adVar13.c(j11), e14);
                                    adVar13.d(f12);
                                    return Optional.empty();
                                case 12:
                                    dd ddVar7 = (dd) obj;
                                    long m12 = ddVar7.f5402a.e().m();
                                    try {
                                        ad adVar14 = ddVar7.f5402a;
                                        if (m12 == 0) {
                                            idVar = adVar14.e();
                                        } else {
                                            adVar14.f4459b--;
                                            idVar = (id) adVar14.f4458a.remove(adVar14.c(m12));
                                        }
                                        adVar14.d(idVar);
                                        return Optional.empty();
                                    } catch (yc unused2) {
                                        dcVar = dc.B;
                                        break;
                                    }
                                case 13:
                                    dd ddVar8 = (dd) obj;
                                    try {
                                        ad adVar15 = ddVar8.f5402a;
                                        long m13 = adVar15.e().m();
                                        long m14 = adVar15.e().m();
                                        jk0 jk0Var = ddVar8.f5403b;
                                        tc tcVar3 = ddVar8.f5404c;
                                        jk0Var.z(tcVar3.b(), m14, jk0Var.E().f11883b);
                                        tcVar3.a(m13);
                                        return Optional.empty();
                                    } catch (rc | sc unused3) {
                                        dcVar = dc.M;
                                        break;
                                    } catch (wc unused4) {
                                        dcVar = dc.W;
                                        break;
                                    } catch (xc unused5) {
                                        dcVar = dc.R;
                                        break;
                                    }
                                case 14:
                                    dd ddVar9 = (dd) obj;
                                    try {
                                        ddVar9.f5402a.d(id.g(ddVar9.f5402a.e().l()));
                                        return Optional.empty();
                                    } catch (fd unused6) {
                                        dcVar = dc.K;
                                        break;
                                    }
                                default:
                                    try {
                                        ad adVar16 = ((dd) obj).f5402a;
                                        ArrayList arrayList2 = (ArrayList) adVar16.e().o();
                                        int size = arrayList2.size();
                                        while (i10 < size) {
                                            Object obj2 = arrayList2.get(i10);
                                            i10++;
                                            adVar16.d((id) obj2);
                                        }
                                        return Optional.empty();
                                    } catch (zc unused7) {
                                        dcVar = dc.f5393v;
                                        break;
                                    }
                            }
                        } catch (yc unused8) {
                            dcVar = dc.C;
                        }
                    } catch (zc e15) {
                        e = e15;
                        throw new AssertionError(a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (xc | yc unused9) {
                    dcVar = dc.S;
                }
            } catch (fd | qc | sc unused10) {
                dcVar = dc.T;
            }
        } catch (fd unused11) {
            dcVar = dc.F;
        } catch (IOException e16) {
            e = e16;
            throw new AssertionError(a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(dcVar);
    }
}
