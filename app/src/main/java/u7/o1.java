package u7;
import d.c;
import q.d;
import q.e;
import q.r0;
import q.x;
import r0.i1;
import r0.y;
import r7.a;
import r7.b;
import u7.g1;
import u7.h1;
import u7.j1;
import u7.n1;
import u7.o1;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wa.b9;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f26647a;

    /* renamed from: b, reason: collision with root package name */
    public final d f26648b;

    /* renamed from: c, reason: collision with root package name */
    public final d f26649c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f26650d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f26651f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f26652g;

    /* renamed from: h, reason: collision with root package name */
    public float f26653h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26654j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f26655k;

    /* renamed from: l, reason: collision with root package name */
    public List f26656l;

    /* renamed from: m, reason: collision with root package name */
    public List f26657m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26658n;

    /* renamed from: o, reason: collision with root package name */
    public final i1 f26659o;

    /* renamed from: p, reason: collision with root package name */
    public final d f26660p;

    /* renamed from: q, reason: collision with root package name */
    public final d f26661q;

    public o1(SharedPreferences sharedPreferences, d dVar, d dVar2) {
        boolean z3;
        float f10;
        dVar.getClass();
        dVar2.getClass();
        this.f26647a = sharedPreferences;
        this.f26648b = dVar;
        this.f26649c = dVar2;
        this.f26650d = y.B(g1.f26211f);
        int i = sharedPreferences.getInt("open_stack", 0);
        this.e = y.B(Integer.valueOf(i < 0 ? 0 : i));
        this.f26651f = new HashMap();
        this.f26652g = new float[0];
        this.f26655k = y.B(Boolean.FALSE);
        this.f26657m = qe.s.f24023u;
        sf.n0 n0Var = b.f24611a;
        a aVar = a.NOTEBOOK_STACKS;
        aVar.getClass();
        boolean contains = b.f24613c.contains(aVar);
        this.f26658n = !contains;
        if (!contains && sharedPreferences.getBoolean("stack_view", false)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f26659o = y.B(Boolean.valueOf(z3));
        if (!contains && sharedPreferences.getBoolean("stack_view", false)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f26660p = e.a(f10);
        this.f26661q = e.a(sharedPreferences.getInt("last_stack", 0) >= 0 ? r3 : 0);
    }

    public final float a(float f10) {
        int c10 = i().c(k()) - 1;
        if (c10 < 0) {
            c10 = 0;
        }
        return b9.d(f10, 0.0f, c10);
    }

    public final int b(int i) {
        int c10 = i().c(k()) - 1;
        if (c10 < 0) {
            c10 = 0;
        }
        return b9.e(i, 0, c10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r8.f26661q.g(r1, r0) == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, ve.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof h1
            if (r0 == 0) goto L13
            r0 = r10
            h1 r0 = (h1) r0
            int r1 = r0.f26265x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26265x = r1
            goto L18
        L13:
            h1 r0 = new h1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f26263v
            int r1 = r0.f26265x
            r2 = 0
            pe.z r3 = pe.z.f22715a
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            pe.a.e(r10)
            return r3
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            return r2
        L33:
            int r9 = r0.f26262u
            pe.a.e(r10)
            goto L71
        L39:
            pe.a.e(r10)
            boolean r10 = r8.f26658n
            if (r10 != 0) goto L41
            goto L8f
        L41:
            sf.n0 r10 = b.f24611a
            a r10 = a.NOTEBOOK_STACKS
            r10.getClass()
            r8.q(r5)
            android.content.SharedPreferences r10 = r8.f26647a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r1 = "stack_view"
            android.content.SharedPreferences$Editor r10 = r10.putBoolean(r1, r5)
            r10.apply()
            int r10 = r8.k()
            float r10 = (float) r10
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r10)
            r0.f26262u = r9
            r0.f26265x = r5
            d r10 = r8.f26661q
            java.lang.Object r10 = r10.g(r1, r0)
            if (r10 != r6) goto L71
            goto L8e
        L71:
            java.lang.Float r10 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r1)
            r1 = 1128792064(0x43480000, float:200.0)
            r5 = 4
            r7 = 1060655596(0x3f3851ec, float:0.72)
            r0 r1 = e.r(r7, r1, r2, r5)
            r0.f26262u = r9
            r0.f26265x = r4
            d r9 = r8.f26660p
            java.lang.Object r9 = d.c(r9, r10, r1, r0)
            if (r9 != r6) goto L8f
        L8e:
            return r6
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o1.c(int, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        if (d.c(r16.f26660p, r2, r8, r3) != r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r16.f26648b.g(r2, r3) == r13) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r17, int r18, ve.c r19) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o1.d(int, int, ve.c):java.lang.Object");
    }

    public final int e() {
        int b10 = ff.a.b(((Number) this.f26661q.e()).floatValue());
        int size = i().f26212a.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return b9.e(b10, 0, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r8.f26661q.g(r1, r0) == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ve.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof j1
            if (r0 == 0) goto L13
            r0 = r9
            j1 r0 = (j1) r0
            int r1 = r0.f26357w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26357w = r1
            goto L18
        L13:
            j1 r0 = new j1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f26355u
            int r1 = r0.f26357w
            pe.z r2 = pe.z.f22715a
            r3 = 2
            r4 = 1
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            pe.a.e(r9)
            return r2
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L33:
            pe.a.e(r9)
            goto L6c
        L37:
            pe.a.e(r9)
            boolean r9 = r8.f26658n
            if (r9 == 0) goto L89
            boolean r9 = r8.m()
            if (r9 == 0) goto L45
            goto L89
        L45:
            r8.q(r4)
            android.content.SharedPreferences r9 = r8.f26647a
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r1 = "stack_view"
            android.content.SharedPreferences$Editor r9 = r9.putBoolean(r1, r4)
            r9.apply()
            int r9 = r8.k()
            float r9 = (float) r9
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r9)
            r0.f26357w = r4
            d r9 = r8.f26661q
            java.lang.Object r9 = r9.g(r1, r0)
            if (r9 != r5) goto L6c
            goto L88
        L6c:
            java.lang.Float r9 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r1)
            r1 = 1128792064(0x43480000, float:200.0)
            r4 = 4
            r6 = 1060655596(0x3f3851ec, float:0.72)
            r7 = 0
            r0 r1 = e.r(r6, r1, r7, r4)
            r0.f26357w = r3
            d r3 = r8.f26660p
            java.lang.Object r9 = d.c(r3, r9, r1, r0)
            if (r9 != r5) goto L89
        L88:
            return r5
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o1.f(ve.c):java.lang.Object");
    }

    public final d g() {
        return this.f26660p;
    }

    public final boolean h() {
        return this.f26658n;
    }

    public final g1 i() {
        return (g1) this.f26650d.getValue();
    }

    public final float j() {
        return this.f26653h;
    }

    public final int k() {
        return ((Number) this.e.getValue()).intValue();
    }

    public final boolean l() {
        return ((Boolean) this.f26655k.getValue()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) this.f26659o.getValue()).booleanValue();
    }

    public final float n(int i) {
        if (i >= 0) {
            float[] fArr = this.f26652g;
            if (i < fArr.length) {
                return fArr[i];
            }
        }
        return i;
    }

    public final void o(int i) {
        if (i < 0) {
            i = 0;
        }
        this.e.setValue(Integer.valueOf(i));
        SharedPreferences.Editor putInt = this.f26647a.edit().putInt("open_stack", k());
        String a10 = i().a(k());
        if (a10 == null || a10.length() <= 0) {
            a10 = null;
        }
        putInt.putString("open_stack_id", a10).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        if (d.c(r8.f26660p, r1, r3, r0) != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r8.f26648b.g(r5, r0) == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(int r9, ve.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof n1
            if (r0 == 0) goto L13
            r0 = r10
            n1 r0 = (n1) r0
            int r1 = r0.f26594y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26594y = r1
            goto L18
        L13:
            n1 r0 = new n1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f26592w
            int r1 = r0.f26594y
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2b
            pe.a.e(r10)
            goto Lc1
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L32:
            int r9 = r0.f26591v
            int r1 = r0.f26590u
            pe.a.e(r10)
            r10 = r9
            r9 = r1
            goto La1
        L3c:
            pe.a.e(r10)
            if (r9 >= 0) goto L44
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L44:
            g1 r10 = r8.i()
            int r10 = r10.d(r9)
            g1 r1 = r8.i()
            int r1 = r1.c(r10)
            if (r1 != 0) goto L59
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L59:
            boolean r1 = r8.m()
            if (r1 != 0) goto L68
            int r1 = r8.k()
            if (r10 != r1) goto L68
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L68:
            boolean r1 = r8.m()
            if (r1 == 0) goto L81
            r1 = 0
            r8.q(r1)
            android.content.SharedPreferences r5 = r8.f26647a
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r6 = "stack_view"
            android.content.SharedPreferences$Editor r1 = r5.putBoolean(r6, r1)
            r1.apply()
        L81:
            r8.o(r10)
            g1 r1 = r8.i()
            int r1 = r1.b(r9)
            float r1 = (float) r1
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r0.f26590u = r9
            r0.f26591v = r10
            r0.f26594y = r3
            d r1 = r8.f26648b
            java.lang.Object r1 = r1.g(r5, r0)
            if (r1 != r4) goto La1
            goto Lc0
        La1:
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            r3 = 1128792064(0x43480000, float:200.0)
            r5 = 4
            r6 = 1060655596(0x3f3851ec, float:0.72)
            r7 = 0
            r0 r3 = e.r(r6, r3, r7, r5)
            r0.f26590u = r9
            r0.f26591v = r10
            r0.f26594y = r2
            d r9 = r8.f26660p
            java.lang.Object r9 = d.c(r9, r1, r3, r0)
            if (r9 != r4) goto Lc1
        Lc0:
            return r4
        Lc1:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o1.p(int, ve.c):java.lang.Object");
    }

    public final void q(boolean z3) {
        this.f26659o.setValue(Boolean.valueOf(z3));
    }

    public final void r(float f10) {
        HashMap hashMap;
        float f11;
        int size = i().f26212a.size();
        if (this.f26652g.length != size) {
            float[] fArr = new float[size];
            for (int i = 0; i < size; i++) {
                fArr[i] = i;
            }
            this.f26652g = fArr;
        }
        float exp = 1.0f - ((float) Math.exp((-b9.d(f10, 1.0f, 64.0f)) / 70.0f));
        float f12 = 0.0f;
        int i10 = 0;
        while (true) {
            String str = "";
            hashMap = this.f26651f;
            if (i10 >= size) {
                break;
            }
            String a10 = i().a(i10);
            if (a10 != null) {
                str = a10;
            }
            float f13 = i10;
            Float f14 = (Float) hashMap.get(str);
            if (f14 == null || Math.abs(f13 - f14.floatValue()) < 0.002f) {
                f11 = f13;
            } else {
                f11 = ((f13 - f14.floatValue()) * exp) + f14.floatValue();
            }
            hashMap.put(str, Float.valueOf(f11));
            this.f26652g[i10] = f11;
            f12 += Math.abs(f13 - f11);
            i10++;
        }
        if (hashMap.size() > size) {
            Set keySet = hashMap.keySet();
            jf.d i11 = b9.i(0, size);
            HashSet hashSet = new HashSet();
            Iterator it = i11.iterator();
            while (true) {
                jf.c cVar = (jf.c) it;
                if (!cVar.f19194w) {
                    break;
                }
                String a11 = i().a(cVar.nextInt());
                if (a11 == null) {
                    a11 = "";
                }
                hashSet.add(a11);
            }
            keySet.retainAll(hashSet);
        }
        this.f26653h = f12;
    }
}
