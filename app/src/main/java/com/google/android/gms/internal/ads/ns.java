package com.google.android.gms.internal.ads;
import n9.a0;
import n9.f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ns implements n9.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8830a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8832c;

    /* renamed from: d, reason: collision with root package name */
    public final rn f8833d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8834f;
    public final ArrayList e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f8835g = new HashMap();

    public ns(HashSet hashSet, boolean z3, int i, rn rnVar, List list, boolean z9) {
        this.f8830a = hashSet;
        this.f8831b = z3;
        this.f8832c = i;
        this.f8833d = rnVar;
        this.f8834f = z9;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        String str2 = split[2];
                        if ("true".equals(str2)) {
                            this.f8835g.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f8835g.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.e.add(str);
                }
            }
        }
    }

    @Override // n9.f
    public final int a() {
        return this.f8832c;
    }

    @Override // n9.f
    public final boolean b() {
        return this.f8834f;
    }

    @Override // n9.f
    public final boolean c() {
        return this.f8831b;
    }

    @Override // n9.f
    public final Set d() {
        return this.f8830a;
    }
}
