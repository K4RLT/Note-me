package gg;

import eg.e1;
import eg.h1;
import eg.k1;
import eg.n1;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f17806a = qe.k.u(new cg.d[]{h1.f16524b, k1.f16538b, e1.f16509b, n1.f16552b});

    public static final boolean a(cg.d dVar) {
        dVar.getClass();
        if (dVar.isInline() && f17806a.contains(dVar)) {
            return true;
        }
        return false;
    }
}
