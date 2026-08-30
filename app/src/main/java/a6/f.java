package a6;
import d.i;
import l.a;
import p.s;
import q.d;
import q.x;
import t.f1;
import t.l;
import v.h;
import v.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.InputEvent;
import androidx.work.CoroutineWorker;
import b2.k1;
import b8.h4;
import b8.k0;
import b8.m1;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.h1;
import com.google.firebase.analytics.FirebaseAnalytics;
import g5.f0;
import g5.o0;
import k0.j1;
import pf.b0;
import q.g1;
import r.u0;
import r0.a1;
import r0.i1;
import r0.n2;
import r0.o1;
import r0.t1;
import r0.w0;
import sf.d0;
import sf.n0;
import u7.m3;
import w7.t9;
import wa.u6;

/* loaded from: classes.dex */
public final class f extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f267u;

    /* renamed from: v, reason: collision with root package name */
    public int f268v;

    /* renamed from: w, reason: collision with root package name */
    public Object f269w;

    /* renamed from: x, reason: collision with root package name */
    public Object f270x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f271y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m3 m3Var, int i, m1 m1Var, h4 h4Var, te.c cVar) {
        super(2, cVar);
        this.f267u = 4;
        this.f269w = m3Var;
        this.f268v = i;
        this.f270x = m1Var;
        this.f271y = h4Var;
    }

    private final Object j(Object obj) {
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return obj;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        te.g gVar = (te.g) this.f269w;
        l5.a aVar = new l5.a((g5.v) this.f270x, (a1.f) this.f271y, null, 0);
        this.f268v = 1;
        Object J = b0.J(gVar, aVar, this);
        ue.a aVar2 = ue.a.f27192u;
        if (J == aVar2) {
            return aVar2;
        }
        return J;
    }

    private final Object k(Object obj) {
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return pe.z.f22715a;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        pf.z zVar = (pf.z) this.f269w;
        d0 d0Var = ((i) this.f270x).f27257a;
        f6.i iVar = new f6.i((n0.a) this.f271y, 3, zVar);
        this.f268v = 1;
        d0Var.getClass();
        d0.k(d0Var, iVar, this);
        return ue.a.f27192u;
    }

    private final Object l(Object obj) {
        g1 g1Var = (g1) this.f270x;
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            o1 o1Var = (o1) this.f269w;
            f6.h J = r0.y.J(new s(g1Var, 0));
            i5.j jVar = new i5.j(1, o1Var, g1Var, (a1) this.f271y);
            this.f268v = 1;
            Object b10 = J.b(jVar, this);
            ue.a aVar = ue.a.f27192u;
            if (b10 == aVar) {
                return aVar;
            }
        }
        return pe.z.f22715a;
    }

    private final Object m(Object obj) {
        a1 a1Var = (a1) this.f271y;
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                this.f268v = 1;
                Object j10 = b0.j(300L, this);
                ue.a aVar = ue.a.f27192u;
                if (j10 == aVar) {
                    return aVar;
                }
            }
            return pe.z.f22715a;
        }
        ((b1.v) this.f269w).clear();
        ((b1.v) this.f270x).clear();
        a1Var.setValue(Boolean.FALSE);
        return pe.z.f22715a;
    }

    private final Object o(Object obj) {
        FirebaseAnalytics firebaseAnalytics;
        Context context = (Context) this.f269w;
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            a1 a1Var = (a1) this.f271y;
            int i10 = q7.f.f23568a;
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                this.f268v = 1;
                Object j10 = b0.j(7000L, this);
                ue.a aVar = ue.a.f27192u;
                if (j10 == aVar) {
                    return aVar;
                }
            }
            return pe.z.f22715a;
        }
        if (((Boolean) q7.b.f23564c.f25140u.getValue()).booleanValue()) {
            context.getClass();
            n0 n0Var = q7.e.f23567a;
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("scraply_notify", 0);
            sharedPreferences.edit().putInt("primer_shown", sharedPreferences.getInt("primer_shown", 0) + 1).putLong("primer_last_at", System.currentTimeMillis()).apply();
            try {
                firebaseAnalytics = FirebaseAnalytics.getInstance(context.getApplicationContext());
            } catch (Exception e) {
                wd0.o("Analytics no disponible: ", e.getMessage(), "NotifyAnalytics");
                firebaseAnalytics = null;
            }
            if (firebaseAnalytics != null) {
                Bundle bundle = new Bundle();
                bundle.putString("outcome", "primer_shown");
                f1 f1Var = firebaseAnalytics.f15587a;
                f1Var.getClass();
                f1Var.e(new h1(f1Var, null, "notif_permission", bundle, false, 2));
            }
            n0 n0Var2 = q7.b.f23563b;
            Boolean bool = Boolean.FALSE;
            n0Var2.getClass();
            n0Var2.k(null, bool);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33 && i11 >= 33 && u6.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                ((i) this.f270x).a("android.permission.POST_NOTIFICATIONS");
            }
        }
        return pe.z.f22715a;
    }

    private final Object p(Object obj) {
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            i iVar = (i) this.f269w;
            h hVar = (h) this.f270x;
            this.f268v = 1;
            Object a10 = iVar.a(hVar, this);
            ue.a aVar = ue.a.f27192u;
            if (a10 == aVar) {
                return aVar;
            }
        }
        pf.n0 n0Var = (pf.n0) this.f271y;
        if (n0Var != null) {
            n0Var.a();
        }
        return pe.z.f22715a;
    }

    private final Object q(Object obj) {
        int i = this.f268v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return pe.z.f22715a;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        pf.z zVar = (pf.z) this.f269w;
        t1 t1Var = (t1) this.f270x;
        w0 w0Var = (w0) this.f271y;
        this.f268v = 1;
        t1Var.b(zVar, w0Var, this);
        return ue.a.f27192u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.b(r1, r7) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (pf.b0.J(r1, r2, r7) == r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f271y
            sf.g r0 = (sf.g) r0
            java.lang.Object r1 = r7.f270x
            te.g r1 = (te.g) r1
            int r2 = r7.f268v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L13
            goto L1a
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L1a:
            pe.a.e(r8)
            goto L4e
        L1e:
            pe.a.e(r8)
            java.lang.Object r8 = r7.f269w
            r0.o1 r8 = (r0.o1) r8
            te.h r2 = te.h.f25707u
            boolean r2 = kotlin.jvm.internal.a(r1, r2)
            ue.a r5 = ue.a.f27192u
            if (r2 == 0) goto L3e
            r0.l2 r1 = new r0.l2
            r2 = 0
            r1.<init>(r8, r2)
            r7.f268v = r4
            java.lang.Object r8 = r0.b(r1, r7)
            if (r8 != r5) goto L4e
            goto L4d
        L3e:
            l5.a r2 = new l5.a
            r4 = 0
            r6 = 5
            r2.<init>(r0, r8, r4, r6)
            r7.f268v = r3
            java.lang.Object r8 = pf.b0.J(r1, r2, r7)
            if (r8 != r5) goto L4e
        L4d:
            return r5
        L4e:
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        i1 i1Var = ((l) this.f270x).f25448d;
        int i = this.f268v;
        try {
            if (i != 0) {
                if (i == 1) {
                    pe.a.e(obj);
                } else {
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                pe.a.e(obj);
                f1 f1Var = (f1) this.f269w;
                i1Var.setValue(Boolean.TRUE);
                df.p pVar = (df.p) this.f271y;
                this.f268v = 1;
                Object invoke = pVar.invoke(f1Var, this);
                ue.a aVar = ue.a.f27192u;
                if (invoke == aVar) {
                    return aVar;
                }
            }
            i1Var.setValue(Boolean.FALSE);
            return pe.z.f22715a;
        } catch (Throwable th) {
            i1Var.setValue(Boolean.FALSE);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [df.p, ve.i] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f267u) {
            case 0:
                return new f((k) this.f270x, (CoroutineWorker) this.f271y, cVar, 0);
            case 1:
                return new f((b5.b) this.f269w, (Uri) this.f270x, (InputEvent) this.f271y, cVar, 1);
            case 2:
                f fVar = new f((k0) this.f270x, (Context) this.f271y, cVar, 2);
                fVar.f269w = obj;
                return fVar;
            case 3:
                return new f((m3) this.f269w, (Integer) this.f270x, this.f268v, (m1) this.f271y, cVar);
            case 4:
                return new f((m3) this.f269w, this.f268v, (m1) this.f270x, (h4) this.f271y, cVar);
            case 5:
                return new f((df.p) this.f269w, (c0.d) this.f270x, (a1) this.f271y, cVar, 5);
            case 6:
                f fVar2 = new f((String) this.f271y, cVar, 6);
                fVar2.f270x = obj;
                return fVar2;
            case 7:
                return new f((Context) this.f269w, (t9) this.f270x, (a1) this.f271y, cVar, 7);
            case 8:
                return new f((d) this.f269w, (a1) this.f270x, (a1) this.f271y, cVar, 8);
            case 9:
                return new f((b8.u6) this.f269w, (a1) this.f270x, (a1) this.f271y, cVar, 9);
            case 10:
                return new f((rf.h) this.f271y, cVar, 10);
            case 11:
                return new f((d0.f) this.f269w, (k1) this.f270x, (a0.o) this.f271y, cVar, 11);
            case 12:
                return new f((c7.n) this.f269w, (j6.p) this.f270x, (f6.e) this.f271y, cVar, 12);
            case 13:
                return new f((a1) this.f270x, (j1) this.f271y, cVar, 13);
            case 14:
                f fVar3 = new f((o0) this.f271y, cVar, 14);
                fVar3.f270x = obj;
                return fVar3;
            case 15:
                return new f((h8.f) this.f269w, (Long) this.f270x, (df.l) this.f271y, cVar, 15);
            case 16:
                return new f((kotlin.jvm.internal.y) this.f270x, (i5.v) this.f271y, cVar, 16);
            case 17:
                f fVar4 = new f((pf.q) this.f270x, (df.p) this.f271y, cVar);
                fVar4.f269w = obj;
                return fVar4;
            case 18:
                f fVar5 = new f((n2) this.f270x, (d) this.f271y, cVar, 18);
                fVar5.f269w = obj;
                return fVar5;
            case 19:
                return new f((j1) this.f271y, cVar, 19);
            case 20:
                return new f((te.g) this.f269w, (g5.v) this.f270x, (a1.f) this.f271y, cVar, 20);
            case gl.zzm /* 21 */:
                f fVar6 = new f((i) this.f270x, (n0.a) this.f271y, cVar, 21);
                fVar6.f269w = obj;
                return fVar6;
            case 22:
                f fVar7 = new f((g1) this.f270x, (a1) this.f271y, cVar, 22);
                fVar7.f269w = obj;
                return fVar7;
            case 23:
                return new f((b1.v) this.f269w, (b1.v) this.f270x, (a1) this.f271y, cVar, 23);
            case 24:
                return new f((Context) this.f269w, (i) this.f270x, (a1) this.f271y, cVar, 24);
            case 25:
                return new f((i) this.f269w, (h) this.f270x, (pf.n0) this.f271y, cVar, 25);
            case 26:
                f fVar8 = new f((t1) this.f270x, (w0) this.f271y, cVar, 26);
                fVar8.f269w = obj;
                return fVar8;
            case 27:
                f fVar9 = new f((te.g) this.f270x, (sf.g) this.f271y, cVar, 27);
                fVar9.f269w = obj;
                return fVar9;
            case 28:
                f fVar10 = new f((l) this.f270x, (df.p) this.f271y, cVar, 28);
                fVar10.f269w = obj;
                return fVar10;
            default:
                return new f((l) this.f269w, (u0) this.f270x, (df.p) this.f271y, cVar, 29);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f267u) {
            case 0:
                f fVar = (f) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                fVar.invokeSuspend(zVar);
                return zVar;
            case 1:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((f) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 10:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 11:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 12:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 14:
                return ((f) create((f0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 16:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 17:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 18:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 19:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 20:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case gl.zzm /* 21 */:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 22:
                return ((f) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 23:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 24:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 25:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 26:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 27:
                return ((f) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 28:
                return ((f) create((f1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((f) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x0470, code lost:
    
        if (r5 != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x040e, code lost:
    
        if (r6 == r2) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x066d, code lost:
    
        if (r2 == r3) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x07d6, code lost:
    
        if (d.c(r0, r2, r4, r28) == r3) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x07bc, code lost:
    
        if (r0.y.u(getContext()).R(r2, r28) == r3) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x07fa, code lost:
    
        if (d.c(r0, r4, r5, r28) == r3) goto L426;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06b9 A[Catch: all -> 0x068c, TryCatch #8 {all -> 0x068c, blocks: (B:377:0x0686, B:379:0x06b1, B:381:0x06b9, B:382:0x06c7, B:390:0x06d8, B:392:0x06a2, B:396:0x06db, B:400:0x06e0, B:401:0x06e1, B:408:0x069d, B:384:0x06c8, B:386:0x06ce), top: B:372:0x0679, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Type inference failed for: r3v45, types: [rf.l] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v98, types: [df.p, ve.i] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, r0.o1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x06ad -> B:349:0x06b1). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f267u = i;
        this.f270x = obj;
        this.f271y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f267u = i;
        this.f271y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(pf.q qVar, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f267u = 17;
        this.f270x = qVar;
        this.f271y = (ve.i) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f267u = i;
        this.f269w = obj;
        this.f270x = obj2;
        this.f271y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m3 m3Var, Integer num, int i, m1 m1Var, te.c cVar) {
        super(2, cVar);
        this.f267u = 3;
        this.f269w = m3Var;
        this.f270x = num;
        this.f268v = i;
        this.f271y = m1Var;
    }
}
