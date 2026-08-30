package b8;
import b0.j;
import b1.h;
import b1.y;
import b8.a1;
import c2.u0;
import d.c;
import d0.b;
import g0.e1;
import g0.g2;
import i0.n;
import k0.j1;
import r0.f1;
import r0.o1;
import r0.t1;
import r0.u1;
import r0.w0;
import r2.q;
import r2.x;
import r7.f;
import t.c1;
import t.d;
import t.i;
import t.m2;
import t.x1;
import u7.k6;
import u7.m3;
import v1.w;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends ve.i implements df.p {
    public Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1813u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1814v;

    /* renamed from: w, reason: collision with root package name */
    public Object f1815w;

    /* renamed from: x, reason: collision with root package name */
    public int f1816x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1817y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1818z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(w wVar, df.q qVar, df.l lVar, c1 c1Var, te.c cVar) {
        super(2, cVar);
        this.f1813u = 10;
        this.f1814v = wVar;
        this.f1815w = (ve.i) qVar;
        this.f1818z = (kotlin.jvm.internal.m) lVar;
        this.A = c1Var;
    }

    private final Object j(Object obj) {
        Context context = (Context) this.f1814v;
        r0.a1 a1Var = (r0.a1) this.f1817y;
        int i = this.f1816x;
        pe.z zVar = pe.z.f22715a;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            r0.a1 a1Var2 = (r0.a1) this.f1815w;
            float f10 = k6.f26414a;
            if (((f) a1Var2.getValue()) == f.READY && !((Boolean) ((r0.a1) this.f1818z).getValue()).booleanValue() && !((Boolean) ((r0.a1) this.A).getValue()).booleanValue() && !((Boolean) a1Var.getValue()).booleanValue() && !ia.e()) {
                sf.n0 n0Var = h.f24629a;
                context.getClass();
                if (!((Boolean) h.f24634g.getValue()).booleanValue()) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_tips", 0);
                    if (!sharedPreferences.getBoolean("bubble_off", false) && sharedPreferences.getInt("launches", 0) >= 3 && sharedPreferences.getInt("bubble_shows", 0) < 4) {
                        if (System.currentTimeMillis() - sharedPreferences.getLong("bubble_last_at", 0L) >= 432000000) {
                            this.f1816x = 1;
                            Object j10 = pf.j(1800L, this);
                            ue.a aVar = ue.a.f27192u;
                            if (j10 == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
            }
            return zVar;
        }
        float f11 = k6.f26414a;
        a1Var.setValue(Boolean.TRUE);
        sf.n0 n0Var2 = h.f24629a;
        context.getClass();
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("scraply_tips", 0);
        sharedPreferences2.edit().putInt("bubble_shows", sharedPreferences2.getInt("bubble_shows", 0) + 1).putLong("bubble_last_at", System.currentTimeMillis()).apply();
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0110 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:9:0x00e5, B:12:0x0110, B:14:0x0116, B:16:0x011e, B:18:0x0126, B:20:0x012c, B:24:0x0136, B:26:0x0145, B:28:0x0156, B:34:0x015f, B:46:0x0030, B:47:0x010a, B:49:0x003d, B:50:0x0082, B:52:0x004c, B:55:0x0058, B:57:0x005e, B:59:0x0064, B:64:0x0089, B:66:0x008f, B:67:0x0095, B:69:0x009b, B:71:0x00aa, B:74:0x00cd, B:76:0x00d1, B:80:0x00e8, B:81:0x00b4, B:82:0x00b8, B:84:0x00be, B:90:0x00ed), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0126 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:9:0x00e5, B:12:0x0110, B:14:0x0116, B:16:0x011e, B:18:0x0126, B:20:0x012c, B:24:0x0136, B:26:0x0145, B:28:0x0156, B:34:0x015f, B:46:0x0030, B:47:0x010a, B:49:0x003d, B:50:0x0082, B:52:0x004c, B:55:0x0058, B:57:0x005e, B:59:0x0064, B:64:0x0089, B:66:0x008f, B:67:0x0095, B:69:0x009b, B:71:0x00aa, B:74:0x00cd, B:76:0x00d1, B:80:0x00e8, B:81:0x00b4, B:82:0x00b8, B:84:0x00be, B:90:0x00ed), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:9:0x00e5, B:12:0x0110, B:14:0x0116, B:16:0x011e, B:18:0x0126, B:20:0x012c, B:24:0x0136, B:26:0x0145, B:28:0x0156, B:34:0x015f, B:46:0x0030, B:47:0x010a, B:49:0x003d, B:50:0x0082, B:52:0x004c, B:55:0x0058, B:57:0x005e, B:59:0x0064, B:64:0x0089, B:66:0x008f, B:67:0x0095, B:69:0x009b, B:71:0x00aa, B:74:0x00cd, B:76:0x00d1, B:80:0x00e8, B:81:0x00b4, B:82:0x00b8, B:84:0x00be, B:90:0x00ed), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015f A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:9:0x00e5, B:12:0x0110, B:14:0x0116, B:16:0x011e, B:18:0x0126, B:20:0x012c, B:24:0x0136, B:26:0x0145, B:28:0x0156, B:34:0x015f, B:46:0x0030, B:47:0x010a, B:49:0x003d, B:50:0x0082, B:52:0x004c, B:55:0x0058, B:57:0x005e, B:59:0x0064, B:64:0x0089, B:66:0x008f, B:67:0x0095, B:69:0x009b, B:71:0x00aa, B:74:0x00cd, B:76:0x00d1, B:80:0x00e8, B:81:0x00b4, B:82:0x00b8, B:84:0x00be, B:90:0x00ed), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a1.k(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [df.q, ve.i] */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlin.jvm.internal.m, df.l] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1813u) {
            case 0:
                a1 a1Var = new a1((String) this.f1815w, (d1) this.A, cVar);
                a1Var.f1817y = obj;
                return a1Var;
            case 1:
                a1 a1Var2 = new a1((d1) this.f1818z, cVar);
                a1Var2.f1817y = obj;
                return a1Var2;
            case 2:
                return new a1((Context) this.f1814v, (w7.t9) this.f1815w, (w7.s9) this.f1818z, (r0.a1) this.A, (r0.a1) this.f1817y, cVar, 2);
            case 3:
                return new a1((u6) this.f1815w, (Context) this.f1818z, (r0.a1) this.A, (r0.a1) this.f1817y, cVar);
            case 4:
                return new a1((Context) this.f1817y, (String) this.f1815w, cVar);
            case 5:
                return new a1((e1) this.f1814v, (r0.a1) this.f1815w, (y) this.f1818z, (j1) this.A, (j) this.f1817y, cVar, 5);
            case 6:
                return new a1((b) this.f1814v, (x) this.f1815w, (e1) this.f1818z, (g2) this.A, (q) this.f1817y, cVar, 6);
            case 7:
                a1 a1Var3 = new a1((u0) this.f1814v, (df.l) this.f1815w, (c) this.f1818z, (n) this.A, cVar, 7);
                a1Var3.f1817y = obj;
                return a1Var3;
            case 8:
                a1 a1Var4 = new a1((u1) this.f1815w, (t1) this.f1818z, (w0) this.A, cVar);
                a1Var4.f1817y = obj;
                return a1Var4;
            case 9:
                a1 a1Var5 = new a1((m2) this.f1814v, (i) this.f1815w, (d) this.f1818z, (pf.d1) this.A, cVar, 9);
                a1Var5.f1817y = obj;
                return a1Var5;
            case 10:
                a1 a1Var6 = new a1((w) this.f1814v, (df.q) this.f1815w, (df.l) this.f1818z, (c1) this.A, cVar);
                a1Var6.f1817y = obj;
                return a1Var6;
            case 11:
                a1 a1Var7 = new a1((Context) this.f1818z, (String) this.f1814v, (w7.a8) this.A, cVar);
                a1Var7.f1817y = obj;
                return a1Var7;
            case 12:
                return new a1((m3) this.f1818z, (String) this.f1815w, (Context) this.A, (df.l) this.f1817y, cVar);
            case 13:
                return new a1((q.d) this.f1814v, (q.d) this.f1815w, (m3) this.f1818z, (Context) this.A, (f1) this.f1817y, cVar, 13);
            case 14:
                return new a1((List) this.f1814v, (o1) this.f1815w, (q.d) this.f1818z, (m3) this.A, (Context) this.f1817y, cVar, 14);
            case 15:
                return new a1((q.d) this.f1815w, (y) this.f1818z, (String) this.f1814v, (q.d) this.A, (y) this.f1817y, cVar);
            case 16:
                return new a1((Context) this.f1814v, (r0.a1) this.f1815w, (r0.a1) this.f1818z, (r0.a1) this.A, (r0.a1) this.f1817y, cVar, 16);
            case 17:
                a1 a1Var8 = new a1((w7.t9) this.f1818z, (Context) this.A, cVar, 17);
                a1Var8.f1817y = obj;
                return a1Var8;
            default:
                a1 a1Var9 = new a1((List) this.f1818z, (ArrayList) this.A, cVar, 18);
                a1Var9.f1815w = obj;
                return a1Var9;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1813u) {
            case 0:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 8:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                return ((a1) create((x1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 10:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 11:
                return ((a1) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 12:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 14:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 16:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 17:
                return ((a1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((a1) create(obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ce, code lost:
    
        if (q.c(r1, r8, r11, r17) == r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023a, code lost:
    
        if (r1 == r11) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0785, code lost:
    
        if (r1 == r0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x074e, code lost:
    
        if (r1 == r0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        if (r2 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0202, code lost:
    
        if (q.c(r0, r1, r2, r17) == r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0436 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v7, types: [df.q, ve.i] */
    /* JADX WARN: Type inference failed for: r14v4, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r1v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44, types: [h] */
    /* JADX WARN: Type inference failed for: r1v62, types: [h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v34, types: [yf.a] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, pf.d1] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r8v0, types: [te.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, String str, w7.a8 a8Var, te.c cVar) {
        super(2, cVar);
        this.f1813u = 11;
        this.f1818z = context;
        this.f1814v = str;
        this.A = a8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(d1 d1Var, te.c cVar) {
        super(2, cVar);
        this.f1813u = 1;
        this.f1818z = d1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u6 u6Var, Context context, r0.a1 a1Var, r0.a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f1813u = 3;
        this.f1815w = u6Var;
        this.f1818z = context;
        this.A = a1Var;
        this.f1817y = a1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, te.c cVar, int i) {
        super(2, cVar);
        this.f1813u = i;
        this.f1814v = obj;
        this.f1815w = obj2;
        this.f1818z = obj3;
        this.A = obj4;
        this.f1817y = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, Object obj4, te.c cVar, int i) {
        super(2, cVar);
        this.f1813u = i;
        this.f1814v = obj;
        this.f1815w = obj2;
        this.f1818z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f1813u = i;
        this.f1818z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(String str, d1 d1Var, te.c cVar) {
        super(2, cVar);
        this.f1813u = 0;
        this.f1815w = str;
        this.A = d1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(q.d dVar, y yVar, String str, q.d dVar2, y yVar2, te.c cVar) {
        super(2, cVar);
        this.f1813u = 15;
        this.f1815w = dVar;
        this.f1818z = yVar;
        this.f1814v = str;
        this.A = dVar2;
        this.f1817y = yVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u1 u1Var, t1 t1Var, w0 w0Var, te.c cVar) {
        super(2, cVar);
        this.f1813u = 8;
        this.f1815w = u1Var;
        this.f1818z = t1Var;
        this.A = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(m3 m3Var, String str, Context context, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f1813u = 12;
        this.f1818z = m3Var;
        this.f1815w = str;
        this.A = context;
        this.f1817y = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, String str, te.c cVar) {
        super(2, cVar);
        this.f1813u = 4;
        this.f1817y = context;
        this.f1815w = str;
    }
}
