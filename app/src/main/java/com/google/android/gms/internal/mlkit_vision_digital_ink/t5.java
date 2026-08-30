package com.google.android.gms.internal.mlkit_vision_digital_ink;
import l4.a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t5 extends d6 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(String str, Class cls, boolean z3, boolean z9, int i) {
        super(str, cls, z3, z9);
        this.f15002f = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.d6
    public void a(Iterator it, p6 p6Var) {
        switch (this.f15002f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.f14184a;
                    if (!hasNext) {
                        p6Var.a(next, str);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("[");
                    sb2.append(next);
                    do {
                        sb2.append(',');
                        sb2.append(it.next());
                    } while (it.hasNext());
                    sb2.append(']');
                    p6Var.a(sb2.toString(), str);
                    return;
                }
                return;
            default:
                super.a(it, p6Var);
                return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.d6
    public void b(Object obj, p6 p6Var) {
        boolean z3;
        switch (this.f15002f) {
            case 1:
                u7 u7Var = (u7) obj;
                if (u7Var != null) {
                    s7 s7Var = u7Var.f15057a.f15007w;
                    s7Var.getClass();
                    int i = 0;
                    while (true) {
                        if (i < s7Var.a() - s7Var.b()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i < s7Var.a() - s7Var.b()) {
                                Object obj2 = s7Var.f14964v.f15005u[s7Var.b() + i];
                                i++;
                                Map.Entry entry = (Map.Entry) obj2;
                                if (!((Set) entry.getValue()).isEmpty()) {
                                    Iterator it = ((Set) entry.getValue()).iterator();
                                    while (it.hasNext()) {
                                        p6Var.a(it.next(), (String) entry.getKey());
                                    }
                                } else {
                                    p6Var.a(null, (String) entry.getKey());
                                }
                            } else {
                                l4.a.c();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.b(obj, p6Var);
                return;
        }
    }
}
