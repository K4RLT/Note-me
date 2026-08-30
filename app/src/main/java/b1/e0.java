package b1;

import java.util.Map;

/* loaded from: classes.dex */
public final class e0 implements Map.Entry, ef.c {

    /* renamed from: u, reason: collision with root package name */
    public final Object f1332u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1333v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f1334w;

    public e0(f0 f0Var) {
        this.f1334w = f0Var;
        Map.Entry entry = (Map.Entry) f0Var.f1341x;
        entry.getClass();
        this.f1332u = entry.getKey();
        Map.Entry entry2 = (Map.Entry) f0Var.f1341x;
        entry2.getClass();
        this.f1333v = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1332u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1333v;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        f0 f0Var = this.f1334w;
        y yVar = (y) f0Var.f1339v;
        if (yVar.e().f1406d == f0Var.f1338u) {
            Object obj2 = this.f1333v;
            yVar.put(this.f1332u, obj);
            this.f1333v = obj;
            return obj2;
        }
        l4.a.m();
        return null;
    }
}
