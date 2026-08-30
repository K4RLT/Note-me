package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f15107b;

    public /* synthetic */ v0(x0 x0Var, int i) {
        this.f15106a = i;
        this.f15107b = x0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15106a) {
            case 0:
                x0 x0Var = this.f15107b;
                Set<String> keySet = x0Var.e.getAll().keySet();
                SharedPreferences.Editor edit = x0Var.e.edit();
                Iterator<String> it = keySet.iterator();
                while (it.hasNext()) {
                    edit.remove(it.next());
                }
                if (edit.commit()) {
                    return null;
                }
                x.p("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(x0Var.f15218c)));
                return null;
            default:
                x0 x0Var2 = this.f15107b;
                x0Var2.e = x0Var2.f15216a.getSharedPreferences(x0Var2.f15218c, 0);
                return Boolean.valueOf(!r1.getAll().isEmpty());
        }
    }
}
