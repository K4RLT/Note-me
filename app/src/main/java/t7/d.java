package t7;
import c.d;
import d.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import k1.l0;
import m2.a0;
import q.e;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;
import r7.j;
import ya.h9;
import z0.h;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f25660a = l0.d(4062059302L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f25661b = l0.d(4294953293L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25662c = 0;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if (kotlin.jvm.internal.l.a(r0.O(), java.lang.Integer.valueOf(r13)) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(df.a r63, df.a r64, df.a r65, r0.m r66, int r67) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.a(df.a, df.a, df.a, r0.m, int):void");
    }

    public static final void b(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-152862724);
        int i10 = i & 1;
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10, z3)) {
            a1 o10 = y.o(b.f25654d, rVar);
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            boolean f10 = rVar.f(context);
            Object O = rVar.O();
            if (f10 || O == l.f24285a) {
                Context context2 = context;
                while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity)) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                    context2.getClass();
                }
                if (context2 instanceof Activity) {
                    O = (Activity) context2;
                } else {
                    O = null;
                }
                rVar.k0(O);
            }
            h9.c(((Boolean) o10.getValue()).booleanValue(), d1.a.d(androidx.compose.foundation.layout.d.f506c, 50.0f), androidx.compose.animation.c.d(e.s(200, 0, null, 6), 2), androidx.compose.animation.c.e(e.s(200, 0, null, 6), 2), null, h.d(-1421321004, new j(1, context, o10, (Activity) O), rVar), rVar, 200112, 16);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a0(i, 24);
        }
    }
}
