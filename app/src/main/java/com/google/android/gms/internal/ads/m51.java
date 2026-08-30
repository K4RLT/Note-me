package com.google.android.gms.internal.ads;
import l4.a;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class m51 extends m61 {

    /* renamed from: v, reason: collision with root package name */
    public Object f8251v;

    /* renamed from: w, reason: collision with root package name */
    public int f8252w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8253x;

    /* renamed from: y, reason: collision with root package name */
    public final Iterator f8254y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8255z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m51(g61 g61Var, Set set, Set set2) {
        this();
        this.f8253x = 1;
        this.f8255z = set2;
        this.f8254y = set.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z3;
        i31 i31Var;
        Object next;
        Set set;
        if (this.f8252w != 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        int i = this.f8252w;
        int i10 = i - 1;
        if (i != 0) {
            if (i10 == 0) {
                return true;
            }
            if (i10 != 2) {
                this.f8252w = 4;
                switch (this.f8253x) {
                    case 0:
                        do {
                            Iterator it = this.f8254y;
                            if (it.hasNext()) {
                                i31Var = (i31) this.f8255z;
                                next = it.next();
                            } else {
                                this.f8252w = 3;
                                next = null;
                                break;
                            }
                        } while (!i31Var.l(next));
                    default:
                        do {
                            Iterator it2 = this.f8254y;
                            if (it2.hasNext()) {
                                set = (Set) this.f8255z;
                                next = it2.next();
                            } else {
                                this.f8252w = 3;
                                next = null;
                                break;
                            }
                        } while (!set.contains(next));
                }
                this.f8251v = next;
                if (this.f8252w != 3) {
                    this.f8252w = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.m61, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f8252w = 2;
            Object obj = this.f8251v;
            this.f8251v = null;
            return obj;
        }
        l4.a.c();
        return null;
    }

    public m51() {
        super(0);
        this.f8252w = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m51(Iterator it, i31 i31Var) {
        this();
        this.f8253x = 0;
        this.f8254y = it;
        this.f8255z = i31Var;
    }
}
