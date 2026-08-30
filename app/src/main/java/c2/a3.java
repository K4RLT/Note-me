package c2;
import p.w;
import x.o;
import c.p;
import c2.a3;
import c2.e2;
import i0.m;
import q.x;
import r0.e1;

/* loaded from: classes.dex */
public final class a3 implements sf.h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3465u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3466v;

    public /* synthetic */ a3(int i, Object obj) {
        this.f3465u = i;
        this.f3466v = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    @Override // sf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r5, te.c r6) {
        /*
            r4 = this;
            int r0 = r4.f3465u
            switch(r0) {
                case 0: goto Laf;
                case 1: goto La3;
                case 2: goto L89;
                case 3: goto L41;
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            vd.m r5 = (vd.m) r5
            java.lang.Object r6 = r4.f3466v
            vd.z r6 = (vd.z) r6
            java.util.concurrent.atomic.AtomicReference r6 = r6.f27652c
            r6.set(r5)
            pe.z r5 = pe.z.f22715a
            return r5
        L13:
            pe.j r5 = (pe.j) r5
            java.lang.Object r6 = r5.f22693u
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.f22694v
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r0 = r4.f3466v
            u7.o1 r0 = (u7.o1) r0
            android.content.SharedPreferences r0 = r0.f26647a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "last_carousel"
            android.content.SharedPreferences$Editor r6 = r0.putInt(r1, r6)
            java.lang.String r0 = "last_stack"
            android.content.SharedPreferences$Editor r5 = r6.putInt(r0, r5)
            r5.apply()
            pe.z r5 = pe.z.f22715a
            return r5
        L41:
            boolean r0 = r6 instanceof sf.j
            if (r0 == 0) goto L54
            r0 = r6
            sf.j r0 = (sf.j) r0
            int r1 = r0.f25186w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L54
            int r1 = r1 - r2
            r0.f25186w = r1
            goto L59
        L54:
            sf.j r0 = new sf.j
            r0.<init>(r4, r6)
        L59:
            java.lang.Object r6 = r0.f25184u
            int r1 = r0.f25186w
            r2 = 1
            if (r1 == 0) goto L6d
            if (r1 != r2) goto L66
            pe.a.e(r6)
            goto L86
        L66:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            goto L88
        L6d:
            pe.a.e(r6)
            java.lang.Object r6 = r4.f3466v
            rf.t r6 = (rf.t) r6
            if (r5 != 0) goto L78
            c4.s r5 = tf.c.f25716b
        L78:
            r0.f25186w = r2
            rf.h r6 = r6.f24819x
            java.lang.Object r5 = r6.a(r5, r0)
            ue.a r6 = ue.a.f27192u
            if (r5 != r6) goto L86
            r5 = r6
            goto L88
        L86:
            pe.z r5 = pe.z.f22715a
        L88:
            return r5
        L89:
            pe.z r5 = (pe.z) r5
            java.lang.Object r5 = r4.f3466v
            m r5 = (m) r5
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r6 < r0) goto La0
            android.view.inputmethod.InputMethodManager r6 = r5.i()
            java.lang.Object r5 = r5.f18055w
            android.view.View r5 = (android.view.View) r5
            p.w(r6, r5)
        La0:
            pe.z r5 = pe.z.f22715a
            return r5
        La3:
            h8.e r5 = (h8.e) r5
            java.lang.Object r6 = r4.f3466v
            df.l r6 = (df.l) r6
            r6.invoke(r5)
            pe.z r5 = pe.z.f22715a
            return r5
        Laf:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Object r6 = r4.f3466v
            e2 r6 = (e2) r6
            e1 r6 = r6.f3512u
            r6.i(r5)
            pe.z r5 = pe.z.f22715a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a3.e(java.lang.Object, te.c):java.lang.Object");
    }
}
