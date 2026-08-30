package b8;
import a1.g;
import b0.j;
import b0.p;
import b2.f1;
import b5.a;
import b8.e1;
import b8.k1;
import b8.l2;
import b8.p0;
import b8.q0;
import c2.u0;
import d.c;
import d1.u;
import i0.c;
import i0.n;
import i2.c;
import i5.j;
import j6.n;
import k6.i;
import l.a;
import l4.a;
import m.d;
import o7.b;
import r0.a1;
import r0.d;
import r0.e1;
import r0.f1;
import r0.o1;
import t.d;
import t.i;
import t.m2;
import t.t1;
import t.z1;
import u7.k6;
import u7.m3;
import u7.o1;
import u7.v0;
import u7.w0;
import x7.f0;
import y2.c;
import z.m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.view.ScrollCaptureSession;
import com.daren.scraply.MainActivity;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.gl;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class l2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2347u;

    /* renamed from: v, reason: collision with root package name */
    public int f2348v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2349w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2350x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2351y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2352z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(v7.d dVar, m3 m3Var, int i, h8.f fVar, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f2347u = 18;
        this.f2349w = dVar;
        this.f2350x = m3Var;
        this.f2348v = i;
        this.f2351y = fVar;
        this.f2352z = a1Var;
    }

    private final Object j(Object obj) {
        i iVar = (i) this.f2350x;
        i iVar2 = iVar.M;
        int i = this.f2348v;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    pf.d1 p10 = pf.p(((pf.z) this.f2349w).A());
                    iVar.R = true;
                    z1 z1Var = iVar.J;
                    r.u0 u0Var = r.u0.f24148u;
                    a1 a1Var = new a1((m2) this.f2351y, iVar, (d) this.f2352z, p10, (te.c) null, 9);
                    this.f2348v = 1;
                    Object f10 = z1Var.f(u0Var, a1Var, this);
                    ue.a aVar = ue.a.f27192u;
                    if (f10 == aVar) {
                        return aVar;
                    }
                }
                iVar2.y();
                iVar.R = false;
                iVar2.l(null);
                iVar.O = false;
                return pe.z.f22715a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            iVar.R = false;
            iVar2.l(null);
            iVar.O = false;
            throw th;
        }
    }

    private final Object k(Object obj) {
        o1 o1Var = (o1) this.f2349w;
        int i = this.f2348v;
        te.c cVar = null;
        if (i != 0) {
            if (i == 1) {
                o1Var = (o1) this.f2350x;
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            wf.e eVar = pf.l0.f22767a;
            wf.d dVar = wf.d.f29913w;
            k2 k2Var = new k2(this.f2351y, (Context) this.f2352z, cVar, 8);
            this.f2349w = null;
            this.f2350x = o1Var;
            this.f2348v = 1;
            obj = pf.b0.J(dVar, k2Var, this);
            ue.a aVar = ue.a.f27192u;
            if (obj == aVar) {
                return aVar;
            }
        }
        o1Var.setValue(obj);
        return pe.z.f22715a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (d(r10, r9) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (m3.i(r2, r1, r0, r9) == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2351y
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.f2352z
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r9.f2350x
            m3 r2 = (m3) r2
            int r3 = r9.f2348v
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r3 == 0) goto L28
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1d
            pe.a.e(r10)
            goto La5
        L1d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r10)
            r10 = 0
            return r10
        L24:
            pe.a.e(r10)
            goto L35
        L28:
            pe.a.e(r10)
            r9.f2348v = r5
            java.lang.Object r10 = m3.i(r2, r1, r0, r9)
            if (r10 != r6) goto L35
            goto La4
        L35:
            q0 r10 = q0.f2553a
            r1.getClass()
            r0.getClass()
            boolean r3 = mf.f.u(r0)
            if (r3 == 0) goto L44
            goto L94
        L44:
            p0 r3 = r10.e(r1)
            java.util.Map r7 = r3.f2507b
            boolean r7 = r7.containsKey(r0)
            if (r7 != 0) goto L51
            goto L94
        L51:
            java.util.Map r7 = r3.f2507b
            r7.getClass()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r7)
            r8.remove(r0)
            int r0 = r8.size()
            if (r0 == 0) goto L85
            if (r0 == r5) goto L67
            goto L87
        L67:
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r8 = java.util.Collections.singletonMap(r5, r0)
            r8.getClass()
            goto L87
        L85:
            qe.t r8 = qe.t.f24024u
        L87:
            java.util.List r0 = r3.f2506a
            r0.getClass()
            p0 r3 = new p0
            r3.<init>(r0, r8)
            r10.f(r1, r3)
        L94:
            java.lang.Object r10 = r9.f2349w
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto La5
            n r0 = r2.f26530b
            r9.f2348v = r4
            java.lang.Object r10 = d(r10, r9)
            if (r10 != r6) goto La5
        La4:
            return r6
        La5:
            pe.z r10 = pe.z.f22715a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l2.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ad, code lost:
    
        if (r13.e(r1, r12) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (pf.b0.J(r3, r9, r12) == r8) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f2349w
            g r0 = (g) r0
            java.lang.Object r1 = r12.f2351y
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r12.f2350x
            m3 r2 = (m3) r2
            int r3 = r12.f2348v
            pe.z r4 = pe.z.f22715a
            r5 = 2
            r6 = 0
            r7 = 1
            ue.a r8 = ue.a.f27192u
            if (r3 == 0) goto L2b
            if (r3 == r7) goto L26
            if (r3 != r5) goto L20
            pe.a.e(r13)
            goto Lb0
        L20:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r13)
            return r6
        L26:
            pe.a.e(r13)
            goto La5
        L2b:
            pe.a.e(r13)
            java.util.List r13 = r2.f26547u
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r13 = r13.iterator()
        L3b:
            boolean r9 = r13.hasNext()
            if (r9 == 0) goto L54
            java.lang.Object r9 = r13.next()
            r10 = r9
            b r10 = (b) r10
            java.lang.String r10 = r10.f21853g
            boolean r10 = kotlin.jvm.internal.a(r10, r1)
            if (r10 == 0) goto L3b
            r3.add(r9)
            goto L3b
        L54:
            java.util.ArrayList r13 = new java.util.ArrayList
            r9 = 10
            int r9 = qe.d(r3, r9)
            r13.<init>(r9)
            int r9 = r3.size()
            r10 = 0
        L64:
            if (r10 >= r9) goto L74
            java.lang.Object r11 = r3.get(r10)
            int r10 = r10 + 1
            b r11 = (b) r11
            java.lang.String r11 = r11.f21848a
            r13.add(r11)
            goto L64
        L74:
            sf.n0 r3 = r2.f26551y
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            if (r3 <= r7) goto Lb6
            int r3 = r13.size()
            java.util.List r9 = r2.f26547u
            int r9 = r9.size()
            if (r3 < r9) goto L8f
            goto Lb6
        L8f:
            wf.e r3 = pf.l0.f22767a
            wf.d r3 = wf.d.f29913w
            k1 r9 = new k1
            java.lang.Object r10 = r12.f2352z
            android.content.Context r10 = (android.content.Context) r10
            r9.<init>(r13, r2, r10, r6)
            r12.f2348v = r7
            java.lang.Object r13 = pf.b0.J(r3, r9, r12)
            if (r13 != r8) goto La5
            goto Laf
        La5:
            n r13 = r2.f26530b
            r12.f2348v = r5
            java.lang.Object r13 = r13.e(r1, r12)
            if (r13 != r8) goto Lb0
        Laf:
            return r8
        Lb0:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r0.invoke(r13)
            return r4
        Lb6:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r0.invoke(r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l2.m(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        a1 a1Var = (a1) this.f2351y;
        int i = this.f2348v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            float f10 = k6.f26414a;
            if (!((Boolean) a1Var.getValue()).booleanValue() && !((List) this.f2349w).isEmpty() && ((Boolean) ((a1) this.f2352z).getValue()).booleanValue()) {
                this.f2348v = 1;
                Object j10 = pf.j(120L, this);
                ue.a aVar = ue.a.f27192u;
                if (j10 == aVar) {
                    return aVar;
                }
            }
            return pe.z.f22715a;
        }
        float f11 = k6.f26414a;
        a1Var.setValue(Boolean.TRUE);
        ((df.a) this.f2350x).invoke();
        return pe.z.f22715a;
    }

    private final Object p(Object obj) {
        int i = this.f2348v;
        if (i != 0) {
            if (i != 1) {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pe.a.e(obj);
            a.p();
            return null;
        }
        pe.a.e(obj);
        sf.a0 a0Var = ((m3) this.f2350x).f26552z;
        j jVar = new j(4, (o1) this.f2349w, (List) this.f2351y, (pf.z) this.f2352z);
        this.f2348v = 1;
        a0Var.f25140u.b(jVar, this);
        return ue.a.f27192u;
    }

    private final Object q(Object obj) {
        Context context = (Context) this.f2352z;
        m3 m3Var = (m3) this.f2350x;
        int i = this.f2348v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            f1 f1Var = (f1) this.f2351y;
            float f10 = k6.f26414a;
            m3Var.G(context, f1Var.h());
            m3Var.a0(context);
            q.d dVar = (q.d) this.f2349w;
            Float f11 = new Float(0.0f);
            q.k1 s10 = q.e.s(700, 0, q.y.f23031a, 2);
            this.f2348v = 1;
            Object c10 = q.c(dVar, f11, s10, this);
            ue.a aVar = ue.a.f27192u;
            if (c10 == aVar) {
                return aVar;
            }
        }
        return pe.z.f22715a;
    }

    private final Object r(Object obj) {
        Bitmap bitmap = (Bitmap) this.f2350x;
        String str = (String) this.f2351y;
        f1 f1Var = (f1) this.f2349w;
        ConcurrentHashMap.KeySetView keySetView = (ConcurrentHashMap.KeySetView) f1Var.E;
        int i = this.f2348v;
        te.c cVar = null;
        int i10 = 1;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(f1.h((Context) this.f2352z), "coverdraw_" + str + ".png"));
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                bitmap.recycle();
                keySetView.remove(str);
                throw th;
            }
            bitmap.recycle();
            keySetView.remove(str);
            wf.e eVar = pf.l0.f22767a;
            qf.d dVar = uf.n.f27235a;
            v7.a aVar = new v7.a(f1Var, str, cVar, i10);
            this.f2348v = 1;
            Object J = pf.b0.J(dVar, aVar, this);
            ue.a aVar2 = ue.a.f27192u;
            if (J == aVar2) {
                return aVar2;
            }
        }
        return pe.z.f22715a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0195, code lost:
    
        if (pf.b0.J(r0, r2, r27) == r5) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0161, code lost:
    
        if (pf.b0.J(r0, r3, r27) == r5) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0197, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        if (r13 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017a, code lost:
    
        r13.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0178, code lost:
    
        if (r13 == null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00b8: MOVE (r8 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:185), block:B:117:0x00b8 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l2.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        a1 a1Var;
        int i = this.f2348v;
        w7.l9 l9Var = null;
        if (i != 0) {
            if (i == 1) {
                a1Var = (a1) this.f2349w;
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            a1Var = (a1) this.f2352z;
            w7.ma maVar = (w7.ma) ((a1) this.f2350x).getValue();
            if (maVar != null) {
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f2351y;
                w7.p9 p9Var = w7.p9.f28915a;
                Context context = (Context) yVar.f19787u;
                this.f2349w = a1Var;
                this.f2348v = 1;
                obj = w7.p9.l(context, maVar, this);
                ue.a aVar = ue.a.f27192u;
                if (obj == aVar) {
                    return aVar;
                }
            }
            a1Var.setValue(l9Var);
            return pe.z.f22715a;
        }
        l9Var = (w7.l9) obj;
        a1Var.setValue(l9Var);
        return pe.z.f22715a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.Bitmap] */
    private final Object u(Object obj) {
        String str;
        a1 a1Var;
        o1 o1Var;
        v7.d dVar = (v7.d) this.f2351y;
        o1 o1Var2 = (o1) this.f2349w;
        int i = this.f2348v;
        te.c cVar = null;
        cVar = null;
        if (i != 0) {
            if (i == 1) {
                o1 o1Var3 = (o1) this.f2350x;
                pe.a.e(obj);
                o1Var = o1Var3;
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            v0 v0Var = w0.f26984a;
            if (dVar != null) {
                str = dVar.f27410f;
            } else {
                str = null;
            }
            v0 a10 = w0.a(str);
            a1Var = o1Var2;
            if (dVar != null) {
                a1Var = o1Var2;
                if (!a10.f26938a.equals("none")) {
                    wf.e eVar = pf.l0.f22767a;
                    wf.d dVar2 = wf.d.f29913w;
                    androidx.lifecycle.q qVar = new androidx.lifecycle.q(a10, (kotlin.jvm.internal.y) this.f2352z, cVar, 23);
                    this.f2349w = null;
                    this.f2350x = o1Var2;
                    this.f2348v = 1;
                    obj = pf.b0.J(dVar2, qVar, this);
                    ue.a aVar = ue.a.f27192u;
                    o1Var = o1Var2;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            a1Var.setValue(cVar);
            return pe.z.f22715a;
        }
        a1Var = o1Var;
        cVar = (Bitmap) obj;
        a1Var.setValue(cVar);
        return pe.z.f22715a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [df.p, ve.i] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2347u) {
            case 0:
                l2 l2Var = new l2((m3) this.f2350x, (String) this.f2351y, (Context) this.f2352z, cVar, 0);
                l2Var.f2349w = obj;
                return l2Var;
            case 1:
                l2 l2Var2 = new l2((n2) this.f2350x, (u3) this.f2351y, (ca) this.f2352z, cVar, 1);
                l2Var2.f2349w = obj;
                return l2Var2;
            case 2:
                l2 l2Var3 = new l2((z3) this.f2352z, cVar);
                l2Var3.f2351y = obj;
                return l2Var3;
            case 3:
                l2 l2Var4 = new l2((w7.l9) this.f2351y, (t4) this.f2352z, cVar, 3);
                l2Var4.f2349w = obj;
                return l2Var4;
            case 4:
                l2 l2Var5 = new l2((c) this.f2350x, (m) this.f2351y, (o5) this.f2352z, cVar, 4);
                l2Var5.f2349w = obj;
                return l2Var5;
            case 5:
                l2 l2Var6 = new l2((bl0) this.f2351y, (ve.i) this.f2352z, cVar);
                l2Var6.f2349w = obj;
                return l2Var6;
            case 6:
                l2 l2Var7 = new l2((df.l) this.f2350x, (AtomicReference) this.f2351y, (df.p) this.f2352z, cVar);
                l2Var7.f2349w = obj;
                return l2Var7;
            case 7:
                return new l2((MainActivity) this.f2351y, (Uri) this.f2352z, cVar, 7);
            case 8:
                l2 l2Var8 = new l2((g5.v) this.f2350x, (pf.l) this.f2351y, (a) this.f2352z, cVar, 8);
                l2Var8.f2349w = obj;
                return l2Var8;
            case 9:
                l2 l2Var9 = new l2((g5.o0) this.f2350x, (int[]) this.f2351y, (String[]) this.f2352z, cVar, 9);
                l2Var9.f2349w = obj;
                return l2Var9;
            case 10:
                l2 l2Var10 = new l2((df.l) this.f2350x, (c) this.f2351y, (n) this.f2352z, cVar, 10);
                l2Var10.f2349w = obj;
                return l2Var10;
            case 11:
                return new l2((c) this.f2349w, (ScrollCaptureSession) this.f2350x, (Rect) this.f2351y, (Consumer) this.f2352z, cVar, 11);
            case 12:
                return new l2(this.f2349w, (q.d) this.f2350x, (a1) this.f2351y, (a1) this.f2352z, cVar, 12);
            case 13:
                l2 l2Var11 = new l2((a1) this.f2351y, (q.f0) this.f2352z, cVar, 13);
                l2Var11.f2349w = obj;
                return l2Var11;
            case 14:
                l2 l2Var12 = new l2((kotlin.jvm.internal.y) this.f2351y, (sf.h) this.f2352z, cVar, 14);
                l2Var12.f2349w = obj;
                return l2Var12;
            case 15:
                l2 l2Var13 = new l2((sf.g) this.f2350x, (sf.n0) this.f2351y, (Float) this.f2352z, cVar, 15);
                l2Var13.f2349w = obj;
                return l2Var13;
            case 16:
                return new l2((sf.k0) this.f2349w, (sf.g) this.f2350x, (sf.n0) this.f2351y, (Float) this.f2352z, cVar, 16);
            case 17:
                l2 l2Var14 = new l2((i) this.f2350x, (m2) this.f2351y, (d) this.f2352z, cVar, 17);
                l2Var14.f2349w = obj;
                return l2Var14;
            case 18:
                return new l2((v7.d) this.f2349w, (m3) this.f2350x, this.f2348v, (h8.f) this.f2351y, (a1) this.f2352z, cVar);
            case 19:
                l2 l2Var15 = new l2((v0) this.f2351y, (Context) this.f2352z, cVar, 19);
                l2Var15.f2349w = obj;
                return l2Var15;
            case 20:
                return new l2((m3) this.f2350x, (Context) this.f2352z, (String) this.f2351y, (String) this.f2349w, cVar);
            case gl.zzm /* 21 */:
                return new l2((m3) this.f2350x, this.f2349w, this.f2351y, this.f2352z, cVar, 21);
            case 22:
                return new l2((List) this.f2349w, (df.a) this.f2350x, (a1) this.f2351y, (a1) this.f2352z, cVar, 22);
            case 23:
                return new l2((m3) this.f2350x, this.f2349w, this.f2351y, this.f2352z, cVar, 23);
            case 24:
                return new l2((m3) this.f2350x, (Context) this.f2352z, (q.d) this.f2349w, (f1) this.f2351y, cVar);
            case 25:
                return new l2((f1) this.f2349w, (Context) this.f2352z, (String) this.f2351y, (Parcelable) this.f2350x, cVar, 25);
            case 26:
                return new l2((f1) this.f2349w, (Context) this.f2352z, (String) this.f2351y, (Parcelable) this.f2350x, cVar, 26);
            case 27:
                return new l2((a1) this.f2350x, (kotlin.jvm.internal.y) this.f2351y, (a1) this.f2352z, cVar, 27);
            case 28:
                l2 l2Var16 = new l2((v7.d) this.f2351y, (kotlin.jvm.internal.y) this.f2352z, cVar, 28);
                l2Var16.f2349w = obj;
                return l2Var16;
            default:
                return new l2((df.a) this.f2349w, (e1) this.f2350x, (e1) this.f2351y, (e1) this.f2352z, cVar, 29);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2347u) {
            case 0:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((l2) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                ((l2) create((sf.h) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 10:
                ((l2) create((u0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 11:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 12:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 14:
                return ((l2) create(new rf.o(((rf.o) obj).f24813a), (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((l2) create((sf.g0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 16:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 17:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 18:
                l2 l2Var = (l2) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                l2Var.invokeSuspend(zVar);
                return zVar;
            case 19:
                return ((l2) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 20:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case gl.zzm /* 21 */:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 22:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 23:
                ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 24:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 25:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 26:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 27:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 28:
                return ((l2) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((l2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:285|(1:286)|(1:(1:(2:290|(3:(1:(1:294)(2:297|298))(1:299)|295|296)(6:300|301|302|(1:304)|295|296))(7:308|309|(2:311|(3:313|306|307))|302|(0)|295|296))(3:314|315|316))(3:328|329|(3:331|306|307))|317|318|319|320|321) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02af, code lost:
    
        if (q.e.u(r5, r4) == r0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02d3, code lost:
    
        if (sf.e0.i(r1, r2, r4) == r0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0455, code lost:
    
        if (pf.b0.J((te.g) r5, r6, r4) == r0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0443, code lost:
    
        if (r5 == r0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0611, code lost:
    
        if (pf.b0.J(r3, r5, r4) == r10) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05b6, code lost:
    
        if (r0 == r10) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0614, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0615, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0616, code lost:
    
        r0.printStackTrace();
        ya.he.f31326b = false;
        f0.d();
        r1 = pf.l0.f22767a;
        r1 = uf.n.f27235a;
        r2 = new androidx.lifecycle.q((com.daren.scraply.MainActivity) r4.f2351y, r0, r14, r8);
        r4.f2350x = null;
        r4.f2349w = null;
        r4.f2348v = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0636, code lost:
    
        if (pf.b0.J(r1, r2, r4) != r10) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x06ac, code lost:
    
        if (r3 == r0) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x069a, code lost:
    
        if (r2 == r0) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x07d5, code lost:
    
        if (t1.c(r3, r7, r2, r4) == r5) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0879, code lost:
    
        if (r0 == r3) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x086a, code lost:
    
        if (r1 == r3) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x08d7, code lost:
    
        if (r1 == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x093b, code lost:
    
        if (e1.p(r6, r8, r4) == r3) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0930, code lost:
    
        if (pf.b0.J(r2, r5, r4) == r3) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0136, code lost:
    
        if (r1.b(r3, r4) == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0114, code lost:
    
        if (r1.b(r3, r4) == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (sf.e0.i(r2, r6, r4) == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
    
        if (r1 == r5) goto L76;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0491 A[Catch: all -> 0x04a3, TryCatch #3 {all -> 0x04a3, blocks: (B:207:0x048d, B:209:0x0491, B:211:0x049f, B:213:0x04a5, B:217:0x04aa, B:219:0x04ae), top: B:206:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05ec A[Catch: Exception -> 0x0544, TRY_LEAVE, TryCatch #9 {Exception -> 0x0544, blocks: (B:299:0x053f, B:301:0x0549, B:302:0x05e2, B:304:0x05ec, B:308:0x054e, B:309:0x05ba, B:311:0x05c2, B:315:0x055c, B:317:0x0584, B:329:0x0565), top: B:286:0x0522 }] */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v40, types: [u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [u] */
    /* JADX WARN: Type inference failed for: r2v86, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x02b7 -> B:130:0x0295). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x02d3 -> B:130:0x0295). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 2476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(z3 z3Var, te.c cVar) {
        super(2, cVar);
        this.f2347u = 2;
        this.f2352z = z3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l2(bl0 bl0Var, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f2347u = 5;
        this.f2351y = bl0Var;
        this.f2352z = (ve.i) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l2(df.l lVar, AtomicReference atomicReference, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f2347u = 6;
        this.f2350x = (kotlin.jvm.internal.m) lVar;
        this.f2351y = atomicReference;
        this.f2352z = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, Object obj4, te.c cVar, int i) {
        super(2, cVar);
        this.f2347u = i;
        this.f2349w = obj;
        this.f2350x = obj2;
        this.f2351y = obj3;
        this.f2352z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f2347u = i;
        this.f2350x = obj;
        this.f2351y = obj2;
        this.f2352z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f2347u = i;
        this.f2351y = obj;
        this.f2352z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m3 m3Var, Context context, String str, String str2, te.c cVar) {
        super(2, cVar);
        this.f2347u = 20;
        this.f2350x = m3Var;
        this.f2352z = context;
        this.f2351y = str;
        this.f2349w = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m3 m3Var, Context context, q.d dVar, f1 f1Var, te.c cVar) {
        super(2, cVar);
        this.f2347u = 24;
        this.f2350x = m3Var;
        this.f2352z = context;
        this.f2349w = dVar;
        this.f2351y = f1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m3 m3Var, Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f2347u = i;
        this.f2350x = m3Var;
        this.f2349w = obj;
        this.f2351y = obj2;
        this.f2352z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(f1 f1Var, Context context, String str, Parcelable parcelable, te.c cVar, int i) {
        super(2, cVar);
        this.f2347u = i;
        this.f2349w = f1Var;
        this.f2352z = context;
        this.f2351y = str;
        this.f2350x = parcelable;
    }
}