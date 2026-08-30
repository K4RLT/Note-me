package f5;
import d.e;
import g.a;

import android.content.res.AssetManager;
import android.os.Build;
import c.l;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import g0.j1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import r.m1;
import t.n1;
import t.u0;
import t.x1;
import t.z1;
import ya.jb;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16723a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16724b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16725c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f16726d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16727f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16728g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16729h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        Object r12;
        this.f16723a = false;
        this.f16724b = executor;
        this.f16725c = cVar;
        this.f16728g = str;
        this.f16727f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            r12 = d.f16740d;
        } else {
            switch (i) {
                case 24:
                case 25:
                    r12 = d.f16743h;
                    break;
                case 26:
                    r12 = d.f16742g;
                    break;
                case 27:
                    r12 = d.f16741f;
                    break;
                case 28:
                case 29:
                case 30:
                    r12 = e;
                    break;
                default:
                    r12 = 0;
                    break;
            }
        }
        this.f16726d = r12;
    }

    public static final float a(a aVar, x1 x1Var, float f10) {
        z1 z1Var = (z1) aVar.f16724b;
        long h3 = z1Var.h(z1Var.d(f10));
        z1 z1Var2 = x1Var.f25580a;
        return z1Var.g(z1Var.e(z1.a(z1Var2, z1Var2.f25607j, h3, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(f5.a r16, t.z1 r17, t.u0 r18, float r19, float r20, ve.c r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.b(f5.a, t.z1, t.u0, float, float, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(f5.a r11, kotlin.jvm.internal.y r12, kotlin.jvm.internal.v r13, t.z1 r14, kotlin.jvm.internal.y r15, long r16, ve.c r18) {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof t.x0
            if (r3 == 0) goto L17
            r3 = r2
            t.x0 r3 = (t.x0) r3
            int r4 = r3.A
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.A = r4
            goto L1c
        L17:
            t.x0 r3 = new t.x0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f25579z
            int r4 = r3.A
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L37
            kotlin.jvm.internal.y r11 = r3.f25578y
            t.z1 r12 = r3.f25577x
            kotlin.jvm.internal.v r0 = r3.f25576w
            kotlin.jvm.internal.y r1 = r3.f25575v
            f5.a r3 = r3.f25574u
            pe.a.e(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L6a
        L37:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r11)
            r11 = 0
            return r11
        L3e:
            pe.a.e(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4a:
            a0.j0 r2 = new a0.j0
            r4 = 0
            r6 = 17
            r2.<init>(r11, r4, r6)
            r3.f25574u = r11
            r3.f25575v = r12
            r3.f25576w = r13
            r3.f25577x = r14
            r3.f25578y = r15
            r3.A = r5
            java.lang.Object r2 = pf.b0.K(r0, r2, r3)
            ue.a r0 = ue.a.f27192u
            if (r2 != r0) goto L67
            return r0
        L67:
            r0 = r13
            r6 = r14
            r7 = r15
        L6a:
            t.u0 r2 = (t.u0) r2
            if (r2 == 0) goto La4
            java.lang.Object r1 = r12.f19787u
            t.u0 r1 = (t.u0) r1
            boolean r1 = r1.f25530c
            long r3 = r2.f25528a
            long r8 = r2.f25529b
            t.u0 r10 = new t.u0
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f19787u = r1
            long r3 = r6.e(r3)
            float r12 = r6.g(r3)
            r0.f19784u = r12
            r12 = 30
            r1 = 0
            q.l r12 = q.e.b(r12, r1, r1)
            r7.f19787u = r12
            r11.g(r2)
            float r11 = r0.f19784u
            boolean r11 = t.t0.a(r11)
            r11 = r11 ^ r5
            goto La5
        La4:
            r11 = 0
        La5:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.c(f5.a, kotlin.jvm.internal.y, kotlin.jvm.internal.v, t.z1, kotlin.jvm.internal.y, long, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u0 f(rf.h hVar) {
        u0 u0Var = null;
        lf.e a10 = lf.g.a(new j1((Object) new m1(4, hVar), (te.c) (0 == true ? 1 : 0), 3));
        while (a10.hasNext()) {
            u0 u0Var2 = (u0) a10.next();
            if (u0Var != null) {
                u0Var2 = u0Var.a(u0Var2);
            }
            u0Var = u0Var2;
        }
        return u0Var;
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((c) this.f16725c).a();
                return null;
            }
            return null;
        }
    }

    public void e(int i, Serializable serializable) {
        ((Executor) this.f16724b).execute(new l(i, 2, this, serializable));
    }

    public void g(u0 u0Var) {
        pw pwVar = (pw) this.f16729h;
        long j10 = u0Var.f25529b;
        long j11 = u0Var.f25528a;
        ((w1.c) pwVar.f14821v).a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        ((w1.c) pwVar.f14822w).a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(t.z1 r5, t.w0 r6, ve.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t.y0
            if (r0 == 0) goto L13
            r0 = r7
            t.y0 r0 = (t.y0) r0
            int r1 = r0.f25586x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25586x = r1
            goto L18
        L13:
            t.y0 r0 = new t.y0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f25584v
            int r1 = r0.f25586x
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            f5.a r5 = r0.f25583u
            pe.a.e(r7)
            goto L53
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            r5 = 0
            return r5
        L2e:
            pe.a.e(r7)
            r4.f16723a = r2
            l5.a r7 = new l5.a
            r1 = 0
            r3 = 9
            r7.<init>(r5, r6, r1, r3)
            r0.f25583u = r4
            r0.f25586x = r2
            pf.s1 r5 = new pf.s1
            te.g r6 = r0.getContext()
            r1 = 0
            r5.<init>(r6, r0, r1)
            java.lang.Object r5 = ya.bd.a(r5, r5, r7)
            ue.a r6 = ue.a.f27192u
            if (r5 != r6) goto L52
            return r6
        L52:
            r5 = r4
        L53:
            r6 = 0
            r5.f16723a = r6
            pe.z r5 = pe.z.f22715a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.h(t.z1, t.w0, ve.c):java.lang.Object");
    }

    public a(z1 z1Var, t.a aVar, n1 n1Var, y2.c cVar) {
        this.f16724b = z1Var;
        this.f16725c = aVar;
        this.f16726d = n1Var;
        this.e = cVar;
        this.f16727f = jb.a(Integer.MAX_VALUE, 6, null);
        this.f16729h = new pw(19);
    }
}