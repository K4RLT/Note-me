package g9;
import b.a;
import b0.e0;
import b0.g1;
import d.a;
import d.c;
import f0.c;
import g2.a;
import i0.a;
import j.b;
import j.f0;
import j.k;
import j.m0;
import j.o;
import n.v;
import p.a;
import q.a;
import q.b;
import q.c;
import q.h;
import q.n;
import q.x;
import q1.b;
import r.a;
import r.c;
import r.d;
import r.e;
import s.a;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.consent_sdk.a6;
import com.google.android.gms.internal.consent_sdk.d7;
import com.google.android.gms.internal.consent_sdk.e7;
import com.google.android.gms.internal.consent_sdk.f7;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.cx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dt;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ea;
import com.google.android.gms.internal.mlkit_vision_digital_ink.eb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fs;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ia;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iv;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lt;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n9;
import com.google.android.gms.internal.mlkit_vision_digital_ink.or;
import com.google.android.gms.internal.mlkit_vision_digital_ink.p8;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ta;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tr;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.w9;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y6;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import wa.h8;
import wa.x7;

/* loaded from: classes.dex */
public final class n implements e7, da, uq, ic.b, mb.f {
    public Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17677u;

    /* renamed from: v, reason: collision with root package name */
    public Object f17678v;

    /* renamed from: w, reason: collision with root package name */
    public Object f17679w;

    /* renamed from: x, reason: collision with root package name */
    public Object f17680x;

    /* renamed from: y, reason: collision with root package name */
    public Object f17681y;

    /* renamed from: z, reason: collision with root package name */
    public Object f17682z;

