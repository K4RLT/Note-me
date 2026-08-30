package c2;
import x.o;
import c0.d0;
import c2.a;
import q.x;
import r0.i1;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;

import com.daren.scraply.MainActivity;

/* loaded from: classes.dex */
public final class o1 extends a {
    public final i1 C;
    public boolean D;

    public o1(MainActivity mainActivity) {
        super(mainActivity);
        this.C = y.B(null);
    }

    @Override // a
    public final void a(int i, m mVar) {
        int i10;
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(420213850);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            df.p pVar = (df.p) this.C.getValue();
            if (pVar == null) {
                rVar.a0(-1238798753);
            } else {
                rVar.a0(98586082);
                pVar.invoke(rVar, 0);
            }
            rVar.p(false);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d0(this, i, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return o1.class.getName();
    }

    @Override // a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.D;
    }

    public final void setContent(df.p pVar) {
        this.D = true;
        this.C.setValue(pVar);
        if (isAttachedToWindow()) {
            if (this.f3455x == null && !isAttachedToWindow()) {
                x.o("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            } else {
                d();
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
