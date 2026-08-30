package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class n7 extends cp {

    /* renamed from: b, reason: collision with root package name */
    public final Level f14704b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f14705c;

    /* renamed from: d, reason: collision with root package name */
    public final u6 f14706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = o7.f14740f;
        u6 u6Var = o7.f14741g;
        this.f14704b = level;
        this.f14705c = set;
        this.f14706d = u6Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void f(q5 q5Var) {
        String str = (String) q5Var.f().n(l6.f14596a);
        if (str == null) {
            str = (String) this.f14164a;
        }
        if (str == null) {
            z5 z5Var = q5Var.f14840d;
            if (z5Var != null) {
                str = z5Var.b();
                int indexOf = str.indexOf(36, str.lastIndexOf(46));
                if (indexOf >= 0) {
                    str = str.substring(0, indexOf);
                }
            } else {
                q.x.o("cannot request log site information prior to postProcess()");
                return;
            }
        }
        o7.m(q5Var, nw.g(str), this.f14704b, this.f14705c, this.f14706d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final boolean i(Level level) {
        return true;
    }
}