    public n(ic.a aVar, ic.b bVar) {
        boolean z3;
        this.f17677u = 8;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<ic.j> set = aVar.f18388c;
        Set set2 = aVar.f18391g;
        for (ic.j jVar : set) {
            int i = jVar.f18409c;
            int i10 = jVar.f18408b;
            if (i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ic.r rVar = jVar.f18407a;
            if (z3) {
                if (i10 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i == 2) {
                hashSet3.add(rVar);
            } else if (i10 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(ic.a(dd.b.class));
        }
        this.f17678v = Collections.unmodifiableSet(hashSet);
        this.f17679w = Collections.unmodifiableSet(hashSet2);
        this.f17680x = Collections.unmodifiableSet(hashSet3);
        this.f17681y = Collections.unmodifiableSet(hashSet4);
        this.f17682z = Collections.unmodifiableSet(hashSet5);
        this.A = bVar;
    }

    public static void B(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        p pVar = p.f17688g;
        l9.d dVar = pVar.f17689a;
        String str2 = pVar.f17692d.f20029u;
        dVar.getClass();
        l9.a(context, str2, bundle, new pw(dVar, 16, context));
    }

    public static qc.p0 j(qc.p0 p0Var, pc.e eVar, m0 m0Var) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        qc.o0 a10 = p0Var.a();
        String b10 = ((pc.c) eVar.f22657v).b();
        if (b10 != null) {
            a10.e = new qc.c1(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        pc.d dVar = (pc.d) ((AtomicMarkableReference) ((com.google.android.gms.internal.ads.d) m0Var.f18665x).f5230v).getReference();
        synchronized (dVar) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar.f22652a));
        }
        List r8 = r(unmodifiableMap);
        pc.d dVar2 = (pc.d) ((AtomicMarkableReference) ((com.google.android.gms.internal.ads.d) m0Var.f18666y).f5230v).getReference();
        synchronized (dVar2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(dVar2.f22652a));
        }
        List r10 = r(unmodifiableMap2);
        if (!r8.isEmpty() || !r10.isEmpty()) {
            qc.q0 q0Var = (qc.q0) p0Var.f23899c;
            a10.f23889c = new qc.q0(q0Var.f23907a, r8, r10, q0Var.f23910d, q0Var.e, q0Var.f23911f, q0Var.f23912g);
        }
        return a10.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qc.d1] */
    public static qc.i2 k(qc.p0 p0Var, m0 m0Var) {
        List a10 = ((ad) m0Var.f18667z).a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a10.size(); i++) {
            pc.m mVar = (pc.m) a10.get(i);
            mVar.getClass();
            Object obj = new Object();
            pc.b bVar = (pc.b) mVar;
            String str = bVar.e;
            if (str != null) {
                String str2 = bVar.f22648b;
                if (str2 != null) {
                    obj.f23748a = new qc.f1(str2, str);
                    String str3 = bVar.f22649c;
                    if (str3 != null) {
                        obj.f23749b = str3;
                        obj.f23750c = bVar.f22650d;
                        obj.f23751d = bVar.f22651f;
                        obj.e = (byte) (obj.e | 1);
                        arrayList.add(obj.a());
                    } else {
                        g5.h("Null parameterKey");
                        return null;
                    }
                } else {
                    g5.h("Null rolloutId");
                    return null;
                }
            } else {
                g5.h("Null variantId");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        qc.o0 a11 = p0Var.a();
        a11.f23891f = new qc.g1(arrayList);
        return a11.a();
    }

    public static boolean l(int i, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i) {
                return true;
            }
        }
        return false;
    }

    public static n m(Context context, oc.w wVar, tc.c cVar, b6.u uVar, pc.e eVar, m0 m0Var, e4 e4Var, lw lwVar, j6.c cVar2, oc.j jVar) {
        oc.r rVar = new oc.r(context, wVar, uVar, e4Var, lwVar);
        tc.a aVar = new tc.a(cVar, lwVar, jVar);
        rc.a aVar2 = uc.a.f27159b;
        n8.b(context);
        return new n(rVar, aVar, new uc.a(new uc.c(n8.a().c(new l8.a(uc.a.f27160c, uc.a.f27161d)).a("FIREBASE_CRASHLYTICS_REPORT", new k8.c("json"), uc.a.e), lwVar.c(), cVar2)), eVar, m0Var, wVar, 12);
    }

    public static ColorStateList n(Context context, int i) {
        int b10 = f0.b(context, R.attr.colorControlHighlight);
        int a10 = f0.a(context, R.attr.colorButtonNormal);
        int[] iArr = f0.f18629b;
        int[] iArr2 = f0.f18631d;
        int b11 = j3.a.b(b10, i);
        return new ColorStateList(new int[][]{iArr, iArr2, f0.f18630c, f0.f18632f}, new int[]{a10, b11, j3.a.b(b10, i), i});
    }

    public static LayerDrawable q(o oVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable d2 = oVar.d(context, R.drawable.abc_star_black_48dp);
        Drawable d10 = oVar.d(context, R.drawable.abc_star_half_black_48dp);
        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d2;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d2.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d10 instanceof BitmapDrawable) && d10.getIntrinsicWidth() == dimensionPixelSize && d10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static List r(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new qc.f0(str, str2));
                } else {
                    g5.h("Null value");
                    return null;
                }
            } else {
                g5.h("Null key");
                return null;
            }
        }
        Collections.sort(arrayList, new e0(7));
        return Collections.unmodifiableList(arrayList);
    }

    public static void w(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f10;
        int[] iArr = k.f18646a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = b.f18615b;
        }
        PorterDuff.Mode mode2 = b.f18615b;
        synchronized (b.class) {
            f10 = o.f(i, mode);
        }
        mutate.setColorFilter(f10);
    }

    public n9 A(int i) {
        AtomicLong atomicLong = (AtomicLong) this.f17679w;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            ta taVar = ta.B;
            if (taVar != null) {
                return taVar;
            }
            return new ta();
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.k1 k1Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.k1(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f17680x;
            com.google.android.gms.internal.mlkit_vision_digital_ink.k1 k1Var2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.k1) atomicReference.get();
            if (k1Var2 != null && k1Var2.B > i) {
                ta taVar2 = ta.B;
                if (taVar2 != null) {
                    return taVar2;
                }
                return new ta();
            }
            while (!atomicReference.compareAndSet(k1Var2, k1Var)) {
                if (atomicReference.get() == k1Var2 || atomicReference.get() == k1Var2) {
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i) {
                k1Var.cancel(true);
                while (!atomicReference.compareAndSet(k1Var, null)) {
                    if (atomicReference.get() != k1Var && atomicReference.get() != k1Var) {
                        return k1Var;
                    }
                }
                return k1Var;
            }
            ou1 ou1Var = (ou1) this.f17678v;
            da daVar = (da) ou1Var.f9238v;
            ia iaVar = (ia) ou1Var.f9239w;
            if (daVar != null && iaVar != null) {
                k1Var.f(n5.o(com.google.android.gms.internal.mlkit_vision_digital_ink.a(daVar), iaVar));
                return k1Var;
            }
            k1Var.f((fb) this.A);
            return k1Var;
        }
    }

    @Override // ic.b
    public Object a(Class cls) {
        if (((Set) this.f17678v).contains(ic.a(cls))) {
            Object a10 = ((ic.b) this.A).a(cls);
            if (!cls.equals(dd.b.class)) {
                return a10;
            }
            return new Object();
        }
        g5.q.n("Attempting to request an undeclared dependency ", cls, ".");
        return null;
    }

    @Override // mb.f
    public Object b() {
        Object b10 = ((mb.e) this.f17678v).b();
        mb.e eVar = new mb.e(new k6.i(9, (ic.c) this.f17679w));
        Object b11 = ((mb.e) this.f17680x).b();
        return new lb.d1((lb.v) b10, eVar, (lb.t0) b11, new mb.e(new k6.i(9, (mb.e) this.f17681y)), (lb.n0) ((mb.e) this.f17682z).b(), (lb.f1) ((mb.e) this.A).b());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public /* bridge */ /* synthetic */ Object c() {
        ((s5) this.f17678v).e();
        com.google.android.gms.internal.mlkit_vision_digital_ink.s0 s0Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.s0) ((tq) this.f17681y).c();
        Executor executor = (Executor) ((tq) this.f17682z).c();
        return new iv(s0Var, executor);
    }

    @Override // ic.b
    public gd.b d(ic.r rVar) {
        if (((Set) this.f17679w).contains(rVar)) {
            return ((ic.b) this.A).d(rVar);
        }
        g5.q.n("Attempting to request an undeclared dependency Provider<", rVar, ">.");
        return null;
    }

    @Override // ic.b
    public gd.b e(Class cls) {
        return d(ic.a(cls));
    }

    @Override // ic.b
    public ic.p f(ic.r rVar) {
        if (((Set) this.f17680x).contains(rVar)) {
            return ((ic.b) this.A).f(rVar);
        }
        g5.q.n("Attempting to request an undeclared dependency Deferred<", rVar, ">.");
        return null;
    }

    @Override // ic.b
    public gd.b g(ic.r rVar) {
        if (((Set) this.f17682z).contains(rVar)) {
            return ((ic.b) this.A).g(rVar);
        }
        g5.q.n("Attempting to request an undeclared dependency Provider<Set<", rVar, ">>.");
        return null;
    }

    @Override // ic.b
    public Object h(ic.r rVar) {
        if (((Set) this.f17678v).contains(rVar)) {
            return ((ic.b) this.A).h(rVar);
        }
        g5.q.n("Attempting to request an undeclared dependency ", rVar, ".");
        return null;
    }

    @Override // ic.b
    public Set i(ic.r rVar) {
        if (((Set) this.f17681y).contains(rVar)) {
            return ((ic.b) this.A).i(rVar);
        }
        g5.q.n("Attempting to request an undeclared dependency Set<", rVar, ">.");
        return null;
    }

    public ib.o o(ib.o oVar) {
        return oVar.g(new d5.c(0), new l4.a(21, this));
    }

    public ic.p p(Class cls) {
        return f(ic.a(cls));
    }

    public ColorStateList s(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return x7.a(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230786) {
            return x7.a(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList c10 = c(context, R.attr.colorSwitchThumbNormal);
            if (c10 != null && c10.isStateful()) {
                int[] iArr3 = f0.f18629b;
                iArr[0] = iArr3;
                iArr2[0] = c10.getColorForState(iArr3, 0);
                iArr[1] = f0.e;
                iArr2[1] = f0.b(context, R.attr.colorControlActivated);
                iArr[2] = f0.f18632f;
                iArr2[2] = c10.getDefaultColor();
            } else {
                iArr[0] = f0.f18629b;
                iArr2[0] = f0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = f0.e;
                iArr2[1] = f0.b(context, R.attr.colorControlActivated);
                iArr[2] = f0.f18632f;
                iArr2[2] = f0.b(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return n(context, f0.b(context, R.attr.colorButtonNormal));
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return n(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            return n(context, f0.b(context, R.attr.colorAccent));
        }
        if (i != 2131230781 && i != R.drawable.abc_spinner_textfield_background_material) {
            if (l(i, (int[]) this.f17679w)) {
                return c(context, R.attr.colorControlNormal);
            }
            if (l(i, (int[]) this.f17682z)) {
                return x7.a(context, R.color.abc_tint_default);
            }
            if (l(i, (int[]) this.A)) {
                return x7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return x7.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return x7.a(context, R.color.abc_tint_spinner);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, qc.o0] */
    public void t(Throwable th, Thread thread, String str, String str2, long j10, boolean z3) {
        e4 e4Var;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean z9;
        boolean equals = str2.equals("crash");
        oc.r rVar = (oc.r) this.f17678v;
        Context context = rVar.f21933a;
        int i = context.getResources().getConfiguration().orientation;
        e4 e4Var2 = rVar.f21936d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        Boolean bool = null;
        nd.o oVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            oVar = new nd.o(th3.getLocalizedMessage(), th3.getClass().getName(), e4Var2.h(th3.getStackTrace()), oVar);
        }
        Object obj = new Object();
        obj.f23888b = str2;
        obj.f23887a = j10;
        obj.f23892g = (byte) (obj.f23892g | 1);
        qc.b2 d2 = lc.d.f20328b.d(context);
        int i10 = ((qc.z0) d2).f23979c;
        if (i10 > 0) {
            if (i10 != 100) {
                z9 = true;
            } else {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        }
        Boolean bool2 = bool;
        ArrayList c10 = lc.c(context);
        byte b10 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) oVar.f21273w;
        String name = thread.getName();
        if (name != null) {
            byte b11 = (byte) 1;
            List d10 = oc.d(stackTraceElementArr, 4);
            if (d10 != null) {
                if (b11 == 1) {
                    arrayList.add(new qc.v0(4, name, d10));
                    if (z3) {
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread)) {
                                StackTraceElement[] h3 = e4Var2.h(next.getValue());
                                String name2 = key.getName();
                                if (name2 != null) {
                                    e4Var = e4Var2;
                                    List d11 = oc.d(h3, 0);
                                    if (d11 != null) {
                                        if (b11 == 1) {
                                            it = it2;
                                            arrayList.add(new qc.v0(0, name2, d11));
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            if (b11 == 0) {
                                                sb2.append(" importance");
                                            }
                                            x.o(g3.a.l("Missing required properties:", sb2));
                                            return;
                                        }
                                    } else {
                                        g5.h("Null frames");
                                        return;
                                    }
                                } else {
                                    g5.h("Null name");
                                    return;
                                }
                            } else {
                                e4Var = e4Var2;
                                it = it2;
                            }
                            it2 = it;
                            e4Var2 = e4Var;
                        }
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    qc.t0 c11 = oc.c(oVar, 0);
                    qc.u0 e = oc.e();
                    List a10 = rVar.a();
                    if (a10 != null) {
                        qc.r0 r0Var = new qc.r0(unmodifiableList, c11, null, e, a10);
                        if (b10 == 1) {
                            obj.f23889c = new qc.q0(r0Var, null, null, bool2, d2, c10, i);
                            obj.f23890d = rVar.b(i);
                            qc.p0 a11 = obj.a();
                            tc.a aVar = (tc.a) this.f17679w;
                            pc.e eVar = (pc.e) this.f17681y;
                            m0 m0Var = (m0) this.f17682z;
                            aVar.d(k(j(a11, eVar, m0Var), m0Var), str, equals);
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        if (b10 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        x.o(g3.a.l("Missing required properties:", sb3));
                        return;
                    }
                    g5.h("Null binaries");
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                if (b11 == 0) {
                    sb4.append(" importance");
                }
                x.o(g3.a.l("Missing required properties:", sb4));
                return;
            }
            g5.h("Null frames");
            return;
        }
        g5.h("Null name");
    }

    public ib.o u(String str, Executor executor) {
        ib.h hVar;
        ArrayList b10 = ((tc.a) this.f17679w).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            File file = (File) b10.get(i);
            try {
                rc.a aVar = tc.a.f25690g;
                String e = tc.a.e(file);
                aVar.getClass();
                arrayList.add(new oc.a(rc.a.i(e), file.getName(), file));
            } catch (IOException e8) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e8);
                file.delete();
            }
            i = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            oc.a aVar2 = (oc.a) obj;
            if (str == null || str.equals(aVar2.f21868b)) {
                uc.a aVar3 = (uc.a) this.f17680x;
                qc.b0 b0Var = aVar2.f21867a;
                boolean z3 = true;
                if (b0Var.f23706f == null || b0Var.f23707g == null) {
                    oc.v b11 = ((oc.w) this.A).b(true);
                    qc.b0 b0Var2 = aVar2.f21867a;
                    String str2 = b11.f21944a;
                    qc.a0 a10 = b0Var2.a();
                    a10.e = str2;
                    qc.b0 a11 = a10.a();
                    String str3 = b11.f21945b;
                    qc.a0 a12 = a11.a();
                    a12.f23682f = str3;
                    aVar2 = new oc.a(a12.a(), aVar2.f21868b, aVar2.f21869c);
                }
                if (str == null) {
                    z3 = false;
                }
                uc.c cVar = aVar3.f27162a;
                synchronized (cVar.f27171f) {
                    try {
                        hVar = new ib.h();
                        if (z3) {
                            ((AtomicInteger) cVar.i.f18914v).getAndIncrement();
                            if (cVar.f27171f.size() < cVar.e) {
                                lc.d dVar = lc.d.f20327a;
                                dVar.b("Enqueueing report: " + aVar2.f21868b);
                                dVar.b("Queue size: " + cVar.f27171f.size());
                                cVar.f27172g.execute(new qb.s(cVar, aVar2, hVar));
                                dVar.b("Closing task for report: " + aVar2.f21868b);
                                hVar.d(aVar2);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + aVar2.f21868b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.i.f18915w).getAndIncrement();
                                hVar.d(aVar2);
                            }
                        } else {
                            cVar.b(aVar2, hVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(hVar.f18363a.g(executor, new l4.a(24, this)));
            }
        }
        return h8.f(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(java.lang.String r6, android.os.Bundle r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.v(java.lang.String, android.os.Bundle, java.lang.String):void");
    }

    public ib.o x(String str, Bundle bundle, String str2) {
        int i;
        try {
            v(str, bundle, str2);
            ba.b bVar = (ba.b) this.f17680x;
            ba.h hVar = ba.h.f3130w;
            ba.r rVar = bVar.f3118c;
            if (rVar.t() < 12000000) {
                if (rVar.v() != 0) {
                    return bVar.a(bundle).h(hVar, new j6.s(bVar, 1, bundle));
                }
                return h8.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            ba.q c10 = ba.c(bVar.f3117b);
            synchronized (c10) {
                i = c10.f3157u;
                c10.f3157u = i + 1;
            }
            return c10.d(new ba.o(i, 1, bundle, 1)).g(hVar, ba.d.f3123v);
        } catch (InterruptedException | ExecutionException e) {
            return h8.d(e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b6.u zzb() {
        Application application = (Application) ((f7) this.f17678v).zzb();
        com.google.android.gms.internal.consent_sdk.r rVar = (com.google.android.gms.internal.consent_sdk.r) ((d7) this.f17679w).zzb();
        Handler handler = com.google.android.gms.internal.consent_sdk.d0.f13387a;
        com.google.android.gms.internal.consent_sdk.c(handler);
        com.google.android.gms.internal.consent_sdk.c0 c0Var = com.google.android.gms.internal.consent_sdk.d0.f13388b;
        com.google.android.gms.internal.consent_sdk.c(c0Var);
        return new b6.u(application, rVar, handler, c0Var, (com.google.android.gms.internal.consent_sdk.p0) ((f7) this.f17680x).zzb(), ((com.google.android.gms.internal.consent_sdk.f) ((f7) this.f17681y)).zzb(), (com.google.android.gms.internal.consent_sdk.k) ((a6) this.f17682z).zzb(), (com.google.android.gms.internal.consent_sdk.g) ((f7) this.A).zzb());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.lang.Object] */
    public n9 z() {
        AtomicLong atomicLong;
        long j10;
        final int i;
        ya k3;
        fb fbVar = (fb) this.A;
        if (fbVar.isDone()) {
            return fbVar;
        }
        do {
            atomicLong = (AtomicLong) this.f17679w;
            j10 = atomicLong.get();
            i = (int) (j10 >>> 32);
        } while (!atomicLong.compareAndSet(j10, ((((int) j10) + 1) & 4294967295L) | (i << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f17681y;
        Object obj = new Object();
        ya yaVar = (ya) atomicReference.getAndSet(obj);
        ia iaVar = ia.f14473u;
        if (yaVar == null) {
            k3 = n5.o(com.google.android.gms.internal.mlkit_vision_digital_ink.a(new c7.x(this, i, 10)), iaVar);
        } else {
            ea eaVar = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.i1
                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj2) {
                    return g9.n.this.A(i);
                }
            };
            int i10 = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
            k3 = n5.k(yaVar, Throwable.class, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.b(), 3, eaVar), (eb) this.f17682z);
        }
        obj.f(k3);
        com.google.android.gms.internal.mlkit_vision_digital_ink.j1 j1Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.j1(this, i);
        obj.g(new ba.j(7, this, (Object) obj, j1Var), iaVar);
        return j1Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        int i = 0;
        switch (this.f17677u) {
            case 3:
                dt dtVar = (dt) this.f17678v;
                ya yaVar = (ya) this.f17679w;
                ya yaVar2 = (ya) this.f17680x;
                fs fsVar = (fs) this.f17681y;
                y6 y6Var = (y6) this.f17682z;
                String str = (String) this.A;
                int i10 = 1;
                if (((com.google.android.gms.internal.mlkit_vision_digital_ink.q2) n5.r(yaVar)).c()) {
                    return n5.m(new lt(i10, (ya) ((com.google.android.gms.internal.mlkit_vision_digital_ink.q2) n5.r(yaVar)).a()));
                }
                if (((com.google.android.gms.internal.mlkit_vision_digital_ink.q2) n5.r(yaVar2)).c()) {
                    return n5.m(new lt(i10, (ya) ((com.google.android.gms.internal.mlkit_vision_digital_ink.q2) n5.r(yaVar2)).a()));
                }
                w9 d2 = dtVar.f14214b.d(fsVar, false);
                com.google.android.gms.internal.mlkit_vision_digital_ink.r0 r0Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(dtVar, 5, fsVar);
                eb ebVar = dtVar.f14218g;
                int i11 = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
                int i12 = 3;
                return n5.q(n5.q(d2, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.b(), i12, r0Var), ebVar), new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.b(), i12, new com.google.android.gms.internal.mlkit_vision_digital_ink.c1(dtVar, fsVar, y6Var, str, 3)), ebVar);
            default:
                String str2 = "";
                Context context = (Context) this.f17678v;
                com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f17680x;
                String str3 = (String) this.f17679w;
                Uri uri = (Uri) this.f17681y;
                or orVar = (or) this.f17682z;
                tr trVar = (tr) this.A;
                try {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.r a10 = com.google.android.gms.internal.mlkit_vision_digital_ink.a(context);
                    a10.f14879a = str3;
                    Uri c10 = a10.c();
                    InputStream inputStream = (InputStream) iVar.c(uri, com.google.android.gms.internal.mlkit_vision_digital_ink.a());
                    try {
                        OutputStream outputStream = (OutputStream) iVar.c(c10, new s5(2));
                        try {
                            p8.a(inputStream, outputStream);
                            outputStream.close();
                            inputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.w unused) {
                    cx.g("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", orVar.D(), trVar.P());
                    str2 = a.l("System limit exceeded for file ", orVar.D(), ", group ", trVar.P());
                    i = 25;
                } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.x unused2) {
                    cx.g("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", orVar.D(), trVar.P());
                    str2 = a.l("Malformed blob Uri for file ", orVar.D(), ", group ", trVar.P());
                    i = 17;
                } catch (com.google.android.gms.internal.mlkit_vision_digital_ink.y e) {
                    if (!TextUtils.isEmpty(e.getMessage())) {
                        str2 = e.getMessage();
                    }
                    cx.k("%s: Failed to share after download for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", orVar.D(), trVar.P(), str2);
                    str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
                    i = 24;
                } catch (IOException unused3) {
                    cx.g("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", orVar.D(), trVar.P());
                    str2 = a5.a.h("Error while copying file ", orVar.D(), ", group ", trVar.P(), ", to the shared blob storage");
                    i = 22;
                }
                if (i == 0) {
                    return va.f15125v;
                }
                throw new fx(i, str2);
        }
    }

    public n(Context context, String str) {
        String concat;
        this.f17677u = 6;
        this.f17678v = context.getApplicationContext();
        this.f17679w = str;
        this.f17680x = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = na.a(context).c(0, context.getPackageName()).versionName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb2.append(packageName);
            sb2.append("-");
            sb2.append(str2);
            concat = sb2.toString();
        } catch (PackageManager.NameNotFoundException e) {
            int i = k9.a0.f19634b;
            l9.i.d("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.A = concat;
    }

    public n(Context context, l9.a aVar, PackageInfo packageInfo, String str, r9.d dVar) {
        this.f17677u = 13;
        this.f17678v = context;
        this.f17679w = context.getPackageName();
        this.f17680x = aVar.f20029u;
        this.f17681y = packageInfo;
        this.f17682z = str;
        this.A = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.lang.Object] */
    public n(da daVar) {
        this.f17677u = 2;
        long j10 = Integer.MIN_VALUE;
        this.f17679w = new AtomicLong((j10 & 4294967295L) | (j10 << 32));
        this.f17680x = new AtomicReference(null);
        this.f17681y = new AtomicReference(null);
        ia iaVar = ia.f14473u;
        this.f17682z = new eb(iaVar);
        Object obj = new Object();
        this.A = obj;
        ou1 ou1Var = new ou1(4);
        ou1Var.f9238v = daVar;
        ou1Var.f9239w = iaVar;
        this.f17678v = ou1Var;
        obj.g(ou1Var, iaVar);
    }

    public n(Set set, String str, String str2) {
        this.f17677u = 7;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f17678v = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f17680x = str;
        this.f17681y = str2;
        this.f17682z = fb.a.f16932b;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f17679w = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            g5.b();
            throw null;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f17677u = i;
        this.f17678v = obj;
        this.f17679w = obj2;
        this.f17680x = obj3;
        this.f17681y = obj4;
        this.f17682z = obj5;
        this.A = obj6;
    }

    public n(int i) {
        this.f17677u = i;
        switch (i) {
            case 14:
                return;
            default:
                this.f17678v = new int[]{2131230796, 2131230794, 2131230720};
                this.f17679w = new int[]{2131230744, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f17680x = new int[]{2131230793, 2131230795, 2131230737, R.drawable.abc_text_cursor_material, 2131230790, 2131230791, 2131230792};
                this.f17681y = new int[]{2131230769, R.drawable.abc_cab_background_internal_bg, 2131230768};
                this.f17682z = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.A = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
        }
    }

    public n(bc.g gVar, g1 g1Var, gd.b bVar, gd.b bVar2, hd.e eVar) {
        this.f17677u = 11;
        gVar.a();
        ba.b bVar3 = new ba.b(gVar.f3177a);
        this.f17678v = gVar;
        this.f17679w = g1Var;
        this.f17680x = bVar3;
        this.f17681y = bVar;
        this.f17682z = bVar2;
        this.A = eVar;
    }
}