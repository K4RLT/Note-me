package jb;
import a.a;
import f.b;

import android.content.Context;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import j.i0;
import j.m0;
import n8.l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Context f19108a;

    public f(Context context, int i) {
        switch (i) {
            case 2:
                this.f19108a = context.getApplicationContext();
                return;
            default:
                this.f19108a = context;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [n8.j, java.lang.Object] */
    public n8.j a() {
        Context context = this.f19108a;
        if (context != null) {
            Object obj = new Object();
            obj.f21184u = p8.a(l.f21192a);
            p8.c cVar = new p8.c(context);
            obj.f21185v = cVar;
            obj.f21186w = p8.a(new e4(18, cVar, new k6.i(14, cVar), false));
            p8.c cVar2 = obj.f21185v;
            int i = 3;
            obj.f21187x = new u.c(i, cVar2);
            oe.a a10 = p8.a(new j6.e(obj.f21187x, p8.a(new t.a(i, cVar2))));
            obj.f21188y = a10;
            Object obj2 = new Object();
            p8.c cVar3 = obj.f21185v;
            i0 i0Var = new i0(19, cVar3, a10, obj2);
            oe.a aVar = obj.f21184u;
            oe.a aVar2 = obj.f21186w;
            obj.f21189z = p8.a(new i0(10, new u0(aVar, aVar2, i0Var, a10, a10, 12), new m0(cVar3, aVar2, a10, i0Var, aVar, a10, a10), new j6.i(aVar, a10, i0Var, a10)));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface b(q2.z r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f19108a
            boolean r1 = r9 instanceof q2.z
            r6 = 0
            if (r1 == 0) goto Lcd
            int r1 = r9.f23374a
            java.lang.ThreadLocal r2 = i3.j.f18193a
            boolean r2 = r0.isRestricted()
            if (r2 == 0) goto L13
            r1 = r6
            goto L1f
        L13:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r4 = 0
            r5 = 0
            r3 = 0
            android.graphics.Typeface r1 = i3.a(r0, r1, r2, r3, r4, r5)
        L1f:
            r1.getClass()
            q2.r r9 = r9.f23376c
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L38
            java.lang.ThreadLocal r3 = q2.b0.f23330a
            if (r1 != 0) goto L30
            goto Lcd
        L30:
            java.util.ArrayList r9 = r9.f23363a
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L3b
        L38:
            r6 = r1
            goto Lcd
        L3b:
            java.lang.ThreadLocal r3 = q2.b0.f23330a
            java.lang.Object r4 = r3.get()
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            if (r4 != 0) goto L4d
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.set(r4)
        L4d:
            lb.q.p(r4)
            r4.setTypeface(r1)
            y2.e r1 = ya.pd.a(r0)
            r3 = 31
            r5 = 0
            if (r2 < r3) goto L6d
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = a7.i.b(r2)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r7) goto L6f
        L6d:
            r0 = r5
            goto L7b
        L6f:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = a7.i.b(r0)
        L7b:
            if (r0 != 0) goto L87
            m2.f0 r0 = new m2.f0
            r0.<init>(r1)
            java.lang.String r9 = a3.a(r9, r6, r0, r3)
            goto Lbb
        L87:
            int r1 = r9.size()
            if (r1 > 0) goto Lc3
            r1 = 1137180672(0x43c80000, float:400.0)
            float r0 = (float) r0
            float r0 = r0 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r0 = wa.b9.d(r0, r1, r2)
            boolean r9 = r9.isEmpty()
            java.lang.String r1 = ""
            if (r9 != 0) goto La7
            java.lang.String r9 = ","
            java.lang.String r1 = r1.concat(r9)
        La7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r1 = "'wght' "
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
        Lbb:
            lb.q.q(r4, r9)
            android.graphics.Typeface r6 = r4.getTypeface()
            goto Lcd
        Lc3:
            java.lang.Object r9 = r9.get(r5)
            r9.getClass()
            g5.q.b()
        Lcd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.b(q2.z):android.graphics.Typeface");
    }
}