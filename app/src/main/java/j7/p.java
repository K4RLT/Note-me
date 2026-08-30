package j7;
import l.a;

import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k1.l0;
import k1.o0;
import k1.r;
import m2.d0;
import m2.g0;
import m2.h0;
import m2.j0;
import m2.n0;
import m2.p0;
import m2.r0;
import m2.s0;
import m2.v;
import m2.x;
import q2.s;
import ya.ae;
import ya.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19033u;

    public /* synthetic */ p(int i) {
        this.f19033u = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        List list;
        y2.o oVar;
        Integer num;
        r rVar;
        j1.b bVar;
        Float f10;
        String str;
        Float f11;
        t2.a aVar;
        m2.e eVar;
        x2.f fVar;
        x2.h hVar;
        m2.i iVar;
        Integer num2;
        Integer num3;
        String str2;
        m2.e eVar2;
        String str3;
        x2.k kVar;
        x2.m mVar;
        y2.o oVar2;
        x2.q qVar;
        x xVar;
        x2.i iVar2;
        x2.e eVar3;
        x2.d dVar;
        r rVar2;
        y2.o oVar3;
        s sVar;
        q2.o oVar4;
        q2.p pVar;
        String str4;
        y2.o oVar5;
        x2.a aVar2;
        x2.p pVar2;
        t2.b bVar2;
        r rVar3;
        x2.l lVar;
        Boolean bool;
        int i = 0;
        h0 h0Var4 = null;
        m2.k kVar2 = null;
        r17 = null;
        o0 o0Var = null;
        r17 = null;
        x2.s sVar2 = null;
        r17 = null;
        n0 n0Var = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        r17 = null;
        m2.l lVar2 = null;
        r17 = null;
        m2.m mVar2 = null;
        r17 = null;
        r0 r0Var = null;
        r17 = null;
        s0 s0Var = null;
        r17 = null;
        h0 h0Var5 = null;
        r17 = null;
        v vVar = null;
        x2.g gVar = null;
        Float f12 = null;
        r17 = null;
        n0 n0Var2 = null;
        y2.p pVar3 = null;
        Float f13 = null;
        Integer num4 = null;
        y2.o oVar6 = null;
        String str8 = null;
        h0Var4 = null;
        switch (this.f19033u) {
            case 0:
                p5.a aVar3 = (p5.a) obj;
                aVar3.getClass();
                p5.c T = aVar3.T("SELECT * FROM stacks ORDER BY orderIndex ASC");
                try {
                    int b10 = e0.b(T, FacebookMediationAdapter.KEY_ID);
                    int b11 = e0.b(T, "title");
                    int b12 = e0.b(T, "orderIndex");
                    int b13 = e0.b(T, "createdAt");
                    int b14 = e0.b(T, "updatedAt");
                    ArrayList arrayList = new ArrayList();
                    while (T.P()) {
                        arrayList.add(new k7.i((int) T.getLong(b12), T.getLong(b13), T.getLong(b14), T.D(b10), T.D(b11)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                p5.a aVar4 = (p5.a) obj;
                aVar4.getClass();
                p5.c T2 = aVar4.T("SELECT COUNT(*) FROM stacks");
                try {
                    if (T2.P()) {
                        i = (int) T2.getLong(0);
                    }
                    T2.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 2:
                p5.a aVar5 = (p5.a) obj;
                aVar5.getClass();
                p5.c T3 = aVar5.T("SELECT * FROM stacks ORDER BY orderIndex ASC");
                try {
                    int b15 = e0.b(T3, FacebookMediationAdapter.KEY_ID);
                    int b16 = e0.b(T3, "title");
                    int b17 = e0.b(T3, "orderIndex");
                    int b18 = e0.b(T3, "createdAt");
                    int b19 = e0.b(T3, "updatedAt");
                    ArrayList arrayList2 = new ArrayList();
                    while (T3.P()) {
                        arrayList2.add(new k7.i((int) T3.getLong(b17), T3.getLong(b18), T3.getLong(b19), T3.D(b15), T3.D(b16)));
                    }
                    return arrayList2;
                } finally {
                }
            case 3:
                p5.a aVar6 = (p5.a) obj;
                aVar6.getClass();
                p5.c T4 = aVar6.T("SELECT COALESCE(MAX(orderIndex), -1) + 1 FROM stacks");
                try {
                    if (T4.P()) {
                        i = (int) T4.getLong(0);
                    }
                    T4.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 4:
                obj.getClass();
                return Integer.valueOf(gf.d.f17755v.d(2147418112) + 65536);
            case 5:
                return Boolean.valueOf(!(((m2.b) obj) instanceof v));
            case 6:
                m2.s sVar3 = (m2.s) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(sVar3.f20562b);
                sb2.append(", ");
                return a5.a.i(sb2, sVar3.f20563c, ')');
            case 7:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                df.l lVar3 = (df.l) m2.e0.f20461h.f12503w;
                Boolean bool2 = Boolean.FALSE;
                if (kotlin.jvm.internal.a(obj2, bool2) || obj2 == null) {
                    h0Var = null;
                } else {
                    h0Var = (h0) lVar3.invoke(obj2);
                }
                Object obj3 = list2.get(1);
                if (kotlin.jvm.internal.a(obj3, bool2) || obj3 == null) {
                    h0Var2 = null;
                } else {
                    h0Var2 = (h0) lVar3.invoke(obj3);
                }
                Object obj4 = list2.get(2);
                if (kotlin.jvm.internal.a(obj4, bool2) || obj4 == null) {
                    h0Var3 = null;
                } else {
                    h0Var3 = (h0) lVar3.invoke(obj4);
                }
                Object obj5 = list2.get(3);
                if (!kotlin.jvm.internal.a(obj5, bool2) && obj5 != null) {
                    h0Var4 = (h0) lVar3.invoke(obj5);
                }
                return new n0(h0Var, h0Var2, h0Var3, h0Var4);
            case 8:
                obj.getClass();
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                x90 x90Var = m2.e0.f20455a;
                if (kotlin.jvm.internal.a(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((df.l) x90Var.f12503w).invoke(obj6);
                }
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str8 = (String) obj7;
                }
                String str9 = str8;
                str9.getClass();
                return new m2.g(list, str9);
            case 9:
                obj.getClass();
                return new x2.l(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list4 = (List) obj;
                return new x2.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 11:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                y2.p[] pVarArr = y2.o.f30818b;
                df.l lVar4 = m2.e0.f20469q.f20450v;
                Boolean bool3 = Boolean.FALSE;
                kotlin.jvm.internal.a(obj8, bool3);
                if (obj8 != null) {
                    oVar = (y2.o) lVar4.invoke(obj8);
                } else {
                    oVar = null;
                }
                oVar.getClass();
                long j10 = oVar.f30820a;
                Object obj9 = list5.get(1);
                kotlin.jvm.internal.a(obj9, bool3);
                if (obj9 != null) {
                    oVar6 = (y2.o) lVar4.invoke(obj9);
                }
                y2.o oVar7 = oVar6;
                oVar7.getClass();
                return new x2.q(j10, oVar7.f30820a);
            case 12:
                obj.getClass();
                return new s(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new x2.a(((Float) obj).floatValue());
            case 14:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                if (obj10 != null) {
                    num = (Integer) obj10;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                if (obj11 != null) {
                    num4 = (Integer) obj11;
                }
                num4.getClass();
                return new p0(g0.b(intValue, num4.intValue()));
            case 15:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i10 = r.f19522m;
                Boolean bool4 = Boolean.FALSE;
                kotlin.jvm.internal.a(obj12, bool4);
                if (obj12 != null) {
                    if (kotlin.jvm.internal.a(obj12, Boolean.FALSE)) {
                        rVar = new r(r.f19521l);
                    } else {
                        rVar = new r(l0.c(((Integer) obj12).intValue()));
                    }
                } else {
                    rVar = null;
                }
                rVar.getClass();
                long j11 = rVar.f19523a;
                Object obj13 = list7.get(1);
                d0 d0Var = m2.e0.f20470r;
                kotlin.jvm.internal.a(obj13, bool4);
                if (obj13 != null) {
                    bVar = (j1.b) d0Var.f20450v.invoke(obj13);
                } else {
                    bVar = null;
                }
                bVar.getClass();
                long j12 = bVar.f18762a;
                Object obj14 = list7.get(2);
                if (obj14 != null) {
                    f13 = (Float) obj14;
                }
                f13.getClass();
                return new o0(j11, j12, f13.floatValue());
            case 16:
                if (kotlin.jvm.internal.a(obj, Boolean.FALSE)) {
                    return new y2.o(y2.o.f30819c);
                }
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                if (obj15 != null) {
                    f10 = (Float) obj15;
                } else {
                    f10 = null;
                }
                f10.getClass();
                float floatValue = f10.floatValue();
                Object obj16 = list8.get(1);
                if (obj16 != null) {
                    pVar3 = (y2.p) obj16;
                }
                y2.p pVar4 = pVar3;
                pVar4.getClass();
                return new y2.o(ae.f(pVar4.f30821a, floatValue));
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                if (obj17 != null) {
                    str = (String) obj17;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj18 = list9.get(1);
                x90 x90Var2 = m2.e0.i;
                if (!kotlin.jvm.internal.a(obj18, Boolean.FALSE) && obj18 != null) {
                    n0Var2 = (n0) ((df.l) x90Var2.f12503w).invoke(obj18);
                }
                return new m2.m(str, n0Var2);
            case 18:
                if (kotlin.jvm.internal.a(obj, Boolean.FALSE)) {
                    return new j1.b(9205357640488583168L);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                if (obj19 != null) {
                    f11 = (Float) obj19;
                } else {
                    f11 = null;
                }
                f11.getClass();
                float floatValue2 = f11.floatValue();
                Object obj20 = list10.get(1);
                if (obj20 != null) {
                    f12 = (Float) obj20;
                }
                f12.getClass();
                float floatValue3 = f12.floatValue();
                return new j1.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(floatValue3) & 4294967295L));
            case 19:
                obj.getClass();
                List list11 = (List) obj;
                ArrayList arrayList3 = new ArrayList(list11.size());
                int size = list11.size();
                while (i < size) {
                    Object obj21 = list11.get(i);
                    x90 x90Var3 = m2.e0.f20472t;
                    if (kotlin.jvm.internal.a(obj21, Boolean.FALSE) || obj21 == null) {
                        aVar = null;
                    } else {
                        aVar = (t2.a) ((df.l) x90Var3.f12503w).invoke(obj21);
                    }
                    aVar.getClass();
                    arrayList3.add(aVar);
                    i++;
                }
                return new t2.b(arrayList3);
            case 20:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList4 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    x90 x90Var4 = m2.e0.f20456b;
                    if (kotlin.jvm.internal.a(obj22, Boolean.FALSE) || obj22 == null) {
                        eVar = null;
                    } else {
                        eVar = (m2.e) ((df.l) x90Var4.f12503w).invoke(obj22);
                    }
                    eVar.getClass();
                    arrayList4.add(eVar);
                    i++;
                }
                return arrayList4;
            case gl.zzm /* 21 */:
                obj.getClass();
                String str10 = (String) obj;
                t2.c.f25640a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str10);
                if (kotlin.jvm.internal.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str10 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new t2.a(forLanguageTag);
            case 22:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                if (obj23 != null) {
                    fVar = (x2.f) obj23;
                } else {
                    fVar = null;
                }
                fVar.getClass();
                float f14 = fVar.f30052a;
                Object obj24 = list13.get(1);
                if (obj24 != null) {
                    hVar = (x2.h) obj24;
                } else {
                    hVar = null;
                }
                hVar.getClass();
                int i11 = hVar.f30053a;
                Object obj25 = list13.get(2);
                if (obj25 != null) {
                    gVar = (x2.g) obj25;
                }
                gVar.getClass();
                return new x2.i(i11, f14);
            case 23:
                obj.getClass();
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                if (obj26 != null) {
                    iVar = (m2.i) obj26;
                } else {
                    iVar = null;
                }
                iVar.getClass();
                Object obj27 = list14.get(2);
                if (obj27 != null) {
                    num2 = (Integer) obj27;
                } else {
                    num2 = null;
                }
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj28 = list14.get(3);
                if (obj28 != null) {
                    num3 = (Integer) obj28;
                } else {
                    num3 = null;
                }
                num3.getClass();
                int intValue3 = num3.intValue();
                Object obj29 = list14.get(4);
                if (obj29 != null) {
                    str2 = (String) obj29;
                } else {
                    str2 = null;
                }
                str2.getClass();
                switch (iVar.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        x90 x90Var5 = m2.e0.f20460g;
                        if (!kotlin.jvm.internal.a(obj30, Boolean.FALSE) && obj30 != null) {
                            vVar = (v) ((df.l) x90Var5.f12503w).invoke(obj30);
                        }
                        v vVar2 = vVar;
                        vVar2.getClass();
                        eVar2 = new m2.e(vVar2, intValue2, intValue3, str2);
                        break;
                    case 1:
                        Object obj31 = list14.get(1);
                        x90 x90Var6 = m2.e0.f20461h;
                        if (!kotlin.jvm.internal.a(obj31, Boolean.FALSE) && obj31 != null) {
                            h0Var5 = (h0) ((df.l) x90Var6.f12503w).invoke(obj31);
                        }
                        h0 h0Var6 = h0Var5;
                        h0Var6.getClass();
                        eVar2 = new m2.e(h0Var6, intValue2, intValue3, str2);
                        break;
                    case 2:
                        Object obj32 = list14.get(1);
                        x90 x90Var7 = m2.e0.f20457c;
                        if (!kotlin.jvm.internal.a(obj32, Boolean.FALSE) && obj32 != null) {
                            s0Var = (s0) ((df.l) x90Var7.f12503w).invoke(obj32);
                        }
                        s0 s0Var2 = s0Var;
                        s0Var2.getClass();
                        eVar2 = new m2.e(s0Var2, intValue2, intValue3, str2);
                        break;
                    case 3:
                        Object obj33 = list14.get(1);
                        x90 x90Var8 = m2.e0.f20458d;
                        if (!kotlin.jvm.internal.a(obj33, Boolean.FALSE) && obj33 != null) {
                            r0Var = (r0) ((df.l) x90Var8.f12503w).invoke(obj33);
                        }
                        r0 r0Var2 = r0Var;
                        r0Var2.getClass();
                        eVar2 = new m2.e(r0Var2, intValue2, intValue3, str2);
                        break;
                    case 4:
                        Object obj34 = list14.get(1);
                        x90 x90Var9 = m2.e0.e;
                        if (!kotlin.jvm.internal.a(obj34, Boolean.FALSE) && obj34 != null) {
                            mVar2 = (m2.m) ((df.l) x90Var9.f12503w).invoke(obj34);
                        }
                        m2.m mVar3 = mVar2;
                        mVar3.getClass();
                        eVar2 = new m2.e(mVar3, intValue2, intValue3, str2);
                        break;
                    case 5:
                        Object obj35 = list14.get(1);
                        x90 x90Var10 = m2.e0.f20459f;
                        if (!kotlin.jvm.internal.a(obj35, Boolean.FALSE) && obj35 != null) {
                            lVar2 = (m2.l) ((df.l) x90Var10.f12503w).invoke(obj35);
                        }
                        m2.l lVar5 = lVar2;
                        lVar5.getClass();
                        eVar2 = new m2.e(lVar5, intValue2, intValue3, str2);
                        break;
                    case 6:
                        Object obj36 = list14.get(1);
                        if (obj36 != null) {
                            str7 = (String) obj36;
                        }
                        String str11 = str7;
                        str11.getClass();
                        eVar2 = new m2.e(new j0(str11), intValue2, intValue3, str2);
                        break;
                    default:
                        l4.a.o();
                        return null;
                }
                return eVar2;
            case 24:
                if (obj != null) {
                    str6 = (String) obj;
                }
                String str12 = str6;
                str12.getClass();
                return new s0(str12);
            case 25:
                if (obj != null) {
                    str5 = (String) obj;
                }
                String str13 = str5;
                str13.getClass();
                return new r0(str13);
            case 26:
                obj.getClass();
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                if (obj37 != null) {
                    str3 = (String) obj37;
                } else {
                    str3 = null;
                }
                str3.getClass();
                Object obj38 = list15.get(1);
                x90 x90Var11 = m2.e0.i;
                if (!kotlin.jvm.internal.a(obj38, Boolean.FALSE) && obj38 != null) {
                    n0Var = (n0) ((df.l) x90Var11.f12503w).invoke(obj38);
                }
                return new m2.l(str3, n0Var);
            case 27:
                obj.getClass();
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                if (obj39 != null) {
                    kVar = (x2.k) obj39;
                } else {
                    kVar = null;
                }
                kVar.getClass();
                int i12 = kVar.f30060a;
                Object obj40 = list16.get(1);
                if (obj40 != null) {
                    mVar = (x2.m) obj40;
                } else {
                    mVar = null;
                }
                mVar.getClass();
                int i13 = mVar.f30065a;
                Object obj41 = list16.get(2);
                y2.p[] pVarArr2 = y2.o.f30818b;
                d0 d0Var2 = m2.e0.f20469q;
                Boolean bool5 = Boolean.FALSE;
                kotlin.jvm.internal.a(obj41, bool5);
                if (obj41 != null) {
                    oVar2 = (y2.o) d0Var2.f20450v.invoke(obj41);
                } else {
                    oVar2 = null;
                }
                oVar2.getClass();
                long j13 = oVar2.f30820a;
                Object obj42 = list16.get(3);
                x2.q qVar2 = x2.q.f30070c;
                x90 x90Var12 = m2.e0.f20464l;
                if (kotlin.jvm.internal.a(obj42, bool5) || obj42 == null) {
                    qVar = null;
                } else {
                    qVar = (x2.q) ((df.l) x90Var12.f12503w).invoke(obj42);
                }
                Object obj43 = list16.get(4);
                boolean a10 = kotlin.jvm.internal.a(obj43, bool5);
                x90 x90Var13 = g0.f20480a;
                if (a10 || obj43 == null) {
                    xVar = null;
                } else {
                    xVar = (x) ((df.l) x90Var13.f12503w).invoke(obj43);
                }
                Object obj44 = list16.get(5);
                x2.i iVar3 = x2.i.f30054c;
                x90 x90Var14 = m2.e0.f20473u;
                if (kotlin.jvm.internal.a(obj44, bool5) || obj44 == null) {
                    iVar2 = null;
                } else {
                    iVar2 = (x2.i) ((df.l) x90Var14.f12503w).invoke(obj44);
                }
                Object obj45 = list16.get(6);
                boolean a11 = kotlin.jvm.internal.a(obj45, bool5);
                x90 x90Var15 = g0.f20481b;
                if (a11 || obj45 == null) {
                    eVar3 = null;
                } else {
                    eVar3 = (x2.e) ((df.l) x90Var15.f12503w).invoke(obj45);
                }
                eVar3.getClass();
                int i14 = eVar3.f30048a;
                Object obj46 = list16.get(7);
                if (obj46 != null) {
                    dVar = (x2.d) obj46;
                } else {
                    dVar = null;
                }
                dVar.getClass();
                int i15 = dVar.f30046a;
                Object obj47 = list16.get(8);
                boolean a12 = kotlin.jvm.internal.a(obj47, bool5);
                x90 x90Var16 = g0.f20482c;
                if (!a12 && obj47 != null) {
                    sVar2 = (x2.s) ((df.l) x90Var16.f12503w).invoke(obj47);
                }
                return new v(i12, i13, j13, qVar, xVar, iVar2, i14, i15, sVar2);
            case 28:
                obj.getClass();
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i16 = r.f19522m;
                Boolean bool6 = Boolean.FALSE;
                kotlin.jvm.internal.a(obj48, bool6);
                if (obj48 != null) {
                    if (obj48.equals(bool6)) {
                        rVar2 = new r(r.f19521l);
                    } else {
                        rVar2 = new r(l0.c(((Integer) obj48).intValue()));
                    }
                } else {
                    rVar2 = null;
                }
                rVar2.getClass();
                long j14 = rVar2.f19523a;
                Object obj49 = list17.get(1);
                y2.p[] pVarArr3 = y2.o.f30818b;
                df.l lVar6 = m2.e0.f20469q.f20450v;
                kotlin.jvm.internal.a(obj49, bool6);
                if (obj49 != null) {
                    oVar3 = (y2.o) lVar6.invoke(obj49);
                } else {
                    oVar3 = null;
                }
                oVar3.getClass();
                long j15 = oVar3.f30820a;
                Object obj50 = list17.get(2);
                s sVar4 = s.f23364v;
                x90 x90Var17 = m2.e0.f20465m;
                if (kotlin.jvm.internal.a(obj50, bool6) || obj50 == null) {
                    sVar = null;
                } else {
                    sVar = (s) ((df.l) x90Var17.f12503w).invoke(obj50);
                }
                Object obj51 = list17.get(3);
                if (obj51 != null) {
                    oVar4 = (q2.o) obj51;
                } else {
                    oVar4 = null;
                }
                Object obj52 = list17.get(4);
                if (obj52 != null) {
                    pVar = (q2.p) obj52;
                } else {
                    pVar = null;
                }
                Object obj53 = list17.get(6);
                if (obj53 != null) {
                    str4 = (String) obj53;
                } else {
                    str4 = null;
                }
                Object obj54 = list17.get(7);
                kotlin.jvm.internal.a(obj54, bool6);
                if (obj54 != null) {
                    oVar5 = (y2.o) lVar6.invoke(obj54);
                } else {
                    oVar5 = null;
                }
                oVar5.getClass();
                long j16 = oVar5.f30820a;
                Object obj55 = list17.get(8);
                x90 x90Var18 = m2.e0.f20466n;
                if (kotlin.jvm.internal.a(obj55, bool6) || obj55 == null) {
                    aVar2 = null;
                } else {
                    aVar2 = (x2.a) ((df.l) x90Var18.f12503w).invoke(obj55);
                }
                Object obj56 = list17.get(9);
                x90 x90Var19 = m2.e0.f20463k;
                if (kotlin.jvm.internal.a(obj56, bool6) || obj56 == null) {
                    pVar2 = null;
                } else {
                    pVar2 = (x2.p) ((df.l) x90Var19.f12503w).invoke(obj56);
                }
                Object obj57 = list17.get(10);
                t2.b bVar3 = t2.b.f25637w;
                x90 x90Var20 = m2.e0.f20471s;
                if (kotlin.jvm.internal.a(obj57, bool6) || obj57 == null) {
                    bVar2 = null;
                } else {
                    bVar2 = (t2.b) ((df.l) x90Var20.f12503w).invoke(obj57);
                }
                Object obj58 = list17.get(11);
                kotlin.jvm.internal.a(obj58, bool6);
                if (obj58 != null) {
                    if (obj58.equals(bool6)) {
                        rVar3 = new r(r.f19521l);
                    } else {
                        rVar3 = new r(l0.c(((Integer) obj58).intValue()));
                    }
                } else {
                    rVar3 = null;
                }
                rVar3.getClass();
                long j17 = rVar3.f19523a;
                Object obj59 = list17.get(12);
                x90 x90Var21 = m2.e0.f20462j;
                if (kotlin.jvm.internal.a(obj59, bool6) || obj59 == null) {
                    lVar = null;
                } else {
                    lVar = (x2.l) ((df.l) x90Var21.f12503w).invoke(obj59);
                }
                Object obj60 = list17.get(13);
                o0 o0Var2 = o0.f19508d;
                x90 x90Var22 = m2.e0.f20467o;
                if (!kotlin.jvm.internal.a(obj60, bool6) && obj60 != null) {
                    o0Var = (o0) ((df.l) x90Var22.f12503w).invoke(obj60);
                }
                return new h0(j14, j15, sVar, oVar4, pVar, (q2.i) null, str4, j16, aVar2, pVar2, bVar2, j17, lVar, o0Var, 49184);
            default:
                obj.getClass();
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                if (obj61 != null) {
                    bool = (Boolean) obj61;
                } else {
                    bool = null;
                }
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj62 = list18.get(1);
                if (obj62 != null) {
                    kVar2 = (m2.k) obj62;
                }
                kVar2.getClass();
                return new x(booleanValue);
        }
    }
}
