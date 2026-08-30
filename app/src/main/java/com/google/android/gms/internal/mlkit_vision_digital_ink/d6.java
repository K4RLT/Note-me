package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14184a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f14185b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14186c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14187d;
    public final long e;

    public d6(String str, Class cls, boolean z3, boolean z9) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                for (int i = 1; i < str.length(); i++) {
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                        q.x.n("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                        throw null;
                    }
                }
                this.f14184a = str;
                this.f14185b = cls;
                this.f14186c = z3;
                this.f14187d = z9;
                int identityHashCode = System.identityHashCode(this);
                long j10 = 0;
                for (int i10 = 0; i10 < 5; i10++) {
                    j10 |= 1 << (identityHashCode & 63);
                    identityHashCode >>>= 6;
                }
                this.e = j10;
                return;
            }
            q.x.n("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        q.x.n("identifier must not be empty");
        throw null;
    }

    public void a(Iterator it, p6 p6Var) {
        while (it.hasNext()) {
            b(it.next(), p6Var);
        }
    }

    public void b(Object obj, p6 p6Var) {
        p6Var.a(obj, this.f14184a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f14185b.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("/");
        return a5.a.l(sb2, this.f14184a, "[", name2, "]");
    }
}
