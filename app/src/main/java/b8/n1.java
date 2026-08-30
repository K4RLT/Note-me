package b8;
import c2.c;
import c2.n;
import c2.o;
import c2.p;
import eb.w;
import k1.c0;
import k1.h;
import k1.i;
import k1.k;
import k1.l0;
import k1.r;
import l7.b;
import m.g;
import m1.d;

import android.graphics.DashPathEffect;
import com.daren.scraply.R;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.gl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2434u;

    public /* synthetic */ n1(int i) {
        this.f2434u = i;
    }

    private final Object e(Object obj) {
        float f10;
        long j10;
        float f11;
        d dVar = (d) obj;
        dVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32)) / 2.0f;
        float l0 = dVar.l0(r4.f2641h) + dVar.l0(r4.f2637c);
        float l02 = dVar.l0(r4.f2642j);
        float f12 = (float) 0.6d;
        d.n0(dVar, l0.c(805306368), (Float.floatToRawIntBits(dVar.l0(f12) + intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(dVar.l0(f12) + intBitsToFloat) << 32) | (Float.floatToRawIntBits(l02 + l0) & 4294967295L), dVar.l0((float) 1.8d), 1, null, 480);
        float l03 = dVar.l0((float) 0.7d);
        long j11 = r4.f2649q;
        r rVar = new r(j11);
        long j12 = r4.f2650r;
        r rVar2 = new r(j12);
        long j13 = r4.f2651s;
        c0 k3 = w.k(qe.h(rVar, rVar2, new r(j13)), 0.0f, l0, 8);
        long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat - l03) << 32);
        float f13 = (float) 0.3d;
        float l04 = intBitsToFloat - dVar.l0(f13);
        float f14 = (float) 0.2d;
        float l05 = dVar.l0(f14) + l0;
        float f15 = (float) 1.05d;
        long j14 = j12;
        d.s0(dVar, k3, floatToRawIntBits, (Float.floatToRawIntBits(l04) << 32) | (Float.floatToRawIntBits(l05) & 4294967295L), dVar.l0(f15), 0.0f, 480);
        float l06 = dVar.l0(f13) + intBitsToFloat;
        float l07 = dVar.l0(f14) + l0;
        d.s0(dVar, w.k(qe.h(new r(j14), new r(j13), new r(j14)), 0.0f, l0, 8), (Float.floatToRawIntBits(intBitsToFloat + l03) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(l06) << 32) | (Float.floatToRawIntBits(l07) & 4294967295L), dVar.l0(f15), 0.0f, 480);
        float l08 = dVar.l0((float) 2.6d);
        float l09 = dVar.l0(1) + 0.0f;
        boolean z3 = false;
        while (l09 < l0 - dVar.l0((float) 1.5d)) {
            if (z3) {
                f10 = dVar.l0((float) 0.55d);
            } else {
                f10 = -dVar.l0((float) 0.55d);
            }
            if (z3) {
                j10 = r4.f2649q;
                f11 = 0.75f;
            } else {
                j10 = r4.f2651s;
                f11 = 0.65f;
            }
            long c10 = r.c(j10, f11);
            float l010 = dVar.l0((float) 1.0d) + l09;
            float f16 = l08;
            d.n0(dVar, c10, (Float.floatToRawIntBits(intBitsToFloat - f10) << 32) | (Float.floatToRawIntBits(l09) & 4294967295L), (Float.floatToRawIntBits(l010) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat + f10) << 32), dVar.l0(f12), 0, null, 496);
            l09 += f16;
            z3 = !z3;
            l08 = f16;
            l0 = l0;
            j14 = j14;
        }
        long j15 = j14;
        float l011 = dVar.l0((float) 3.6d);
        float l012 = dVar.l0((float) 2.0d);
        float l013 = dVar.l0((float) 0.4d) + l0;
        long c11 = l0.c(889192448);
        float l014 = dVar.l0(f13) + (intBitsToFloat - (l011 / 2.0f));
        float l015 = dVar.l0(f13) + (l013 - (l012 / 2.0f));
        d.d0(dVar, c11, (Float.floatToRawIntBits(l014) << 32) | (Float.floatToRawIntBits(l015) & 4294967295L), (Float.floatToRawIntBits(l012) & 4294967295L) | (Float.floatToRawIntBits(l011) << 32), null, 120);
        d.C(dVar, w.b(qe.h(new r(j13), new r(j11), new r(j15), new r(j13)), 0.0f, 0.0f, 14), (Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(r15) & 4294967295L), (Float.floatToRawIntBits(l011) << 32) | (Float.floatToRawIntBits(l012) & 4294967295L), new h(dVar.l0((float) 1.15d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
        return pe.z.f22715a;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.f2434u;
        int i10 = 9;
        int i11 = 15;
        pe.z zVar = pe.z.f22715a;
        int i12 = 5;
        int i13 = 4;
        int i14 = 2;
        int i15 = 7;
        int i16 = 3;
        switch (i) {
            case 0:
                switch (((Integer) obj).intValue()) {
                    case 0:
                    case 1:
                    case 8:
                    case 9:
                    case 14:
                    case 15:
                        return "vintage";
                    case 2:
                    case 3:
                    case 10:
                    case 11:
                        return "love_letter";
                    case 4:
                    case 5:
                    case 12:
                    case 13:
                        return "hearts_fine";
                    case 6:
                    case 7:
                        return "blush";
                    default:
                        return null;
                }
            case 1:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                v1 v1Var = new v1(q1Var.a(R.string.store_love_title), q1Var.a(R.string.store_common_sub), i15);
                Set set = c2.f1906a;
                String str = "";
                int i17 = 10;
                return qe.h(v1Var, new v1("Cada historia de amor es hermosa, pero la nuestra es mi favorita.", str, 10), new v1(q1Var.a(R.string.store_lbl_date), q1Var.a(R.string.store_prompt_love), 14), new s1(str, 8), new x1("10 razones por las que te amo", 1, 0), new x1("", 6, 0), new s1(q1Var.a(R.string.store_lbl_memories), 16), new s1(str, 4), new v1("Te quiero no por quien eres, sino por quien soy cuando estoy contigo.", str, i17), new o1(18), new v1("Si pudiera elegir un lugar en el mundo, me quedaría a tu lado siempre.", str, i17), new s1(q1Var.a(R.string.store_lbl_photos), i11), new s1(q1Var.a(R.string.store_lbl_vows), 1), new o1(2), new v1("Para siempre", "Eres mi momento favorito de todos los días.", 16), new v1("Gracias por estar aquí", "Guardar tus recuerdos es la forma más dulce de volver a vivirlos.", 16));
            case 2:
                q1 q1Var2 = (q1) obj;
                q1Var2.getClass();
                String a10 = q1Var2.a(R.string.store_year_title);
                String a11 = q1Var2.a(R.string.store_common_sub);
                Set set2 = c2.f1906a;
                v1 v1Var2 = new v1(a10, a11, 8);
                s1 s1Var = new s1(q1Var2.a(R.string.store_quote_year), 3);
                r1 r1Var = new r1(12, q1Var2.a(R.string.store_lbl_goals), false);
                v1 v1Var3 = new v1(q1Var2.a(R.string.store_lbl_date), q1Var2.a(R.string.store_prompt_year), 1);
                ArrayList arrayList = q1Var2.f2571f;
                if (arrayList.size() > 0) {
                    obj2 = arrayList.get(0);
                } else {
                    obj2 = "";
                }
                String str2 = (String) obj2;
                ArrayList arrayList2 = q1Var2.e;
                str2.getClass();
                arrayList2.getClass();
                return qe.h(v1Var2, s1Var, r1Var, v1Var3, new u1(str2, 1, arrayList2), new x1(q1Var2.a(R.string.store_lbl_habits), 10, 1), new a2(q1Var2.a(R.string.store_lbl_before), q1Var2.a(R.string.store_lbl_after), false), new s1(q1Var2.a(R.string.store_lbl_notes), 7));
            case 3:
                q1 q1Var3 = (q1) obj;
                q1Var3.getClass();
                String a12 = q1Var3.a(R.string.store_recipes_title);
                String a13 = q1Var3.a(R.string.store_common_sub);
                Set set3 = c2.f1906a;
                return qe.h(new v1(a12, a13, 8), new r1(12, q1Var3.a(R.string.store_lbl_list), true), new t1(q1Var3.a(R.string.store_lbl_name), 0, q1Var3.a(R.string.store_lbl_ingredients), q1Var3.a(R.string.store_lbl_steps)), new t1(q1Var3.a(R.string.store_lbl_name), 0, q1Var3.a(R.string.store_lbl_ingredients), q1Var3.a(R.string.store_lbl_steps)), new t1(q1Var3.a(R.string.store_lbl_name), 0, q1Var3.a(R.string.store_lbl_ingredients), q1Var3.a(R.string.store_lbl_steps)), new t1(q1Var3.a(R.string.store_lbl_name), 0, q1Var3.a(R.string.store_lbl_ingredients), q1Var3.a(R.string.store_lbl_steps)), new t1(q1Var3.a(R.string.store_lbl_favourites), 3, q1Var3.a(R.string.store_lbl_name), q1Var3.a(R.string.store_lbl_note)), new s1(q1Var3.a(R.string.store_lbl_notes), 7));
            case 4:
                q1 q1Var4 = (q1) obj;
                q1Var4.getClass();
                String a14 = q1Var4.a(R.string.store_home_title);
                String a15 = q1Var4.a(R.string.store_common_sub);
                Set set4 = c2.f1906a;
                int i18 = 7;
                return qe.h(new v1(a14, a15, 8), new r1(12, q1Var4.a(R.string.store_lbl_todo), true), new b2(q1Var4.a(R.string.store_lbl_expenses), 14, q1Var4.a(R.string.store_lbl_concept), q1Var4.a(R.string.store_lbl_amount)), new a2(q1Var4.a(R.string.store_lbl_before), q1Var4.a(R.string.store_lbl_after), true), n(b.CLASSIC_CORNERS), new s1(q1Var4.a(R.string.store_lbl_sketch), i18), new r1(12, q1Var4.a(R.string.store_lbl_list), true), new s1(q1Var4.a(R.string.store_lbl_notes), i18));
            case 5:
                ((q1) obj).getClass();
                ArrayList arrayList3 = new ArrayList(12);
                int i19 = 0;
                for (int i20 = 12; i19 < i20; i20 = 12) {
                    Set set5 = c2.f1906a;
                    arrayList3.add(new o1(4));
                    i19++;
                }
                return arrayList3;
            case 6:
                int i21 = 7;
                int i22 = 12;
                ((q1) obj).getClass();
                ArrayList arrayList4 = new ArrayList(12);
                int i23 = 0;
                while (i23 < i22) {
                    Set set6 = c2.f1906a;
                    arrayList4.add(new o1(i21));
                    i23++;
                    i22 = 12;
                    i21 = 7;
                }
                return arrayList4;
            case 7:
                ((q1) obj).getClass();
                ArrayList arrayList5 = new ArrayList(12);
                for (int i24 = 0; i24 < 12; i24++) {
                    arrayList5.add(new o1(0));
                }
                return arrayList5;
            case 8:
                q1 q1Var5 = (q1) obj;
                q1Var5.getClass();
                String a16 = q1Var5.a(R.string.store_lbl_date);
                String a17 = q1Var5.a(R.string.store_album_title);
                String a18 = q1Var5.a(R.string.store_common_sub);
                Set set7 = c2.f1906a;
                v1 v1Var4 = new v1(a17, a18, 4);
                b bVar = b.SCRAP;
                y1 c10 = c(a16, bVar);
                o1 o1Var = new o1(i11);
                b bVar2 = b.CLASSIC_CORNERS;
                String a19 = q1Var5.a(R.string.store_lbl_photos);
                bVar2.getClass();
                return qe.h(v1Var4, c10, o1Var, new y1(bVar2, a19, 0), new s1(q1Var5.a(R.string.store_lbl_memories), 13), c(a16, b.SCRAP_PREMIUM), new s1(q1Var5.a(R.string.store_quote_album), 11), new u1(bVar, 3, bVar2), new o1(i11), new y1(bVar, a16, 1), new v1(q1Var5.a(R.string.store_lbl_notes), a16, 3), new u1(bVar, 3, bVar2));
            case 9:
                q1 q1Var6 = (q1) obj;
                q1Var6.getClass();
                String a20 = q1Var6.a(R.string.store_travel_title);
                String a21 = q1Var6.a(R.string.store_common_sub);
                Set set8 = c2.f1906a;
                v1 v1Var5 = new v1(a20, a21, 8);
                r1 r1Var2 = new r1(12, q1Var6.a(R.string.store_lbl_packing), true);
                v1 v1Var6 = new v1(q1Var6.a(R.string.store_lbl_date), q1Var6.a(R.string.store_prompt_day), 1);
                b bVar3 = b.SCRAP;
                u1 o10 = o(6, null, qe.h(bVar3, bVar3));
                s1 s1Var2 = new s1(q1Var6.a(R.string.store_lbl_tickets), 20);
                b bVar4 = b.STAMP;
                return qe.h(v1Var5, r1Var2, v1Var6, o10, s1Var2, o(6, null, qe.h(bVar4, bVar4, bVar4)), new s1(q1Var6.a(R.string.store_quote_travel), 3), new s1(q1Var6.a(R.string.store_lbl_notes), i15));
            case 10:
                if (((Integer) obj).intValue() == 11) {
                    return "dots";
                }
                return null;
            case 11:
                q1 q1Var7 = (q1) obj;
                q1Var7.getClass();
                ArrayList arrayList6 = q1Var7.f2570d;
                String a22 = q1Var7.a(R.string.store_lbl_week);
                String a23 = q1Var7.a(R.string.store_lbl_notes);
                String a24 = q1Var7.a(R.string.store_weekly_title);
                String a25 = q1Var7.a(R.string.store_common_sub);
                Set set9 = c2.f1906a;
                List h3 = qe.h(new v1(a24, a25, 13), new v1(q1Var7.a(R.string.store_lbl_goals), q1Var7.a(R.string.store_lbl_todo), i10));
                jf.b bVar5 = new jf.b(1, 4, 1);
                ArrayList arrayList7 = new ArrayList();
                Iterator it = bVar5.iterator();
                while (true) {
                    jf.c cVar = (jf.c) it;
                    if (cVar.f19194w) {
                        String str3 = a23;
                        qe.q.n(arrayList7, qe.h(p(arrayList6, 0, a22, 0, null, 56), p(arrayList6, 4, null, cVar.nextInt(), str3, 36)));
                        a23 = str3;
                        a22 = a22;
                    } else {
                        return qe.l.E(qe.l.E(h3, arrayList7), qe.h(new s1(q1Var7.a(R.string.store_lbl_habits), i10), new s1(a23, 6)));
                    }
                }
            case 12:
                q1 q1Var8 = (q1) obj;
                q1Var8.getClass();
                String a26 = q1Var8.a(R.string.store_baby_title);
                String a27 = q1Var8.a(R.string.store_common_sub);
                Set set10 = c2.f1906a;
                v1 v1Var7 = new v1(a26, a27, 8);
                u1 o11 = o(4, q1Var8.a(R.string.store_lbl_name), qe.g(b.CIRCLE));
                r1 r1Var3 = new r1(10, q1Var8.a(R.string.store_lbl_milestones), false);
                y1 n10 = n(b.ROUNDED);
                v1 v1Var8 = new v1(q1Var8.a(R.string.store_lbl_date), q1Var8.a(R.string.store_prompt_baby), 1);
                b bVar6 = b.ARCH;
                return qe.h(v1Var7, o11, r1Var3, n10, v1Var8, o(6, null, qe.h(bVar6, bVar6)), new x1(q1Var8.a(R.string.store_lbl_habits), 6, 1), new s1(q1Var8.a(R.string.store_lbl_notes), i15));
            case 13:
                q1 q1Var9 = (q1) obj;
                q1Var9.getClass();
                String a28 = q1Var9.a(R.string.store_gratitude_title);
                String a29 = q1Var9.a(R.string.store_common_sub);
                Set set11 = c2.f1906a;
                int i25 = 1;
                return qe.h(new v1(a28, a29, 8), new s1(q1Var9.a(R.string.store_quote_gratitude), i16), new v1(q1Var9.a(R.string.store_lbl_date), q1Var9.a(R.string.store_prompt_gratitude), i25), new v1(q1Var9.a(R.string.store_lbl_date), q1Var9.a(R.string.store_prompt_gratitude), i25), new v1(q1Var9.a(R.string.store_lbl_date), q1Var9.a(R.string.store_prompt_day), i25), new v1(q1Var9.a(R.string.store_lbl_date), q1Var9.a(R.string.store_prompt_day), i25), new x1(q1Var9.a(R.string.store_lbl_habits), 8, 1), new s1(q1Var9.a(R.string.store_lbl_notes), i15));
            case 14:
                if (((Integer) obj).intValue() == 51) {
                    return "dots";
                }
                return null;
            case 15:
                q1 q1Var10 = (q1) obj;
                q1Var10.getClass();
                ArrayList arrayList8 = q1Var10.e;
                String a30 = q1Var10.a(R.string.store_lbl_goals);
                String a31 = q1Var10.a(R.string.store_lbl_notes);
                String a32 = q1Var10.a(R.string.store_lbl_habits);
                String a33 = q1Var10.a(R.string.store_lbl_summary);
                String a34 = q1Var10.a(R.string.store_prompt_month);
                String a35 = q1Var10.a(R.string.store_lbl_memories);
                String a36 = q1Var10.a(R.string.store_monthly_title);
                String a37 = q1Var10.a(R.string.store_common_sub);
                Set set12 = c2.f1906a;
                v1 v1Var9 = new v1(a36, a37, i14);
                String a38 = q1Var10.a(R.string.store_year_title);
                ArrayList arrayList9 = q1Var10.f2571f;
                arrayList9.getClass();
                List h10 = qe.h(v1Var9, new u1(a38, 0, arrayList9));
                jf.d i26 = wa.b9.i(0, 12);
                ArrayList arrayList10 = new ArrayList();
                Iterator it2 = i26.iterator();
                while (true) {
                    jf.c cVar2 = (jf.c) it2;
                    if (cVar2.f19194w) {
                        int nextInt = cVar2.nextInt();
                        if (nextInt >= 0 && nextInt < arrayList9.size()) {
                            obj3 = arrayList9.get(nextInt);
                        } else {
                            obj3 = "";
                        }
                        ArrayList arrayList11 = arrayList8;
                        w1 j10 = c2.j(arrayList11, 0, (String) obj3, 0, a30, a31, 8);
                        w1 j11 = c2.j(arrayList11, 1, null, nextInt + 1, null, null, 52);
                        s1 s1Var3 = new s1(a32, i12);
                        int i27 = i16;
                        int i28 = i13;
                        t1 t1Var = new t1(a33, i28, a34, a35);
                        h4[] h4VarArr = new h4[i28];
                        h4VarArr[0] = j10;
                        h4VarArr[1] = j11;
                        h4VarArr[2] = s1Var3;
                        h4VarArr[i27] = t1Var;
                        qe.q.n(arrayList10, qe.h(h4VarArr));
                        a30 = a30;
                        a31 = a31;
                        arrayList8 = arrayList11;
                        i16 = i27;
                        i12 = 5;
                        i13 = 4;
                    } else {
                        return qe.l.E(qe.l.E(h10, arrayList10), qe.h(new s1(q1Var10.a(R.string.store_lbl_dates), 17), new s1(a31, 14)));
                    }
                }
                break;
            case 16:
                q1 q1Var11 = (q1) obj;
                q1Var11.getClass();
                String a39 = q1Var11.a(R.string.store_wedding_title);
                String a40 = q1Var11.a(R.string.store_common_sub);
                Set set13 = c2.f1906a;
                v1 v1Var10 = new v1(a39, a40, 8);
                r1 r1Var4 = new r1(12, q1Var11.a(R.string.store_lbl_todo), true);
                a2 a2Var = new a2(q1Var11.a(R.string.store_lbl_vows), q1Var11.a(R.string.store_lbl_note), false);
                u1 o12 = o(6, null, qe.g(b.GOLD));
                b2 b2Var = new b2(q1Var11.a(R.string.store_lbl_guests), 14, q1Var11.a(R.string.store_lbl_name), q1Var11.a(R.string.store_lbl_amount));
                b bVar7 = b.SCALLOPED;
                return qe.h(v1Var10, r1Var4, a2Var, o12, b2Var, o(6, null, qe.h(bVar7, bVar7)), new s1(q1Var11.a(R.string.store_quote_love), i16), n(b.ROUNDED));
            case 17:
                q1 q1Var12 = (q1) obj;
                q1Var12.getClass();
                String a41 = q1Var12.a(R.string.store_study_title);
                String a42 = q1Var12.a(R.string.store_common_sub);
                Set set14 = c2.f1906a;
                int i29 = 1;
                return qe.h(new v1(a41, a42, 8), new r1(12, q1Var12.a(R.string.store_lbl_todo), false), new v1(q1Var12.a(R.string.store_lbl_date), q1Var12.a(R.string.store_lbl_key), i29), new v1(q1Var12.a(R.string.store_lbl_date), q1Var12.a(R.string.store_lbl_summary), i29), new v1(q1Var12.a(R.string.store_lbl_date), q1Var12.a(R.string.store_lbl_key), i29), new v1(q1Var12.a(R.string.store_lbl_date), q1Var12.a(R.string.store_lbl_summary), i29), new x1(q1Var12.a(R.string.store_lbl_habits), 8, 1), new s1(q1Var12.a(R.string.store_lbl_notes), i15));
            case 18:
                q1 q1Var13 = (q1) obj;
                q1Var13.getClass();
                String a43 = q1Var13.a(R.string.store_habits_title);
                String a44 = q1Var13.a(R.string.store_common_sub);
                Set set15 = c2.f1906a;
                return qe.h(new v1(a43, a44, 8), new r1(8, q1Var13.a(R.string.store_lbl_goals), false), new x1(q1Var13.a(R.string.store_lbl_habits), 10, 1), new x1(q1Var13.a(R.string.store_lbl_habits), 10, 1), new x1(q1Var13.a(R.string.store_lbl_habits), 10, 1), new x1(q1Var13.a(R.string.store_lbl_habits), 10, 1), new v1(q1Var13.a(R.string.store_lbl_date), q1Var13.a(R.string.store_prompt_month), 1), new s1(q1Var13.a(R.string.store_lbl_notes), i15));
            case 19:
                q1 q1Var14 = (q1) obj;
                q1Var14.getClass();
                String a45 = q1Var14.a(R.string.store_books_title);
                String a46 = q1Var14.a(R.string.store_common_sub);
                Set set16 = c2.f1906a;
                return qe.h(new v1(a45, a46, 8), new r1(12, q1Var14.a(R.string.store_lbl_wishlist), true), new t1(q1Var14.a(R.string.store_lbl_read), 3, q1Var14.a(R.string.store_lbl_title2), q1Var14.a(R.string.store_lbl_note)), new t1(q1Var14.a(R.string.store_lbl_read), 3, q1Var14.a(R.string.store_lbl_title2), q1Var14.a(R.string.store_lbl_note)), new t1(q1Var14.a(R.string.store_lbl_read), 3, q1Var14.a(R.string.store_lbl_title2), q1Var14.a(R.string.store_lbl_note)), new t1(q1Var14.a(R.string.store_lbl_read), 3, q1Var14.a(R.string.store_lbl_title2), q1Var14.a(R.string.store_lbl_note)), new s1(q1Var14.a(R.string.store_quote_read), i16), new s1(q1Var14.a(R.string.store_lbl_notes), i15));
            case 20:
                q1 q1Var15 = (q1) obj;
                q1Var15.getClass();
                String a47 = q1Var15.a(R.string.store_movies_title);
                String a48 = q1Var15.a(R.string.store_common_sub);
                Set set17 = c2.f1906a;
                return qe.h(new v1(a47, a48, 8), new r1(12, q1Var15.a(R.string.store_lbl_wishlist), true), new t1(q1Var15.a(R.string.store_lbl_seen), 3, q1Var15.a(R.string.store_lbl_title2), q1Var15.a(R.string.store_lbl_note)), new t1(q1Var15.a(R.string.store_lbl_seen), 3, q1Var15.a(R.string.store_lbl_title2), q1Var15.a(R.string.store_lbl_note)), new b2(q1Var15.a(R.string.store_lbl_series), 14, q1Var15.a(R.string.store_lbl_title2), q1Var15.a(R.string.store_lbl_note)), new t1(q1Var15.a(R.string.store_lbl_seen), 3, q1Var15.a(R.string.store_lbl_title2), q1Var15.a(R.string.store_lbl_note)), new s1(q1Var15.a(R.string.store_lbl_notes), i15), new s1(q1Var15.a(R.string.store_lbl_notes), i15));
            case gl.zzm /* 21 */:
                d dVar = (d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                float f10 = 0.42f * intBitsToFloat;
                float l0 = dVar.l0(15);
                float f11 = (intBitsToFloat - f10) / 2.0f;
                float f12 = (f10 + intBitsToFloat) / 2.0f;
                float l02 = dVar.l0(a3.e);
                float f13 = intBitsToFloat - l02;
                float l03 = intBitsToFloat2 - dVar.l0(a3.f1826f);
                float l04 = dVar.l0(9);
                float l05 = dVar.l0((float) 6.5d);
                float l06 = dVar.l0((float) 4.5d);
                h a49 = k.a();
                float f14 = l02 + l04;
                a49.h(f14, l0);
                a49.g(f11 - l06, l0);
                float f15 = l0 - l06;
                a49.j(f11, l0, f11, f15);
                a49.g(f11, l05);
                a49.j(f11, 0.0f, f11 + l05, 0.0f);
                a49.g(f12 - l05, 0.0f);
                a49.j(f12, 0.0f, f12, l05);
                a49.g(f12, f15);
                a49.j(f12, l0, l06 + f12, l0);
                float f16 = f13 - l04;
                a49.g(f16, l0);
                float f17 = l0 + l04;
                a49.j(f13, l0, f13, f17);
                float f18 = l03 - l04;
                a49.g(f13, f18);
                a49.j(f13, l03, f16, l03);
                a49.g(f14, l03);
                a49.j(l02, l03, l02, f18);
                a49.g(l02, f17);
                a49.j(l02, l0, f14, l0);
                a49.d();
                long j12 = r.f19513b;
                d.o0(dVar, a49, r.c(j12, 0.26f), null, 60);
                d.o0(dVar, a49, a3.f1823b, null, 60);
                long j13 = a3.f1824c;
                float f19 = (float) 0.7d;
                d.o0(dVar, a49, j13, new h(dVar.l0(f19), 0.0f, 0, 0, null, 30), 52);
                float f20 = intBitsToFloat / 2.0f;
                float l07 = dVar.l0((float) 3.8d);
                float l08 = dVar.l0((float) 4.6d);
                float l09 = (l08 - dVar.l0((float) 2.5d)) + l07;
                float f21 = l07 + l08;
                float l010 = dVar.l0(14) / 2.0f;
                float f22 = f20 - l010;
                float f23 = l010 + f20;
                float l011 = dVar.l0((float) 5.4d) / 2.0f;
                float f24 = f20 - l011;
                float f25 = f20 + l011;
                float l012 = dVar.l0((float) 0.9d);
                float l013 = dVar.l0(f19);
                h a50 = k.a();
                float f26 = f24 + l012;
                a50.h(f26, l07);
                a50.g(f25 - l012, l07);
                float f27 = l07 + l012;
                a50.j(f25, l07, f25, f27);
                float f28 = l09 - l013;
                a50.g(f25, f28);
                a50.j(f25, l09, f25 + l013, l09);
                float f29 = f23 - l012;
                a50.g(f29, l09);
                float f30 = l09 + l012;
                a50.j(f23, l09, f23, f30);
                float f31 = f21 - l012;
                a50.g(f23, f31);
                a50.j(f23, f21, f29, f21);
                float f32 = f22 + l012;
                a50.g(f32, f21);
                a50.j(f22, f21, f22, f31);
                a50.g(f22, f30);
                a50.j(f22, l09, f32, l09);
                a50.g(f24 - l013, l09);
                a50.j(f24, l09, f24, f28);
                a50.g(f24, f27);
                a50.j(f24, l07, f26, l07);
                a50.d();
                d.o0(dVar, a50, kb.f2334a, null, 60);
                d.g0(dVar, a50, w.k(qe.h(new r(r.c(j12, 0.5f)), new r(r.f19520k), new r(r.c(j12, 0.15f))), l07, f21, 8), 0.0f, null, 60);
                d.o0(dVar, a50, r.c(j12, 0.4f), new h(dVar.l0((float) 0.5d), 0.0f, 0, 0, null, 30), 52);
                float l014 = dVar.l0((float) 0.3d) + f21;
                d.n0(dVar, j13, (Float.floatToRawIntBits(f32) << 32) | (Float.floatToRawIntBits(l014) & 4294967295L), (Float.floatToRawIntBits(f29) << 32) | (Float.floatToRawIntBits(dVar.l0(r2) + f21) & 4294967295L), dVar.l0((float) 0.35d), 0, null, 496);
                return zVar;
            case 22:
                fg.h hVar = (fg.h) obj;
                hVar.getClass();
                hVar.f16978c = true;
                return zVar;
            case 23:
                fg.h hVar2 = (fg.h) obj;
                hVar2.getClass();
                hVar2.f16978c = true;
                hVar2.f16979d = true;
                hVar2.f16976a = true;
                return zVar;
            case 24:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 25:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.exists());
            case 26:
                d dVar2 = (d) obj;
                dVar2.getClass();
                float l015 = dVar2.l0(14);
                float f33 = 2;
                float f34 = (float) 1.4d;
                d.n0(dVar2, l0.c(1442840575), (Float.floatToRawIntBits(dVar2.l0(f33)) << 32) | (Float.floatToRawIntBits(l015) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.e() >> 32)) - dVar2.l0(f33)) << 32) | (Float.floatToRawIntBits(l015) & 4294967295L), dVar2.l0((float) 0.7d), 0, new i(new DashPathEffect(new float[]{dVar2.l0(f34), dVar2.l0(f34)}, 0.0f)), 464);
                return zVar;
            case 27:
                d dVar3 = (d) obj;
                dVar3.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar3.e() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L));
                float f35 = intBitsToFloat3 / 2.0f;
                float f36 = 0.4f * intBitsToFloat4;
                float f37 = intBitsToFloat3 * 0.17f;
                long j14 = r4.B;
                float f38 = intBitsToFloat4 * 0.98f;
                d.n0(dVar3, j14, (Float.floatToRawIntBits(f35) << 32) | (Float.floatToRawIntBits(f36) & 4294967295L), (Float.floatToRawIntBits(0.28f * intBitsToFloat3) << 32) | (Float.floatToRawIntBits(f38) & 4294967295L), f37, 0, null, 480);
                long j15 = r4.A;
                d.n0(dVar3, j15, (Float.floatToRawIntBits(f36) & 4294967295L) | (Float.floatToRawIntBits(f35) << 32), (Float.floatToRawIntBits(0.72f * intBitsToFloat3) << 32) | (Float.floatToRawIntBits(f38) & 4294967295L), f37, 0, null, 480);
                float f39 = intBitsToFloat3 * 0.48f;
                float f40 = intBitsToFloat4 * 0.5f;
                float f41 = f36 - (0.62f * f40);
                c a51 = wa.s8.a((Float.floatToRawIntBits(0.02f * intBitsToFloat3) << 32) | (Float.floatToRawIntBits(f41) & 4294967295L), (Float.floatToRawIntBits(f40) & 4294967295L) | (Float.floatToRawIntBits(f39) << 32));
                c a52 = wa.s8.a((Float.floatToRawIntBits((intBitsToFloat3 * 0.98f) - f39) << 32) | (Float.floatToRawIntBits(f41) & 4294967295L), (Float.floatToRawIntBits(f40) & 4294967295L) | (Float.floatToRawIntBits(f39) << 32));
                long j16 = r4.f2658z;
                c0 k3 = w.k(qe.h(new r(j16), new r(j15), new r(j14)), f41, f41 + f40, 8);
                d.C(dVar3, k3, a51.d(), a51.c(), null, 120);
                d.C(dVar3, k3, a52.d(), a52.c(), null, 120);
                float f42 = 0.09f * intBitsToFloat3;
                long j17 = r4.f2656x;
                float f43 = f42 * 1.3f;
                long floatToRawIntBits = (Float.floatToRawIntBits(a51.f18763a + f43) << 32) | (Float.floatToRawIntBits(a51.f18764b + f42) & 4294967295L);
                float f44 = f39 - (2.6f * f42);
                float f45 = f40 - (f42 * 2.0f);
                d.d0(dVar3, j17, floatToRawIntBits, (Float.floatToRawIntBits(f44) << 32) | (Float.floatToRawIntBits(f45) & 4294967295L), null, 120);
                d.d0(dVar3, j17, (Float.floatToRawIntBits(a52.f18763a + f43) << 32) | (Float.floatToRawIntBits(a52.f18764b + f42) & 4294967295L), (Float.floatToRawIntBits(f45) & 4294967295L) | (Float.floatToRawIntBits(f44) << 32), null, 120);
                d.D(dVar3, j14, intBitsToFloat3 * 0.13f, (Float.floatToRawIntBits(f35) << 32) | (Float.floatToRawIntBits(f36) & 4294967295L), null, 120);
                d.D(dVar3, r.c(j16, 0.55f), intBitsToFloat3 * 0.06f, (Float.floatToRawIntBits(f35 - (intBitsToFloat3 * 0.03f)) << 32) | (Float.floatToRawIntBits(f36 - (intBitsToFloat3 * 0.04f)) & 4294967295L), null, 120);
                return zVar;
            case 28:
                return e(obj);
            default:
                fg.h hVar3 = (fg.h) obj;
                hVar3.getClass();
                hVar3.f16978c = true;
                return zVar;
        }
    }
}
