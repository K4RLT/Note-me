package c2;
import a0.k0;
import a3.a;
import b0.j;
import b2.i0;
import b2.k1;
import c.a;
import c2.f0;
import j1.b;
import j1.c;
import j1.d;
import j2.a;
import j2.h;
import j2.i;
import j2.j;
import j2.n;
import j2.o;
import j2.q;
import j2.s;
import j2.v;
import j2.x;
import k1.e0;
import k1.f0;
import k1.g0;
import k1.h;
import k1.i0;
import k1.l0;
import k1.p0;
import m.g;
import m2.g;
import m2.m0;
import m2.p0;
import n.f;
import n.i0;
import n.i;
import n.j;
import n.k;
import n.l;
import n.m;
import n.s0;
import n.u;
import n.v;
import n.w;
import n.x;
import n0.a;
import n0.n;
import q.x;
import y2.k;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.List;
import ya.jb;
import ya.vd;

/* loaded from: classes.dex */
public final class f0 extends q3.b {
    public static final v Q;
    public boolean A;
    public c0 B;
    public w C;
    public final x D;
    public final u E;
    public final u F;
    public final String G;
    public final String H;
    public final j.i0 I;
    public final w J;
    public m2 K;
    public boolean L;
    public final u M;
    public final a6.e N;
    public final ArrayList O;
    public final e0 P;

    /* renamed from: d */
    public final x f3516d;
    public int e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final e0 f3517f;

    /* renamed from: g */
    public final AccessibilityManager f3518g;

    /* renamed from: h */
    public long f3519h;
    public final y i;

    /* renamed from: j */
    public final z f3520j;

    /* renamed from: k */
    public List f3521k;

    /* renamed from: l */
    public final Handler f3522l;

    /* renamed from: m */
    public final b0 f3523m;

    /* renamed from: n */
    public int f3524n;

    /* renamed from: o */
    public int f3525o;

    /* renamed from: p */
    public r3.e f3526p;

    /* renamed from: q */
    public r3.e f3527q;

    /* renamed from: r */
    public boolean f3528r;

    /* renamed from: s */
    public final w f3529s;

    /* renamed from: t */
    public final w f3530t;

    /* renamed from: u */
    public final s0 f3531u;

    /* renamed from: v */
    public final s0 f3532v;

    /* renamed from: w */
    public int f3533w;

    /* renamed from: x */
    public Integer f3534x;

    /* renamed from: y */
    public final f f3535y;

