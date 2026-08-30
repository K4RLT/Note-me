package a1;
import b.a;
import c.c;
import c.i;
import c.q;
import d.g;
import q.j;

import a0.u;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.widget.Toast;
import androidx.ink.nativeloader.testing.NativePointerTestHelpers;
import b1.g0;
import b1.v;
import b1.y;
import b8.b7;
import b8.ca;
import b8.d9;
import b8.lb;
import b8.m9;
import b8.q6;
import b8.y9;
import b8.z5;
import b8.z9;
import com.daren.scraply.R;
import com.google.android.filament.Engine;
import com.google.android.filament.Scene;
import com.google.android.filament.View;
import com.google.android.gms.internal.ads.gl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import k1.m0;
import n.i0;
import p7.q0;
import pe.z;
import pf.b0;
import pf.l0;
import r0.a1;
import r0.e1;
import r0.j0;
import u7.l2;
import u7.m3;
import u7.v2;
import u7.z0;
import v1.h0;
import v1.w;
import w7.e3;
import w7.f1;
import w7.m7;
import w7.ma;
import w7.y6;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f195u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f196v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f197w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f198x;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.f195u = i;
        this.f196v = obj;
        this.f197w = obj2;
        this.f198x = obj3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int m12;
        Scene scene;
        final int i = 2;
        boolean z3 = false;
        r10 = false;
        boolean z9 = false;
        int i10 = 0;
        int i11 = 0;
        final int i12 = 1;
        switch (this.f195u) {
            case 0:
                l lVar = (l) this.f196v;
                Object obj2 = this.f197w;
                r rVar = (r) this.f198x;
                i0 i0Var = lVar.f212v;
                if (!i0Var.b(obj2)) {
                    lVar.f211u.remove(obj2);
                    i0Var.m(obj2, rVar);
                    return new k(z3 ? 1 : 0, lVar, obj2, rVar);
                }
                g5.j("Key ", obj2, " was used multiple times ");
                return null;
            case 1:
                return NativePointerTestHelpers.a((df.l) this.f196v, (yf.c) this.f197w, (LinkedHashMap) this.f198x, ((Long) obj).longValue());
            case 2:
                Integer num = (Integer) obj;
                ((a1) this.f198x).setValue(new lb((ca) this.f196v, num.intValue(), (j1.c) ((HashMap) this.f197w).get(num)));
                return z.f22715a;
            case 3:
                List list = (List) this.f196v;
                df.l lVar2 = (df.l) this.f197w;
                m3 m3Var = (m3) this.f198x;
                z.e eVar = (z.e) obj;
                eVar.getClass();
                int i13 = 8;
                eVar.o(list.size(), new u(new b7(i13), i13, list), new d9(1, list), new z0.c(-632812321, new m9(list, lVar2, m3Var), true));
                return z.f22715a;
            case 4:
                final List list2 = (List) this.f196v;
                final df.p pVar = (df.p) this.f197w;
                final df.l lVar3 = (df.l) this.f198x;
                z.e eVar2 = (z.e) obj;
                eVar2.getClass();
                int size = list2.size();
                final int i14 = z3 ? 1 : 0;
                z.e.p(eVar2, size, null, new z0.c(-272749884, new df.r() { // from class: b8.y7
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
                    
                        if (kotlin.jvm.internal.a(r8.O(), java.lang.Integer.valueOf(r13)) == false) goto L31;
                     */
                    @Override // df.r
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object d(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
                        /*
                            Method dump skipped, instructions count: 1286
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: b8.y7.d(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, true), 6);
                return z.f22715a;
            case 5:
                df.l lVar4 = (df.l) this.f196v;
                df.a aVar = (df.a) this.f197w;
                Context context = (Context) this.f198x;
                e7.j jVar = (e7.j) obj;
                z5 z5Var = z5.f3075a;
                z5.f(false);
                if (lVar4 != null) {
                    if (jVar == e7.j.EARNED) {
                        z3 = true;
                    }
                    lVar4.invoke(Boolean.valueOf(z3));
                }
                int i15 = y9.f3048a[jVar.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            String string = context.getString(R.string.universe_ad_not_finished);
                            string.getClass();
                            z9.q(context, string);
                        } else {
                            l4.a.o();
                            return null;
                        }
                    } else {
                        aVar.invoke();
                    }
                } else {
                    aVar.invoke();
                }
                return z.f22715a;
            case 6:
                Activity activity = (Activity) this.f196v;
                f1 f1Var = (f1) this.f197w;
                String str = (String) this.f198x;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e7.q qVar = e7.q.f15992z;
                if (booleanValue) {
                    i11 = qVar.f1338u;
                }
                qVar.f(activity, i11);
                f1Var.invoke(new e7.p(activity, str, i12));
                return z.f22715a;
            case 7:
                g0 g0Var = (g0) this.f196v;
                Activity activity2 = (Activity) this.f197w;
                df.a aVar2 = (df.a) this.f198x;
                if (((Boolean) obj).booleanValue()) {
                    i10 = g0Var.f1338u;
                }
                g0Var.f(activity2, i10);
                aVar2.invoke();
                return z.f22715a;
            case 8:
                h8.f fVar = (h8.f) this.f196v;
                Long l10 = (Long) this.f197w;
                df.l lVar5 = (df.l) this.f198x;
                fVar.getClass();
                ((j0) obj).getClass();
                pf.z zVar = fVar.f17923a;
                wf.e eVar3 = l0.f22767a;
                b0.x(zVar, uf.n.f27235a, new a6.f(fVar, l10, lVar5, (te.c) null, 15), 2);
                return new b0.u(9, fVar);
            case 9:
                h8.f fVar2 = (h8.f) this.f196v;
                a1 a1Var = (a1) this.f197w;
                a1 a1Var2 = (a1) this.f198x;
                fVar2.getClass();
                a1Var.getClass();
                a1Var2.getClass();
                ((h8.f) obj).getClass();
                long j10 = ((j1.b) a1Var.getValue()).f18762a;
                fVar2.f17938r = new q6(4, a1Var, a1Var2);
                if (fVar2.c(j10)) {
                    fVar2.a(false);
                }
                r0.f1 f1Var2 = fVar2.f17936p;
                f1Var2.i(f1Var2.h() + 1);
                return z.f22715a;
            case 10:
                String str2 = (String) this.f196v;
                a1 a1Var3 = (a1) this.f197w;
                a1 a1Var4 = (a1) this.f198x;
                Boolean bool = (Boolean) obj;
                boolean booleanValue2 = bool.booleanValue();
                a1Var3.setValue(bool);
                if (booleanValue2) {
                    str2 = "";
                }
                a1Var4.setValue(str2);
                return z.f22715a;
            case 11:
                String str3 = (String) this.f196v;
                v7.d dVar = (v7.d) this.f197w;
                Typeface typeface = (Typeface) this.f198x;
                m1.d dVar2 = (m1.d) obj;
                dVar2.getClass();
                z0.b(k1.a(dVar2.p0().j()), Float.intBitsToFloat((int) (dVar2.e() >> 32)), Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)), str3, dVar.f27411g, typeface);
                return z.f22715a;
            case 12:
                final List list3 = (List) this.f196v;
                final Context context2 = (Context) this.f197w;
                final a1 a1Var5 = (a1) this.f198x;
                z.e eVar4 = (z.e) obj;
                eVar4.getClass();
                z.e.p(eVar4, list3.size(), null, new z0.c(-815246752, new df.r() { // from class: b8.y7
                    @Override // df.r
                    public final Object d(Object obj3, Object obj4, Object obj5, Object obj6) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            */
                        /*
                            Method dump skipped, instructions count: 1286
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: b8.y7.d(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, true), 6);
                return z.f22715a;
            case 13:
                m3 m3Var2 = (m3) this.f196v;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f197w;
                w wVar = (w) this.f198x;
                j1.b bVar = (j1.b) obj;
                v2 v2Var = m3Var2.f26550x;
                h0 h0Var = (h0) wVar;
                if (Math.abs(Float.intBitsToFloat((int) (bVar.f18762a >> 32)) - (v2Var.f26946a * ((int) (h0Var.S >> 32)))) <= (v2Var.f26948c * ((int) (h0Var.S >> 32))) / 2.0f && Math.abs(Float.intBitsToFloat((int) (bVar.f18762a & 4294967295L)) - (v2Var.f26947b * ((int) (h0Var.S & 4294967295L)))) <= (v2Var.f26949d * ((int) (4294967295L & h0Var.S))) / 2.0f) {
                    z9 = true;
                }
                uVar.f19783u = z9;
                return z.f22715a;
            case 14:
                m3 m3Var3 = (m3) this.f196v;
                o7.b bVar2 = (o7.b) this.f197w;
                a1 a1Var6 = (a1) this.f198x;
                String str4 = (String) obj;
                str4.getClass();
                String str5 = bVar2.f21848a;
                str5.getClass();
                Iterator it = m3Var3.f26547u.iterator();
                int i16 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!kotlin.jvm.internal.a(((o7.b) it.next()).f21848a, str5)) {
                            i16++;
                        }
                    } else {
                        i16 = -1;
                    }
                }
                if (i16 >= 0) {
                    o7.b bVar3 = (o7.b) m3Var3.f26547u.get(i16);
                    if (!kotlin.jvm.internal.a(bVar3.f21849b, str4) && (m12 = m3.m1(m3Var3, o7.a(bVar3, str4, 0, 125))) >= 0) {
                        m3Var3.f26541o.f(m3Var3.O(m12));
                    }
                }
                a1Var6.setValue(Boolean.FALSE);
                return z.f22715a;
            case 15:
                Context context3 = (Context) this.f196v;
                l2 l2Var = (l2) this.f197w;
                a1 a1Var7 = (a1) this.f198x;
                z7.f fVar3 = (z7.f) obj;
                fVar3.getClass();
                a1Var7.setValue(fVar3);
                context3.getClass();
                context3.getSharedPreferences("scraply_settings", 0).edit().putString("graphics_quality", fVar3.name()).apply();
                String lowerCase = fVar3.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                f7.i("quality_changed", f7.c(new pe.j("to", lowerCase)));
                f7.q("quality_set", lowerCase);
                z7.n g8 = z7.d.g(context3, fVar3);
                l2Var.getClass();
                View view = l2Var.f26438d;
                if (view != null) {
                    l2.b(view, g8);
                }
                Engine engine = l2Var.f26432a;
                if (engine != null && (scene = l2Var.f26436c) != null) {
                    Integer num2 = l2Var.f26448j;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        scene.c(intValue);
                        engine.n(intValue);
                        com.google.android.filament.b.f4241a.b(intValue);
                    }
                    l2Var.f(engine, scene, g8);
                    l2Var.a(engine, scene, g8);
                }
                return z.f22715a;
            case 16:
                Context context4 = (Context) this.f196v;
                List list4 = (List) this.f197w;
                y yVar = (y) this.f198x;
                if (!((Boolean) obj).booleanValue()) {
                    Toast.makeText(context4, context4.getString(R.string.gallery_stack_delete_blocked), 0).show();
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        yVar.remove((String) it2.next());
                    }
                }
                return z.f22715a;
            case 17:
                e1 e1Var = (e1) this.f196v;
                e1 e1Var2 = (e1) this.f197w;
                e1 e1Var3 = (e1) this.f198x;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.h(e1Var.h());
                m0Var.i(e1Var.h());
                m0Var.n(e1Var2.h());
                m0Var.r(e1Var3.h());
                return z.f22715a;
            case 18:
                v vVar = (v) this.f196v;
                v vVar2 = (v) this.f197w;
                a1 a1Var8 = (a1) this.f198x;
                vVar.clear();
                vVar2.clear();
                a1Var8.setValue(y6.DRAWING);
                vVar.add((j1.b) obj);
                return z.f22715a;
            case 19:
                String str6 = (String) this.f196v;
                Typeface typeface2 = (Typeface) this.f197w;
                u7.d dVar3 = (u7.d) this.f198x;
                m1.d dVar4 = (m1.d) obj;
                dVar4.getClass();
                k1.p j11 = dVar4.p0().j();
                Paint paint = new Paint(1);
                paint.setTypeface(typeface2);
                paint.setColor(dVar3.f26036d);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(Float.intBitsToFloat((int) (dVar4.e() & 4294967295L)) * 0.55f);
                float measureText = paint.measureText(str6);
                if (measureText > Float.intBitsToFloat((int) (dVar4.e() >> 32)) * 0.88f && measureText > 0.0f) {
                    paint.setTextSize(((Float.intBitsToFloat((int) (dVar4.e() >> 32)) * 0.88f) / measureText) * paint.getTextSize());
                }
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                k1.a(j11).drawText(str6, Float.intBitsToFloat((int) (dVar4.e() >> 32)) / 2.0f, (Float.intBitsToFloat((int) (4294967295L & dVar4.e())) / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
                return z.f22715a;
            case 20:
                String str7 = (String) this.f196v;
                a1 a1Var9 = (a1) this.f197w;
                e1 e1Var4 = (e1) this.f198x;
                float f10 = m7.f28734c;
                a1Var9.setValue(str7);
                e1Var4.i(0.0f);
                return z.f22715a;
            case gl.zzm /* 21 */:
                String str8 = (String) this.f196v;
                String str9 = (String) this.f197w;
                List list5 = (List) this.f198x;
                m1.d dVar5 = (m1.d) obj;
                dVar5.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar5.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L));
                ArrayList arrayList = new ArrayList(24);
                for (int i17 = 0; i17 < 24; i17++) {
                    arrayList.add(new PointF(g3.a.y(i17 / 23.0f, 0.76f, 0.12f, intBitsToFloat), g3.a.y((float) Math.sin(r5 * 6.0f), 0.26f, 0.5f, intBitsToFloat2)));
                }
                k1.p j12 = dVar5.p0().j();
                List list6 = q0.f22559a;
                q0.e(k1.a(j12), arrayList, str8, str9, intBitsToFloat2 * 0.2f, list5, 0.0f);
                return z.f22715a;
            case 22:
                final e3 e3Var = (e3) this.f196v;
                final Context context5 = (Context) this.f197w;
                final a1 a1Var10 = (a1) this.f198x;
                z.e eVar5 = (z.e) obj;
                eVar5.getClass();
                z.e.p(eVar5, q0.f22559a.size(), null, new z0.c(276585410, new df.r() { // from class: b8.y7
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        */
                    @Override // df.r
                    public final java.lang.Object d(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
                        /*
                            Method dump skipped, instructions count: 1286
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: b8.y7.d(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, true), 6);
                return z.f22715a;
            default:
                df.l lVar6 = (df.l) this.f196v;
                a1 a1Var11 = (a1) this.f197w;
                a1 a1Var12 = (a1) this.f198x;
                ma maVar = (ma) obj;
                maVar.getClass();
                a1Var11.setValue(Boolean.FALSE);
                a1Var12.setValue(null);
                lVar6.invoke(maVar);
                return z.f22715a;
        }
    }
}
