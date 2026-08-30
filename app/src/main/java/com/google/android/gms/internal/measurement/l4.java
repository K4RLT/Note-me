package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l4 implements c4 {

    /* renamed from: u, reason: collision with root package name */
    public static final n.e f13833u = new n.r0(0);

    public static synchronized void a() {
        synchronized (l4.class) {
            Iterator it = ((n.d) f13833u.values()).iterator();
            if (!it.hasNext()) {
                f13833u.clear();
            } else {
                ((l4) it.next()).getClass();
                throw null;
            }
        }
    }
}