    /* renamed from: z */
    public final rf.h f3536z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        v vVar = j.f20897a;
        v vVar2 = new v(32);
        int i = vVar2.f20953b;
        if (i >= 0) {
            int i10 = i + 32;
            vVar2.b(i10);
            int[] iArr2 = vVar2.f20952a;
            int i11 = vVar2.f20953b;
            if (i != i11) {
                qe.k.c(i10, i, i11, iArr2, iArr2);
            }
            qe.k.f(i, 0, 12, iArr, iArr2);
            vVar2.f20953b += 32;
            Q = vVar2;
            return;
        }
        x.l("");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [c2.y] */
    /* JADX WARN: Type inference failed for: r3v3, types: [c2.z] */
    public f0(x xVar) {
        this.f3516d = xVar;
        int i = 0;
        this.f3517f = new e0(this, i);
        Object systemService = xVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f3518g = accessibilityManager;
        this.f3519h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: c2.y
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                List<AccessibilityServiceInfo> list;
                f0 f0Var = f0.this;
                if (z3) {
                    list = f0Var.f3518g.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = qe.s.f24023u;
                }
                f0Var.f3521k = list;
            }
        };
        this.f3520j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: c2.z
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                f0 f0Var = f0.this;
                f0Var.f3521k = f0Var.f3518g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f3521k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f3522l = new Handler(Looper.getMainLooper());
        this.f3523m = new b0(this);
        this.f3524n = Integer.MIN_VALUE;
        this.f3525o = Integer.MIN_VALUE;
        this.f3529s = new w();
        this.f3530t = new w();
        this.f3531u = new s0(0);
        this.f3532v = new s0(0);
        this.f3533w = -1;
        this.f3535y = new f(0);
        this.f3536z = jb.a(1, 6, null);
        this.A = true;
        w wVar = l.f20912a;
        wVar.getClass();
        this.C = wVar;
        this.D = new x();
        this.E = new u();
        this.F = new u();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new j.i0(24);
        this.J = new w();
        this.K = new m2(xVar.getSemanticsOwner().a(), wVar);
        int i10 = i.f20891a;
        this.M = new u();
        xVar.addOnAttachStateChangeListener(new a0(i, this));
        this.N = new a6.e(6, this);
        this.O = new ArrayList();
        this.P = new e0(this, 1);
    }

    public static Rect E(l0 l0Var) {
        if (!(l0Var instanceof k1.f0) && !(l0Var instanceof g0)) {
            return null;
        }
        c r8 = l0Var.r();
        return new Rect((int) r8.f18763a, (int) r8.f18764b, (int) r8.f18765c, (int) r8.f18766d);
    }

    public static float[] F(l0 l0Var) {
        if (l0Var instanceof g0) {
            d dVar = ((g0) l0Var).e;
            long j10 = dVar.f18773h;
            long j11 = dVar.f18772g;
            long j12 = dVar.f18771f;
            long j13 = dVar.e;
            return new float[]{Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L))};
        }
        return null;
    }

    public static Region G(l0 l0Var) {
        if (l0Var instanceof e0) {
            e0 e0Var = (e0) l0Var;
            c r8 = e0Var.r();
            Region region = new Region(new Rect((int) r8.f18763a, (int) r8.f18764b, (int) r8.f18765c, (int) r8.f18766d));
            Region region2 = new Region();
            i0 i0Var = e0Var.e;
            if (i0Var instanceof h) {
                region2.setPath(((h) i0Var).f19481a, region);
                return region2;
            }
            androidx.datastore.preferences.protobuf.s1.k("Unable to obtain android.graphics.Path");
            return null;
        }
        return null;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String n(n nVar) {
        g gVar;
        if (nVar != null) {
            j jVar = nVar.f18823d;
            i0 i0Var = jVar.f18813u;
            v vVar = s.f18839a;
            if (i0Var.c(vVar)) {
                return a.a((List) jVar.b(vVar), ",", null, 62);
            }
            v vVar2 = s.E;
            if (i0Var.c(vVar2)) {
                Object g8 = i0Var.g(vVar2);
                if (g8 == null) {
                    g8 = null;
                }
                g gVar2 = (g) g8;
                if (gVar2 != null) {
                    return gVar2.f20477v;
                }
            } else {
                Object g10 = i0Var.g(s.A);
                if (g10 == null) {
                    g10 = null;
                }
                List list = (List) g10;
                if (list != null && (gVar = (g) qe.l.x(list)) != null) {
                    return gVar.f20477v;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.m, df.a] */
    public static final boolean q(h hVar, float f10) {
        Object r02 = hVar.f18787a;
        if (f10 >= 0.0f || ((Number) r02.invoke()).floatValue() <= 0.0f) {
            if (f10 > 0.0f && ((Number) r02.invoke()).floatValue() < ((Number) hVar.f18788b.invoke()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.m, df.a] */
    public static final boolean r(h hVar) {
        Object r02 = hVar.f18787a;
        if (((Number) r02.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        ((Number) hVar.f18788b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.m, df.a] */
    public static final boolean s(h hVar) {
        Object r02 = hVar.f18787a;
        if (((Number) r02.invoke()).floatValue() < ((Number) hVar.f18788b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void x(f0 f0Var, int i, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        f0Var.w(i, i10, num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x049c, code lost:
    
        if (r1.isEmpty() == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04cb, code lost:
    
        if (r5 != null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04d0, code lost:
    
        if (r5 == null) goto L546;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(k r60) {
        /*
            Method dump skipped, instructions count: 1577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.f0.A(k):void");
    }

    public final void B(i0 i0Var, x xVar) {
        j x9;
        if (i0Var.I() && !this.f3516d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(i0Var)) {
            i0 i0Var2 = null;
            if (!i0Var.Z.n(8)) {
                i0Var = i0Var.v();
                while (true) {
                    if (i0Var != null) {
                        if (i0Var.Z.n(8)) {
                            break;
                        } else {
                            i0Var = i0Var.v();
                        }
                    } else {
                        i0Var = null;
                        break;
                    }
                }
            }
            if (i0Var != null && (x9 = i0Var.x()) != null) {
                if (!x9.f18815w) {
                    i0 v2 = i0Var.v();
                    while (true) {
                        if (v2 != null) {
                            j x10 = v2.x();
                            if (x10 != null && x10.f18815w) {
                                i0Var2 = v2;
                                break;
                            }
                            v2 = v2.v();
                        } else {
                            break;
                        }
                    }
                    if (i0Var2 != null) {
                        i0Var = i0Var2;
                    }
                }
                int i = i0Var.f1490v;
                if (xVar.a(i)) {
                    x(this, t(i), 2048, 1, 8);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.m, df.a] */
    public final void C(i0 i0Var) {
        if (i0Var.I() && !this.f3516d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(i0Var)) {
            int i = i0Var.f1490v;
            h hVar = (h) this.f3529s.b(i);
            h hVar2 = (h) this.f3530t.b(i);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent h3 = h(i, 4096);
            if (hVar != null) {
                h3.setScrollX((int) ((Number) hVar.f18787a.invoke()).floatValue());
                h3.setMaxScrollX((int) ((Number) hVar.f18788b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                h3.setScrollY((int) ((Number) hVar2.f18787a.invoke()).floatValue());
                h3.setMaxScrollY((int) ((Number) hVar2.f18788b.invoke()).floatValue());
            }
            v(h3);
        }
    }

    public final boolean D(n nVar, int i, int i10, boolean z3) {
        String n10;
        Integer num;
        Integer num2;
        j jVar = nVar.f18823d;
        int i11 = nVar.f18825g;
        v vVar = i.i;
        boolean z9 = false;
        if (jVar.f18813u.c(vVar) && a(nVar)) {
            df.q qVar = (df.q) ((a) nVar.f18823d.b(vVar)).f18776b;
            if (qVar != null) {
                return ((Boolean) qVar.b(Integer.valueOf(i), Integer.valueOf(i10), Boolean.valueOf(z3))).booleanValue();
            }
        } else if ((i != i10 || i10 != this.f3533w) && (n10 = n(nVar)) != null) {
            if (i < 0 || i != i10 || i10 > n10.length()) {
                i = -1;
            }
            this.f3533w = i;
            if (n10.length() > 0) {
                z9 = true;
            }
            int t3 = t(i11);
            Integer num3 = null;
            if (z9) {
                num = Integer.valueOf(this.f3533w);
            } else {
                num = null;
            }
            if (z9) {
                num2 = Integer.valueOf(this.f3533w);
            } else {
                num2 = null;
            }
            if (z9) {
                num3 = Integer.valueOf(n10.length());
            }
            v(j(t3, num, num2, num3, n10));
            z(i11);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.f0.I():void");
    }

    @Override // q3.b
    public final k6.i a(View view) {
        return this.f3523m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, r3.e eVar, String str, Bundle bundle) {
        n nVar;
        Object obj;
        Region G;
        Object obj2;
        float[] F;
        Object obj3;
        Rect E;
        Object obj4;
        Object obj5;
        int i10;
        c cVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i11;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f24537a;
        o oVar = (o) m().b(i);
        if (oVar != null && (nVar = oVar.f18826a) != null) {
            j jVar = nVar.f18823d;
            i0 i0Var = jVar.f18813u;
            String n10 = n(nVar);
            if (kotlin.jvm.internal.l.a(str, this.G)) {
                int d2 = this.E.d(i);
                if (d2 != -1) {
                    accessibilityNodeInfo2.getExtras().putInt(str, d2);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.l.a(str, this.H)) {
                int d10 = this.F.d(i);
                if (d10 != -1) {
                    accessibilityNodeInfo2.getExtras().putInt(str, d10);
                    return;
                }
                return;
            }
            k1 k1Var = null;
            if (i0Var.c(i.f18789a) && bundle != null && kotlin.jvm.internal.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i13 > 0 && i12 >= 0) {
                    if (n10 != null) {
                        i10 = n10.length();
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    if (i12 < i10) {
                        m0 n11 = n(jVar);
                        if (n11 != null) {
                            ArrayList arrayList = new ArrayList();
                            int i14 = 0;
                            while (i14 < i13) {
                                int i15 = i12 + i14;
                                if (i15 >= n11.f20524a.f20514a.f20477v.length()) {
                                    arrayList.add(k1Var);
                                    accessibilityNodeInfo = accessibilityNodeInfo2;
                                    i11 = i13;
                                } else {
                                    c b10 = n11.b(i15);
                                    k1 d11 = nVar.d();
                                    long j10 = 0;
                                    if (d11 != null) {
                                        if (!d11.h1().H) {
                                            d11 = k1Var;
                                        }
                                        if (d11 != null) {
                                            j10 = d11.W(0L);
                                        }
                                    }
                                    c i16 = b10.i(j10);
                                    c g8 = nVar.g();
                                    if (i16.g(g8)) {
                                        cVar = i16.e(g8);
                                    } else {
                                        cVar = k1Var;
                                    }
                                    if (cVar != 0) {
                                        float f10 = cVar.f18763a;
                                        x xVar = this.f3516d;
                                        long u9 = xVar.u((Float.floatToRawIntBits(cVar.f18764b) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
                                        long u10 = xVar.u((Float.floatToRawIntBits(cVar.f18765c) << 32) | (Float.floatToRawIntBits(cVar.f18766d) & 4294967295L));
                                        int i17 = (int) (u9 >> 32);
                                        int i18 = (int) (u10 >> 32);
                                        accessibilityNodeInfo = accessibilityNodeInfo2;
                                        i11 = i13;
                                        int i19 = (int) (u9 & 4294967295L);
                                        int i20 = (int) (u10 & 4294967295L);
                                        rectF = new RectF(Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), Math.min(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)), Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), Math.max(Float.intBitsToFloat(i19), Float.intBitsToFloat(i20)));
                                    } else {
                                        accessibilityNodeInfo = accessibilityNodeInfo2;
                                        i11 = i13;
                                        rectF = null;
                                    }
                                    arrayList.add(rectF);
                                }
                                i14++;
                                i13 = i11;
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                k1Var = null;
                            }
                            accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            v vVar = s.f18861y;
            if (i0Var.c(vVar) && bundle != null && kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object g10 = i0Var.g(vVar);
                if (g10 == null) {
                    obj5 = null;
                } else {
                    obj5 = g10;
                }
                String str2 = (String) obj5;
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, nVar.f18825g);
                return;
            }
            if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g11 = i0Var.g(s.O);
                if (g11 == null) {
                    obj4 = null;
                } else {
                    obj4 = g11;
                }
                p0 p0Var = (p0) obj4;
                if (p0Var != null) {
                    l0 i21 = i(p0Var, nVar);
                    if (i21 instanceof k1.f0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(i21));
                        return;
                    } else if (i21 instanceof g0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(i21));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F(i21));
                        return;
                    } else if (i21 instanceof e0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G(i21));
                        return;
                    } else {
                        l4.a.o();
                        return;
                    }
                }
                return;
            }
            if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g12 = i0Var.g(s.O);
                if (g12 == null) {
                    obj3 = null;
                } else {
                    obj3 = g12;
                }
                p0 p0Var2 = (p0) obj3;
                if (p0Var2 != null && (E = E(i(p0Var2, nVar))) != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g13 = i0Var.g(s.O);
                if (g13 == null) {
                    obj2 = null;
                } else {
                    obj2 = g13;
                }
                p0 p0Var3 = (p0) obj2;
                if (p0Var3 != null && (F = F(i(p0Var3, nVar))) != null) {
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g14 = i0Var.g(s.O);
                if (g14 == null) {
                    obj = null;
                } else {
                    obj = g14;
                }
                p0 p0Var4 = (p0) obj;
                if (p0Var4 != null && (G = G(i(p0Var4, nVar))) != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G);
                }
            }
        }
    }

    public final Rect d(o oVar) {
        k kVar = oVar.f18827b;
        float f10 = kVar.f30809a;
        float f11 = kVar.f30810b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        x xVar = this.f3516d;
        long u9 = xVar.u(floatToRawIntBits);
        float f12 = kVar.f30811c;
        float f13 = kVar.f30812d;
        long u10 = xVar.u((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        int i = (int) (u9 >> 32);
        int i10 = (int) (u10 >> 32);
        int i11 = (int) (u9 & 4294967295L);
        int i12 = (int) (u10 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i10))), (int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (pf.j(r4, r2) == r7) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:53:0x0046, B:55:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:14:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ve.c r17) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.f0.e(ve.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.internal.m, df.a] */
    public final boolean f(int i, long j10, boolean z3) {
        v vVar;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (!kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        k m4 = m();
        if (b.c(j10, 9205357640488583168L) || (((9223372034707292159L & j10) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z3) {
            vVar = s.f18857u;
        } else if (!z3) {
            vVar = s.f18856t;
        } else {
            l4.a.o();
            return false;
        }
        Object[] objArr = m4.f20904c;
        long[] jArr = m4.f20902a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z13 = false;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j11) < 128) {
                        o oVar = (o) objArr[(i11 << 3) + i14];
                        k kVar = oVar.f18827b;
                        float f10 = kVar.f30809a;
                        i10 = i12;
                        float f11 = kVar.f30810b;
                        float f12 = kVar.f30811c;
                        float f13 = kVar.f30812d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                        if (intBitsToFloat >= f10) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (intBitsToFloat < f12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z14 = z9 & z10;
                        if (intBitsToFloat2 >= f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z15 = z14 & z11;
                        if (intBitsToFloat2 < f13) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12 & z15) {
                            Object g8 = oVar.f18826a.f18823d.f18813u.g(vVar);
                            if (g8 == null) {
                                g8 = null;
                            }
                            h hVar = (h) g8;
                            if (hVar != null) {
                                Object r12 = hVar.f18787a;
                                if (i < 0) {
                                    if (((Number) r12.invoke()).floatValue() <= 0.0f) {
                                    }
                                    z13 = true;
                                } else {
                                    if (((Number) r12.invoke()).floatValue() >= ((Number) hVar.f18788b.invoke()).floatValue()) {
                                    }
                                    z13 = true;
                                }
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    j11 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return z13;
                }
            }
            if (i11 != length) {
                i11++;
            } else {
                return z13;
            }
        }
    }

    public final void g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (o()) {
                u(this.f3516d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                A(m());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent h(int i, int i10) {
        o oVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        x xVar = this.f3516d;
        obtain.setPackageName(xVar.getContext().getPackageName());
        obtain.setSource(xVar, i);
        if (o() && (oVar = (o) m().b(i)) != null) {
            n nVar = oVar.f18826a;
            obtain.setPassword(nVar.f18823d.f18813u.c(s.J));
            Object g8 = nVar.f18823d.f18813u.g(s.f18850n);
            if (g8 == null) {
                g8 = null;
            }
            boolean a10 = kotlin.jvm.internal.l.a(g8, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                a.g(obtain, a10);
            }
        }
        return obtain;
    }

    public final l0 i(p0 p0Var, n nVar) {
        long j10;
        k1 d2 = nVar.d();
        if (d2 != null) {
            j10 = d2.f31771w;
        } else {
            j10 = 0;
        }
        return p0Var.a(vd.c(j10), nVar.f18822c.T, this.f3516d.getDensity());
    }

    public final AccessibilityEvent j(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent h3 = h(i, 8192);
        if (num != null) {
            h3.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            h3.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            h3.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            h3.getText().add(charSequence);
        }
        return h3;
    }

    public final int k(n nVar) {
        j jVar = nVar.f18823d;
        if (!jVar.f18813u.c(s.f18839a)) {
            v vVar = s.F;
            if (jVar.f18813u.c(vVar)) {
                return (int) (((p0) jVar.b(vVar)).f20546a & 4294967295L);
            }
        }
        return this.f3533w;
    }

    public final int l(n nVar) {
        j jVar = nVar.f18823d;
        if (!jVar.f18813u.c(s.f18839a)) {
            v vVar = s.F;
            if (jVar.f18813u.c(vVar)) {
                return (int) (((p0) jVar.b(vVar)).f20546a >> 32);
            }
        }
        return this.f3533w;
    }

    public final k m() {
        n nVar;
        if (this.A) {
            this.A = false;
            x xVar = this.f3516d;
            this.C = q.b(xVar.getSemanticsOwner());
            if (o()) {
                w wVar = this.C;
                Resources resources = xVar.getContext().getResources();
                u uVar = this.E;
                uVar.a();
                u uVar2 = this.F;
                uVar2.a();
                o oVar = (o) wVar.b(-1);
                if (oVar != null) {
                    nVar = oVar.f18826a;
                } else {
                    nVar = null;
                }
                nVar.getClass();
                ArrayList b10 = x.b(nVar, new k0(9, wVar), new k0(10, resources), qe.g(nVar));
                int i = 1;
                int size = b10.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i10 = ((n) b10.get(i - 1)).f18825g;
                        int i11 = ((n) b10.get(i)).f18825g;
                        uVar.f(i10, i11);
                        uVar2.f(i11, i10);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean o() {
        if (this.f3518g.isEnabled() && !this.f3521k.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void p(i0 i0Var) {
        if (this.f3535y.add(i0Var)) {
            this.f3536z.e(pe.z.f22715a);
        }
    }

    public final int t(int i) {
        if (i == this.f3516d.getSemanticsOwner().a().f18825g) {
            return -1;
        }
        return i;
    }

    public final void u(n nVar, m2 m2Var) {
        int[] iArr = m.f20915a;
        x xVar = new x();
        List j10 = j(4, nVar);
        i0 i0Var = nVar.f18822c;
        int size = j10.size();
        for (int i = 0; i < size; i++) {
            n nVar2 = (n) j10.get(i);
            k m4 = m();
            int i10 = nVar2.f18825g;
            if (m4.a(i10)) {
                if (!m2Var.f3579b.b(i10)) {
                    p(i0Var);
                    return;
                }
                xVar.a(i10);
            }
        }
        x xVar2 = m2Var.f3579b;
        int[] iArr2 = xVar2.f20956b;
        long[] jArr = xVar2.f20955a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !xVar.b(iArr2[(i11 << 3) + i13])) {
                            p(i0Var);
                            return;
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        List j12 = j(4, nVar);
        int size2 = j12.size();
        for (int i14 = 0; i14 < size2; i14++) {
            n nVar3 = (n) j12.get(i14);
            m2 m2Var2 = (m2) this.J.b(nVar3.f18825g);
            if (m2Var2 != null && m().a(nVar3.f18825g)) {
                u(nVar3, m2Var2);
            }
        }
    }

    public final boolean v(AccessibilityEvent accessibilityEvent) {
        if (!o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f3528r = true;
        }
        try {
            return ((Boolean) this.f3517f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f3528r = false;
        }
    }

    public final boolean w(int i, int i10, Integer num, List list) {
        if (i != Integer.MIN_VALUE && o()) {
            AccessibilityEvent h3 = h(i, i10);
            if (num != null) {
                h3.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                h3.setContentDescription(a.a(list, ",", null, 62));
            }
            return v(h3);
        }
        return false;
    }

    public final void y(String str, int i, int i10) {
        AccessibilityEvent h3 = h(t(i), 32);
        h3.setContentChangeTypes(i10);
        if (str != null) {
            h3.getText().add(str);
        }
        v(h3);
    }

    public final void z(int i) {
        c0 c0Var = this.B;
        if (c0Var != null) {
            n nVar = c0Var.f3486a;
            if (i != nVar.f18825g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0Var.f3490f <= 1000) {
                AccessibilityEvent h3 = h(t(nVar.f18825g), 131072);
                h3.setFromIndex(c0Var.f3489d);
                h3.setToIndex(c0Var.e);
                h3.setAction(c0Var.f3487b);
                h3.setMovementGranularity(c0Var.f3488c);
                h3.getText().add(n(nVar));
                v(h3);
            }
        }
        this.B = null;
    }
}